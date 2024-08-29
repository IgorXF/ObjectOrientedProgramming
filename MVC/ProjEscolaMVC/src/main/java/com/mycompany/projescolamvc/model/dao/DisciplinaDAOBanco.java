/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projescolamvc.model.dao;

import com.mycompany.projescolamvc.model.entities.Aluno;
import com.mycompany.projescolamvc.model.entities.Disciplina;
import com.mycompany.projescolamvc.model.entities.Professor;
import com.mycompany.projescolamvc.model.file.SerializadorJSONAluno;
import com.mycompany.projescolamvc.model.file.SerializadorJSONProfessor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class DisciplinaDAOBanco implements IDao{
    private Connection connection;
    private SerializadorJSONAluno serializador = new SerializadorJSONAluno();
    private SerializadorJSONProfessor serializador2 = new SerializadorJSONProfessor();

    public DisciplinaDAOBanco(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Object disciplinaN) {
        Disciplina disciplina = (Disciplina) disciplinaN;
        List<Aluno> alunos = disciplina.getAlunos();
        String alunosAsJson =serializador.toFile(alunos);
        
       List<Professor> professores = disciplina.getProfM();
        String professorAsJson =serializador2.toFile(professores);
        
        String sql = "INSERT INTO disciplina (nome, semestre, horario, profM, alunos) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getSemestre());
            stmt.setString(3, disciplina.getHorario());
            stmt.setString(4, professorAsJson);
            stmt.setString(5, alunosAsJson);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar aluno: " + e.getMessage());
        }
    }

    @Override
    public void update(String nome, Object disciplinaN) {
        Disciplina disciplina = (Disciplina) disciplinaN;
        List<Aluno> alunos = disciplina.getAlunos();
        String alunosAsJson =serializador.toFile(alunos);
        
        List<Professor> professores = disciplina.getProfM();
        String professorAsJson =serializador2.toFile(professores);
        
        String sql = "UPDATE disciplina SET semestre = ?,  horario = ?, profM = ?, alunos = ? WHERE nome = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getSemestre());
            stmt.setString(3, disciplina.getHorario());
            stmt.setString(4, professorAsJson);
            stmt.setString(5, alunosAsJson);
            stmt.setString(5, nome);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar disciplina: " + e.getMessage());
        }
    }

    @Override
    public void delete(String nome) {
        String sql = "DELETE FROM disciplina WHERE nome = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar disciplina: " + e.getMessage());
        }
    }

    @Override
    public Disciplina find(String cpf) {
        String sql = "SELECT * FROM disciplina WHERE nome = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String alunosJson = rs.getString("alunos");
                    List<Aluno> alunos = serializador.fromFile(alunosJson);
                    String profs = rs.getString("profM");
                    List<Professor> profM =serializador2.fromFile(profs);
                    
                    
                    return new Disciplina(
                        rs.getString("nome"),
                        rs.getString("semestre"),
                        rs.getString("horario"),
                        profM,
                        alunos
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar disciplina: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Disciplina> findAll() {
        String sql = "SELECT * FROM disciplina";
        List<Disciplina> disciplinas = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                String alunosJson = rs.getString("alunos");
                List<Aluno> alunos = serializador.fromFile(alunosJson);
                
                String profs = rs.getString("profM");
                List<Professor> profM =serializador2.fromFile(profs);
                disciplinas.add(new Disciplina(
                        rs.getString("nome"),
                        rs.getString("semestre"),
                        rs.getString("horario"),
                        profM,
                        alunos
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar disciplinas: " + e.getMessage());
        }
        return disciplinas;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projescolamvc.controller;

import com.mycompany.projescolamvc.model.dao.IDao;
import com.mycompany.projescolamvc.model.entities.Aluno;
import com.mycompany.projescolamvc.model.entities.Disciplina;
import com.mycompany.projescolamvc.model.entities.Professor;
import com.mycompany.projescolamvc.model.valid.ValidacaoAluno;
import com.mycompany.projescolamvc.model.valid.ValidacaoDisciplina;
import com.mycompany.projescolamvc.model.valid.ValidacaoProfessor;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class DisciplinaController {
    private IDao repositorio;
    
    public DisciplinaController(IDao repositorio){
        this.repositorio = repositorio;
    }
    
    public void adicionarDisciplina(String nome, String semestre, String horario) {
        ValidacaoDisciplina valid = new ValidacaoDisciplina();
        Disciplina novaDisciplina = valid.validacao(nome, semestre, horario);
        
        repositorio.save(novaDisciplina);
    }
    
    public void addDisciplina(Disciplina d){
        repositorio.save(d);
    }

    public void removerDisciplina(String nome) {
        repositorio.delete(nome);
    }

    public Disciplina buscarDisciplina(String nome) {
        return (Disciplina) repositorio.find(nome);
    }

    public List<Disciplina> listarDisciplinas() {
        return repositorio.findAll();
    }

    public void atualizarDisciplina(String nomeAntigo, String semestre, String horario) {
        removerDisciplina(nomeAntigo);
        adicionarDisciplina(nomeAntigo, semestre, horario);
    }
    
    public void atualizarDisciplinaA(Disciplina d, String cpf, String nome, String idade, String matricula, String anoIngresso) {
        removerDisciplina(d.getNome());
        ValidacaoAluno valid = new ValidacaoAluno();
        Aluno novoAluno = valid.validacao(cpf, nome, idade, matricula, anoIngresso);
        if(novoAluno != null){
            d.setAluno(novoAluno);
            System.out.println(d);
            addDisciplina(d);
            System.out.println("ponto");
            
        }else{
            System.out.println("Não entrou");
        }
    }
    
    public void atualizarDisciplinaP(Disciplina d, String cpf, String nome, String idade, String sexo) {
        removerDisciplina(d.getNome());
        ValidacaoProfessor valid = new ValidacaoProfessor();
        Professor novoP = valid.validacao(cpf, nome, idade, sexo);
        if(novoP != null){
            d.setProfM(novoP);
            System.out.println(d);
            addDisciplina(d);
            System.out.println("ponto");
            
        }else{
            System.out.println("Não entrou");
        }
    }
}

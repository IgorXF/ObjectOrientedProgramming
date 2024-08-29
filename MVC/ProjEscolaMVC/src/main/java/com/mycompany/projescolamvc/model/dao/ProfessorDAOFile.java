/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projescolamvc.model.dao;

import com.mycompany.projescolamvc.model.entities.Professor;
import com.mycompany.projescolamvc.model.file.FilePersistence;
import com.mycompany.projescolamvc.model.file.SerializadorJSONProfessor;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class ProfessorDAOFile implements IDao{
    private SerializadorJSONProfessor serializador = new SerializadorJSONProfessor();//Inversao dependencia
    
    private FilePersistence filePersistence = new FilePersistence();
    private String caminhoArquivo;

    public ProfessorDAOFile(String caminhoArquivo, SerializadorJSONProfessor serializador) {
        this.caminhoArquivo = caminhoArquivo;
        this.serializador = serializador;
    }


    @Override
    public void delete(String cpf) {
       
        Professor professorExcluir = this.find(cpf);
        
        if(professorExcluir != null){
            List<Professor> professores = this.findAll();
            professores.remove(professorExcluir);
            
            //mesma rotina para que aprendemos nas aulas de persistencia
            String jsonData = serializador.toFile(professores);
            filePersistence.saveToFile(jsonData, caminhoArquivo);
            System.out.println("Professor removido com sucesso do arquivo.");
        }
    }

    @Override
    public Professor find(String cpf) {
        List<Professor> professores = this.findAll();
        
        for (Professor professor : professores) {
            if (professor.getCpf().equals(cpf)){
                return professor;
            }      
        }
        return null;
    }
    
    @Override
    public List<Professor> findAll() {
        String jsonData = filePersistence.loadFromFile(caminhoArquivo);
        return serializador.fromFile(jsonData);
    }

    @Override
    public void update(String cpf, Object newAluno ) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void save(Object newAluno) {
        Professor a = (Professor) newAluno;
        List<Professor> alunos = findAll();
        alunos.add(a);
        
        //mesma rotina para que aprendemos nas aulas de persistencia
        String jsonData = serializador.toFile(alunos);
        filePersistence.saveToFile(jsonData, caminhoArquivo);
        System.out.println("Professor salvo com sucesso no arquivo.");
    }
}

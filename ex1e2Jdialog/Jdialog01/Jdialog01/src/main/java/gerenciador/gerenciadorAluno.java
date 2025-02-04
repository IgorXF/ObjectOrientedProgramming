/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Aluno;
import file.filePersistence;
import file.serializadorCSValuno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class gerenciadorAluno {
    private List<Aluno> alunos ;

    public gerenciadorAluno() {
        this.alunos = new ArrayList<>();
    }
    
    public Aluno buscarAluno(String matricula){
        for(Aluno aluno : alunos){
            if(aluno.getMatricula().equals(matricula)){
                return aluno;
            }
        }
        return null;
    }
    
    public void addAluno(Aluno newAluno){
        alunos.add(newAluno);
    }
    
    public void atualizarAluno(String matricula, Aluno newAluno){
        Aluno alunoExistente = buscarAluno(matricula);
        
        if(alunoExistente != null){
            int indice = alunos.indexOf(alunoExistente);
            alunos.set(indice, newAluno);
            System.out.println("Aluno atualizado.");
        }else{
            System.out.println("Não tem matricula " + matricula);  
        } 
    }
    
    public void remover(String matricula){
        alunos.remove(buscarAluno(matricula));
    }
    
    @Override
    public String toString() {
        return "gerenciadorAluno{" + "alunos=" + alunos + '}';
    }
    
     public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSValuno serializador = new serializadorCSValuno();
        String csvData = serializador.toCSV(alunos);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Alunos salvos  em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSValuno serializador = new serializadorCSValuno();
        this.alunos = serializador.fromCSV(csvData);

        System.out.println("Alunos carregados de " + caminhoDoArquivo);
    }

}

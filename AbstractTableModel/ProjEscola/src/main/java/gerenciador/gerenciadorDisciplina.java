/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Aluno;
import classe.Disciplina;
import file.filePersistence;
import file.serializadorCSVDisciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  igorxf
 */
public class gerenciadorDisciplina {
    private List<Disciplina> disciplinas;

    public gerenciadorDisciplina() {
        this.disciplinas = new ArrayList<>();
    }
    
    public void addDisciplina(Disciplina newDisciplina){
        disciplinas.add(newDisciplina);
    }
    
    public Disciplina buscarDisciplina(String nome){
        for(Disciplina discip : disciplinas){
            if(discip.getNome().equals(nome)){
                return discip;
            }
        }
        return null;        
    }
    
    public void atualizarDisciplina(String nome, Disciplina newDiscip){
        Disciplina discipExistente = buscarDisciplina(nome);
        if(discipExistente != null){
            int indice = disciplinas.indexOf(discipExistente);
            disciplinas.set(indice, newDiscip);
            System.out.println("Atualizada");
        }else{
            System.out.println("Não tem disciplina: " + nome);
        }
    }
    
    public void atualizarDisciplinaA(Aluno a,Disciplina d){
        int indice = disciplinas.indexOf(d);
        if (indice != -1) {
        // Adicionar o aluno à lista de alunos da disciplina
        List<Aluno> alunos = d.getAlunos();
        alunos.add(a);
        d.setAlunos(alunos);
        
        // Atualizar a disciplina na lista
        disciplinas.set(indice, d);
    }
    }
    
    public void removeDisciplina(String nome){
        disciplinas.remove(buscarDisciplina(nome));
        System.out.println("Removida");
    }

    @Override
    public String toString() {
        return "gerenciadorDisciplina{" + "disciplina=" + disciplinas + '}';
    }
    
    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSVDisciplina serializador = new serializadorCSVDisciplina();
        String csvData = serializador.toCSV(disciplinas);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Disciplina salva em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVDisciplina serializador = new serializadorCSVDisciplina();
        this.disciplinas = serializador.fromCSV(csvData);

        System.out.println("Disciplinas carregados de " + caminhoDoArquivo);
    }
 
}

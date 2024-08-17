package com.oo.projescolaheranca.gerenciador;

/**
 *
 * @author igorxf
 */
import com.oo.projescolaheranca.classes.Professor;
import com.oo.projescolaheranca.file.SerializadorCSVProfessor;
import com.oo.projetocadproduto.file.FilePersistence;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProfessor {
   
    private List<Professor> professores;

    public GerenciadorProfessor() {
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor adicionado com sucesso!");
    }

    public boolean removerProfessor(String cpf) {
        for (Professor professor : professores) {
            if (professor.getCpf().equals(cpf)) {
                professores.remove(professor);
                System.out.println("Professor removido com sucesso!");
                return true;
            }
        }
        System.out.println("Professor não encontrado!");
        return false;
    }

    public Professor buscarProfessor(String cpf) {
        for (Professor professor : professores) {
            if (professor.getCpf().equals(cpf)) {
                return professor;
            }
        }
        return null;
    }

    public void atualizarProfessor(String cpfAntigo, Professor professorNovo) {
        Professor professorExistente = buscarProfessor(cpfAntigo);
        
        if (professorExistente != null) {
            int indice = professores.indexOf(professorExistente);
            professores.set(indice, professorNovo);
            System.out.println("Professor atualizado com sucesso.");
        } else {
            System.out.println("Professor com o CPF " + cpfAntigo + " não encontrado.");
        }
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Professor professor : professores) {
            saida.append(professor.imprimirParaString());
        }
        return saida.toString();
    }

    public void salvarNoArquivo(String caminhoDoArquivo) {
        // Serializando XML
        SerializadorCSVProfessor serializadorCSV = new SerializadorCSVProfessor();
        String csvData = serializadorCSV.toCSV(this.professores);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Professores salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        FilePersistence filePersistence = new FilePersistence();
        String csvDAta = filePersistence.loadFromFile(caminhoDoArquivo);

        // Desserializando JSON
        SerializadorCSVProfessor desserializadorCSV = new SerializadorCSVProfessor();
        this.professores = desserializadorCSV.fromCSV(csvDAta);

        System.out.println("Professores carregados com sucesso de " + caminhoDoArquivo);
    }

}


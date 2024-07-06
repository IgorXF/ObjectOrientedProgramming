/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciadores;

import classes.Paciente;
import files.FilePersistence;
import files.SerializadorXMLPaciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author igorxf
 */
@XmlRootElement(name="Pacientes")
public class GerenciadorPacientes {
    @XmlElement(name="Paciente")
    private List<Paciente> pacientes = new ArrayList<>();
    
    public void addPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    
    public Paciente buscaPaciente(String cpf){
        for(Paciente paciente : pacientes){
            if(paciente.getCpf().equals(cpf))
                return paciente;
        }
        return null;
    }
    
    public void atualizarPaciente(String cpf, Paciente pessoaNova) {
        Paciente pessoaExistente = buscaPaciente(cpf);
        
        if (pessoaExistente != null) {
            int indice = pacientes.indexOf(pessoaExistente);
            pacientes.set(indice, pessoaNova);
            System.out.println("Paciente atualizada com sucesso.");
        } else {
            System.out.println("Paciente com o CPF " + cpf + " não encontrada.");
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException{
        SerializadorXMLPaciente serializadorXML = new SerializadorXMLPaciente();
        String xmlData = serializadorXML.ToXML(this);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(xmlData, caminhoDoArquivo);
        System.out.println("Pacientes salvos com sucesso em " + caminhoDoArquivo);

    }
    
    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Paciente paciente : pacientes) {
            saida.append(paciente.toString()).append("\n");
        }
        return saida.toString();
    }   

    // Novo: Carrega a lista de objetos de um arquivo CSV
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String xmlData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        SerializadorXMLPaciente desserializadorXML = new SerializadorXMLPaciente();
        this.pacientes = desserializadorXML.fromXML(xmlData).pacientes;
        System.out.println("Pacientes carregados com sucesso de " + caminhoDoArquivo);
    }  
}

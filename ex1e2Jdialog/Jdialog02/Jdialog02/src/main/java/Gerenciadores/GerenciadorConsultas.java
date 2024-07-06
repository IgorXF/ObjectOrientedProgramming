/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciadores;

import classes.Consulta;
import files.FilePersistence;
import files.SerializadorXMLConsulta;
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
@XmlRootElement(name="Consultas")
public class GerenciadorConsultas {
    @XmlElement(name="Consulta")
    private List<Consulta> consultas = new ArrayList<>();
    
    public void addConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    public Consulta buscaConsulta(String id){
        for(Consulta consulta : consultas){
            if(consulta.getId().equals(id))
                return consulta;
        }
        return null;
    }
    
    
    public void atualizarConsulta(String id, Consulta consultaNova) {
        Consulta consultaExistente = buscaConsulta(id);
        
        if (consultaExistente != null) {
            int indice = consultas.indexOf(consultaExistente);
            consultas.set(indice, consultaNova);
            System.out.println("consulta atualizada com sucesso.");
        } else {
            System.out.println("Consulta com o id " + id +" não encontrada.");
        }
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) throws IOException{
        SerializadorXMLConsulta serializadorXML = new SerializadorXMLConsulta();
        String xmlData = serializadorXML.ToXML(this);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(xmlData, caminhoDoArquivo);
        System.out.println("Consultas salvas com sucesso em " + caminhoDoArquivo);

    }

    // Novo: Carrega a lista de objetos de um arquivo CSV
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String xmlData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        SerializadorXMLConsulta desserializadorXML = new SerializadorXMLConsulta();
        this.consultas = desserializadorXML.fromXML(xmlData).consultas;
        System.out.println("Consultas carregados com sucesso de " + caminhoDoArquivo);

    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Consulta consulta : consultas) {
            saida.append(consulta.toString()).append("\n");
        }
        return saida.toString();
    }
    
    
}

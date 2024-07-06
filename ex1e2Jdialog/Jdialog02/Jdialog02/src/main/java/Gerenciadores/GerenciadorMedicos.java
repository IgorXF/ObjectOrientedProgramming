/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciadores;

import classes.Medico;
import files.FilePersistence;
import files.SerializadorXMLMedico;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author igorxf
 */
@XmlRootElement(name="Medicos")
public class GerenciadorMedicos {
    @XmlElement(name="Medico")
    private List<Medico> medicos ;
    
    public GerenciadorMedicos(){
        this.medicos = new ArrayList<>();
    }
    
    public void addMedico(Medico medico){
        medicos.add(medico);
    }
    public Medico buscarMedico(String crm){
        for(Medico medico : medicos){
            if(medico.getCrm().equals(crm)){
                return medico;
            }
        }
        return null;
    }
    
    public void atualizarMedico(String crn, Medico medicoNovo) {
        Medico medicoExistente = buscarMedico(crn);
        
        if (medicoExistente != null) {
            int indice = medicos.indexOf(medicoExistente);
            medicos.set(indice, medicoNovo);
            System.out.println("Medico atualizado com sucesso.");
        } else {
            System.out.println("Medico com o CPF " + crn + " não encontrado.");
        }
    }
    
    
    public void salvarNoArquivo(String caminhoDoArquivo){
        SerializadorXMLMedico serializadorXML = new SerializadorXMLMedico();
        String xmlData = serializadorXML.ToXML(this);
        
        FilePersistence filePersistence = new FilePersistence();
        try {
            filePersistence.saveToFile(xmlData, caminhoDoArquivo);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("medicos salvos com sucesso em " + caminhoDoArquivo);

    }
    
    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for (Medico medico : medicos) {
            saida.append(medico.toString()).append("\n");
        }
        return saida.toString();
    }

    // Novo: Carrega a lista de objetos de um arquivo CSV
    public void carregarDoArquivo(String caminhoDoArquivo) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String xmlData = filePersistence.loadFromFile(caminhoDoArquivo);
        
        SerializadorXMLMedico desserializadorXML = new SerializadorXMLMedico();
        this.medicos = desserializadorXML.fromXML(xmlData).medicos;
        System.out.println("medicos carregados com sucesso de " + caminhoDoArquivo);

    }  
}

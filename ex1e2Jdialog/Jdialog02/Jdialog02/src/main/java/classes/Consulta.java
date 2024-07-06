/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author igorxf
 */
@XmlRootElement
public class Consulta {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private String dataHora;
    
    public Consulta() {
        this.id = "";
        this.paciente = new Paciente(); 
        this.medico = new Medico();      
        this.dataHora = "";
    }

    public Consulta(Paciente paciente, Medico medico, String dataHora, String id) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.id = id;
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id  
                + ", dataHora=" + dataHora + '}';
    }

    
    
}

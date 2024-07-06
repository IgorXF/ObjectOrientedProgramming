/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import Gerenciadores.GerenciadorPacientes;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author igorxf
 */
public class SerializadorXMLPaciente {
    public String ToXML(GerenciadorPacientes pacientes) {
        try {
            JAXBContext context = JAXBContext.newInstance(GerenciadorPacientes.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter writer = new StringWriter();
            marshaller.marshal(pacientes, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Desserializa XML em formato String para um objeto Filme
    public GerenciadorPacientes fromXML(String xmlString) {
        try {
            JAXBContext context = JAXBContext.newInstance(GerenciadorPacientes.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(xmlString);

            return (GerenciadorPacientes) unmarshaller.unmarshal(reader);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
}

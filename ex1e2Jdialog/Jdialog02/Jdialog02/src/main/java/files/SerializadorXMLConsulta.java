/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import Gerenciadores.GerenciadorConsultas;
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
public class SerializadorXMLConsulta {
    public String ToXML(GerenciadorConsultas consultas) {
        try {
            JAXBContext context = JAXBContext.newInstance(GerenciadorConsultas.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter writer = new StringWriter();
            marshaller.marshal(consultas, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Desserializa XML em formato String para um objeto Filme
    public GerenciadorConsultas fromXML(String xmlString) {
        try {
            JAXBContext context = JAXBContext.newInstance(GerenciadorConsultas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(xmlString);

            return (GerenciadorConsultas) unmarshaller.unmarshal(reader);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import Gerenciadores.GerenciadorMedicos;
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
public class SerializadorXMLMedico {
    public String ToXML(GerenciadorMedicos medicos) {
        try {
            JAXBContext context = JAXBContext.newInstance(GerenciadorMedicos.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter writer = new StringWriter();
            marshaller.marshal(medicos, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Desserializa XML em formato String para um objeto Filme
    public GerenciadorMedicos fromXML(String xmlString) {
        try {
            JAXBContext context = JAXBContext.newInstance(GerenciadorMedicos.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(xmlString);

            return (GerenciadorMedicos) unmarshaller.unmarshal(reader);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projescolamvc.model.file;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.projescolamvc.model.entities.Disciplina;
import java.util.List;
/**
 *
 * @author igorxf
 */
public class SerializadorJSONDisciplina {
    public String toFile(List<Disciplina> disciplinas) {
        try {
            // Convertendo objeto filme para JSON 
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(disciplinas);

            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Desserializa JSON em formato String para um objeto Filme
    public List<Disciplina> fromFile(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
             
            List<Disciplina> disciplinas = mapper.readValue(jsonString, new TypeReference<List<Disciplina>>() {});
           // GerenciadorProduto produtos = mapper.readValue(jsonString, GerenciadorProduto.class);
            
            return disciplinas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

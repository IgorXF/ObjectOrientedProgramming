/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projescolamvc.model.valid;


import com.mycompany.projescolamvc.model.entities.Disciplina;
import com.mycompany.projescolamvc.model.exceptions.DisciplinaException;

/**
 *
 * @author igorxf
 */
public class ValidacaoDisciplina {
    public Disciplina validacao(String nome, String semestre, String horario, String profM) {
    Disciplina d = new Disciplina();
    
    if (nome.isEmpty())
        throw new DisciplinaException("Error - Campo vazio: 'Nome'.");
    d.setNome(nome);
    
    if (semestre.isEmpty())
        throw new DisciplinaException("Error - Campo vazio: 'Semestre'.");
    d.setSemestre(semestre);
    
    if (horario.isEmpty())
        throw new DisciplinaException("Error - Campo vazio: 'Horario'.");
    d.setHorario(horario);
    
    if (profM.isEmpty())
        throw new DisciplinaException("Error - Campo vazio: 'Professor Ministrante'.");
    d.setProfM(profM);
    
    
    return d;
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesConcretas;

import interfaces.ILogStorage;

/**
 *
 * @author igorxf
 */
public class ConsoleLogStorage  implements ILogStorage{
    
    @Override
    public void armazenar(String mensagem){
        System.out.println(mensagem);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesConcretas;

import Interface.ILogStorage;

/**
 *
 * @author 14626232639
 */
public class ConsoleLogStorage  implements ILogStorage{
    
    @Override
    public void armazenar(String mensagem){
        System.out.println(mensagem);
    }
}

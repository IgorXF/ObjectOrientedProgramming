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
public class ServicoLog{
    ILogStorage log;
            
    public ServicoLog(ILogStorage log){
        this.log = log;
    }
    
    public void registrarLog(String mensagem){
        log.armazenar(mensagem);
    }
}

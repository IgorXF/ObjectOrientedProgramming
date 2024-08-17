/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrodelog;

import classesConcretas.ArquivoLogStorage;
import classesConcretas.ConsoleLogStorage;
import classesConcretas.ServicoLog;
import interfaces.ILogStorage;

/**
 *
 * @author igorxf
 */
public class RegistroDeLog {

    public static void main(String[] args) {
        ILogStorage logArquivo = new ArquivoLogStorage(); 
        ServicoLog serv1 = new ServicoLog(logArquivo);
        serv1.registrarLog("And the rose blooms once more");
        
        ILogStorage logConsole = new ConsoleLogStorage();
        ServicoLog serv2 = new ServicoLog(logConsole);
        serv2.registrarLog("Winter yields to spring");
    }
}

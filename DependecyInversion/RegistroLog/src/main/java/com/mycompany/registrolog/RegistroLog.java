/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrolog;

import ClassesConcretas.ArquivoLogStorage;
import ClassesConcretas.ConsoleLogStorage;
import Interface.ILogStorage;

/**
 *
 * @author 14626232639
 */
public class RegistroLog {

    public static void main(String[] args) {
        ILogStorage log = new ArquivoLogStorage();
        
        log.armazenar("pçouify");
    }
}

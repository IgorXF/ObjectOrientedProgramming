/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projescolamvc;

import com.mycompany.projescolamvc.controller.AlunoController;
import com.mycompany.projescolamvc.gui.JFrameDepartamento;
import com.mycompany.projescolamvc.model.dao.AlunoDAOFile;
import com.mycompany.projescolamvc.model.dao.IDao;
import com.mycompany.projescolamvc.model.entities.Aluno;
import com.mycompany.projescolamvc.model.file.SerializadorJSONAluno;

/**
 *
 * @author igorxf
 */
public class ProjEscolaMVC {

    public static void main(String[] args) {
        //piloto();
        JFrameDepartamento tela = new JFrameDepartamento();
        tela.setVisible(true);
    }
    
    public static void piloto(){
        String caminhoArquivo = "ListagemAlunos.json"; // ou produtos.xml para SerializadorXMLProduto

        
        SerializadorJSONAluno serializador = new SerializadorJSONAluno();
       
        IDao repositorio = new AlunoDAOFile(caminhoArquivo, serializador);
        
        AlunoController controller = new AlunoController(repositorio);
        
        Aluno a1 = new Aluno("001", "Igor", 19, "1", "2023");
        controller.adicionarAluno("001", "Igor", "1", "1", "2023");
//        Produto p1 = new Produto("001", "Produto 1", 10.0, 15.0);
//        Produto p2 = new Produto("002", "Produto 2", 20.0, 25.0);
//        controller.adicionarProduto(p1);
//        controller.adicionarProduto(p2);
//
//        // Lista produtos
//        List<Produto> produtos = controller.listarProdutos();
//        produtos.forEach(System.out::println);
//
//        // Remove um produto
//        controller.removerProduto("001");
//
//        // Lista produtos novamente
//        produtos = controller.listarProdutos();
//        produtos.forEach(System.out::println);
    }
}

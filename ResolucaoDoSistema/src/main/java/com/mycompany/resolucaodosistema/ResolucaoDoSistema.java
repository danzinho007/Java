package com.mycompany.resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
// Programa pra 

/**
 *
 * @author Daniel
 */
public class ResolucaoDoSistema {
    
//    Programa que diz qual Resolução do Sistema a pessoa tem
//    Toolkit.getDefaultToolkit().getSreenSize() = Obtém a Dimensão da Tela
//    do Sistema Operacional
//    Converte a Largura e Altura em inteiro e guarda elas em variáveis
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) dimensao.getWidth();
        int altura = (int) dimensao.getHeight();
        System.out.println("A resolução da tela é " + largura + " x " + altura);
    }
}
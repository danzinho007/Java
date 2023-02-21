package com.mycompany.horadosistema;

import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Daniel
 */
public class HoraDoSistema {

/* 
    Programa que mostra a Data do Sistema
    Date = Classe específica do Java pra mostrar a Data
           Faz parte do pacote java.util.Date'
    new = Cria um novo Objeto
    relogio é um objeto
    relogio.toString = converte a Data em String
    .toString = Método
*/
    public static void main(String[] args) {
     Date relogio = new Date();
        System.out.println("A hora do Sistema é");
        System.out.println(relogio.toString());
        
/* 
     Classe Date caiu em desuso, atualmente é LocalDateTime
     LocalDateTime = Classe do Java pra mostrar a hora
                     Faz parte do pacote java.time.*;
*/
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("A hora do Sistema é ");
        System.out.println(agora.toString());
/*
    Formatando a Data e Hora :
    DateTimeFormatter = Classe do Java que cria um Objeto Formatter
        e depois formata a Data e Hora de acordo com o padrão
        Precisa importar o java.time.format.DateTimeFormatter;
*/        
        LocalDateTime atual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String atualFormatado = atual.format(formatter);
        System.out.println("A hora do Sistema é " + atualFormatado);
    }
}
package com.mycompany.idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Daniel
 */
public class IdiomaDoSistema {

//Prgrama que diz qual Idioma do PC da pessoa
//    Locale = Classe do Java pra obter informações sobre o idioma e região do
//    Sistema Operacional
//    Precisa importar java.util.Locale;
//    Obtem a Localização Padrão do S.O, recupera o Idioma a partir da 
//    localização ( getLanguage() )
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Locale localizacao = Locale.getDefault();
        String idioma = localizacao.getLanguage();
        System.out.println("O idioma do PC é " + idioma);
    }
}

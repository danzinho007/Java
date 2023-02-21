package com.mycompany.sistemaoperacionaldosistema;

/**
 *
 * @author Daniel
 */
public class SistemaOperacionalDoSistema {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nomeSO = System.getProperty("os.name");
        String versaoSO = System.getProperty("os.version");
        System.out.println("O sistema operacional é " + nomeSO + " " + versaoSO);
    }
}

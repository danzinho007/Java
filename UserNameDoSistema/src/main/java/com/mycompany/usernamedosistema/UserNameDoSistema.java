package com.mycompany.usernamedosistema;

/**
 *
 * @author Daniel
 */
public class UserNameDoSistema {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nomeUsuario = System.getProperty("user.name");
        System.out.println("O nome do usuário é " + nomeUsuario);
    }
}

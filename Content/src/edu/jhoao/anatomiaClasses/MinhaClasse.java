package edu.jhoao.anatomiaClasses;

public class MinhaClasse {
    public static void main(String [] args){
        String primeiroNome = "Jhoao";
        String segundoNome = "Pedro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primerioNome, String segundoNome){
         return primerioNome.concat(" ").concat(segundoNome);
    }

}
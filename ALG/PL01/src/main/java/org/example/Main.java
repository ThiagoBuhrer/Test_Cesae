package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Programa que solicita o nome do utilizar.
        System.out.println("Qual é o seu nome?");
        String nome = in.nextLine();
        System.out.println("Olá, "+nome+" bem-vindo!");
        //Ou tente essa outra opção:
        //System.out.println("Olá, "+in.nextLine()+" bem-vindo!");

        /*Este é um
        comentério de
        múltiplas linhas...
        */


    }
}
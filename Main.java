package br.unit.faculdade.revisao_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Bem vindo(a)! Qual é o seu nome ?");
        String nome = user.next();
        System.out.println();
        
        System.out.println("E o seu sobrenome ?");
        String sobrenome = user.next();
        System.out.println();
        
        System.out.println("Ótimo ! Você faz aniverário em qual dia ?");
        int dia = user.nextInt();
        System.out.println();
        
        System.out.println("E o mês ?");
        int mes = user.nextInt();
        System.out.println();
        
        System.out.println("E o ano ?");
        int ano = user.nextInt();
        System.out.println();
        
        HeartRates p1 = new HeartRates(nome,sobrenome,dia,mes,ano);
        p1.CalcularIdade();
        System.out.println();
        p1.CalcularFrequenciaMaximna();
        System.out.println();
        p1.CalcularFrequenciaAlvo();
        
    }
    
}

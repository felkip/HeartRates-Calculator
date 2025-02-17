package br.unit.faculdade.revisao_java;
import java.util.Scanner;
public class HeartRates {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    
    public HeartRates(String nome,String sobrenome,int dia, int mes,int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
}
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
     
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano= ano;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void CalcularIdade(){
       int idade_ano = 2025-this.ano;
       System.out.println("A sua idade em anos é "+idade_ano+" certo ?");
    }
    
    public void CalcularFrequenciaMaximna(){
      int idade_ano = 2025-this.ano;
      int frequencia_maxima = 220 - idade_ano;
      System.out.println("Essa é a sua frequência máxima : " + frequencia_maxima+" bpm.");
    }
    
    private int obterFrequenciaRepouso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua frequência cardíaca de repouso (bpm)?");
        return scanner.nextInt();
    }
    
    public void CalcularFrequenciaAlvo(){
      int idade_ano = 2025- this.ano;
      int frequencia_maxima = 220 - idade_ano;
      Scanner input = new Scanner(System.in);
      System.out.println("Qual a intensidade do exercício? (1-leve, 2-moderada, 3-intensa)");
      int intensidade = input.nextInt();

    double intensidadePercentual;
    switch (intensidade) {
        case 1:
            intensidadePercentual = 0.5; // 50%
            break;
        case 2:
            intensidadePercentual = 0.7; // 70%
            break;
        case 3:
            intensidadePercentual = 0.85; // 85%
            break;
        default:
            intensidadePercentual = 0.7; // 70% (padrão)
            System.out.println("Intensidade inválida, usando 70%.");
    }
        int frequenciaRepouso = obterFrequenciaRepouso();
        double frequenciaAlvo = ((frequencia_maxima - frequenciaRepouso) * intensidadePercentual) + frequenciaRepouso;

        System.out.println("Sua frequência cardíaca alvo é: " + frequenciaAlvo + " bpm.");
    }
    
}

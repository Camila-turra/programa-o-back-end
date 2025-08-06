package com.mycompany.poo.aula10;

public class App {
 public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.nome = "Camila";
    pessoa.idade = 16;
    // pessoa.salario = 5.000; atributos privados não são visíveis

    // Intanciando classes que estão declaradas em outros arquivos
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();

    pessoa1.nome = "Arthur";
    pessoa1.idade = 2;
    pessoa1.altura = 0.80;

    pessoa2.nome = "Turrinha";
    pessoa2.idade = 16;
    pessoa2.altura = 1.64;

    pessoa1.exibirDados();
    pessoa2.exibirDados();

    pessoa1.atribuirSalario(2000.0, 500);
    pessoa2.atribuirSalario(3500);

   /*System.out.println("--- Dados da pessoa ---");
    System.out.println("Nome: " + pessoa1.nome);
    System.out.println("Idade: " + pessoa1.idade);
    System.out.println("Altura (m): " + pessoa1.altura);

    System.out.println("--- Dados da pessoa ---");
    System.out.println("Nome: " + pessoa2.nome);
    System.out.println("Idade: " + pessoa2.idade);
    System.out.println("Altura (m): " + pessoa2.altura);*/
 }   
}

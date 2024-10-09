/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author marce
 */

import java.util.Scanner;

public class Array{

    public static void main(String[] args) {
// Cria um scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);
// Define o tamanho do array
int[] numeros = new int[5];

// Recebe os 5 números do usuário
System.out.println("Digite 5 números:");
for (int i = 0; i < numeros.length; i++) {
System.out.print("Número " + (i + 1) + ": ");
numeros[i] = scanner.nextInt();
}

// Exibe os números na ordem inversa
System.out.println("\nNúmeros na ordem inversa:");
for (int i = numeros.length - 1; i >= 0; i--) {
System.out.println(numeros[i]);
}
// Fecha o scanner
scanner.close();
}
}
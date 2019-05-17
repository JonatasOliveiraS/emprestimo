package com.br.aula.java;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe sua idade : ");
		int idade = entrada.nextInt();
		
		System.out.println("informe sua renda : ");
		double renda = entrada.nextDouble();
		
		System.out.println("informe o valor pedido : ");
		double valorPedido = entrada.nextDouble();
		
		int juros = 3;
		double valorTotal = (((valorPedido * juros)/100)*12);
		
		if (idade >= 25 && idade <= 60) {
			System.out.println("idade adequada");
			if (renda > 1000) {
				if (valorPedido >= 1000 && valorPedido <= renda * 10) {
					System.out.println("valor aceito , parabens");
				
				}else 
					System.out.println("idade inadequada");
			
			}else {
				System.out.println("renda insuficiente");
			}
		}else {
			System.out.println("idade inadequada");
				}
			}
		
	
	
	
	
	
	}
		
		
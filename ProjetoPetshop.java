package com.mycompany.projetopetshop;

import java.util.Scanner;
import java.util.*;

public class ProjetoPetshop {
	
		
		//SCANNERS
		public static Scanner scanner;
		public static int numero;
		public static int qtdPeq;
		public static int qtdGran; 
		public static int qtdPeqfs; 
		public static int qtdGranfs;
		
		//VALORES DOS PETSHOPS
		public static int GrandePetMCF = 40;
		public static int PequenoPetMCF = 20;
		public static double meucaninofelizKM = 2.000;
		public static int GranPetMCFfinal = 48;
		public static int PeqPetMCFfinal = 24;

		public static int GrandePetVR = 50;
		public static int PequenoPetVR = 15;
		public static double VaiRexKM = 1.700;
		public static int GranPetVRfinal = 20;
		public static int PeqPetVRfinal = 55;

		public static int PequenoChowC = 30;
		public static int GrandeChowC = 45;
		public static int ChowChawgasMetros = 800;
	    
		
	    //VALORES DA ESTRUTURA IF...ELSE PEQUENO E GRANDE
		  public static int PeqMCF = (qtdPeq * PequenoPetMCF); 
          public static int GranMCF = (qtdGran * GrandePetMCF);
		  public static int GfsMCF = (qtdGranfs * GranPetMCFfinal); 
		  public static int PfsMCF = (qtdPeqfs * PeqPetMCFfinal); 
		  public static int PeqVR = (qtdGranfs * GranPetVRfinal);
     	  public static int GranVR = (qtdPeqfs * PeqPetVRfinal);
	      public static int GranVRfs = (qtdPeq * GrandePetVR);
		  public static int PeqVRfs = (qtdGran * PequenoPetVR);
		  public static int PeqChowC = (qtdPeq * PequenoChowC);
		  public static int GranChowC = (qtdGran * GrandeChowC);
	    
	     
	public static void main(String[] args){
		
	    Scanner valor = new Scanner(System.in);

	    System.out.println("Digite 1 ou 2 para o dia que voce deseja ir ao Petshop"); 
	    System.out.println("===============================================================================================");
	    System.out.println("1 - dia util");
	    System.out.println("|------------------------------------------------------------------------------|");
	    System.out.println("2 - final de semana");
	    System.out.println("|------------------------------------------------------------------------------|");
	    numero = valor.nextInt();
	    
	   
			//ESTRUTURA CONDICIONAL
		switch(numero) {
			case 1:
				System.out.println("Você escolheu dias uteis! Agora digite a quantidade de animais de pequeno porte:");
				qtdPeq = valor.nextInt();
			
				System.out.println("Agora digite a quantidade de animais de grande porte: ");
				qtdGran = valor.nextInt();
				
					//COMPARAÇAO DOS VALORES
					if (PeqMCF <= PeqVR &&  GranMCF <= GranVR || PeqMCF <= PeqChowC && GranMCF <= GranChowC){
					System.out.println("===============================================================================================");
					System.out.println("O melhor petshop para você é Meu Canino Feliz, pelo valor mais economico para pet de pequeno porte por: R$" + (qtdPeq*PequenoPetMCF) + " e grande porte por: R$:" +(qtdGran * GrandePetMCF));
					
					}else if (PeqVR <= PeqMCF && GranVR <= GranMCF || PeqVR <= PeqChowC && GranVR <= GranChowC) {
					System.out.println("===============================================================================================");
					System.out.println("O melhor petshop para você é Vai Rex, pelo valor mais economico para pet de pequeno porte por: R$" + (qtdPeq * GrandePetVR) +" e de grande porte por: R$" +(qtdPeq * GrandePetVR));
					
					}else if(PeqChowC <= PeqMCF && GranChowC <= GranMCF || PeqChowC <= PeqVR && GranChowC <= GranVR){
					System.out.println("===============================================================================================");
					System.out.println("O melhor petshop para você é Chow Chawgs, pelo valor mais economico de pequeno porte: R$" + (qtdPeq * PequenoChowC) + " e de grande porte por: R$" + (qtdPeq * PequenoChowC));
					}	
				
			break;
			
			case 2:
				System.out.println("Você escolheu os finais de semana! Digite a quantidade de animais de pequeno porte:");
				qtdPeqfs = valor.nextInt();
				
				System.out.println("Agora Digite a quantidade de animais de grande porte:");
				qtdGranfs = valor.nextInt();
				

					if (PfsMCF <= PeqVRfs &&  GfsMCF <= GranVRfs ||  PfsMCF <= PeqChowC && GfsMCF <= GranChowC){
					System.out.println("===============================================================================================");
					System.out.println("O melhor petshop para você é Meu Canino Feliz, pelo valor mais economico para pet de pequeno porte por: R$" + (qtdPeqfs * PeqPetMCFfinal) + " e grande porte por: R$:" + (qtdGranfs * GranPetVRfinal));
					
					}else if (PeqVRfs <= PfsMCF && GranVRfs <= GfsMCF || PeqVRfs <= PeqChowC && GranVRfs <= GranChowC) {
					System.out.println("===============================================================================================");
					System.out.println("O melhor petshop para você é Vai Rex, pelo valor mais economico para pet de pequeno porte por: R$" + (qtdPeqfs *PeqPetVRfinal) +" e de grande porte por: R$" + (qtdGranfs * GranPetVRfinal));

					}else if(PeqChowC <= PfsMCF && GranChowC <= GranVRfs || PeqChowC <= PeqVRfs && GranChowC <= GranVRfs){
					System.out.println("===============================================================================================");
				System.out.println("O melhor petshop para você é Chow Chawgs, pelo valor mais economico de pequeno porte: R$" + (qtdPeqfs * PequenoChowC) + " e de grande porte por: R$" + (qtdGranfs * GrandeChowC));
				}	
			break;	
			
			default:
				System.out.println("Está opção não existe. Tente novamente.");
		}	

	}
	
}	
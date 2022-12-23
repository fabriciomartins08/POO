package br.uern.di.poo.unidade1.construcao;

import java.text.DecimalFormat; 

public class Main {
    public static void main(String args[]){
                
                
 
                DecimalFormat df = new DecimalFormat("#,###.00");
                 
        
		Porta porta1 = new Porta(ePortas.porta_simples, 1.8, 1.1, false);
                Porta porta2 = new Porta(ePortas.porta_de_luxo, 1.9, 1.5, true);
                Porta porta3 = new Porta(ePortas.porta_padrao, 1.7, 1.2, true);
                Porta porta4 = new Porta(ePortas.porta_simples, 1.6, 1.6, false);
	
                double p1 = porta1.calculaPreco();
                double p2 = porta2.calculaPreco();
                double p3 = porta3.calculaPreco();
                double p4 = porta4.calculaPreco();
                
                Servicos servico = new Servicos();
                
                porta1.exibePorta();
                System.out.println("preco: R$ " + df.format(p1) );
                System.out.println("Valor da instalacao: R$ " + df.format(servico.instalacao(porta1)));
                
                System.out.println();
                
                porta2.exibePorta();
                System.out.println("preco: R$ " + df.format(p2));
                System.out.println("Valor da instalacao: R$ " + df.format(servico.instalacao(porta2)));
                
                System.out.println();
                
                porta3.exibePorta();
                System.out.println("preco: R$ " + df.format(p3));
                System.out.println("Valor da instalacao: R$ " + df.format(servico.instalacao(porta3)));
                
                System.out.println();
                
                porta4.exibePorta();
                System.out.println("preco: R$ " + df.format(p4));
                System.out.println("Valor da instalacao: R$ " + df.format(servico.instalacao(porta4)));
    }
}
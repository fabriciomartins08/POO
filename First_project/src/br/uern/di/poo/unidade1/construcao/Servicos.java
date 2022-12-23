package br.uern.di.poo.unidade1.construcao;


public class Servicos {
                public static final double VALOR_LUXO=0.1,INSTALACAO=70.00 , PIVOTANTE =250.00;
		
		public static double instalacao(Porta uma_porta){
			double servicos=0;
			
			servicos= servicos+ INSTALACAO;
			
			if(uma_porta.tipo_porta == ePortas.porta_de_luxo) {
				servicos=servicos + uma_porta.calculaPreco()*  VALOR_LUXO;
			}
			
			if(uma_porta.pivotante == true) {
				servicos=servicos +  PIVOTANTE;
			}
			
			return servicos;
		}  
}

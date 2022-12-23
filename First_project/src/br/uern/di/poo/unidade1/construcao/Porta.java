package br.uern.di.poo.unidade1.construcao;

public class Porta{
		public static final double VALORACRESCENTADO = 350.0;
                public static final double ALTURA = 1.8;
                public static final double LARGURA = 0.7;
                
                ePortas tipo_porta;
		double alt=1.8,larg=0.7;
		boolean pivotante= false;
		
		public Porta() {
			tipo_porta=ePortas.porta_simples;
			alt= ALTURA;
			larg= LARGURA;
			pivotante=false;
			
		}

		public Porta(ePortas tipo_porta, double alt, double larg, boolean pivotante) {
			this.tipo_porta = tipo_porta;
			this.alt = alt;
			this.larg = larg;
			this.pivotante = pivotante;
		}

		public ePortas getTipo_porta() {
			return tipo_porta;
		}

		public void setTipo_porta(ePortas tipo_porta) {
			this.tipo_porta = tipo_porta;
		}

		public double getAlt() {
			return alt;
		}

		public void setAlt(double alt) {
			this.alt = alt;
		}

		public double getLarg() {
			return larg;
		}

		public void setLarg(double larg) {
			this.larg = larg;
		}

		public boolean isPivotante() {
			return pivotante;
		}

		public void setPivotante(boolean pivotante) {
			this.pivotante = pivotante;
		}
		
		public double calculaPreco(){
				double valor = 0;
				double area;
			
				area=this.alt*this.larg;
				if(this.tipo_porta == ePortas.porta_simples) {
					valor = ePortas.porta_simples.valor_m2 * area;
					if (this.pivotante == true) {
						valor += VALORACRESCENTADO;
					}
				}
				
				if(this.tipo_porta == ePortas.porta_padrao) {
					valor = ePortas.porta_padrao.valor_m2 * area;
					if (this.pivotante == true) {
						valor += VALORACRESCENTADO;
					}
					}
				if(this.tipo_porta == ePortas.porta_de_luxo) {
					valor = ePortas.porta_de_luxo.valor_m2 * area;
					if (this.pivotante == true) {
						valor += VALORACRESCENTADO;
					}
					}
			

			return valor;
		}
		
		public void exibePorta() {
			
			System.out.println("tipo da porta: "+ this.tipo_porta + "\naltura: " + this.alt + "\nlargura: " + this.larg + "\npivotante: " + this.pivotante);
		}
}
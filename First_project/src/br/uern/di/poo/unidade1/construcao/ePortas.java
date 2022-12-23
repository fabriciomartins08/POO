package br.uern.di.poo.unidade1.construcao;


public enum ePortas {
        porta_simples("madeira compensada", "fechadura simples", 50.00), porta_padrao("madeira andiroba", "encaixe", 140.00), porta_de_luxo("madeira ipÃª", "tetra", 350.00);
		
	String tipo_madeira,tipo_fechadura;
	double valor_m2;
	
	private ePortas (String tipo_madeira,String tipo_fechadura,double valor){
		this.tipo_madeira=tipo_madeira;
		this.tipo_fechadura=tipo_fechadura;
		this.valor_m2=valor;
	}

	public String getTipo_madeira() {
		return tipo_madeira;
	}

	public String getTipo_fechadura() {
		return tipo_fechadura;
	}

	public double getValor_m2() {
		return valor_m2;
	}
	
		
}


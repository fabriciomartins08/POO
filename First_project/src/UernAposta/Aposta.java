package UernAposta;

public class Aposta {

 private Evento evento;
 private Resultado resultado;
 private double valorApostado;
public Evento getEvento() {
	return evento;
}
public void setEvento(Evento evento) {
	this.evento = evento;
}
public Resultado getResultado() {
	return resultado;
}
public void setResultado(Resultado resultado) {
	this.resultado = resultado;
}
public double getValorApostado() {
	return valorApostado;
}
public void setValorApostado(double valorApostado) {
	this.valorApostado = valorApostado;
}
public Aposta(Evento evento, Resultado resultado, double valorApostado) {
	this.evento = evento;
	this.resultado = resultado;
	this.valorApostado = valorApostado;
}

public double calculaLucro(Evento quartasFinal1) {
	return getValorApostado()*0.5;
	
    }
}
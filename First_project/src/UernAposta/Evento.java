package UernAposta;

public class Evento {
	
	
	private String nome1;
	private String time1;
	private String time2;
	private double num1,num2,num3;
	private Resultado resultado;
	
	public Resultado getResultado() {
		return resultado;
	}
	public String getNome1() {
		return nome1;
	}
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getNum3() {
		return num3;
	}
	public void setNum3(double num3) {
		this.num3 = num3;
	}
	public Evento(String nome1, String time1, String time2, double num1, double num2, double num3) {
		this.nome1 = nome1;
		this.time1 = time1;
		this.time2 = time2;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
		
	}
	
		
	
	
	
	
}

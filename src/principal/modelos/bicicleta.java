package principal.modelos;

public class bicicleta {

	private String modelo;
	private int velocidade;
	private int pedaladasPorMinuto;
	private int marcha;
	private quadro quadro;
	private roda rodaDianteira;
	private roda rodaTraseira;
	int totalDeProdutos;
	
	public bicicleta(String modelo, int velocidade ,int pedaladasPorMinuto ,int marcha) {
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.marcha = marcha;
		this.pedaladasPorMinuto = pedaladasPorMinuto;
		
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getPedaladasPorMinuto() {
		return pedaladasPorMinuto;
	}
	
	public int getMarcha() {
		return marcha;
	}
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setVelocidade(int velocidade) {
		if(velocidade >= 0) {
			this.velocidade = velocidade;
		}
	}
	public void setPedaladasPorMinuto(int pedaladasPorMinuto) {
			this.pedaladasPorMinuto = pedaladasPorMinuto;
		}
		
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public quadro getQuadro() {
		return quadro;
	}

	public void setQuadro(quadro quadro) {
		this.quadro = quadro;
	}

	public roda getRodaDianteira() {
		return rodaDianteira;
	}

	public void setRodaDianteira(roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}

	public roda getRodaTraseira() {
		return rodaTraseira;
	}

	public void setRodaTraseira(roda rodaTraseira) {
		this.rodaTraseira = rodaTraseira;
	}
	
}

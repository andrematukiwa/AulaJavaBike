package principal.modelos;

public class quadro {

	private String tamanho;
	private String cor;
	private String material;
	
	public quadro(String tamanho, String cor , String material) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.material = material;
		
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	

	
}

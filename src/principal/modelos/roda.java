package principal.modelos;

public class roda {
	
	private String aro;
	private String cor;
	private String material;
	
	public roda(String aro, String cor , String material) {
		this.aro = aro;
		this.cor = cor;
		this.material = material;
		
	}
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
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

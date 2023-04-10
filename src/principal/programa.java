package principal;

import principal.modelos.*;

public class programa {
	
	public static void main(String[] args) {
		
		quadro QuadroDaBike = new quadro("Grande","Vermelha","Aluminio"); 
		roda rodaDianteiraDaBike = new roda("20","Aluminio","Aluminio");
		roda rodaTraseiraDaBike = new roda("20","Aluminio","Aluminio");
		bicicleta minhaBike =  new bicicleta("Caloi",0 ,0 ,1);
		
		
	
		
		
		
		System.out.println("Modelo: " + minhaBike.getModelo());
		System.out.println("Velocidade: " + minhaBike.getVelocidade());
		System.out.println("Marcha: " + minhaBike.getMarcha());
		System.out.println("Pedaladas: " + minhaBike.getPedaladasPorMinuto());
		
		System.out.println("Tamanho: " + QuadroDaBike.getTamanho());
		System.out.println("Cor: " + QuadroDaBike.getCor());
		System.out.println("Material: " + QuadroDaBike.getMaterial());
	
		System.out.println("Roda dianteira aro: " + rodaDianteiraDaBike.getAro());
		System.out.println("Roda dianteira cor: " + rodaDianteiraDaBike.getCor());
		System.out.println("Roda dianteiramaterial: " + rodaDianteiraDaBike.getMaterial());
		
		System.out.println("Roda traseira aro: " + rodaTraseiraDaBike.getAro());
		System.out.println("Roda traseira cor: " + rodaTraseiraDaBike.getCor());
		System.out.println("Roda traseira material: " + rodaTraseiraDaBike.getMaterial());
		
		
	}

}

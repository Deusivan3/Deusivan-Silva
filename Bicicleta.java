package Veiculo;

public class Bicicleta extends Veiculo {
	public Bicicleta(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    public void trocarMarcha() {
        System.out.println("Trocando marcha");
    }

    
    @Override
    public void mover() {
    	System.out.println("A bicicleta está se movendo");
    	
    }
    
    @Override
    public void info () {
    	System.out.println("Marca: "+marca+ "Modelo: "+modelo+ "Ano: "+ano+ "Cor"+cor);
    	
    }
    
}

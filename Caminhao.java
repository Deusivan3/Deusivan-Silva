package Veiculo;

public class Caminhao extends Veiculo {
	public Caminhao(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    public void levantarCarga() {
        System.out.println("Levantando carga");
    }
    @Override
    public void mover() {
    	System.out.println("O caminhao está se movendo");
    	
    }
    
    @Override
    public void info () {
    	System.out.println("Marca: "+marca+ "Modelo: "+modelo+ "Ano: "+ano+ "Cor"+cor);
    	
    }
	

}

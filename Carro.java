package Veiculo;

public class Carro extends Veiculo {
	
	public Carro(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
        
        
        
    }

    public void ligarArCondicionado() {
        System.out.println("Ligando ar condicionado");
        
    }
    @Override
    public void mover() {
    	System.out.println("O carro está se movendo");
    	
    }
    
    @Override
    public void info () {
    	System.out.println("Marca: "+marca+ "Modelo: "+modelo+ "Ano: "+ano+ "Cor"+cor);
    	
    	
    }
    
    
}




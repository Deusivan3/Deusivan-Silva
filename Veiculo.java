package Veiculo;

public class Veiculo {

	
	    public String marca;
	    public String modelo;
	    public int ano;
	    public String cor;

	    public Veiculo(String marca , String modelo , int ano , String cor ) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	    }
	    public void mover () {
	    	System.out.println("O veiculo está se locomvendo");
	    	
	    	
	    }
	    
	    public void info () {
	    	System.out.println("Marca: "+marca+ "Modelo: "+modelo+ "Ano: "+ano+ "Cor"+cor);
	    	
	    }

	    
}
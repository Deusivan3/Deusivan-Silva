package Veiculo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro(" Fiat ", " Estrada ", 2019 , " prata " );
		Bicicleta bicicleta = new Bicicleta( "scott " , " Spark 910 ", 2020 , " verde " );
		Caminhao caminhao = new Caminhao(" Mercedes " , " Arocs " , 2023 , " vermelho " );
		
	carro.info();
	carro.mover();	
	carro.ligarArCondicionado();
	
	bicicleta.info();
	bicicleta.mover();
	bicicleta.trocarMarcha();
	
	caminhao.info();
	caminhao.mover();
	caminhao.levantarCarga();
		

	}

}

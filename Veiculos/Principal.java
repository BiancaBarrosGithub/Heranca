package Veiculos;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("BMW","BMW X1",2022,"Perto");
		System.out.println("Veiculo");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		Automovel automovel = new Automovel("BMW","BMW X1",2022,"Perto",4,"motor");
		System.out.println("Automovel");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano:  " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("NumeroPortas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		Moto moto = new Moto("BMW","BMW X1",2022,"Perto",100);
		System.out.println("Moto");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano:  " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada());
	}
}

package poo1;

public class ObjetoCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();

		//Objeto 1
		carro1.setCor("Amarelo");
		carro1.setMarca("Renault");
		carro1.setPorta(4);
		carro1.setTipo("Esportivo");
		carro1.setVireDireita("Sim");
		carro1.setVireEsquerda("Sim");
		carro1.setAceleracao(90);
		carro1.setVelocidadeMax(200);

		//Objeto 2
		carro2.setCor("Cinza");
		carro2.setMarca("Chevrolet");
		carro2.setPorta(2);
		carro2.setTipo("Desportivo");
		carro2.setVireDireita("Sim");
		carro2.setVireEsquerda("Sim");
		carro2.setAceleracao(40);
		carro2.setVelocidadeMax(160);

		//Objeto 3
		carro3.setCor("Cinza Escuro");
		carro3.setMarca("Mercedes");
		carro3.setPorta(2);
		carro3.setTipo("Esportivo");
		carro3.setVireDireita("Sim");
		carro3.setVireEsquerda("Sim");
		carro3.setAceleracao(100);
		carro3.setVelocidadeMax(180);
		
		//Objeto 4
		carro4.setCor("Azul");
		carro4.setMarca("Fiat");
		carro4.setPorta(4);
		carro4.setTipo("Desportivo");
		carro4.setVireDireita("Sim");
		carro4.setVireEsquerda("Sim");
		carro4.setAceleracao(30);
		carro4.setVelocidadeMax(100);
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(carro1.getCor());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getPorta());
		System.out.println(carro1.getTipo());
		System.out.println(carro1.getVireDireita());
		System.out.println(carro1.getVireEsquerda());
		System.out.println(carro1.getAceleracao());
		System.out.println(carro1.getVelocidadeMax());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(carro2.getCor());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getPorta());
		System.out.println(carro2.getTipo());
		System.out.println(carro2.getVireDireita());
		System.out.println(carro2.getVireEsquerda());
		System.out.println(carro2.getAceleracao());
		System.out.println(carro2.getVelocidadeMax());
		
		System.out.println("-----OBJETO 3-----");
		System.out.println(carro3.getCor());
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getPorta());
		System.out.println(carro3.getTipo());
		System.out.println(carro3.getVireDireita());
		System.out.println(carro3.getVireEsquerda());
		System.out.println(carro3.getAceleracao());
		System.out.println(carro3.getVelocidadeMax());
		
		System.out.println("-----OBJETO 4-----");
		System.out.println(carro4.getCor());
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getPorta());
		System.out.println(carro4.getTipo());
		System.out.println(carro4.getVireDireita());
		System.out.println(carro4.getVireEsquerda());
		System.out.println(carro4.getAceleracao());
		System.out.println(carro4.getVelocidadeMax());
	}

}

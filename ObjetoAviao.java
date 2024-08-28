package poo1;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();

		//Objeto 1
		aviao1.setCor("Branco");
		aviao1.setTipo("Pistão");
		aviao1.setNumJanela(100);
		aviao1.setNumTurbina(9);
		aviao1.setSobe("Sim");
		aviao1.setDesce("Sim");
		aviao1.setMovAsa("Sim");
		aviao1.setAbrePorta("Sim");

		//Objeto 2
		aviao2.setCor("Preto");
		aviao2.setTipo("Turboélice");
		aviao2.setNumJanela(100);
		aviao2.setNumTurbina(9);
		aviao2.setSobe("Não");
		aviao2.setDesce("Não");
		aviao2.setMovAsa("Sim");
		aviao2.setAbrePorta("Sim");

		//Objeto 3
		aviao3.setCor("Azul");
		aviao3.setTipo("Jato");
		aviao3.setNumJanela(110);
		aviao3.setNumTurbina(9);
		aviao3.setSobe("Não");
		aviao3.setDesce("Não");
		aviao3.setMovAsa("Não");
		aviao3.setAbrePorta("Sim");

		//Objeto 4
		aviao4.setCor("Vermelho");
		aviao4.setTipo("Supersônico");
		aviao4.setNumJanela(110);
		aviao4.setNumTurbina(9);
		aviao4.setSobe("Não");
		aviao4.setDesce("Não");
		aviao4.setMovAsa("Não");
		aviao4.setAbrePorta("Não");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getTipo());
		System.out.println(aviao1.getNumJanela());
		System.out.println(aviao1.getNumTurbina());
		System.out.println(aviao1.getSobe());
		System.out.println(aviao1.getDesce());
		System.out.println(aviao1.getMovAsa());
		System.out.println(aviao1.getAbrePorta());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getTipo());
		System.out.println(aviao2.getNumJanela());
		System.out.println(aviao2.getNumTurbina());
		System.out.println(aviao2.getSobe());
		System.out.println(aviao2.getDesce());
		System.out.println(aviao2.getMovAsa());
		System.out.println(aviao2.getAbrePorta());
		
		System.out.println("-----OBJETO 3-----");
		System.out.println(aviao3.getCor());
		System.out.println(aviao3.getTipo());
		System.out.println(aviao3.getNumJanela());
		System.out.println(aviao3.getNumTurbina());
		System.out.println(aviao3.getSobe());
		System.out.println(aviao3.getDesce());
		System.out.println(aviao3.getMovAsa());
		System.out.println(aviao3.getAbrePorta());
		
		System.out.println("-----OBJETO 4-----");
		System.out.println(aviao4.getCor());
		System.out.println(aviao4.getTipo());
		System.out.println(aviao4.getNumJanela());
		System.out.println(aviao4.getNumTurbina());
		System.out.println(aviao4.getSobe());
		System.out.println(aviao4.getDesce());
		System.out.println(aviao4.getMovAsa());
		System.out.println(aviao4.getAbrePorta());
	}

}

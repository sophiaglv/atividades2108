package poo1;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		//Objeto 1
		cliente1.setId(01);
		cliente1.setNome("Sophia");
		cliente1.setCPF("12345678901");
		cliente1.setRG("123F45678");
		cliente1.setTrabalha("Sim");
		cliente1.setAnda("Sim");
		cliente1.setFala("Sim");
		cliente1.setEnxerga("Sim");

		//Objeto 2
		cliente2.setId(02);
		cliente2.setNome("Janaina");
		cliente2.setCPF("01987654321");
		cliente2.setRG("35G81475G4");
		cliente2.setTrabalha("Não");
		cliente2.setAnda("Sim");
		cliente2.setFala("Sim");
		cliente2.setEnxerga("Não");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getRG());
		System.out.println(cliente1.getTrabalha());
		System.out.println(cliente1.getAnda());
		System.out.println(cliente1.getFala());
		System.out.println(cliente1.getEnxerga());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getCPF());
		System.out.println(cliente2.getRG());
		System.out.println(cliente2.getTrabalha());
		System.out.println(cliente2.getAnda());
		System.out.println(cliente2.getFala());
		System.out.println(cliente2.getEnxerga());
	}

}

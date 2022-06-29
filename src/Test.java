
public class Test {
	
	public static void main(String args[]) {
		
		SistemaInterno sistema = new SistemaInterno();
		
		Gerente gerente = new Gerente(3, "Lucas");
		Caixa caixa = new Caixa(6, "Felipe");
		Supervisor supervisor = new Supervisor(2, "Jorge");
		
		gerente.setSenha(123);
		caixa.setSenha(444);
		supervisor.setSenha(456);
		
		System.out.println("Gerente: ");
		sistema.login(gerente);
		System.out.println("Caixa: ");
		sistema.login(caixa);
		System.out.println("Supervisor: ");
		sistema.login(supervisor);
	}
}

import java.util.Scanner;

public class SistemaInterno {

	public void login(FuncionarioAutenticavel funcionario) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a senha:");
		
		int senha = scan.nextInt();
		
		if(funcionario.autentica(senha)) {
			System.out.println("Funcionario Autenticado!");
		}else{
			System.out.println("O Funcionario nao possui permissao de acesso!");
		}	
	}
}

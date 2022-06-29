
public class Supervisor extends FuncionarioAutenticavel{
	
	public Supervisor(int codigo, String nome) {
		super(codigo, nome);
	}

	int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public int getSenhaFuncionario() {
		return senha;
	}
}

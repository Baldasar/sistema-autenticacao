
public class Gerente extends FuncionarioAutenticavel{
	
	public Gerente(int codigo, String nome) {
		super(codigo, nome);
	}

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public int getSenhaFuncionario() {
		return senha;
	}
}
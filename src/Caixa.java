
public class Caixa extends FuncionarioAutenticavel{
	public Caixa(int codigo, String nome) {
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
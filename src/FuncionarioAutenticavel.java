
public abstract class FuncionarioAutenticavel extends Funcionario{
	
	public FuncionarioAutenticavel(int codigo, String nome) {
		super(codigo, nome);
	}
	
	@Override
	public boolean autentica(int senha) {
		if(senha == getSenhaFuncionario()) {
			return true;
		}else {
			return false;
		}
	}
}

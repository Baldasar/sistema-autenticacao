
public abstract class Funcionario {
	
	private int codigo;
	private String nome;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public abstract boolean autentica(int senha);
	public abstract int getSenhaFuncionario();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

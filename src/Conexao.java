
public class Conexao implements AutoCloseable {

	public Conexao(){
		System.out.println("Abriu conexão");
		throw new IllegalStateException();
	}

	public void leDados(){
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}
	
	public void fecha(){
		System.out.println("Fechando conexão");
	}

	@Override
	public void close(){
		System.out.println("Fechando conexão");
	}
}

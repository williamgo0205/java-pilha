
public class Conexao implements AutoCloseable {

	public Conexao(){
		System.out.println("Abriu conex�o");
		throw new IllegalStateException();
	}

	public void leDados(){
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}
	
	public void fecha(){
		System.out.println("Fechando conex�o");
	}

	@Override
	public void close(){
		System.out.println("Fechando conex�o");
	}
}

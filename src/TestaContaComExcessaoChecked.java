public class TestaContaComExcessaoChecked {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.Deposita();
		} catch (MinhaException ex) {
			System.out.println("tratamento ....");
			
		}
		
	}
}	

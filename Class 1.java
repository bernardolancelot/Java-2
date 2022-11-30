public class Numero {
	private int num;
	public Numero(int num){
		this.num = num;
	}
	public boolean verificaPrimo() throws PrimoException {
		if(num == 0 || num == 1){
			throw new PrimoException();
		}
		for(int i = 2; i < num; i) {
			if (numero % i == 0) {
				throw new PrimoException();
			}
		}
		return true;
	}
}

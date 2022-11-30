public class TestaNumero {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		Numero num  = new Numero(num);
		int num = newstInt();
		try {
			if(num.verificaPrimo()) {
				System.out.println("O número é primo.");
			}
		}
		catch(PrimoException e) {
			Sistem.out.println("Erro: " + e);
		}
		finally{
			ent.close();
		}
	}
}

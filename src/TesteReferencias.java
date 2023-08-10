// quando tem um new so so tem uma referencia 
public class TesteReferencias {

	public static void main(String[] args) {
	Conta primeiraConta=new Conta();
	primeiraConta.saldo = 300;
	System.out.println("Saldo da primeira conta =  " + primeiraConta.saldo);
	
	
	// referencia a primeira conta 
	Conta segundaConta=primeiraConta;
	System.out.println("Saldo da segunda conta =  " + segundaConta.saldo);
	
	// soma 
	segundaConta.saldo+=100;
	System.out.println("Saldo da segunda conta =  " + segundaConta.saldo);

	System.out.println(primeiraConta.saldo);
	
	
// conta se referencia ao mesmo objeto
	
	if(primeiraConta == segundaConta) {
		System.out.println("São as mesma conta");
	}
	
	}

}

//acesso de um atributo a um objeto 
public class CriaConta {

	public static void main(String[] args) {
// criando o objeto com o new e referenciado 
	Conta primeiraConta = new Conta();
	primeiraConta.saldo=200;
	//imprime
	System.out.println(primeiraConta.saldo);
	//somando valor
	primeiraConta.saldo+=100;
	System.out.println(primeiraConta.saldo);
	
	Conta segundaConta =new Conta();
	segundaConta.saldo=50;
	System.out.println("Primeira conta tem " +primeiraConta.saldo);
	System.out.println("Segunda conta tem " + segundaConta.saldo);
	// criando objeto
	
	segundaConta.agencia =146;
	System.out.println(segundaConta.agencia);
	System.out.println("Agora a segunda conta está na agencia" + segundaConta.agencia);
	
	
	
	System.out.println(primeiraConta.numero);
	if(primeiraConta == segundaConta) {
		System.out.println("São as mesma conta");
	}else {
		System.out.println("Contas diferentes");
	}
	
	
	
	}

}

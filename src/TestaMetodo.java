
public class TestaMetodo {

	public static void main(String[] args) {

		// chamando a conta
		// primeiro nome da variavel
		// segundo nome da classe
		Conta contaDoPaulo = new Conta();
		// invocando o metodo
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
// testando o saldo 
		boolean consequiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(consequiuRetirar);

// testando transferencia 
Conta contaDaMarcela=new Conta();
contaDaMarcela.deposita(1000);
// transfere 
if (contaDaMarcela.transfere(3000, contaDoPaulo)) {
	System.out.println("Transferencia com sucesso");
	
}else{
	System.out.println("Transferencia não realizada");
	
}

System.out.println(contaDaMarcela.saldo);
System.out.println(contaDoPaulo.saldo);
	}
	}



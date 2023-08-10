//atributos
public class Conta {
//	dubble tipo de variavel 
	double saldo;
	int agencia;
	int numero;
	String titular;

	// coportamentos
	// metodos
//	void metodo que nao retorna resposta
//	1- metodo tem uma informação a esquerda 
	public void deposita(double valor) {
		// this referencia a um objeto
//		this.saldo = this.saldo+ valor;	
		this.saldo += valor;
	}

//	funções metodo com retorno 
//	2- metodo comm resposta
	public boolean saca(double valor) {
		// tem dinheiro
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

//	3 metodo
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false;
		}
	}


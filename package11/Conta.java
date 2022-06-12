package package11;

public class Conta {
	private float saldo;
	private float limite;
	float val_ret;

	public Conta(int Id, float saldo, float limite, Cliente cliente) {
		this.saldo = saldo;
		this.limite = limite;
	}
	

	public void sacar(float valor) {

		if (valor <= (this.saldo)) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque  Raalizado com Sucesso");
		} else if (valor <= (this.saldo + this.limite)) {
			// Calculando o valor exedente do saque
			// 100 - 200 = ->100
			val_ret = this.saldo - valor;
			if (val_ret <= 0) {
				this.saldo = 0;
			}
			// val_ret = this.limite - val_ret
			val_ret = this.limite + val_ret;
			// System.out.println("teste " + val_ret);
			this.limite = val_ret;
			System.out.println("Saque  Raalizado com Sucesso");
		} else {
			System.err.println("Saldo Insuficiente");
		}

	}

	public void Depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	/**
	 * metodo Getter do atributo Saldo
	 * 
	 * @return saldo mais limite
	 */
	public float getSaldo() {
		return this.saldo + this.limite;
	}

	@Override
	public String toString() {
		return "O Saldo Da Conta é; " + this.saldo;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj  instanceof Conta)) {// instasia de
			return false;
		}else {
		Conta verificar = (Conta) obj; // Cast 
		return verificar.getSaldo() == this.getSaldo();
	}
	}
}
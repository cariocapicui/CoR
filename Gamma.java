package br.edu.unifacisa.exercicio.chain;

public class Gamma extends FilterOp {

	
	public Gamma(Double a) {
		super();
	}
	
	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("Gamma aplicado");
	}

}


package br.edu.unifacisa.exercicio.chain;

public class Fill extends FilterOp {
	
	public Fill (String codCor) {
	
	}
	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("Fill aplicado");
	}

}

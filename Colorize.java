package br.edu.unifacisa.exercicio.chain;

public class Colorize extends FilterOp {

	public Colorize (int cor) {
		
	}
	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("Colorizacao aplicada");
		
	}

}

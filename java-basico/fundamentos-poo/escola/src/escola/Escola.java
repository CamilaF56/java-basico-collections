package escola;

// arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Andrade");
		felipe.setIdade(8);
		felipe.setSexo("masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e eh do sexo " + felipe.getSexo());
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 		
	}
}
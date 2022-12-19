import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 3 numeros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = funcaoMaior(a, b, c);
		
		mostrarResultado(maior);
		
		sc.close();
	}
	/*FUNÇÃO CRIADA PRA RETORNAR O MAIOR DENTRE 3 NUMEROS INTEIROS
	 * Essa primeira função retorna um valor.
	 * é sempre nescessario começar a função com public static
	 * depois você informa o tipo de função no coso int
	 * depois o nome da funçao
	 * e entre () as variaveis da função, não precisa usar as mesmas
	 * por fim criar a var de retorno no caso aux
	 * pra retornar no fim da função return aux; */
	public static int funcaoMaior(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux =y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	/*FUNÇAO CRIADA DE EXEMPLO DE COMO EXIBIR RETORNO DA FUNÇÃO
	 * Essa função recebe um valor mas...
	 * Não retorna nada apenas exibe uma mensssagem
	 * por isso no tipo de função colocasse void significado = vazio
	 * resultado é a mesma variavel aux*/
	public static void mostrarResultado(int resultado) { 
		System.out.println("Maior = " + resultado);
	}

}
package Package;
import java.util.Scanner;

public class sistema_ferramentas {
	
	private static Scanner ler = new Scanner(System.in);
	
	int MAX=100, C=0;
	int codigo [] = new int [MAX];
	String nome [] = new String [MAX];
	String categoria [] = new String [MAX];
	double preco [] = new double [MAX];
	int quantidade [] = new int [MAX];
	
	public int quantidadeCorreta () {
		int valor;
		do {
		System.out.print("\nQuantidade (deve um valor maior que [1]): ");
		valor = ler.nextInt();
			if (valor < 0 ) {
				System.out.println("Valor Inválido, por favor digitar um valor maior que [1].");
			}
			
		} while (valor < 0);
		
		return valor;
	}
	
	public double precoPositivo () {
		double valor;
		do {
		System.out.print("\nPreço Unitário (deve ser um valor positivo): ");
		valor = ler.nextDouble();
			if (valor < 0 ) {
				System.out.println("Valor Inválido, por favor digitar um valor positivo.");
			}
			
		} while (valor < 0);
		
		return valor;
	}
	
	public void cadastrarFerramenta () {
		System.out.println("\n\t|Cadastrar Ferramenta|\n");
		System.out.print("Código: ");
		codigo [C] = ler.nextInt();
		
		System.out.print("\nNome: ");
		nome [C] = ler.next();
		
		System.out.print("\nCategoria: ");
		categoria [C] = ler.next();
		
		preco [C] = precoPositivo();
		
		quantidade [C] = quantidadeCorreta();
		
		System.out.println("Ferramenta Cadastrada com Sucesso!");
		C++;
	}
	
	public static void main(String[] args) {
		
		sistema_ferramentas sistema_principal = new sistema_ferramentas();
		
		int opcao;
		do {
				System.out.println("\nMenu De Opções");
				System.out.println("1. Cadastrar Ferramentas");
				System.out.println("2. Consultar Ferramentas");
				System.out.println("3. Atualizar Quantidade de Ferramentas");
				System.out.println("4. Remover Ferramenta do Estoque");
				System.out.println("5. Exibir valor em R$ do Estoque");
				System.out.println("6. Listar Ferramentas");
				System.out.println("0. Sair do Sistema");
				System.out.print("Digite a Opção: " );
				opcao = ler.nextInt();
		
			switch (opcao) {
				case 1:
					sistema_principal.cadastrarFerramenta();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
				break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 0:
					System.out.println("\tSaindo... Obrigado por utilizar o Sistema!");
					break;
				default:
					System.out.println("Opção Inválida!!!");
					break;
				}
			}while (opcao != 0); 
		} 
	}



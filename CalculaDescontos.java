import java.util.Scanner;
public class CalculaDescontos{
public static void main (String []args) {
Scanner scanner = new Scanner(System.in);
//Entrada de dados
System.out.print("Nome do produto: ");
String produtos = scanner.next();
System.out.print("Preço do produto: ");
double preço = scanner.nextDouble();
System.out.print("Quantidade comprada: ");
int quantidade = scanner.nextInt();
//Processamento
double valorCompra = preço * quantidade;
double desconto;
if(valorCompra >= 1000 ) {
    desconto = valorCompra * (15.0 / 100 );
}
else if(valorCompra >= 500) {
    desconto = valorCompra * (10.0 / 100);
}
else {
    desconto = valorCompra * (5.0 / 100);
}

double valorFinal = valorCompra - desconto;

//saida
System.out.println(produtos);
System.out.println("Valor total sem desconto: " + valorCompra);
System.out.println("Desconto: " + desconto);
System.out.println("Valor Final: " + valorFinal);

scanner.close();
}
}

import java.util.Scanner;
public class Media {
public static void main (String [] args) {
Scanner scanner = new Scanner(System.in);
//Entrada de dados
System.out.print("digite a primeira nota: ");
double nota1 = scanner.nextDouble();
System.out.print("digite a segunda nota: ");
double nota2 = scanner.nextDouble();
System.out.print("digite a terceira nota: ");
double nota3 = scanner.nextDouble();
//Processamento
double media = (nota1 + nota2 + nota3) / 3;
System.out.println("sua média é: " + media);
if(media >= 7.0) {
    System.out.println("você foi aprovado! Com a media " + media);
}
else if (media <= 3.0) {
    System.out.println("você foi reprovado! Com a média " + media);
}
else {
    System.out.println("você ficou de recuperação. Com a média " + media);
}
scanner.close();
 }
}

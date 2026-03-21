import.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        while(numero >= 0){
            System.out.println(numero);
            numero--;
            sc.close();
        }


        
    }
}

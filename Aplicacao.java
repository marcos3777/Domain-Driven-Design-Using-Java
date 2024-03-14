import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("1. Qual o seu nome?");
        String nome = tec.nextLine();

        System.out.println("2. Defina classe e objeto?");
        String defClasse = tec.nextLine();

        System.out.println("3. Qual a função do construtor?");
        String contrutor = tec.nextLine();

        System.out.println("4. Qual a sua maior dificuldade?");
        String dificuldade = tec.nextLine();

        System.out.println("Seguem as respostas:");
        System.out.println(nome + ";" + defClasse + ";" +  contrutor + ";" + dificuldade);

        System.out.printf("%s - %s - %s - %s", nome, defClasse, contrutor, dificuldade);

    }


}

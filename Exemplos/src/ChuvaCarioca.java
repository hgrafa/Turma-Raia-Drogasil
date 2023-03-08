import java.util.Scanner;

public class ChuvaCarioca {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Esta chovendo? ");

        // esta/e = is, tem = has, deveria = should (teste)
        // operador de coalescencia nula

        String respostaDaPergunta = leitor.nextLine();
        //  boolean estaChovendo = (respostaDaPergunta == "sim") ? (true) : (false);
        boolean estaChovendo = respostaDaPergunta.equalsIgnoreCase("sim");
        // equalsIgnoreCase: ignora maiusculas e minusculas

        // ---

        if ( estaChovendo ) {
            System.out.println("devo ficar em casa e desligar a tv");
        } else {
            System.out.println("vou sair de casa :)");
        }

    }

}

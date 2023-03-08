import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        // if braceless = se sem chaves
        // funciona apenas quando se tem um comando dentro do bloco
        //        if ( respostaDaPergunta == "sim" )
        //            estaChovendo = true;
        //        else
        //            estaChovendo = false;

        // operador binário = 2 + 2
        // operador unário = a++ incremento, a-- decremento

        // operador ternário
        Scanner leitura = new Scanner(System.in);
        int idade = leitura.nextInt();

        String texto = (idade >= 13) ? "Ah, blz!" : "ñ pode";

        int a = 2;
        a++; // a = a + 1
        System.out.println(a);
        System.out.println(texto);

    }

}

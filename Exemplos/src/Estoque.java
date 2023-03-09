public class Estoque {

    public static void main(String[] args) {

        int estoque = 57;
        int frequenciaCompra = 5;
        int frequenciaVender = 2;

        // 3 -> 1 -> -1 -> 4 -> 2 -> 0

        System.out.println("Loja abriu! Estoque = " + estoque);

        while(estoque != 0 ) {
            if(estoque > 0) {
                System.out.println("Vendendo.... Estoque = " + estoque);
                estoque -= frequenciaVender;
            } else {
                System.out.println("Comprando... Estoque = " + estoque);
                estoque += frequenciaCompra;
            }
        }

        System.out.println("Loja fechou!");

    }
}

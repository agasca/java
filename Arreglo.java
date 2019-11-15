import java.util.Scanner;

//
/**
 * Ficha tecnica in : notas : exceptions
 * https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
 * enmascaramiento de entrada de línea de comando
 * https://es.switch-case.com/53985162
 */
//
class Arreglo {
    static int orden = 3, renglones = 0, kIndiceLetraAB = 1;
    static String leyendasA[] = new String[9];
    static String leyendasXY[] = new String[6];
    static double datos[][] = new double[orden + 1][orden + 1];
    static double valor = 0;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicializa
        // Arreglos: tipos de declaracion
        // incognitas
        leyendasA[1] = "a";
        leyendasA[2] = "b";
        leyendasA[3] = "c";
        leyendasA[4] = "d";
        leyendasA[5] = "e";
        leyendasA[6] = "f";
        leyendasA[7] = "g";
        leyendasA[8] = "h";
        leyendasXY[1] = "x";
        leyendasXY[2] = "y";
        leyendasXY[3] = "z";
        leyendasXY[4] = "w";
        leyendasXY[5] = "";
        // determinantes segun orden

        switch (orden) {
        case 2:
            renglones = (orden);
            break;
        default: // caso orden <> 2
            renglones = orden;
        }

        imprimir("Ingreso de datos--");
        ingresaArreglo();

        leer.close();

        imprimir("Despliega ecuación--");
        imprimeArreglo();

        imprimir("Despliega datos del arreglo--");
        imprimeDatosArreglo();
    }

    // Metodos
    // m.imprimir(x)
    public static void imprimir(String agbCadena) {
        System.out.println("-------------------" + agbCadena);
    }

    public static void imprimeArreglo() {
        for (int i = 1; i <= renglones; i++) {
            for (int j = 1; j <= orden; j++) {
                System.out.print(leyendasA[kIndiceLetraAB] + i + leyendasXY[kIndiceLetraAB]);
                if (j != orden) {
                    System.out.print(" + ");
                }
                // salta letra a,b,..,z
                kIndiceLetraAB++;
            }
            System.out.print(" = " + leyendasA[1 + orden] + i + "\n");
            // asigna letra indice mas 1 para resultado
            kIndiceLetraAB = 1;
        }
    }

    public static void imprimeDatosArreglo() {
        for (int i = 1; i <= renglones; i++) {
            for (int j = 1; j <= orden; j++) {
                System.out.print(datos[i][j]);
                if (j != orden) {
                    System.out.print(" + ");
                }
                // salta letra a,b,..,z
                kIndiceLetraAB++;
            }
            // System.out.print(" = " + leyendasA[1 + orden] +
            // i + (datos[i][0]) + "\n");
            System.out.print(" = " + datos[i][0] + "\n");
            // asigna letra indice mas 1 para resultado
            kIndiceLetraAB = 1;
        }
    }

    public static void ingresaArreglo() {
        for (int i = 1; i <= renglones; i++) {
            for (int j = 1; j <= orden; j++) {
                System.out.print(
                        "Ingresa el valor para " + leyendasA[kIndiceLetraAB] + i + leyendasXY[kIndiceLetraAB] + " :");
                valor = leer.nextDouble();
                System.out.println("->" + valor + "<->" + i + j + "<-");
                datos[i][j] = valor;
                kIndiceLetraAB++;
            }
            System.out.print("Desigualdad para " + leyendasA[1 + orden] + i + ":");
            valor = leer.nextDouble();
            datos[i][0] = valor;
            // asigna letra indice mas 1 para resultado
            kIndiceLetraAB = 1;
        }
    }
}
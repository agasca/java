import java.util.Scanner;

//
/**
 * Ficha tecnica in : -99 para salir : R22savcxmnb@ :
 * R22sammnbvcx"mnbvcxzpytrwqmnbmnb@ : enteros out : operacion metodos :
 * funciones : mensaje de error : notas : exceptions
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
        System.out.println("---------------------------------" + agbCadena);
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
            System.out.print(" = " + leyendasA[1 + orden] + i + "\n");
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
            // asigna letra indice mas 1 para resultado
            kIndiceLetraAB = 1;
        }
    }
}

/*
 *
 * public static void main(String[]args) { //Arreglos: tipos de declaracion
 * //opc 1 //String leyendasA[]; //leyendasA = new String[5] //opc 2 //String
 * leyendasA[] = new String[5]; //opc 3 //int [a] = new int[5], int b[] = new
 * int[3]; //opc 4 //int a[] = {3,42,-1,23,55}; String leyendasA[] = new
 * String[9]; leyendasA[1]="a"; leyendasA[2]="b"; leyendasA[3]="c";
 * leyendasA[4]="d"; leyendasA[5]="e"; leyendasA[6]="f"; leyendasA[7]="g";
 * leyendasA[8]="h"; String leyendasXY[] = new String[6]; leyendasXY[1]="x";
 * leyendasXY[2]="y"; leyendasXY[3]="z"; leyendasXY[4]="w"; leyendasXY[5]="";
 * //desplegar /* //foreach for(String v : leyendasA){ for(String i :
 * leyendasXY){ System.out.println(v + i); } }
 */
/*
 * //for next int r = 1, c = 2, contador = 0; for(int i = 1; i <= r; i++){
 * for(int j = 1; j <= c; j++){ System.out.print( leyendasA[i] + (i+contador) +
 * leyendasXY[i] + (i+contador) + " + " + leyendasA[i+1] + j + leyendasXY[i+1] +
 * j + " = " + leyendasA[i+2] + (i+contador) + "\n"); contador=+1; } }
 */
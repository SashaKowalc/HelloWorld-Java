import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        //Hola Mundo

        final String myConstant = "Esto es una cadena de texto constante";
        System.out.println(myConstant);

        String myString = "Esto es una cadena de texto";
        myString = "Ahora cambio el valor de la cadena de texto";
        System.out.println(myString);

        Integer myInt = 8;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        Double myDouble = 6.0;
        System.out.println(myDouble);

        Float myFloat = 6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat);
        System.out.println(myDouble + myFloat + myInt);
        System.out.println(myDouble + " " + myFloat + myInt + myString);

        Boolean myBoolean = true;
        //Es igual que escribir así = Boolean myBoolean = Boolean.TRUE;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10);
            System.out.println("myFloat es distinto de nulo");
        } else {
            System.out.println("myFloat es nulo");
        }

        if (myInt == 11) {
            System.out.println("myInt es 11");
        } else if (myInt == 12){
            System.out.println("myInt es 12");
        } else {
            System.out.println("myInt no es 11 ni 12");
        }

        List<String> myList = new ArrayList<>();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList);

        Map<String, String> myMap = new HashMap();
        myMap.put("string", myString);
        myMap.put("int", myInt.toString());
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        //while () es otro bucle.

        Main myMain = new Main();
        myMain.myFunction(2, 5);
        myMain.myFunction(6, 12);

        System.out.println(myMain.myReturnFunction(10,2));

        //EJERCICIO DE CONDICIONALES
        Double sueldo = 0.0;
        Double bono = 1.10;
        Double jubilacion = 0.89;
        Integer categoria;

        System.out.println("Ingrese el tipo de categoria que desea conocer el sueldo");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890.00 * bono;
        } else if (categoria == 2) {
            sueldo = 25630.89;
        } else if (categoria == 3) {
            sueldo = 35560.20 * jubilacion;
        } else {
            System.out.println("Se ingreso una categoria erronea");
        }

        if(categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El total del sueldo para la categoria " + categoria + " es igual a: " + sueldo);
        }

        Double promedio;
        String condicionFinal;

        Scanner tecladoOtro = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del alumno");
        promedio = tecladoOtro.nextDouble();

        condicionFinal = promedio >= 7 ? "aprobado" : "desaprobado";
        System.out.println("El alumno esta " + condicionFinal);

        int count = 0;

        while (count <= 10) {
            System.out.println("Estoy en la vuelta " + count);
            count = count + 1;
        }

        //Declaracion de vectores (aca le estoy diciendo que quiero un vector de 4 posiciones, del indice 0 al 3)
        int vector [] = new int[4];

        //Asignacion (manual)
        vector[0] = 2;
        vector[1] = 20;
        vector[2] = 200;
        vector[3] = 2000;
        System.out.println(vector[1]);

        //Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado el numero: " + vector[i]);
            System.out.println("-----------------------------------");
        }

        int tamanoVector;
        Scanner tecladoTamano = new Scanner(System.in);
        System.out.println("Ingrese el temaño que quiere que tenga su vector");
        tamanoVector = tecladoTamano.nextInt();

        int vectorDelUsuario[] = new int [tamanoVector];
        //Asignacion por teclado
        Scanner tecladoVector = new Scanner(System.in);

        for (int i = 0; i < vectorDelUsuario.length; i++) {
            System.out.println("Ingerse un valor para el indice " + i);
            vectorDelUsuario[i] = tecladoVector.nextInt();
        }

        for (int i = 0; i < vectorDelUsuario.length; i++) {
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado el numero: " + vectorDelUsuario[i]);
            System.out.println("-----------------------------------");
        }

        //Declaracion de MATRIZ
        int matrizManual [] [] = new int [3] [3];

        //Asignacion (manual)
        matrizManual [0] [0] = 1;
        matrizManual [0] [1] = 2;
        matrizManual [0] [2] = 3;
        matrizManual [1] [0] = 4;
        matrizManual [1] [1] = 5;
        matrizManual [1] [2] = 6;
        matrizManual [2] [0] = 7;
        matrizManual [2] [1] = 8;
        matrizManual [2] [2] = 9;

        //Recorido de matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posicion f: " + f + " c: " + c);
                System.out.println("es de " + matrizManual[f][c]);
            }
        }

        //Declaracion de MATRIZ
        int matriz [] [] = new int [3] [3];

        Scanner tecladoMatriz = new Scanner(System.in);
        //Asignacion MATRIZ por teclado
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor para la posicion f: " + f + " c: " + c);
                matriz [f] [c] = tecladoMatriz.nextInt();
            }
        }

        //Recorido de MATRIZ
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posicion f: " + f + " c: " + c);
                System.out.println("es de " + matriz[f][c]);
            }
        }

        //EJERCICIO: Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados, se
        //necesita cuente e informe por pantalla cuantas veces se cargo el numero 3

        //Declaramos el vector de 15 posiciones
        int vectorEjercicio [] = new int[15];

        //Ingresamos los valores para llenar el vector
        Scanner tecladoEjercicio = new Scanner(System.in);
        for (int i = 0; i < vectorEjercicio.length; i++) {
            System.out.println("Ingrese un numero para el indice " + i);
            vectorEjercicio[i] = tecladoEjercicio.nextInt();
        }

        //Contamos las veces que aparece el numero 3
        int contador = 0;
        for (int i = 0; i < vectorEjercicio.length; i++) {
            if (vectorEjercicio[i] == 3){
                contador = contador + 1;
            }
        }

        //Mostramos el vector
        for (int i = 0; i < vectorEjercicio.length; i++) {
            System.out.println("En el indice " + i + " el valor es " + vectorEjercicio[i]);
        }

        //Damos la respuesta de cuantas veces se ingreso el numero 3
        System.out.println("Se ingreso " + contador + " veces el numero 3");

        //EJERCICIO DE NOTAS Y PROMEDIO EN MATRIZ
        Double matrizEjercicio [] [] = new Double [4][4];
        Scanner ingreseNota = new Scanner(System.in);
        Double suma = 0.0;

        //Rellenamos la matriz
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if (c != 3) {
                    System.out.println("Ingrese la calificacion del alumno: " + f + " para la evaluación: " + c);
                    matrizEjercicio [f] [c] = ingreseNota.nextDouble();
                    suma = suma + matrizEjercicio [f] [c];
                } else {
                    matrizEjercicio [f] [c] = suma/3;
                    suma = 0.0;
                }
            }
        }

        //Recorido de MATRIZ
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if (c != 3) {
                    System.out.println("El alumno " + f + " en la evaluación " + c);
                    System.out.println("obtuvo un " + matrizEjercicio[f][c]);
                } else {
                    System.out.println("Por lo tanto, el promedio del alumno " + f);
                    System.out.println("es de " + matrizEjercicio[f][c]);
                }
            }
        }

    }

    //void es la palabra reservada de Java para pasar expresar que esto es vacio.
    public void myFunction(int myFirstNumber, int mySecondNumber){
        System.out.println(myFirstNumber + mySecondNumber);
    }

    //Si queremos retornar algo en la funcion, aclararlo despues del public y antes del nombre de la funcion
    public int myReturnFunction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

}
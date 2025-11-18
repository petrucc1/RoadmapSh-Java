package dev_java_learn;

import java.util.Arrays;

public class CreatingArraysInYourPrograms {
    // Um array é um objeto que armazena uma quantidade fixa de valores do mesmo tipo. Seu tamanho é definido no momento da criação e não pode ser alterado depois disso. Cada posição do array é chamada de elemento e é acessada por um índice numérico que começa em zero, de modo que o primeiro elemento está no índice 0 e o sexto no índice 5. Arrays permitem armazenar e organizar vários valores de forma contígua na memória. No exemplo dado, um array de dez inteiros é criado, preenchido manualmente e cada valor é exibido. Em situações reais, loops são usados para percorrer arrays de maneira mais eficiente.

    // Exemplo de criação e preenchimento manual:
    class ArrayDemo {
        public static void main(String[] args) {
            // declares an array of integers
            int[] anArray;

            // allocates memory for 10 integers
            anArray = new int[10];

            // initialize first element
            anArray[0] = 100;
            // initialize second element
            anArray[1] = 200;
            // and so forth
            anArray[2] = 300;
            anArray[3] = 400;
            anArray[4] = 500;
            anArray[5] = 600;
            anArray[6] = 700;
            anArray[7] = 800;
            anArray[8] = 900;
            anArray[9] = 1000;

            IO.println("Element at index 0: "
                    + anArray[0]);
            IO.println("Element at index 1: "
                    + anArray[1]);
            IO.println("Element at index 2: "
                    + anArray[2]);
            IO.println("Element at index 3: "
                    + anArray[3]);
            IO.println("Element at index 4: "
                    + anArray[4]);
            IO.println("Element at index 5: "
                    + anArray[5]);
            IO.println("Element at index 6: "
                    + anArray[6]);
            IO.println("Element at index 7: "
                    + anArray[7]);
            IO.println("Element at index 8: "
                    + anArray[8]);
            IO.println("Element at index 9: "
                    + anArray[9]);
        }
    }
    /* A saída deste programa é:
    Element at index 0: 100
    Element at index 1: 200
    Element at index 2: 300
    Element at index 3: 400
    Element at index 4: 500
    Element at index 5: 600
    Element at index 6: 700
    Element at index 7: 800
    Element at index 8: 900
    Element at index 9: 1000
    */


    // Criação básica de um array e inicialização
    int[] numbers = new int[5];
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    // Printando elementos do array através de um loop
    IO.println("Array elements:");
    for (int i = 0; i < numbers.length; i++) {
            IO.println("Element at index " + i + ": " + numbers[i]);
    }

    String[] fruits = {"apple", "banana", "cherry", "date"};
        IO.println("");
        IO.println("Fruits array:");
        for (int i = 0; i < fruits.length; i++) {
                IO.println(i + ": " + fruits[i]);
    }

    double[] prices = {9.99, 15.50, 7.25};
        IO.println("");
        IO.println("Prices:");
        for (double price : prices) {
                IO.println("$" + price);
    }


    // Enhanced for loop (for-each)
    int[] scores = {95, 87, 92, 78, 85};
    IO.println("Test scores using enhanced for loop:");
    for (int score : scores) {
            IO.println("Score: " + score);
        }

    // Diferentes tipos de dados
    double[] temperatures = {20.5, 25.0, 18.3, 30.2};
    boolean[] flags = {true, false, true, false, true};
    char[] letters = {'a', 'b', 'c', 'd', 'e'};

    IO.println("");
    IO.println("Temperatures:");
    for (double temp : temperatures) {
            IO.println(temp + "°C");
        }

    IO.println("");
    IO.println("Boolean flags:");
    for (int i = 0; i < flags.length; i++) {
            IO.println("Flag " + i + ": " + flags[i]);
    }

    IO.println("");
    IO.println("Character letters:");
    for (char letter : letters) {
            IO.println("Letter: " + letter);
    }


    // É possível criar matrizes de outros tipos:
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;

    // Também é possível colocar os colchetes após o nome da matriz - Entretanto, a convenção desencoraja esse formato; os colchetes identificam o tipo de matriz e devem aparecer com a designação do tipo.:
    float anArrayOfFloats2[];


    // Matriz multidimensional
    class MultiDimArrayDemo {
        public static void main(String[] args) {
            String[][] names = {
                    {"Mr. ", "Mrs. ", "Ms. "},
                    {"Smith", "Jones"}
            };
            // Mr. Smith
            IO.println(names[0][0] + names[1][0]);
            // Ms. Jones
            IO.println(names[0][2] + names[1][1]);
        }
    }


    // Explorando matrizes 2D e operações de matriz:
    // Array 2D:
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    IO.println("3x3 Matrix:");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            IO.print(matrix[i][j] + " ");
        }
        IO.println(); // New line after each row
    }

    // Try a different shaped matrix
    String[][] schedule = {
            {"Math", "Science", "English"},
            {"History", "Art", "PE"},
            {"Music", "Computer", "Study Hall"}
    };

    IO.println("");
    IO.println("Class Schedule:");
        String[] periods = {"Period 1", "Period 2", "Period 3"};
    for (int day = 0; day < schedule.length; day++) {
            IO.println("Day " + (day + 1) + ":");
            for (int period = 0; period < schedule[day].length; period++) {
                IO.println("  " + periods[period] + ": " + schedule[day][period]);
            }
    }

    /* Saída:
    3x3 Matrix:
        1 2 3
        4 5 6
        7 8 9

    Class Schedule:
        Day 1:
        Period 1: Math
        Period 2: Science
        Period 3: English
        Day 2:
        Period 1: History
        Period 2: Art
        Period 3: PE
        Day 3:
        Period 1: Music
        Period 2: Computer
        Period 3: Study Hall
     */

    // Cálculos com matrizes:
    int[] values = {12, 8, 15, 3, 9, 21};
    int sum = 0;
    int max = values[0];
    int min = values[0];

    // Calculando soma, máximo e mínimo
    for (int value : values) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }

        double average = (double) sum / values.length;

    IO.println("Array: " + Arrays.toString(values));
    IO.println("Sum: " + sum);
    IO.println("Average: " + average);
    IO.println("Maximum: " + max);
    IO.println("Minimum: " + min);

    // Tentando com números diferentes
    int[] moreNumbers = {45, 23, 67, 12, 89, 34};
    int total = 0;
    for (int num : moreNumbers) {
            total += num;
    }
    IO.println("");
    IO.println("Second array: " + Arrays.toString(moreNumbers));
    IO.println("Total of second array: " + total);
}

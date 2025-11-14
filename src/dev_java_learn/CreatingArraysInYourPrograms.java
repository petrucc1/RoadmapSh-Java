package dev_java_learn;

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
    // A saída deste programa é:
    /* Element at index 0: 100
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

}

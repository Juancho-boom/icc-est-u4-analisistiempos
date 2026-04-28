package controllers;


public class SortMethods {

    public void sortBubble(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

    }

    public void sortBubbleAvan(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j + 1] = array[j];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }

    }

}
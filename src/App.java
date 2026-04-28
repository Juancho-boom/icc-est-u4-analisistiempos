import java.util.Arrays;
import java.util.concurrent.Callable;

import javax.naming.spi.DirStateFactory.Result;

import controllers.SortMethods;
import models.Results;

public class App {
    public static void main(String[] args) throws Exception {
        SortMethods metodos = new SortMethods();
        int tamanio = 500000;
        int [] array = generate(tamanio);
        int[] arrayBubble = Arrays.copyOf(array,tamanio);
        int[] arrayBubbleAvan = Arrays.copyOf(array,tamanio);
        
        Callable<Void> miFuncionBubble = () -> {
            metodos.sortBubble(arrayBubble);
            return null;
        };
        
        Callable<Void> miFuncionBubbleAvz = () -> {
            metodos.sortBubbleAvan(arrayBubbleAvan);
            return null;
        };
        Results resultsBubble = BenchMarking.medirTiempo(miFuncionBubble);
            System.out.println("Burbuja "+ resultsBubble.getTimeResult());
        Results resultsBubbleAvz = BenchMarking.medirTiempo(miFuncionBubbleAvz);
            System.out.println("Burbuja Avanzada "+ resultsBubbleAvz.getTimeResult());
    }

    public static int[] generate(int size) {
        int[] numeros = new int[size];
        for (int i = 0; i < size; i++) {
            numeros[i] = (int) (Math.random() * 10000);
        }
        return numeros;
    }
}

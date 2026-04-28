import java.util.concurrent.Callable;

//import javax.security.auth.callback.Callback;

import models.Results;

public class BenchMarking {
    public static Results medirTiempo(Callable<Void> funcion){
        try {
            // Calcular timepo inicio
            long inicio = System.nanoTime();
            // Ejecutar la función
            funcion.call();
           // Calcular tiempo fin
           long fin = System.nanoTime();
           // Calcular tiempo ejecucion
           long duracion = (fin - inicio)/1_000_000; // Convertir a milisegundos
           // Devolver resultados
           Results results = new Results(duracion);
            return results;

            
        } catch (Exception e) {
            throw new RuntimeException("Error al ejecutar la función");
            //System.out.println("Error en la funcion");
            //return null;
            
        }
        
    }

}

package EnProceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class estimate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while(!((line=br.readLine()).equals("0"))){
            String evaluatingNums[] = line.split(" ");
            int len = evaluatingNums.length; //cantidad de numeros a evaluar
            /*
            to do:
            (len = 100 ; casos_posibles = ?) hacer esta regla de 3 para encontrar el resultado

            recordar que un caso es un caso posible si para cada numero n en evaluatingNums se encuentran
            numeros p, q, r que cumplan la ecuación de Alex
             */
        }
    }
}

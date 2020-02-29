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
            int cont=0;
            for (int i = 0; i < len ; i++) {
                long num = Long.parseLong(evaluatingNums[i]);
                List<Integer> divisores = new ArrayList<>();
                for (int j = 1; j < Math.ceil(Math.sqrt(num))+1 ; j++) {
                    if(num%j == 0) {
                        divisores.add(j);
                    }
                }
                if (divisores.size()>=3){
                    for (int j = 1; j < divisores.size(); j++) {

                        int p = divisores.get(j-1);
                        int q = divisores.get(j);
                        if(num%(p*q)==0){
                            long r=num/(p*q);
                            if(((p*-q*-r)/((p*-r)+(-q*-r)+(p*-q)))==num){
                                cont++;
                            }
                        }
                    }
                }
            }
            double per = (cont*1.0/len)*100.0;
            System.out.println((int)per);
        }
    }
}

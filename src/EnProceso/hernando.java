package EnProceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hernando {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line=br.readLine()).equals(""))
        {
            int n = Integer.parseInt(line.split(" ")[0]);
            int r = Integer.parseInt(line.split(" ")[1]);
            int h = Integer.parseInt(line.split(" ")[2]);

            for (int i = 0; i <n ; i++) {
                String[] coordenadas = br.readLine().split(" ");
            }
        }
    }
}

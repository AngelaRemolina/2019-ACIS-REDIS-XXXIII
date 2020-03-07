package EnProceso;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag==true){
            String[] line = scan.nextLine().split("  ");
            int n = Integer.parseInt(line[0]);
            int q = Integer.parseInt(line[1]);

            if (n==0 && q==0){
                flag=false;
                break;
            }
            List<String> volumes = new ArrayList<>();
            List<String> texts = new ArrayList<>();
            for (int i = 0; i <n; i++) {
                String v = scan.nextLine();
                volumes.add(v.toLowerCase());
            }
            for (int i = 0; i <q; i++) {
                String t = scan.nextLine();
                texts.add(t.toLowerCase());
            }
            List<String> results = new ArrayList<>();
            int cont =0;
            for (int i = 0; i <q ; i++) {
                String text = texts.get(i);
                for (int j = 0; j <n; j++) {

                    String vol = volumes.get(j);
                    if (vol.contains(text)){
                        results.add(Integer.toString(j+1));
                        break;//como hago que se salga de este for pero no del segundo
                    }
                    else{
                        cont++;
                    }
                    if (cont==(n)){
                        results.add("n");
                    }
                }
                System.out.println(results.get(i));
            }
        }
    }
}

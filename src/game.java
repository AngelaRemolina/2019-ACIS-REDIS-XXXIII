import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int g = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < g; i++) {
            int n = Integer.parseInt(scan.nextLine());
            String[] line = scan.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int c = Integer.parseInt(line[1]);
            String starterName = scan.nextLine();

            if(starterName.equals("Alice")){
                if(a>c){
                    System.out.println("ALICE");
                }
                else {
                    System.out.println("CARL");
                }
            }
            else{
                if(c>a){
                    System.out.println("CARL");
                }
                else{
                    System.out.println("ALICE");
                }

            }
        }
    }
}

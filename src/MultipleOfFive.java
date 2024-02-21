import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       MultipleOfFive m = new MultipleOfFive();
       m.multiply(n);

    }
    public void multiply(int n){
        for(int i =1;i<=n;i++){
            int x = i *5;
            System.out.println(x);
        }

    }
}

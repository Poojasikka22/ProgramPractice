
public class FibonacciSeries {
    public static void main(String args []){
        int i=0;int j =1;
        FibonacciSeries f = new FibonacciSeries();
        f.fib(i,j);

    }
    public void fib(int i,int j){
        int sum = i+j;
        if(sum>=13) {
            System.out.println(sum);
            return;
        }
        System.out.println(sum);
        fib(j,sum);

    }

}
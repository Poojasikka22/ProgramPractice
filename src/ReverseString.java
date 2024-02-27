import java.sql.SQLOutput;

public class ReverseString {



    public static void main(String args[]){
        ReverseString rv = new ReverseString();
        //int nums = 23876;

        String str = "nitin";
        //rv.reverse(nums);
        rv.reverse(str);


    }
    /*public void reverse(int nums){
       int reverse = 0;
     while(nums!=0){
         int remainder = nums%10;

         reverse = Integer.valueOf(String.valueOf(reverse) + String.valueOf(remainder));

         //reverse *10 + remainder;
         nums = nums/10;
     }
        System.out.println(reverse);
    }*/
    public void reverse(String str) {

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            rev = rev + str.charAt(i);
        }
        // System.out.println(rev);
        System.out.println(" ");
        if (str.equals(rev)) {
            System.out.println(" the string is palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}

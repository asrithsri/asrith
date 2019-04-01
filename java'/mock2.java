import java.util.Scanner;
public class mock2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        char a=s.charAt(0);
        char b = s.charAt(0);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>a)
                a=c;
            if(c<b)
                b = c;
        }
        System.out.println(a+" "+ b);
    }
}

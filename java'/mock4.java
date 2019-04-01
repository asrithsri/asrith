import java.util.Scanner;
public class mock4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int lower =0;
        for(int i=0;i<c.length;i++){
            if(c[i]>=48&&c[i]<=58)
                lower=lower+Integer.parseInt(String.valueOf(c[i]));
        }
        System.out.println(lower);
    }
}

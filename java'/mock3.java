import java.util.Scanner;
public class mock3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = s.charAt(0);
        int upper = 0 ;
        int lower = 0;
        for(int i=0;i<s.length();i++){
            a = s.charAt(i);
            if(a>=97&&a<=122){
                lower+=+1;
            }
            if(a>=65&&a<=92){
                upper+=1;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
    }

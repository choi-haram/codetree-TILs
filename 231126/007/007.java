import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        int a3 = sc.nextInt();
        
        a A = new a(a1, a2, a3);
    }
}

class a {
    String s;
    String a;
    int i;

    public a(String secret, String place, int time){
        this.s = secret;
        this.a = place;
        this.i = time;

        System.out.println("secret code : "+s);
        System.out.println("meeting point : "+a);
        System.out.println("time : "+i);
    }
}
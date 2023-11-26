public class Main {
    public static void main(String[] args) {
        a A = new a("codetree", 'L', 13);
    }
}

class a {
    String s;
    char a;
    int i;

    public a(String secret, char place, int time){
        this.s = secret;
        this.a = place;
        this.i = time;

        System.out.println("secret code : "+s);
        System.out.println("meeting point : "+a);
        System.out.println("time : "+i);
    }
}
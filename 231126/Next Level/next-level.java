import java.util.Scanner;

class User{
    String name;
    int level;

    User(){
        this.name = "";
        this.level = 0;
    }
    
    User(String name, int level){
        this.name = name;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        User user1 = new User("codetree", 10);
        System.out.println("user "+user1.name+" lv "+user1.level);
        
        String s = sc.next();
        int i = sc.nextInt();
        User user2 = new User(s, i);
        System.out.print("user "+user2.name+" lv "+user2.level);
    }
}
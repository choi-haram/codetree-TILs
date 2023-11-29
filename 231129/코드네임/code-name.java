import java.util.Scanner;

class User{
    char name;
    int n;
    public User(){
        this.name = 'A';
        this.n = 0;
    }

    public User(char name, int n){
        this.name = name;
        this.n = n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] user = new User[5];
        char tmp1 = 'a';
        int tmp2 = 101;
        for(int i=0; i<5; i++){
            char name = sc.next().charAt(0);
            int n = sc.nextInt();
            user[i] = new User(name, n);  // 배열의 각 요소를 초기화합니다.
            if(tmp2 > n){
                tmp1 = name;
                tmp2 = n;
            }
        }
        System.out.printf("%c %d", tmp1, tmp2);
    }
}
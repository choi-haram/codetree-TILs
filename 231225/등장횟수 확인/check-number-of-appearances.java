import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for(int i=0; i<5; i++){
            int tmp = sc.nextInt();
            if(tmp%2==0){
                result++;
            }
        }
        System.out.println(result);
    }
}
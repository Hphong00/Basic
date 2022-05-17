package Basic;

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) throws Exception{
        System.out.println("nhap :");
        int value = scanner.nextInt();
        System.out.println(uNumber(value));
    }
    private static Scanner scanner = new Scanner(System.in);

    private static long uNumber(int number){
        int cout=0;
        for(int i = 1; i<number; i++){
            if(number%i==0){
                System.out.println(i);
                cout++;
            }
        }
        System.out.println("Tong: "+cout );
        return 0;
    }
}



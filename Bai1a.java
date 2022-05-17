package Basic;

import java.util.Scanner;

public class Bai1a {
    public static void main(String[] args) {
        System.out.println("nhap :");
        int value = scanner.nextInt();
        System.out.println(tongChanLe(value));
    }
    private static Scanner scanner = new Scanner(System.in);

    public static long tongChanLe(int value) {
        long s = 0;
        if(value%2==0){
            for(int i=0;i<=value;i++){
                if(i%2==0){
                    s=s+i;
                }
            }
        }
        else{
            for(int i=0;i<=value;i++){
                if(i%2!=0){
                    s=s+i;
                }
            }
        }
        return s;
    }
}



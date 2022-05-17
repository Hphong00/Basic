package Basic;

import java.util.Scanner;

public class Bai1b {
    public static void main(String[] args) {
        System.out.println("Nhap: ");
        int number = scanner.nextInt();
        dSo(number);
    }
    private static Scanner scanner = new Scanner(System.in);

    public static void dSo(int n){
        float s=1;
        for (int i=2;i<=n;i++){
            s=s+1/(float)i;
        }
        System.out.println(s);
    }
}

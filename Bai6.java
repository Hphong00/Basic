package Basic;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhap: ");
        int number = scanner.nextInt();
        System.out.print("n = ");
        phanTich(number);
    }
    private static Scanner scanner = new Scanner(System.in);

    public static boolean sNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void phanTich(int n){
        int i=2;
        while(n>1){
            if(sNguyenTo(i)){
                if(n%i==0){
                    System.out.print(i+"*");
                    n/=i;
                }
                else
                    i++;
            }
            else
                i++;
        }
    }
}

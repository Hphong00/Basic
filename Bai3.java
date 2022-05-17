package Basic;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("UCLN: "+ uocChungLonNhan(number1,number2));
        System.out.println("BCNN: "+number1*number2/uocChungLonNhan(number1,number2));
    }
    private static Scanner scanner = new Scanner(System.in);

    private static long uocChungLonNhan(int a, int b){
        int n = 1;
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0 && b%i==0)
                n = i;
        }
        return n;
    }
}

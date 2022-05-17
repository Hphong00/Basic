package Basic;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhap: ");
        int number = scanner.nextInt();
        tinhTong(number);
    }
    private static Scanner scanner = new Scanner(System.in);

    private static void tinhTong(int number){
        String numberStr = String.valueOf(number);
        char kytu;
        int s=0;
        for (int i=0;i<numberStr.length();i++){
            kytu = numberStr.charAt(i);
            int num = Integer.parseInt(String.valueOf(kytu));
            s=s+num;
        }
        System.out.println("Tong: "+ s);
    }
}

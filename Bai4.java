package Basic;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("so thu hai: ");
        int b = scanner.nextInt();

        for (int i =a;i<=b;i++){
            for (int j=i+1;j<=b;j++){
                if(soNguyenToChung(i,j)){
                    System.out.println(i+ " " +j);
                }
            }
        }
    }
    private static boolean soNguyenToChung(int a, int b){
        for (int i = 2; i<=a && i<=b; i++){
            if(a%i==0 && b%i ==0){
                return false;
            }
        }
        return true;
    }
}

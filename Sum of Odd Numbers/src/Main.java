import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int s = 0;
        int Total = 0;

        while(s%2==0){
            System.out.printf("Sayı Giriniz: ");
            s = input.nextInt();
            if(s % 4 ==0){
                Total += s;
            }
        }
        System.out.printf("4'dün Kati Sayıların Toplamı: " + Total);

    }
}
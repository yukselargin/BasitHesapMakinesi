import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int select,n1,n2;
        Scanner input= new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1= input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2= input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        select= input.nextInt();

        switch (select){
            case (1):
                System.out.print("Toplam: "+(n1+n2));
                break;
            case (2):
                System.out.print("Çıkarma: "+(n1-n2));
                break;
            case(3):
                System.out.print("Çarpma: "+(n1*n2));
                break;
            case(4):
                switch (n2){
                    case(0):
                        System.out.println("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        break;
                }
                System.out.print("Bölme: "+(n1/n2));
                break;
            default:
                System.out.print("Hatalı giriş yaptınız: Tekrar Deneyiniz.");
        }
    }
}

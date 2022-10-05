import java.util.Scanner;
public class Hesap_makinesi {
    public static void main(String[] args) {
        double a, b;
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.print("İşlem yapılacak ilk sayıyı giriniz: ");
        a = input.nextDouble();
        System.out.print("İşlem yapılacak ikinci sayıyı giriniz: ");
        b = input.nextDouble();
        System.out.println("İşlem yapmak için 1 ile 4 arasından bir sayı giriniz");
        Scanner input2 = new Scanner(System.in);
        System.out.println("1-Toplama\n2-çarpma\n3-bölme\n4-çıkarma");
        choose = input2.nextInt();

        switch (choose) {
            case 1:
                System.out.println("a+b=" + (a + b));
                break;
            case 2:
                System.out.println("axb=" + (a * b));
                break;
            case 3:
                if (b != 0) {
                    System.out.println("a/b=" + (a / b));
                } else {
                    System.out.println("Sayılar sıfıra bölünemez!");
                }
                break;
            case 4:
                System.out.println("a-b=" + (a - b));
                break;
            default:
                System.out.println("hatalı tuşlama yaptınız.");
        }
        System.out.println("program bitti!");
    }
}
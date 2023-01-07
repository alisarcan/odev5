import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double height, weight, vucutKutle;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu(metre cinsinden) Giriniz : ");
        height = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        weight = input.nextDouble();

        vucutKutle = weight/ (height * height);

        System.out.print("Vücut Kitle İndeksiniz : " + vucutKutle );

    }
}

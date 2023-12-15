import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:  ");
        int number = input.nextInt();
        int basamakSayisi = 0;
        int total = 0;
        // her basamaktaki sayıyı basPow değişkenine atıyoruz.
        int basPow ;
        while (number != 0){
            basPow = number % 10;
            // başta sıfır atadığımız total değişkenine her basamağın sayı değerini kümülatif ekliyoruz.
            total += basPow;
            number /= 10;
        }
        System.out.println(total);
    }
}

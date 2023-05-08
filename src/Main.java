//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) { // 1 asal değildir, 2'den başlıyoruz

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // sayı kendisinden küçük olan sayılara tam olarak bölünüyor mu?
                    isPrime = false;
                    break; // bölünüyorsa asal değildir, döngüden çık
                }
            }
            if (isPrime) { // asal ise ekrana yazdır
                System.out.print(i + " ");
            }
        }
    }
}

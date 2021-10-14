package ProjectEulerSolutions;

//Fibonacci dizisindeki her yeni terim, önceki iki terimin eklenmesiyle oluşturulur. 1 ve 2 ile başlayarak, ilk 10 terim şöyle olacaktır:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//Fibonacci dizisindeki değerleri dört milyonu geçmeyen terimleri dikkate alarak çift değerli terimlerin toplamını bulunuz.

public class SolutionTwo {
    public static void main(String[] args) {
        int sayi = 0;
        int a = 0;
        int b = 1;
        int c = a + b ;
        while (c < 4000000){
            if (c % 2 == 0){
                sayi = sayi + c;
            }
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(sayi);
    }
}


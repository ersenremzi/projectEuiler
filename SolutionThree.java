package ProjectEulerSolutions;


//13195'in asal çarpanları 5, 7, 13 ve 29'dur.
//600851475143 sayısının en büyük asal çarpanı kaçtır?

public class SolutionThree {

    public static void main(String[] args) {

        double sayi = 600851475143d;

        for (double i = 2; i * i <= sayi; i++) {
            if (sayi % i == 00) {

                System.out.println(i + " PRİME FACTOR ");
            }
        }
    }
}

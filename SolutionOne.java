package ProjectEulerSolutions;

public class SolutionOne {

    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;

        for (int i = 0 ; i <= 1000; i++){
            if (i % 3 ==0){
                sayi1 = sayi1 + i;
            }
        }

        for (int j = 0 ; j <=1000 ; j++){
            if (j % 5 ==0){
                sayi2 = sayi2 + j;
            }
        }

        System.out.println(sayi1 + sayi2);
    }

}

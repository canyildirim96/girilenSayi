import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        int total=0,repeat=0;
        Scanner inp= new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz: ");
        k = inp.nextInt();

        for (int i= 1; i<=k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                total = total + i;
                repeat++;
                System.out.println(i + " ");
            }
        }int average;
        average = total / repeat;
        System.out.println("Ortalamanız: " + average);

    }
}

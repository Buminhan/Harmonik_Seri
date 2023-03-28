import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        double n, harmonik = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        n = inp.nextDouble();
        for(double i=1;i<=n;i++){
            harmonik +=(1/i);
        }
        System.out.println("Harmonik seri değeri : "+harmonik);
    }
}

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double pi=3.14,r,merkezaci,alan;
        Scanner inp=new Scanner(System.in);

        System.out.print("Yari Cap Degerini Giriniz :");
        r=inp.nextDouble();

        System.out.print("Merkez Aci Degerini Giriniz :");
        merkezaci=inp.nextDouble();

        alan=(pi*(r*r)*merkezaci)/360;
        System.out.println("Alan = "+"\s"+alan);
    }
}

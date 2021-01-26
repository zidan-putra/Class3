
package studikasus;
import java.util.Scanner;

public class class3 {
    double tinggi, berat;
    int jk;
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        class3 ukur = new class3();
        
        System.out.println("== program menghitung indeks massa tubuh ==");
        
        System.out.println("masukan jenis kelamin anda\n1. laki-laki\n2. perempuan");
        ukur.jk = input.nextInt();
        
        System.out.println("masukan berat badan anda (kg), harap gunakan koma : ");
        ukur.berat = input.nextDouble();
        
        System.out.println("masukan tinggi badan anda (m) : ");
        ukur.tinggi = input.nextDouble();
        
        System.out.println("\nindeks massa tubuh anda adalah : "+ukur.ibm()+" kg/m^2");
        System.out.println("dengan status : ");
        ukur.status();
        
        
    }
    double ibm(){
        double imt = berat / (tinggi*tinggi);
        
        return imt;
    }
    void status(){
        if (jk == 1){
            if (ibm() < 18){
                System.out.println("= kurus =");
            }
            else if (ibm() <= 25){
                System.out.println("= normal =");
            }
            else if (ibm() <= 27){
                System.out.println("= kegemukan =");
            }
            else if (ibm() > 27){
                System.out.println("= obesitas =");
            }
        }
        else if (jk == 2){
            if (ibm() < 17){
                System.out.println("= kurus =");
            }
            else if (ibm() <= 23){
                System.out.println("= normal =");
            }
            else if (ibm() <= 27){
                System.out.println("= kegemukan =");
            }
            else if (ibm() > 27){
                System.out.println("= obesitas =");
            }
        }
    }
}

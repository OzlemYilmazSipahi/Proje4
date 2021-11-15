

import java.util.Scanner;
public class Proje4 {
    public static void main(String[] args){

        double yarıcap, mrkzacı, alan, pi=3.14;

        Scanner inp= new Scanner(System.in);

       System.out.print("Dairenin Yarıçapını Giriniz: ") ;
        yarıcap = inp.nextDouble();

        System.out.print("Merkez Açıyı Giriniz: ") ;
        mrkzacı = inp.nextDouble();

        alan = ((pi*(yarıcap*yarıcap)*mrkzacı)/360);
        System.out.print("Verilen Merkez Açıya Göre Alan: " + alan);


    }
}

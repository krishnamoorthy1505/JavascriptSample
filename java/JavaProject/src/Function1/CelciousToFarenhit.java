//package Function1;

import java.util.Scanner;

public class CelciousToFarenhit {
    static double centTOFarenhit(double centi){
        double res = ((5/9d * centi) +32);
       // System.out.println(res);
        return Math.round(res * 100)/100d;
    }
    static double farenhitTOCentigrate(double fare){
        double res = (((fare-31)*5)/9);
        //System.out.println(res);
        return Math.round(res *100)/100d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double centi = sc.nextInt();
        System.out.println(centTOFarenhit(centi));
        double fare = sc.nextInt();
        System.out.println(farenhitTOCentigrate(fare));
    }
}

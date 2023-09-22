//package IF_1;

import java.util.Scanner;

public class ProfitorLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        int sell = sc.nextInt();
        int profit,loss=0;
        if(cash < sell){
            profit=sell - cash;
            System.out.println("1");
            System.out.println("Profit = "+profit);
        }
        else{
            loss = sell - cash;
            System.out.println("-1");
            System.out.println("loss ="+loss);
        }

    }
    
}

/* Problem Description
Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.


Instructions are give on Electricity biil that :
1. For first 50 units Rs. 0.50/unit.
2. For next 100 units Rs. 0.75/unit.
3. For next 100 units Rs. 1.20/unit.
4. For above 250 units Rs. 1.50/unit.
5. An additional surcharge of 20% is added to the bill.

 */

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double bill=0d;
        if(unit <50){
            bill = unit * 0.50;
        }
        else if(unit > 50 && unit<= 150){
            bill = 50 * 0.50 +(unit - 50)* 0.75;
        }
        else if(unit > 150 && unit <= 250){
            bill = (50 * 0.50)+(100*0.75)+(unit-150)*1.20;
        }
        else if(unit > 250){
            bill = (50*0.50) + (100*0.75)+(100*1.20) + (unit-250)*1.50;
        }
        System.out.println(bill);
        double sur = (20 /100d) * bill;
        System.out.println(sur);
        bill = sur + bill;
        System.out.println("Total Bill "+bill);

    }
}

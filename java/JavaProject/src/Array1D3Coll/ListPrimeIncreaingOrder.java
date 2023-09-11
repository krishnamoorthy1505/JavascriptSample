import java.util.ArrayList;
import java.util.Collections;

public class ListPrimeIncreaingOrder {
            static boolean isPrime(int val){
            int count=0;
            boolean isFlag=false;
            for(int i=1;i<=val;i++){
                if(val%i==0){
                    count++;
                }
                if(count>2){
                    //isFlag=false;
                    break;
                }
            }
            if(count==2){
                isFlag=true;
                return isFlag;
            }
            else{
                return false;
            }
        }
        static ArrayList<Integer> primeNumber(ArrayList<Integer> al){
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0;i<al.size();i++){
                int val = al.get(i);
                if(isPrime(val)){
                    res.add(val);
                }
              //  int count=0;
            //     for(int j=1;j<=val;j++){
            //         if(val%i==0){
            //             count++;
            //         }
            //     }
            //     if(count==2){
            //         res.add(val);
            //     }

            }
            Collections.sort(res);
            return res;
        }
        public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(23);
        al.add(8);
        al.add(77);
        al.add(11);
       
        System.out.println(primeNumber(al));


    }


}

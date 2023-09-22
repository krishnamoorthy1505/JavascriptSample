import java.util.Scanner;

public class DiverseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cCount=0;
        int nCount=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
                cCount++;
            }
            // else if((s.charAt(i)>=97 && s.charAt(i)<=122)  ){
            //     cCount++;
            // }
             else if(s.charAt(i)>=47 && s.charAt(i)<=56){
                nCount++;
            }
        }
        System.out.println(cCount+" "+nCount);
        if(cCount > nCount){
            System.out.println(cCount);
        }
        else{
                System.out.println(nCount);

        }
        String s1 = 'a'+'b';
    }
    
}

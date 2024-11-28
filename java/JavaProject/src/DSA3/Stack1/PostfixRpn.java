//package Stack1;

import java.util.Stack;

public class PostfixRpn {
    static int prefixRpn(String[]  A){
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            //char ch = A.charAt(A[i]);
            String chk  = A[i];
            if(chk == "+" || chk =="-" || chk == "*"  || chk == "/"){
                int n2 = st.pop();
                int n1 = st.pop();
                //int res=0;
                if(chk=="+"){
                    st.push(n1+n2);
                    System.out.println(st.peek());
                }
                else if(chk=="-"){
                    st.push(n1-n2);
                    System.out.println(st.peek());

                }
                else if(chk=="*"){
                    st.push(n1*n2);
                    System.out.println(st.peek());


                }
                else if(chk=="/"){
                    st.push(n1/n2);
                    System.out.println(st.peek());

                }
                
                 
                //st.push(res);
            }
            else{
                int sn = Integer.parseInt(A[i]);
                
                    st.push(sn);
                

            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String st[] ={"4","13","2","-","+","5","/"};
        int res = prefixRpn(st);
        System.out.println("res =" +res);
    }
}

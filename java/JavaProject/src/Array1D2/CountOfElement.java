// Given an array A of N integers. 
// Count the number of elements that have at least 1 elements greater than itself.

// Input 1:
// A = [3, 1, 2]
// Input 2:
// A = [5, 5, 3]


// Example Output 3 - 2
// Output 1:
// 2
// Output 2: 3 -1
// 1



import java.util.Scanner;

public class CountOfElement {
    public static int solve(int[] A) {
        int max_value=0,max_count=1;
        int n = A.length;
        for(int i =0 ;i<n;i++){
            if(A[i] > max_value){
                max_value = A[i];
                max_count = 1;
            }else if(A[i] == max_value){
                max_count+=1;
            }
        }
        return A.length - max_count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println(solve(Arr));
        
    }
    
}

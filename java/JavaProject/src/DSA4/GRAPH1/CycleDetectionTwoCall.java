import java.util.ArrayList;
import java.util.HashSet;

public class CycleDetectionTwoCall {
    static int isCycle;
    static boolean vis[];
    static HashSet<Integer> path;
    static void cycleDetectionDisconnectGraph(ArrayList<Integer>[] graph,int src){
        
        for(int nbr:graph[src]){
            if(path.contains(nbr)){
            isCycle=1;
            return;
        }
            if(vis[nbr] == false){
                vis[nbr]=true;
                path.add(nbr);
                cycleDetectionDisconnectGraph(graph, nbr);
                path.remove(nbr);
            }
        }
    }
    static void solve(int[][] edges,int vtx){
       ArrayList<Integer>[] graph =  DirectGraph1.createGraph(edges,vtx);
       isCycle=0;
       vis = new boolean[vtx+1];
       path = new HashSet<>();
       for(int i=1;i<=vtx;i++){
            if(vis[i] == false){
                vis[i]=true;
                path.add(i);
                cycleDetectionDisconnectGraph(graph,i);
            }
       }
       System.out.println(isCycle);

    }
    public static void main(String[] args) {
        int vtx = 5;
        int[][] edges={{1,2},{3,4},{4,5},{5,3}}; 
        solve(edges,vtx);
    }  
}

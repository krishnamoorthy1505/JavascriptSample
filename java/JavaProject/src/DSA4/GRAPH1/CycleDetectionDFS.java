import java.util.ArrayList;
import java.util.HashSet;

public class CycleDetectionDFS {
    static int isCycle;
    static boolean[] vis;
    static HashSet<Integer> path;
    static void cycleDetection(ArrayList<Integer>[] graph,int src){
        for(int nbr:graph[src]){
            if(path.contains(nbr)){
                isCycle = 1;
                return;
            }
            if(vis[nbr]== false){
                vis[nbr] = true;
                path.add(nbr);
                cycleDetection(graph, nbr);
                path.remove(nbr);
            }
        }
    }


    static void solve(int[][] edges,int vtx){
        ArrayList<Integer> graph[] = DirectGraph.createGraph(edges,vtx);
         /* for(int  i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.print(i+"------>");
                int nbr = graph[i].get(j);
                System.out.print(nbr+" ");
            }
            System.out.println();
        }  */
        isCycle = 0;
        vis = new boolean[vtx];
        path = new HashSet<>();
        for(int i=0;i<vtx;i++){
            if(vis[i] == false){
                vis[i] = true;
                path.add(i);
                cycleDetection(graph,i);
                path.remove(i);
            }
        }
        System.out.println(isCycle);


    }
    public static void main(String[] args) {
        int vtx = 5;
        //cyclic
        int[][] edges = {{0,1},{0,2},{1,2},{1,4},{2,3},{3,1}};


       /* //disconnect graph
       int vtx=5;
       int[][] edges={{1,2},{3,4}{4,5},{5,3}};
 */
        solve(edges, vtx);
        
    }
}

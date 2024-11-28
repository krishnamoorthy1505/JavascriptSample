import java.util.ArrayList;

public class DeapthFirstSearch {
    public static void main(String[] args) {
        int vtx = 7;
        int edges[][] = {
            {0,3},{1,2},{2,3},{3,4},{2,5},{4,5},{5,6},{4,6}
        };
        //DirectGraph dg = new DirectGraph();
        CreateGraph dg = new CreateGraph();
        ArrayList<Integer>[] graph = dg.createGraph(edges,vtx);
        System.out.println("----------------");
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.print(i+" ----->");
                int nbr = graph[i].get(j);
                System.out.print(nbr+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");


        solve(graph,5);
    }
    static boolean[] vis;
    static void solve(ArrayList<Integer>[] graph,int src){
        int v = graph.length;
        vis = new boolean[v+1];
        vis[src] = true;
        dfs(graph,src);

    }
    static void dfs(ArrayList<Integer>[] graph,int src){
        System.out.print(src+" ");
        //go on nbr of src
        for(int nbr:graph[src]){
            if(vis[nbr]==false){
                vis[nbr] = true;
                dfs(graph,nbr);
            }
        }
    }
}

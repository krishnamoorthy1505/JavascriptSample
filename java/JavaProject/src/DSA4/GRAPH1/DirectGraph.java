import java.util.ArrayList;

public class DirectGraph {
    static ArrayList<Integer>[] createGraph(int[][] edges,int vtx){
        ArrayList<Integer>[] graph = new ArrayList[vtx];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
        }
        return graph;
    }
    public static void main(String[] args) {
        int vtx = 5;
        int edges[][] = {{0,1},{0,2},{1,2},{1,4},{2,3},{3,1}};
        ArrayList<Integer>[] graph=createGraph(edges,vtx);
        for(int  i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.print(i+"------>");
                int nbr = graph[i].get(j);
                System.out.print(nbr+" ");
            }
            System.out.println();
        }
        //System.out.println();
        //for(int nbr : graph)
    }
}

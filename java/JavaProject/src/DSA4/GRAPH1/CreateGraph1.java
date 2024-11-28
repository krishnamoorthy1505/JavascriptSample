import java.util.ArrayList;

public class CreateGraph1 {
    static ArrayList<Integer>[] createGraph(int [][] edges,int vtx){
        ArrayList<Integer>[] graph = new ArrayList[vtx];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }
        return graph;
    }
    public static void main(String[] args) {
        int vtx = 7;
        int edges[][] = {
            {0,3},{1,2},{2,3},{3,4},{2,5},{4,5},{5,6},{4,6}
        };
        ArrayList<Integer>[] graph=createGraph(edges,vtx);

        for(int i=0;i<graph.length;i++){
            System.out.print(i+"------>");
            for(int j=0;j<graph[i].size();j++){
                int nbr = graph[i].get(j);
                System.out.print(nbr+" ");
            }
            System.out.println();


        }
    }
}

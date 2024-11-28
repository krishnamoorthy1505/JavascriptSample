import java.util.ArrayList;

public class CreateGraph {
    static ArrayList<Integer>[] createGraph(int[][] edges,int vtx){
        //int vtx=4;
        ArrayList<Integer> graph[] = new ArrayList[vtx];
        //System.out.println(graph);
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int j=0;j<edges.length;j++){
            int u = edges[j][0];
            int v = edges[j][1];
            graph[u].add(v);
            graph[v].add(u);
        }
        /* for(int i=0;i<graph.length;i++){
            System.out.print(i+"----->");
            for(int j=0;j<graph[i].size();j++){
                int nbr = graph[i].get(j);
                System.out.print(nbr+" ");
            }
            System.out.println();
        }
 */
        return graph;
    }
    public static void main(String[] args) {
       // int vtx=4;
        //int[][] edges={{0,1},{1,2},{2,3},{1,3},{0,2}};
        int vtx = 7;
        int edges[][] = {
            {0,3},{1,2},{2,3},{3,4},{2,5},{4,5},{5,6},{4,6}
        };
        ArrayList<Integer>[] graph = createGraph(edges,vtx);
        for(int i=0;i<graph.length;i++){
            System.out.print(i+"----->");
            for(int j=0;j<graph[i].size();j++){
                int nbr = graph[i].get(j);
                System.out.print(nbr+" ");
            }
            System.out.println();
        }
    }
}

package graph;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ls = new ArrayList<>();

        int i = 0;
        while(i<V){
            ls.add(new ArrayList<Integer>());
            i++;
        }

        for(i=0;i<edges.length;i++){
            ls.get(edges[i][0]).add(edges[i][1]);
            ls.get(edges[i][1]).add(edges[i][0]);
        }

        return ls;
    }
}

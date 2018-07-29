package Contest_101555;

import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Graph graph = new Graph();
        ArrayList<Vertex> vertices = new ArrayList<Vertex>();
        long[][] matrix = new long[n][n];
        long modulo = 2147483647;
        char[][] matrix_char = new char[n][n];
        for(int i = 0; i < n*n; i++){
            Vertex v = new Vertex(i);
            graph.addVertex(v);
            vertices.add(v);
        }
        for(int i = 0; i < n; i++){
            String str = scanner.next();
            for(int j = 0; j < n; j++){
                char c = str.charAt(j);
                matrix_char[i][j] = c;
                if(c=='#'){

                }else{
                    if(j==n-1){

                    }else{
                        graph.addEdge(vertices.get(n*i+j), vertices.get(n*i+j+1));
                    }
                    if(j==0){

                    }else{
                        graph.addEdge(vertices.get(n*i+j), vertices.get(n*i+j-1));
                    }
                    if(i==0){

                    }else{
                        graph.addEdge(vertices.get(n*i+j), vertices.get(n*(i-1)+j));
                    }
                    if(i==n-1){
                    }else{
                        graph.addEdge(vertices.get(n*i+j), vertices.get(n*(i+1)+j));
                    }
                }
            }
        }
        if(bfsForVertex(graph, vertices.get(0)).containsKey(vertices.get(n*n-1))){
            matrix[0][0] = 1;
            for(int i=0; i < n; i++){
                for(int j=0; j < n; j++){
                    if(matrix_char[i][j]=='.'){
                        if(i>0){
                            matrix[i][j] += matrix[i-1][j] % modulo;
                        }
                        if(j>0){
                            matrix[i][j] += matrix[i][j-1] % modulo;
                        }
                    }
                }
            }
            if(matrix[n-1][n-1]==0){
                System.out.println("THE GAME IS A LIE");
            }else{
                System.out.println(matrix[n-1][n-1]);
            }
        }else{
            System.out.println("INCONCEIVABLE");
        }
    }

    private static class Vertex{
        private int label;

        /**
         * Create a new vertex with a given label
         *
         * @param label
         *            with which to identify the vertex
         */
        public Vertex(int label) {
            this.label = label;
        }

        public void setLabel(int label) {
            this.label = label;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertex)) {
                return false;
            }
            Vertex other = (Vertex) obj;
            return label == other.label;
        }
    }

    private static class Graph{
        private final Map<Vertex, LinkedHashSet<Vertex>> connection_map;

        public Graph(){
            connection_map = new LinkedHashMap<>();
        }

        public void addVertex(Vertex v) {
            connection_map.put(v, new LinkedHashSet<Vertex>());
        }

        public void addEdge(Vertex v1, Vertex v2) {
            connection_map.get(v1).add(v2);
        }

        public boolean edgeExists(Vertex v1, Vertex v2) {
            return connection_map.get(v1).contains(v2);
        }

        public List<Vertex> getVertices() {
            List<Vertex> result = new ArrayList<Vertex>();
            for (Map.Entry<Vertex, LinkedHashSet<Vertex>> entry : connection_map.entrySet()) {
                result.add(entry.getKey());
            }
            return result;
        }

        public List<Vertex> getDownstreamNeighbors(Vertex v) {
            Set<Vertex> downstream = connection_map.get(v);
            List<Vertex> result = new ArrayList<Vertex>();
            for (Vertex neighbor : downstream) {
                result.add(neighbor);
            }
            return result;
        }
    }

    private static Map<Vertex, Integer> bfsForVertex(Graph graph, Vertex start) {
        Map<Vertex, Integer> result = new LinkedHashMap<Vertex, Integer>();
        result.put(start, 0);
        Queue<Vertex> queue = new LinkedList<Vertex>();
        queue.add(start);
        while (!queue.isEmpty()) {
            // Take the first element in the queue
            // Add all of its downstream neighbors to the queue to carry the BFS on them
            // after the vertices in the current level are done
            Vertex up = queue.remove();
            // Add all of its downstream neighbors to the map with a depth one bigger than
            // the depth of up
            for (Vertex down : graph.getDownstreamNeighbors(up)) {
                if (!result.containsKey(down)) {
                    queue.add(down);
                    result.put(down, result.get(up) + 1);
                }
            }
        }
        return result;
    }
}

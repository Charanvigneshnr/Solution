// A Java program for Prim's Minimum Spanning Tree (MST)
// algorithm. The program is for adjacency matrix
// representation of the graph
package Charan;

class MST {

    // Number of vertices in the graph
    private static final int V = 5;

    public static void main(String[] args) {
        MST t = new MST();
        int[][] graph = new int[][]{{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}};

        // Print the solution
        t.primmst(graph);
    }

    // A utility function to find the vertex with minimum
    // key value, from the set of vertices not yet included
    // in mst
    int minKey(int[] key, Boolean[] mstSet) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed mst
    // stored in parent[]
    void printmst(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t"
                    + graph[i][parent[i]]);
    }

    // Function to construct and print mst for a graph
    // represented using adjacency matrix representation
    void primmst(int[][] graph) {
        // Array to store constructed mst
        int[] parent = new int[V];

        // Key values used to pick minimum weight edge in
        // cut
        int[] key = new int[V];

        // To represent set of vertices included in mst
        Boolean[] mstSet = new Boolean[V];

        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // Always include first 1st vertex in mst.
        // Make key 0 so that this vertex is
        // picked as first vertex
        key[0] = 0;

        // First node is always root of mst
        parent[0] = -1;

        // The mst will have V vertices
        for (int count = 0; count < V - 1; count++) {

            // Pick the minimum key vertex from the set of
            // vertices not yet included in mst
            int u = minKey(key, mstSet);

            // Add the picked vertex to the mst Set
            mstSet[u] = true;

            // Update key value and parent index of the
            // adjacent vertices of the picked vertex.
            // Consider only those vertices which are not
            // yet included in mst
            for (int v = 0; v < V; v++)

                // graph[u][v] is non zero only for adjacent
                // vertices of m mstSet[v] is false for
                // vertices not yet included in mst Update
                // the key only if graph[u][v] is smaller
                // than key[v]
                if (graph[u][v] != 0 && !mstSet[v]
                        && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        // Print the constructed mst
        printmst(parent, graph);
    }
}

// This code is contributed by Aakash Hasija

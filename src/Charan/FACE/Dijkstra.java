package Charan.FACE;

import org.jetbrains.annotations.NotNull;

//To find min path between source and destination
//Initially we set all nodes as unvisited and distance to infinity
public class Dijkstra {
    public static void dijkstra(int[] @NotNull [] graph, int source) {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;
        for (int i = 0; i < count; i++) {
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            System.out.printf("Distance from %s to %s is %s%n", source, i, distance[i]);
        }
    }

    private static int findMinDistance(int @NotNull [] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{{0, 0, 1, 2, 0, 0, 0}, {0, 0, 2, 0, 0, 3, 0}, {1, 2, 0, 1, 3, 0, 0},
                {2, 0, 1, 0, 0, 0, 1}, {0, 0, 3, 0, 0, 2, 0}, {0, 3, 0, 0, 2, 0, 1}, {0, 0, 0, 1, 0, 1, 0}};
        Dijkstra T = new Dijkstra();
        dijkstra(graph, 0);
    }
}

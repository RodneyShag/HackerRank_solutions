//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

/* Creates a graph and uses breadth-first search (BFS) to find minimum spanning tree (MST) */
public class Solution {

    private static final int EDGE_WEIGHT = 6;
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numQueries = scan.nextInt();
        
        for (int q = 0; q < numQueries; q++) {
            int numNodes = scan.nextInt();
            int numEdges = scan.nextInt();
            
            /* Create Nodes */
            Node [] node = new Node[numNodes + 1]; // make array 1 bigger than number of Nodes so Node 1 is at index 1
            node[0] = null;
            for (int i = 1; i <= numNodes; i++) {
                node[i] = new Node(i);
            }
            
            /* Connect Nodes */
            for (int i = 0; i < numEdges; i++) {
                int n1 = scan.nextInt();
                int n2 = scan.nextInt();
                node[n1].addNeighbor(node[n2]);
            }
            
            /* Create MST */
            int start = scan.nextInt();
            createMST(node[start]);

            /* Print results */
            for (int i = 1; i <= numNodes; i++) {
                if (i != start) {
                    System.out.print(node[i].distance + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
    
    /* Use BFS to create minimum spanning tree */
    private static void createMST(Node start) {
        if (start == null)
            return;
        
        Queue<Node> queue = new LinkedList<Node>();
        
        start.distance = 0;
        queue.add(start);
        
        while ( ! queue.isEmpty()) {
            Node curr = queue.remove();

            for (Node neighbor : curr.neighbors) {
                if (neighbor.distance == -1) { // meaning it's unvisited
                    neighbor.distance = curr.distance + EDGE_WEIGHT;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    /* Implementation of an UNDIRECTED graph */
    public static class Node {
        public final int     id;
        public int           distance; // this can also tell us if Node has been visited
        public HashSet<Node> neighbors;
        
        public Node (int id) {
            this.id   = id;
            distance  = -1;
            neighbors = new HashSet<>();
        }
        
        public void addNeighbor(Node neighbor) {
            neighbors.add(neighbor);
            neighbor.neighbors.add(this);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class friends {
        static class Edge {
            int src;
            int dest;

            Edge(int src, int dest) {
                this.src = src;
                this.dest = dest;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String[] students = new String[n];
            ArrayList<Edge> graph[] = new ArrayList[n];

            for(int i=0;i<n;i++) {
                students[i] = sc.next();
            }

             for(int i=0;i<graph.length;i++) {
                 graph[i] = new ArrayList<>();
             }

            int m = sc.nextInt();

             for(int i=0;i<m;i++) {
                 String a = sc.next();
                 String b = sc.next();

                 int u = getIndex(students, a);
                 int v = getIndex(students, b);

                 graph[u].add(new Edge(u,v));
                 graph[v].add(new Edge(v,u));
             }

             for(int i=0;i<n;i++) {
                 ArrayList<String> friends= new ArrayList<>();

                 for(Edge e:graph[i]) {
                     friends.add(students[e.dest]);
                 }

                 Collections.sort(friends);

                 System.out.println(students[i] +" ");
                 if(!friends.isEmpty()) {
                     System.out.println(String.join(",",friends));
                 }
                 System.out.println();
             }

        }

        public static int getIndex(String[] students, String name) {
            for(int i=0;i<students.length;i++) {
                if(students[i].equals(name)) {
                    return i;
                }
            }
            return -1;
        }
}

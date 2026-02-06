import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Graphs {
    int n;
    String [] airportNames;
    private Map<String, Integer> airportIndex;
    int [][] matrix;

    Graphs(int n, String[] airportNames) {
        this.n = n;
        this.airportNames = airportNames;
        this.airportIndex = new LinkedHashMap<>();
        this.matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            airportIndex.put(airportNames[i], i);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        for(int i = 0; i < n; i++) {
            matrix[i][i] = 0;
        }
    }

    public void addEdge(String from, String to,  int distance) {
        int i = airportIndex.get(from);
        int j = airportIndex.get(to);

        matrix[i][j] = distance;
    }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       sc.nextLine(); // consume newline

       String[] names = sc.nextLine().split(" ");

       Graphs g = new Graphs(n, names);
       int m = sc.nextInt();
       sc.nextLine();

       for(int i = 0; i < m; i++) {
           String from = sc.nextLine();
           String to = sc.nextLine();
           int distance = sc.nextInt();

           g.addEdge(from, to, distance);
       }

       for(int i = 0; i < n; i++) {
           for(String key : g.airportIndex.keySet()) {
               System.out.println(key + " " + g.airportIndex.get(key));
           }
       }
   }

}

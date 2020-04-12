import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Graph {
    private int[] data;
    private int[][] adjMatrix;
    private boolean[][] visited;

    public Graph(int n) {
        data = new int[n+1];
        adjMatrix = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];
    }

    public void addEdge(int x, int y, int num){
        adjMatrix[y][x] = num;
    }

    public ArrayList<Integer> returnNeighbour(int y){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < adjMatrix[y].length; i++){
            if(adjMatrix[y][i] != 0)
                arr.add(adjMatrix[y][i]);
        }
        return arr;
    }

    public ArrayList<Integer> returnNeighbour2(int y){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < adjMatrix[y].length; i++){
            if(adjMatrix[y][i] != 0)
                arr.addAll(returnNeighbour(i));
        }
        return arr;
    }

    public ArrayList<Integer> totalNeighbour(int y, int layer){
        ArrayList<Integer> arr = new ArrayList<>();

        if (layer == 1){
            returnNeighbour(y);
        } else if (layer == 2){
                returnNeighbour2(y);
        } else {
            arr.addAll(returnNeighbour(y));
            for(int i = 0; i < layer-1; i++){
                for(int p = 0; p < arr.size(); p++){
                    returnNeighbour(p);
                }
            }
        }



        return arr;
    }

    public ArrayList<Integer> BFS(int x){

        for(int i = 0; i < visited.length; i++){
            for(int j = 0; j < visited[0].length; j++){
                visited[i][j] = false;
            }
        }
        ArrayList<Integer> BFS = new ArrayList<Integer>();
        ArrayList<Integer> queue = new ArrayList<Integer>();
        queue.addAll(returnNeighbour(x));
        while(data.length > BFS.size()){
            for(int i = 0; i < queue.size(); i++){
                if(visited[x][queue.get(0)] = false){
                    BFS.add(queue.get(0));
                    queue.remove(0);
                    for(int q = 0; q < visited[queue.get(0)].length; q++){
                        visited[queue.get(0)][q] = true;
                    }
                }
            }
            for(int i = 0; i < BFS.size(); i++){
                BFS.addAll(returnNeighbour(BFS.get(i)));
            }


        }

        return BFS;
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String scanned = scan.nextLine();

    }

}

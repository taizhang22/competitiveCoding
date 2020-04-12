import java.util.*;


public class J52018 {

    public static class Node{
        public ArrayList<Node> edges = new ArrayList<>();
        //creates an arraylist of edges
        public int val;
        //creates another in of values

        public boolean visited = false;

        public void change(){
            visited = true;
        }
    }

    private static void getReachablePages(Node node, Set<Integer> pages){
        if(!pages.contains(node.val)){
            pages.add(node.val);

            for(Node mans : node.edges)
                getReachablePages(mans, pages);


        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pages = in.nextInt();
        //scans the amount of pages

        Map<Integer, Node> map = new HashMap<>();
        for(int i = 0; i < pages; i++) {
            map.put(i, new Node());
            map.get(i).val = i;
        }
        //puts a node in "map" for each of the pages.


        for (int i = 0; i < pages; i++) {
            int choices = in.nextInt();
            System.out.print("# of choice: ");
            //receives the amount of choices for that page.
            // goneto[i] = true; this is also useless
            //sets goneto to true.
            Node root = map.get(i);
            for (int j = 0; j < choices; j++) {
                int connection = in.nextInt() - 1;
                System.out.print(connection + " ");
                //goneto[connection] = true; this is useless
                root.edges.add(map.get(connection));
            }
            System.out.println();
        }

        //program a viable Y/N searcher.
        //initialize a boolean array
        //start adding in all the pages from page 1 onwards.
        //if you manage to hit all the pages, end.
        //if the pages keep looping, have a thing compare the previous list to check and the current list to check.

        Set<Integer> tpage = new HashSet<>();

        getReachablePages(map.get(0),tpage);

        if(tpage.size() == pages){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }



        LinkedList<Node> q = new LinkedList<Node>();
        q.add(map.get(0));

        int layers = 1;
        while(!q.isEmpty()){
            Node poland = q.poll();
            // you're polling q, which is the starting point.
            if(poland.edges.isEmpty()){
                System.out.println(layers);
                return;
            }
            //the moment you hit a node with no edges, you print out the amount of layers you have.

            layers++;
            for(Node edgeNode : poland.edges) {
                q.add(edgeNode);
            }
            //add all the nodes that come from the nodes you use. this DEFINITELY USES up lots of space.

        }
    }

}
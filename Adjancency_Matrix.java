
import java.util.*;
class Graph
{
    private int no_of_vertices;
    LinkedList Adj_node[] ;
    int Adj_Mat[][];
    boolean visited[];
    Queue<Integer> q = new LinkedList<>();

    Graph(int vertices)
    {
        no_of_vertices=vertices;
        Adj_Mat = new int[vertices][vertices];
        Adj_node= new LinkedList[vertices];
        visited= new boolean[vertices];
        Arrays.fill(visited,false);
    }

    public void create_Adj_Mat()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<no_of_vertices; i++)
        {
            for(int j=i; j<no_of_vertices; j++)
            {
                if(i==j)
                    Adj_Mat[i][j]=0;
                else
                {
                    System.out.println("Add Egde between "+ i +" and " + j +" : ");
                    Adj_Mat[i][j]=sc.nextInt();
                    Adj_Mat[j][i]=Adj_Mat[i][j];

                }
            }
        }
    }

    public void create_Adj_List()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<no_of_vertices; i++)
        {
            Adj_node[i] = new LinkedList();
            for(int j=0; j<no_of_vertices; j++)
            {
                if(i!=j)
                {
                    System.out.println("Node "+ i +" is adjacent to " + j +" (Y/N) : ");
                    if(Character.toUpperCase(sc.next().charAt(0))=='Y')
                        Adj_node[i].add(j);
                }
            }
        }
        System.out.println("Adjacency List : ");
        for(LinkedList ll:Adj_node)
            System.out.println(ll.toString());
    }

    public void DisplayMatrix()
    {
        for(int i=0; i<no_of_vertices; i++)
        {
            for(int j=0; j<no_of_vertices; j++)
            {
                System.out.print(Adj_Mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void BFS_AM(int source)
    {
        q.add(source);
        visited[source]=true;

        System.out.print("\n BFS : ");

        while(!q.isEmpty())
        {
            int curr = q.remove();
            System.out.print(curr + "\t");
            for(int i=0;i<no_of_vertices;i++)
            {
                if(Adj_Mat[curr][i]==1 && visited[i]==false)
                {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }

    public void BFS_AL(int source)
    {
        q.add(source);
        visited[source]=true;

        System.out.print("\n BFS : ");

        while(!q.isEmpty())
        {
            int curr = q.remove();
            System.out.print(curr + "\t");
            Iterator<Integer> itr = Adj_node[curr].listIterator();
            while (itr.hasNext())
            {
                int adj_Curr = itr.next();
                if (!visited[adj_Curr])
                {
                    visited[adj_Curr] = true;
                    q.add(adj_Curr);
                }
            }
        }
    }
    public void DFS_AM(int source)
    {
        Stack<String> stk = new Stack<String>();
        Arrays.fill(visited,false);
        stk.push(String.valueOf(source));
        visited[source]=true;

        System.out.print("\n DFS : ");

        while(!stk.isEmpty())
        {
            int curr =Integer.parseInt(stk.pop());
            System.out.print(curr + "\t");
            for(int i=0;i<no_of_vertices;i++)
            {
                if(Adj_Mat[curr][i]==1 && visited[i]==false)
                {
                    stk.push(String.valueOf(i));
                    visited[i]=true;
                }
            }
        }
    }
    public void DFS_AL(int source)
    {
        Stack<String> stk = new Stack<String>();
        Arrays.fill(visited,false);
        stk.push(String.valueOf(source));
        visited[source]=true;

        System.out.print("\n DFS : ");

        while(!stk.isEmpty())
        {
            int curr =Integer.parseInt(stk.pop());
            System.out.print(curr + "\t");
            Iterator<Integer> itr = Adj_node[curr].listIterator();
            while (itr.hasNext())
            {
                int adj_Curr = itr.next();
                if (!visited[adj_Curr])
                {
                    stk.push(String.valueOf(adj_Curr));
                    visited[adj_Curr]=true;
                }
            }
        }
    }
}
public class Adjancency_Matrix
{
    public static void main(String[] args) {
        int choice, Vertices,strt_Node;
        Graph G=null;
        do
        {
            System.out.println("\n**** Depth First Search and Breadth First Search ****");
            System.out.println("1. Represent Graph - Adjacency Matrix \n");
            System.out.println("2. Represent Graph - Adjacency List \n");
            System.out.println("3. Exit\n");
            System.out.println(" Enter your choice : ");

            Scanner sc = new Scanner(System.in);
            choice=sc.nextInt();

            if(choice!=3)
            {
                System.out.println("Enter No. of Vertices");
                Vertices = sc.nextInt();
                G = new Graph(Vertices);
            }

            switch(choice)
            {
                case 1: G.create_Adj_Mat();
                    System.out.println("\n***** Adjacency Matrix *****");
                    G.DisplayMatrix();
                    System.out.println("Enter Start Node :");
                    strt_Node = sc.nextInt();
                    G.BFS_AM(strt_Node);
                    G.DFS_AM(strt_Node);
                    break;
                case 2: G.create_Adj_List();
                    System.out.println("Enter Start Node :");
                    strt_Node = sc.nextInt();
                    G.BFS_AL(strt_Node);
                    G.DFS_AL(strt_Node);
                    break;
            }
        }while(choice<3);
    }
}
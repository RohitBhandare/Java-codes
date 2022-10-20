
import java.util.*;
class Node
{
    int data;
    Node Left;
    Node Right;
}
class Optimal
{
   int no_of_words;
   Node Root;
    Scanner sc=new Scanner(System.in);
    public int p[];
    public int q[];
    public String words[];
    public int w[][];
    public int c[][];
    public int r[][];
    public Optimal(int Size)
    {
        no_of_words=Size;
        p=new int[no_of_words+10];
        words=new String[no_of_words+10];
        q= new int[no_of_words+10];
        w=new int[no_of_words+10][no_of_words+10];
        c=new int[no_of_words+10][no_of_words+10];
        r=new int[no_of_words+10][no_of_words+10];
    }
    void  get_val()
 {
     for(int i=0;i<=no_of_words;i++) {
         if(i!=0) {
             System.out.println("Enter words at: [" + i + "] : ");
             words[i] = sc.next();
             System.out.println("Enter prob. of words at: [" + words[i] + "] : ");
             p[i] = sc.nextInt();
         }
         System.out.println("Enter unsucc. prob. of words at: ["+words[i]+"] : ");
         q[i]=sc.nextInt();
     }

 }
     int Min_Value(int i, int j)
    {
        int m,k=0;
        int minimum = 9999;
        for (m=r[i][j-1];m<=r[i+1][j];m++)
        {
            if ((c[i][m-1]+c[m][j])<minimum)
            {
                minimum=c[i][m-1]+c[m][j];
                k = m;
            }
        }
        return k;
    }
    void OBST()
    {
        int i, j, k;
        for (i=0 ; i<=no_of_words; i++)
        {
            w[i][i] = q[i];
            r[i][i] = c[i][i] = 0;
            System.out.println("W["+i+"]["+i+"] :"+w[i][i]+"\tC["+i+"]["+i+"] :"+c[i][i]+"\tR["+i+"]["+i+"] :"+r[i][i]);
        }
        System.out.println();
        for( i=0;i<no_of_words;i++)
        {
            w[i][i + 1] = w[i][i] + q[i + 1] + p[i + 1];
            r[i][i + 1] = i + 1;
            c[i][i + 1] = q[i] + q[i + 1] + p[i + 1];

            System.out.println("W[" + i + "][" + (i + 1) + "] :" + w[i][i+1] + "\tC[" + i + "][" + (i + 1) + "] :" + c[i][i + 1] + "\tR[" + i + "][" + (i + 1) + "] :" + r[i][i + 1]);
        }
        int m;
        System.out.println();
        for (m=2 ; m<=no_of_words ; m++)
        {
            for (i=0 ; i<=no_of_words-m ; i++)
            {
                j = i+m;
                w[i][j] = w[i][j-1] + p[j] + q[j];
                k = Min_Value(i,j);
                c[i][j] = w[i][j] + c[i][k-1] + c[k][j];
                r[i][j] = k;
                System.out.println("W["+i+"]["+j+"] :"+w[i][j]+"\tC["+i+"]["+j+"] :"+c[i][j]+"\tR["+i+"]["+j+"] :"+r[i][j]);
            }
        }
        System.out.println("\nRoot of OBST is: "+r[0][no_of_words]);
        System.out.println("Total optimized Cost of OBST is: "+c[0][no_of_words]);
        Root=construct(r,0,40);
    }
    Node construct(int r[][],int i,int j)
    {
        Node p;
        if(r[i][j]==0)
        {
            return null;
        }
        else {
            p = new Node();
            p.data = r[i][j];
            p.Left=construct(r,i,r[i][j]-1);
            p.Right=construct(r,i,r[i][j]+1);
            return (p);
        }
    }
    public void inorder(Node Root)
    {
        if(Root==null)
            return ;
        else
        {
            inorder(Root.Left);
            System.out.println("\nTree"+Root.data);
            inorder(Root.Right);
        }
    }
}

class OBST
{
    public static void main (String[] args )
    {
        System.out.println("Enter Numbers of words: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Optimal obj=new Optimal(n);
        obj.get_val();
        obj.OBST();
        Node Root=null;
        obj.inorder(Root);
    }
}
/* *********************************** OUTPUT **************************
Enter Numbers of words:
4
Enter unsucc. prob. of words at: [null] :
1
Enter words at: [1] :

Do
Enter prob. of words at: [Do] :
1
Enter unsucc. prob. of words at: [Do] :
2
Enter words at: [2] :
If
Enter prob. of words at: [If] :
3
Enter unsucc. prob. of words at: [If] :
1
Enter words at: [3] :
Read
Enter prob. of words at: [Read] :
1
Enter unsucc. prob. of words at: [Read] :
1
Enter words at: [4] :
While
Enter prob. of words at: [While] :
3
Enter unsucc. prob. of words at: [While] :
3
W[0][0] :1	C[0][0] :0	R[0][0] :0
W[1][1] :2	C[1][1] :0	R[1][1] :0
W[2][2] :1	C[2][2] :0	R[2][2] :0
W[3][3] :1	C[3][3] :0	R[3][3] :0
W[4][4] :3	C[4][4] :0	R[4][4] :0

W[0][1] :4	C[0][1] :4	R[0][1] :1
W[1][2] :6	C[1][2] :6	R[1][2] :2
W[2][3] :3	C[2][3] :3	R[2][3] :3
W[3][4] :7	C[3][4] :7	R[3][4] :4

W[0][2] :8	C[0][2] :12	R[0][2] :2
W[1][3] :8	C[1][3] :11	R[1][3] :2
W[2][4] :9	C[2][4] :12	R[2][4] :4

W[0][3] :10	C[0][3] :17	R[0][3] :2
W[1][4] :14	C[1][4] :25	R[1][4] :4

W[0][4] :16	C[0][4] :32	R[0][4] :2

Root of OBST is: 2
Total optimized Cost of OBST is: 32

Process finished with exit code 0
************************************************************************/

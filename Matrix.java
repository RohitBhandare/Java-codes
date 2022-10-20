import java.util.*;
public class Matrix {
    public static void main(String[] args)
    {
        System.out.println("*************** Matrix *************");
        int mat1[][]=new int[3][3];
        int mat2[][]=new int[3][3];
        int Result[][]=new int[3][3];
        int i,j;
        System.out.println("Enter a Elements in Mat1: ");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("At ["+i +"]"+"["+j+"] = ");

                mat1[i][j]=sc.nextInt();

            }

        }

        System.out.println("Enter a Elements in Mat2: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("At ["+i +"]"+"["+j+"] = ");
                mat2[i][j]=sc.nextInt();
            }

        }
        System.out.println("Mat1 Elements: ");
        for( i=0;i<3;i++)
        {
            System.out.print("|");
            for( j=0;j<3;j++)
            {
                System.out.print(" "+mat1[i][j]);
            }
            System.out.println("|");

        }
        System.out.println("Mat2 Elements: ");
        for( i=0;i<3;i++)
        {
            System.out.print("|");
            for( j=0;j<3;j++)
            {
                System.out.print(" "+mat2[i][j]);
            }
            System.out.println("|");

        }
        System.out.println("Matrix Addition: ");
        for( i=0;i<3;i++)
        {
            System.out.print("|");
            for (j = 0; j < 3; j++)
            {
                Result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(" "+Result[i][j]);
            }
            System.out.println("| ");
        }
        System.out.println("Matrix Substraction: ");
        for( i=0;i<3;i++)
        {
            System.out.print("|");
            for (j = 0; j < 3; j++)
            {
                Result[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(" "+Result[i][j]);
            }
            System.out.println("| ");
        }
        System.out.println("Matrix Multiplication: ");
        for( i=0;i<3;i++)
        {
            System.out.print("|");
            for (j = 0; j < 3; j++)
            {
                Result[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    Result[i][j]+= mat1[i][k]*mat2[k][j];

                }
                System.out.print(" "+Result[i][j]);

            }
            System.out.println("| ");
        }


    }
}
/* **********************OUTPUT***************************
****************Matrix**************************************
Enter a Elements in Mat1:
At [0][0] = 60
At [0][1] = 60
At [0][2] = 60
At [1][0] = 60
At [1][1] = 60
At [1][2] = 60
At [2][0] = 60
At [2][1] = 60
At [2][2] = 60
Enter a Elements in Mat2:
At [0][0] = 40
At [0][1] = 40
At [0][2] = 40
At [1][0] = 40
At [1][1] = 40
At [1][2] = 40
At [2][0] = 40
At [2][1] = 40
At [2][2] = 40
Mat1 Elements:
| 60 60 60|
| 60 60 60|
| 60 60 60|
Mat2 Elements:
| 40 40 40|
| 40 40 40|
| 40 40 40|
Matrix Addition:
| 100 100 100|
| 100 100 100|
| 100 100 100|
Matrix Substraction:
| 20 20 20|
| 20 20 20|
| 20 20 20|
Matrix Multiplication:
| 7200 7200 7200|
| 7200 7200 7200|
| 7200 7200 7200|

Process finished with exit code 0
* ************************************************************/

import java.util.*;
class  HashTable
{
    String Client_Name;
    int Tel_Phone_NO;
    public HashTable(String CName,int Tel_No)
    {
        Client_Name=CName;
        Tel_Phone_NO=Tel_No;
    }
    public  void  Search(Vector V_hashTable, int Tel_NO)
    {
        int index =Tel_NO%10;
        HashTable searchHash =(HashTable) V_hashTable.elementAt(index);
        if(searchHash.Tel_Phone_NO==Tel_NO) {
            System.out.println("\n\tClient Fount at " + index + " Successfully...............!!!");
            System.out.println("Name Of Client :    " +Client_Name);
            System.out.println("Phone No. Of Client :  " +Tel_Phone_NO);
        }
        else
            System.out.println("Client NOT Found");
    }
}
public class Hashing_Techniques
{
        public static void main(String[] args)
        {
            System.out.print("Hashing Program\n");
            int tablesize = 10;
            HashTable hashtable1;
            System.out.print("Index       Name      Phone NO.   \n");
            Vector hashvector = new Vector(tablesize);
            for(int v_counter=00;v_counter<10;v_counter++)
            {
                hashtable1 = new HashTable("Newton"+v_counter+10,v_counter+ 9322125*2);
                System.out.print(v_counter+1);
                System.out.print("         " + hashtable1.Client_Name);
                System.out.println("    " + hashtable1.Tel_Phone_NO);
                int index = hashtable1.Tel_Phone_NO%10;
                hashvector.add(index,hashtable1);

            }
            HashTable searchHash =new HashTable("Newton110",18644251);
            searchHash.Search(hashvector,searchHash.Tel_Phone_NO);
        }

}





/* .............................OUTPUT..........................................
Hashing Program
Index       Name      Phone NO.
1         Newton010    18644250
2         Newton110    18644251
3         Newton210    18644252
4         Newton310    18644253
5         Newton410    18644254
6         Newton510    18644255
7         Newton610    18644256
8         Newton710    18644257
9         Newton810    18644258
10         Newton910    18644259

	Client Fount at 1 Successfully...............!!!
Name Of Client :    Newton110
Phone No. Of Client :  18644251

Process finished with exit code 0
*/


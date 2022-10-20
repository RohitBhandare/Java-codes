package GCD_LCM_HSF;
//Highest Common factor
public class HCF {
    public static void main(String[] args) {
        int a=12,b=18; //   4: 1->2->4     6: 1->2->3->6  # 2 is the common divisor
        int hcf;
        for(hcf=a;hcf>=1;hcf--)
        {
            if(a%hcf==0 && b%hcf==0)
                break;
        }
        System.out.println(hcf);
    }
}

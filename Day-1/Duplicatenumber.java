import java.util.Scanner;
public class Duplicatenumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int n=sc.nextInt();
    float[] a=new float[1000];
    float[] b=new float[1000];
    int i,j;
    System.out.println("Enter"+ n +"Elements of an array");
    for(i=0;i<n;i++){
        a[i]=sc.nextFloat();
    }
     int flag=0;
     for(i=0;i<n;i++){
        flag=0;
        for(j=0;j<n;j++){
            if(a[i]==a[j]){
                
            }
        }
     }

    }
}

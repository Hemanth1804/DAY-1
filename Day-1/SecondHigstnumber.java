import java.util.Scanner;
public class SecondHigstnumber{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int n=sc.nextInt();
    float[] a=new float[1000];
    float temp;
    int i;
    System.out.println("Enter"+ n +"Elements of an array");
    for(i=0;i<n;i++){
        a[i]=sc.nextFloat();
    }
    float min=a[0];
    int j=0;
    for(i=0;i<n;i++){
        if(a[i]<min){
            min=a[i];
            j=i;
        }
    }
    temp=a[j];
    a[j]=a[n-1];
    a[n-1]=temp;
    min=a[0];
     for(i=0;i<n-1;i++){
        if(a[i]<min){
            min=a[i];
        }
     }
     System.out.println("The second minimum number in the Array is\n"+ min);
   }
}
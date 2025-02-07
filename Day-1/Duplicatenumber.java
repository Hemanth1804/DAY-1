import java.util.Scanner;
public class Duplicatenumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int n=sc.nextInt();
    int[] a=new int[1000];
    int i,j;
    int temp;
    int flag=0;
    System.out.println("Enter"+ n +"Elements of an array");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
     for(i=0;i<n;i++){
        for(j=0;j<n-1-i;j++){
             if(a[j]>a[j+1]){
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
             }
        }
     }
     i=0;
     for(;i<n;i++){
        flag=0;
       for(j=0;j<n;j++){
        if(a[i]==a[j]){
            flag+=1;
            i=j;
        }
       }
       if(flag>1){
        System.out.println("The duplicate number is:"+a[i]+" repeadted at "+flag+" times");
       }
     }
    }
}

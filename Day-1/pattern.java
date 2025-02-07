import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of pattern");
    int n=sc.nextInt();
    int i=0;
    int j,k=1,l=0;
    for(i=0;i<n;i++){
        for(j=0;j<n-(1+i);j++){
           System.out.print(" ");
        }
     while(k>0){
        System.out.print("*");
        k--;
     }
     k=i+3+l;
     l++;
     System.out.println("");
    }
    }
}

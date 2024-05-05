import java.util.Scanner;
class Training {
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
int n=obj.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=obj.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i;j<n;j++){
for(int k=i;k<=j;k++){
System.out.print(a[k]+" ");
}
System.out.println();
}
}
}
}
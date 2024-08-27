import java.util.*;
public class Solution {
    public static int maxarr=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double avg=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            avg=avg+a[i];
        }
        double mean=avg/n;
        System.out.printf("%.2f ",mean);
        double median;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        if(n%2!=0){
            median=a[n/2];
        }
        else{
            median=(a[n/2-1]+a[n/2])/2.0;
        }
        System.out.printf("%.2f ",median);
        int currcou=Integer.MIN_VALUE;
        int maxcou=Integer.MIN_VALUE;
        
        for(int i=0;i<n-1;i++){
            currcou=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    currcou++;
                }
                if(currcou>maxcou){
                    maxcou=currcou;
                    maxarr=a[i];
                }
            }
        }
        System.out.println(maxarr);
    }

}
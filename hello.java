import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int find=(size/2)-1;
        int []num=new int[size];
        for(int i=0;i<size;i=i+1){
            num[i]=scan.nextInt();
            
        }
        for(int i=0;i<size;i=i+1){
            if(find==i){
                System.out.println(num[i]);
            }
        }
       }
       
}
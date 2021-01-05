import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm1003 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int count=0,i,num=0,x;
        try {
            count=Integer.parseInt(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(i=0;i<count;i++){
            x=0;
            try {
                num=Integer.parseInt(bf.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            int[][] num_arr= new int[num+1][2];
            while(x<=num){
                if(x==0){
                    num_arr[x][0]=1;
                }
                else if(x==1){
                    num_arr[x][1]=1;
                }
                else{
                    num_arr[x][0]=num_arr[x-2][0]+num_arr[x-1][0];
                    num_arr[x][1]=num_arr[x-2][1]+num_arr[x-1][1];
                }
                x++;
            }
            System.out.println(num_arr[x-1][0]+" "+num_arr[x-1][1]);
        }
    }
}



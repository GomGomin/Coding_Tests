import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int N = Integer.parseInt(br.readLine());
 StringTokenizer st = new StringTokenizer(br.readLine());
 double[] arr = new double[N];
 int M =0;
 double avg=0;
 for(int i=0; i<N;i++) {
    int x = Integer.parseInt(st.nextToken());
   arr[i]=x;
    if(M<x) {
	   M=x;
   }
 }
 for(int i =0; i<N;i++) {
	 arr[i]=(arr[i]/M)*100;
	 avg+=arr[i];
 }
 System.out.println(avg/N);
 }
}
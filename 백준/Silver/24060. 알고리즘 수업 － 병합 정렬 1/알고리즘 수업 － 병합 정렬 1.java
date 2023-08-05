
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {

    static int[] tmp;
    static int answer = -1;
    static int K;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] A = new int[n];
        tmp = new int[n];

        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(A,0,A.length-1);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void merge_sort(int[] a,int p, int r) {
        if(p < r){
            int q =(p+r)/2;
            merge_sort(a,p,q);
            merge_sort(a,q+1,r);
            merge(a,p,q,r);
        }
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q+1;
        int t = 0;
        while(i<=q && j<=r){
            if(a[i] <= a[j]){
                tmp[t++] = a[i++];
            }else{
                tmp[t++] = a[j++];
            }
        }
        while(i<=q){
            tmp[t++] = a[i++];
        }
        while(j<=r){
            tmp[t++] = a[j++];
        }

        i = p;
        t = 0;

        while(i<=r){
            count++;
            if(count == K){
                answer = tmp[t];
                break;
            }
            a[i++] = tmp[t++];
        }
    }
}





import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int find = Integer.parseInt(st.nextToken());
            int findindex = deque.indexOf(find);
            int middle = 0;

            if (deque.size() % 2 == 0) {
                middle = deque.size() / 2-1;
            } else {
                middle = deque.size() / 2;
            }

            if (deque.peek() == find) {
                deque.poll();
                continue;
            } else {
                if (findindex > middle) {
                    while (deque.peek() != find) {
                        int a = deque.pollLast();
                        deque.addFirst(a);
                        count++;
                    }
                } else {
                    while (deque.peek() != find) {
                        int a = deque.pollFirst();
                        deque.addLast(a);
                        count++;
                    }
                }
                deque.poll();
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}




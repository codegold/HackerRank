package JavaSwapNodesAlgo;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapNodes {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] l = new int[n + 1];
        int[] r = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            String[] lr = reader.readLine().split("\\s");
            l[i] = Integer.parseInt(lr[0]);
            r[i] = Integer.parseInt(lr[1]);
        }

        int[] depth = calculateDepth(l, r, n);

        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(reader.readLine());
            performSwap(l, r, k, depth);
            inorder(l, r, 1);
            System.out.println();
        }
    }

    static int[] calculateDepth(int[] l, int[] r, int n) {
        int[] d = new int[n + 1];
        int prevLevelNodes = 1;
        int depth = 1;
        for (int i = 1; i <= n; ) {
            int currentLevelNodes = 0;
            while (prevLevelNodes-- > 0) {
                d[i] = depth;
                if (l[i] != -1) {
                    currentLevelNodes++;
                }
                if (r[i] != -1) {
                    currentLevelNodes++;
                }
                i++;
            }
            prevLevelNodes = currentLevelNodes;
            depth++;
        }
        return d;
    }

    static void performSwap(int[] l, int[] r, int k, int[] depth) {
        for (int i = 1; i < l.length; i++) {
            if (depth[i] % k == 0) {
                int temp = l[i];
                l[i] = r[i];
                r[i] = temp;
            }
        }
    }

    static void inorder(int[] l, int[] r, int current) {
        if (l[current] != -1) {
            inorder(l, r, l[current]);
        }
        System.out.print(current + " ");
        if (r[current] != -1) {
            inorder(l, r, r[current]);
        }
    }
}
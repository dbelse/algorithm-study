import java.util.Scanner;
 
public class BOJ2999 {
    public static int R, C;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            if (len % i == 0 && i <= len / i) {
                R = i;
                C = len / i;
            }
        }
        if (R == 0 && C == 0) {
            R = 1;
            C = 1;
        }
        int idx = 0;
        char[][] map = new char[R][C];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                map[j][i] = arr[idx++];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(map[i][j]);
            }
        }
        System.out.println(sb.toString());
    }
}

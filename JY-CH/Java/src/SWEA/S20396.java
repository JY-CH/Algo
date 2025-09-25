package SWEA;

import java.io.*;
import java.util.StringTokenizer;

public class S20396 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stoneNumber = Integer.parseInt(st.nextToken());
            int changeCount = Integer.parseInt(st.nextToken());

            int[] stoneStatus = new int[stoneNumber];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < stoneNumber; j++) {
                stoneStatus[j] = Integer.parseInt(st.nextToken());
            }
            for (int l = 0; l < changeCount; l++) {
                st = new StringTokenizer(br.readLine());
                int changeStartIndex = Integer.parseInt(st.nextToken());
                int changeEndIndex = Integer.parseInt(st.nextToken());

                int changeRange = 0;

                if (changeStartIndex + changeEndIndex > stoneNumber) {
                    changeRange = stoneNumber;
                } else {
                    changeRange = changeStartIndex + changeEndIndex - 1;
                }

                for (int k = changeStartIndex; k < changeRange; k++) {
                    int color = stoneStatus[k - 1];
                    stoneStatus[k] = color;
                }
            }
            bw.write("#" + i + " ");
            for (int o = 0; o < stoneNumber; o++) {
                bw.write(stoneStatus[o] + " ");
            }
            bw.write("\n");

        }
        br.close();
        bw.close();

    }
}

package src.main.Java;

public class SQRService {
    public int rangeSqrt(int x, int y) {
        int q = 0;
        for (int i = 10; i < 100; i = i + 1) {
            int v = i * i;
            if (v >= x && v <= y) {
                q++;

            }
        }
        if (q > 0) {
            return q;
        } else {
            return -1;
        }


    }
}

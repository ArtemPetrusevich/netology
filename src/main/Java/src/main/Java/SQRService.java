package src.main.Java;

public class SQRService {
    public int rangeSqrt(int x, int y) {
        int countSquare = 0;
        for (int i = 10; i < 100; i = i + 1) {
            int v = i * i;
            if (v >= x && v <= y) {
                countSquare++;

            }
        }
        if (countSquare > 0) {
            return countSquare;
        } else {
            return -1;
        }


    }
}

package ru.netology.sqr;

public class SQRService {

//    static SquareService service = new SquareService();

    public int numberOfSquares(int start, int end) {
        int count = 0;
        for (
                int i = 10;
                i < 100; i++) {
            int j = i * i;
            if ((j >= start) & (j <= end)) {
                count = count + 1;
            }
        }

        return count;

    }
}

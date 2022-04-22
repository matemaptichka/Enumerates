package ru.netology.sqr;

public class SQRService {
    public int enumerate(int from, int to) {
        int k = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= from) && (i * i <= to)) {
                k++;
            }
        }
        return k;
    }
}

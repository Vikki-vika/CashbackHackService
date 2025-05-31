package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount % boundary == 0) {
            return 0;
        }
        return boundary - amount % boundary;
    }
}


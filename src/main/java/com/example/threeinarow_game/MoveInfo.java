package com.example.threeinarow_game;

public abstract class MoveInfo {

    // запросы
    abstract int getRow1();
    abstract int getCol1();
    abstract int getRow2();
    abstract int getCol2();
    abstract int getPoints(); // запрос: сколько очков набрано за ход

    // постусловие: возвращает использованный бонус, если был, иначе null
    abstract Bonus getBonusUsed(); // запрос: какой бонус был использован (если был)
}


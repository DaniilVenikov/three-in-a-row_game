package com.example.threeinarow_game;

import java.util.List;

public abstract class GameBoard {

    // запросы
    abstract int getWidth();
    abstract int getHeight();

    // предусловие: 0 <= row < getHeight(), 0 <= col < getWidth()
    abstract Field getField(int row, int col);
    abstract boolean hasPossibleMoves();
    abstract List<Combination> findCombinations();


    // команды

    // предусловие: ячейки (row1, col1) и (row2, col2) являются соседними и находятся в пределах поля
    // постусловие: элементы в указанных ячейках поменяны местами
    abstract void swapFields(int row1, int col1, int row2, int col2);

    // предусловие: комбинация comb действительно присутствует на поле
    // постусловие: элементы, входящие в комбинацию, помечаются как пустые (или удаляются)
    abstract void removeCombination(Combination comb);

    // предусловие: на поле есть хотя бы одна пустая ячейка
    // постусловие: все элементы над пустыми ячейками сдвигаются вниз, верхние ячейки становятся пустыми
    abstract void dropElements();

    // предусловие: в поле есть пустые ячейки
    // постусловие: все пустые ячейки заполнены новыми случайными элементами
    abstract void fillEmpty();
}


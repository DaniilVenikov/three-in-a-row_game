package com.example.threeinarow_game;

public abstract class Bonus {
    // запросы
    abstract String getName(); // запрос: имя бонуса

    //команды

    // предусловие: ячейка (row, col) на игровом поле board содержит этот бонус
    // постусловие: применяется эффект бонуса к полю, бонус может быть удалён после активации
    abstract void activate(GameBoard board, int row, int col); // команда: активировать бонус (эффект зависит от типа бонуса)
}

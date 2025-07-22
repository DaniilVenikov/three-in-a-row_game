package com.example.threeinarow_game;

import java.util.List;

public abstract class PlayerInfo {

    // запросы
    abstract String getPlayerName(); // запрос: имя игрока
    abstract int getScore(); // запрос: текущее количество очков
    abstract int getMoveCount(); // запрос: число ходов
    abstract List<MoveInfo> getMoveHistory();// запрос: история ходов


    // команды
    // предусловие: points > 0
    abstract void addScore(int points); // команда: увеличить счёт
    abstract void incrementMove(); // команда: увеличить число ходов

    // предусловие: move != null
    // постусловие: добавляет информацию о ходе в конец истории ходов
    abstract void addMove(MoveInfo move); // команда: добавить ход в историю
}


package com.example.threeinarow_game;

public abstract class Field {
    // запросы
    abstract ElementType getElementType();
    abstract boolean isEmpty(); // запрос: пуста ли ячейка

    // постусловие: возвращает бонус, если он есть, иначе null
    abstract Bonus getBonus(); // запрос: есть ли бонус

    // команды
    abstract void setElementType(ElementType type); // команда: изменить тип элемента
    abstract void setBonus(Bonus bonus); // команда: назначить бонус
}


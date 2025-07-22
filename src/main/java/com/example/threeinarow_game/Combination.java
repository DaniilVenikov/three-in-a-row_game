package com.example.threeinarow_game;

import java.util.List;

public abstract class Combination {
    // Запросы
    abstract List<Field> getFields(); // Список ячеек, входящих в комбинацию
    abstract ElementType getElementType(); // Тип элементов в комбинации
    abstract int getSize(); // Размер комбинации (сколько элементов)

}


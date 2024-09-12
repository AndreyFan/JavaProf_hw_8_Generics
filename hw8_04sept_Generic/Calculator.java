package de.telran.lesson_4_Generic.hw8_04sept_Generic;

//1 уровень сложности: 1. Создайте обобщенный интерфейс для калькулятора,
//в котором будут объявлен перечень операций,
//которые умеет делать ваш калькулятор add, sub, multi и div
//и реализуйте классы, которые
//будут включать данный интерфейс для работы
//с различными типами данных аргументов.

public interface Calculator<T> {
        T add(T a, T b);
        T sub(T a, T b);
        T multi(T a, T b);
        T div(T a, T b);
    }


package de.telran.lesson_4_Generic.hw8_04sept_Generic;

    public class IntCalculator implements Calculator<Integer> {

        @Override
        public Integer add(Integer a, Integer b) {
            return a + b;
        }

        @Override
        public Integer sub(Integer a, Integer b) {
            return a - b;
        }

        @Override
        public Integer multi(Integer a, Integer b) {
            return a * b;
        }

        @Override
        public Integer div(Integer a, Integer b) {
            if (b == 0) {
                System.out.println("на ноль делить нельзя");;
            }
            return a / b;
        }
    }


package de.telran.lesson_4_Generic.hw8_04sept_Generic;

    public class DoubleCalculator implements Calculator<Double> {

        @Override
        public Double add(Double a, Double b) {
            return a + b;
        }

        @Override
        public Double sub(Double a, Double b) {
            return a - b;
        }

        @Override
        public Double multi(Double a, Double b) {
            return a * b;
        }

        @Override
        public Double div(Double a, Double b) {
            if (b == 0) {
                System.out.println("на ноль делить нельзя");
            }
            return a / b;
        }
    }


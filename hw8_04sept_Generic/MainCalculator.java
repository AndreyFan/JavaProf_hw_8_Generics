package de.telran.lesson_4_Generic.hw8_04sept_Generic;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator= new IntCalculator();
        System.out.println("15+5=  "+intCalculator.add(15,5));
        System.out.println("15-5=  "+ intCalculator.sub(15,5));

        Calculator<Double> doubleCalculator=new DoubleCalculator();
        System.out.println("15.0 * 5.0 =  "+doubleCalculator.multi(15.0,5.0));
        System.out.println("15.0 / 5.0 =  " +doubleCalculator.div(15.0, 5.0));
    }


}

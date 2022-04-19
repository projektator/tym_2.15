package pl.edu.wsiz.io11.part1;

public class Exercise09 {

    /**
     * 9. Napisz metodę wyznaczającą średnią arytmetyczną w tablicy liczb rzeczywistych.
     */

    public static void main(String[] args) {
        double[] numbers = {2.5, 3.2, 33.1, -8};
        double sum = 0;
        for (double number : numbers) {

            sum += number;
        }

        double avg = sum / numbers.length;
        System.out.println(" Avg: " + avg);
    }
}
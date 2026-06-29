import tasktwo.TablePrinter;

public class Task2Main {

    public static void main(String[] args) {

        TablePrinter printer = new TablePrinter();

        int[] numbers = {4, 35, 80, 123, 12345, 44, 8, 5};
        int columns = 4;

        String result = printer.solution(numbers, columns);

        System.out.println(result);

    }
}

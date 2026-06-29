package tasktwo;

public class TablePrinter {

    public String solution(int[] numbers, int columns) {
        if (numbers == null || numbers.length == 0) return "";

        int maxWidth = getMaxWidth(numbers);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i += columns) {

            int end = Math.min(i + columns, numbers.length);
            int currentCols = end - i;

            // línea superior
            result.append(buildBorder(maxWidth, currentCols)).append("\n");

            // contenido
            result.append("|");
            for (int j = i; j < end; j++) {
                result.append(formatNumber(numbers[j], maxWidth)).append("|");
            }
            result.append("\n");
        }

        // última línea
        int lastCols = Math.min(columns, numbers.length);
        result.append(buildBorder(maxWidth, lastCols));

        return result.toString();
    }

    private int getMaxWidth(int[] numbers) {
        int max = 0;
        for (int n : numbers) {
            max = Math.max(max, String.valueOf(n).length());
        }
        return max;
    }

    private String buildBorder(int width, int cols) {
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < cols; i++) {
            border.append("+").append("-".repeat(width));
        }
        border.append("+");
        return border.toString();
    }

    private String formatNumber(int num, int width) {
        String s = String.valueOf(num);
        return " ".repeat(width - s.length()) + s;
    }

}

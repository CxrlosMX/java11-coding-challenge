package taskthree;

public class Solution {

    public int solution(int A, int B) {
        int left = 1;
        int right = Math.max(A, B);
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long pieces = (A / mid) + (B / mid);

            if (pieces >= 4) {
                result = mid;     // se puede, buscar más grande
                left = mid + 1;
            } else {
                right = mid - 1;  // muy grande
            }
        }

        return result;
    }

}

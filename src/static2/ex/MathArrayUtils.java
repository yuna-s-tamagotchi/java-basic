package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
            // 인스턴스 생성 블락
            // 이렇게 해주면 사용자가 MathArrayUtils 하고 . 찍었을 때 아, 이건 static 이구나 알 수 있다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {  // iter 단축어
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

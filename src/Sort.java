/**
 * Created by magnus on 2018-03-12.
 */
public class Sort {
    public static void selSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            int tmp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = tmp;
        }
    }

    public static void selSort(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
            }
            double tmp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = tmp;
        }
    }

    public static void selSortStringLength(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int index = i;
            for (int j = i; j < words.length; j++) {
                if (words[j].length() < words[index].length()) {
                    index = j;
                }
            }
            String tmp = words[index];
            words[index] = words[i];
            words[i] = tmp;
        }
    }

    public static void selSortStringAlpha(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int index = i;
            for (int j = i; j < words.length; j++) {
                if (words[j].compareTo(words[index]) < 0) {
                    index = j;
                }
            }
            String tmp = words[index];
            words[index] = words[i];
            words[i] = tmp;
        }
    }
}
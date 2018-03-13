public class SortTest {
    public static void main(String[] args) {
        System.out.println("Sort integers:");
        int[] numbers = {23, 45, 12, 3, 19, 8, 25, 13};
        Sort.selSort(numbers);
        for (int item : numbers) {
            System.out.print(item + ", ");
        }
        System.out.println("\nSort doubles:");
        double[] doubles = {5.5, 0.54, 0.2, Math.PI, 0.001, 0.9, 5 + 1/3D, 5.3};
        Sort.selSort(doubles);
        for (double item : doubles) {
            System.out.print(item + ", ");
        }
        System.out.println("\nSort words alphabetically:");
        String[] words = {"xyz", "lorem", "ipsum", "java", "ord", "abc"};
        Sort.selSortStringAlpha(words);
        for (String item : words) {
            System.out.print(item + ", ");
        }
        System.out.println("\nSort words by length:");
        String[] words2 = {"55555", "22", "1", "999999999", "333"};
        Sort.selSortStringLength(words2);
        for (String item : words2) {
            System.out.print(item + ", ");
        }
    }
}

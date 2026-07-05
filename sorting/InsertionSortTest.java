public class InsertionSortTest {
    public static void main(String[] args) {
        InsertionSort sortArray = new InsertionSort(10);

        System.out.println("Unsorted array:");
        System.out.println(sortArray);

        sortArray.sort();

        System.out.println("Sorted array:");
        System.out.println(sortArray);
    }
}
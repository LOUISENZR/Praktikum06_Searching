package MergeSortTest;

public class sortMain {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        mergeSorting mSort = new mergeSorting();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSorting(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}

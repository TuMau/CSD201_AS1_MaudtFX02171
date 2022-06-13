//    Viết code tính thời gian chạy của 3 thuật toán.
//     Nhận xét hiệu năng của 3 thuật toán với các kiểu dữ liệu khác nhau:
//        - Dữ liệu sắp xếp theo thứ tự ngược lại
//        - Dữ liệu đã được sắp xếp
//        - Dữ liệu có xáo trộn ngẫu nhiên.
// Bubble Sort, Selection Sort, Insertion Sort
public class TimeOfAlgorithm {

    Algorithm algorithm = new Algorithm();

    public long timeOfBubbleSort(float[] array) {
        long startTime = System.nanoTime();

        algorithm.bubbleSortAdd(array);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        return duration;
    }

    public long timeOfInsertionSort(float[] array) {
        long startTime = System.nanoTime();

        algorithm.insertionSortAdd(array);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        return duration;
    }

    public long timeOfSelectionSort(float[] array) {
        long startTime = System.nanoTime();

        algorithm.selectionSortAdd(array);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        return duration;
    }


    public static void main(String[] args) {
        TimeOfAlgorithm time =  new TimeOfAlgorithm();
        
        //  Dữ liệu sắp xếp theo thứ tự ngược lại
        float[] dataNguoc = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Dữ liệu sắp xếp theo thứ tự ngược lại");
        System.out.println("Selection Sort: " + time.timeOfSelectionSort(dataNguoc));
        System.out.println("Bubble Sort: " + time.timeOfBubbleSort(dataNguoc));
        System.out.println("Insertion Sort: " + time.timeOfInsertionSort(dataNguoc));
        
        //Dữ liệu có xáo trộn ngẫu nhiên.
        float[] dataNgauNhien = {12, 0, 11, 1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        System.out.println("Dữ liệu có xáo trộn ngẫu nhiên.");
        System.out.println("Selection Sort: " + time.timeOfSelectionSort(dataNgauNhien));
        System.out.println("Bubble Sort: " + time.timeOfBubbleSort(dataNgauNhien));
        System.out.println("Insertion Sort: " + time.timeOfInsertionSort(dataNgauNhien));
        
        //Dữ liệu đã được sắp xếp
        float[] dataDaXep = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Dữ liệu đã được sắp xếp");
        System.out.println("Selection Sort: " + time.timeOfSelectionSort(dataDaXep));
        System.out.println("Bubble Sort: " + time.timeOfBubbleSort(dataDaXep));
        System.out.println("Insertion Sort: " + time.timeOfInsertionSort(dataDaXep));

    }
}

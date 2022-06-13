import java.io.*;
import java.util.Scanner;

public class Algorithm {

    // Hien thi array ra man hinh
    public void display(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    // Menu of project
    public void showMenu() {
        System.out.println("+------------Menu------------+");
        System.out.println("|   1.Input                             |");
        System.out.println("|   2.Output                          |");
        System.out.println("|   3.Bubble sort                   |");
        System.out.println("|   4.Selection sort                |");
        System.out.println("|   5.Insertion sort                 |");
        System.out.println("|   6.Search > value               |");
        System.out.println("|   7.Search = value               |");
        System.out.println("|   0.Exit                               |");
        System.out.print("Choice: ");
    }

    // Nhap value tu ban phim
    public float[] inputKeyboard() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input element <= 20 and > 0");
        System.out.print("Input number of elements: ");
        int n = sc.nextInt();

        while (n > 20 || n < 1) {
            System.out.println("Input element <= 20 and > 0");
            System.out.print("Please Input number of elements again: ");
            n = sc.nextInt();
        }

        float[] arr = new float[n];

        System.out.println("Input elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Input elements number " + (i + 1) + ": ");
            arr[i] = sc.nextFloat();
        }
        // Kiem tra so nhap vao
        for(float i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        return arr;
    }


    public void writeFile(String fileName, float arr[]) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (float s : arr) {
                bw.write(String.valueOf(s) + " ");
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void writeFileInt(String fileName, int index) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(index);
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public float[] readFile(String fileName) {
        float[] array;
        String data = "";

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                data = line;
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        String[] arrayString = data.split(" ");

        array = new float[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            array[i] = Float.parseFloat(arrayString[i]);
        }

        return array;
    }

    // Sorting the input array using Bubble Sort algorithm
    public void bubbleSort(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap a[j + 1] and a[j]
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            display(arr);
        }
    }

    public void bubbleSortAdd(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap a[j + 1] and a[j]
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Sort the input array using Selection Sort algorithm
    public void selectionSort(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            float temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            display(arr);
        }
    }

    // sap xep array truoc khi tim kiem nhi phan
    public void selectionSortAdd(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            float temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    public void insertionSort(float[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            float key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

            display(array);
        }
    }

    public void insertionSortAdd(float[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            float key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

        }
    }

    public float[] searchIndex(float[] array, float value) {
        float[] index = new float[array.length];
        int n = array.length;
        System.out.print("Chi so la: ");
        for (int i = 0; i < n; i++) {
            if (array[i] >= value) {
                System.out.print(i + " ");
                index[i] = i;
            }
            if (!(array[i] >= value)){
                index[i] = -1;
            }
        }
        System.out.println();
        return index;
    }

    public int binarySearch(float arr[], int left, int right, float value) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return mid;
            }

            if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}


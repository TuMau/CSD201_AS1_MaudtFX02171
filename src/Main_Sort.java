import java.util.Arrays;
import java.util.Scanner;

public class Main_Sort {

    // Ten file luu khi chay chuong trinh
    static String url = "INPUT.TXT"; // Luu mang nhap tu ban phim
    static String urlOutput1 = "OUTPUT1.TXT"; // Bubble Sort
    static String urlOutput2 = "OUTPUT2.TXT"; // Selection Sort
    static String urlOutput3 = "OUTPUT3.TXT"; // Insertion Sort
    static String urlOutput4 = "OUTPUT4.TXT"; // Tuần tự (Search> = value)
    static String urlOutput5 = "OUTPUT5.TXT"; // Nhị phân(Search=value)

    static float[] arr; // bien arr dung de luu khi nhap value tu ban phim
    static float[] a ; // bien a luu array khi doc du lieu tu file
    static float[] b ; // bien b dung de luu khi thuc hien thuat toan

    public static void main(String[] args) {
        System.out.println("Hello Assignment 1 Algorithm...");
        Scanner scanner = new Scanner(System.in);

        Algorithm algorithm = new Algorithm();

        boolean stop_programmer = false;

        while (!stop_programmer) {
            algorithm.showMenu();
            int chon = scanner.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Thanks!!!");
                    stop_programmer = true;
                    break;
                case 1:
                    System.out.println("1. Input");
                    // khoi tao mang nhap tu ban phim
                    arr = algorithm.inputKeyboard();
                    // Write mang vao file INPUT.TXT
                    algorithm.writeFile(url, arr);
                    break;
                case 2:
                    System.out.println("2. Output");
                    System.out.println("Read from file...");
                    a = algorithm.readFile(url);
                    System.out.print("Array a: ");
                    // Read mang tu file Input va luu vao bien a
                    algorithm.display(a);
                    break;
                case 3:
                    System.out.println("3. Bubble sort");
                    b = Arrays.copyOf(a, a.length);
                    // Sap xep file theo Bubble Sort
                    algorithm.bubbleSort(b);
                    // luu vao file OUTPUT1.TXT
                    algorithm.writeFile(urlOutput1, b);
                    break;
                case 4:
                    System.out.println("4. Selection Sort");
                    b = Arrays.copyOf(a, a.length);
                    // Sap xep file theo Selection Sort
                    algorithm.selectionSort(b);
                    // luu vao file OUTPUT2.TXT
                    algorithm.writeFile(urlOutput2, b);
                    break;
                case 5:
                    System.out.println("5. Insertion Sort");
                    b = Arrays.copyOf(a, a.length);
                    // Sap xep file theo Selection Sort
                    algorithm.insertionSort(b);
                    // luu vao file OUTPUT3.TXT
                    algorithm.writeFile(urlOutput3, b);
                    break;
                case 6:
                    System.out.println("6. Search >= value");
                    System.out.println("Linear Search");
                    b = Arrays.copyOf(a, a.length);
                    System.out.print("Input value: ");
                    float value = scanner.nextFloat();
                    float[] index = algorithm.searchIndex(b, value);
                    // luu vao file OUTPUT4.TXT
                    algorithm.writeFile(urlOutput4, index);
                    break;
                case 7:
                    System.out.println("6. Search = value");
                    System.out.println("Binary Search");
                    b = Arrays.copyOf(a, a.length);
                    algorithm.selectionSortAdd(b);
                    System.out.print("Input value: ");
                    value = scanner.nextFloat();
                    int indexOf = algorithm.binarySearch(b, 0, b.length - 1, value);

                    if (indexOf >= 0) {
                        System.out.println("Index of fist element: " + indexOf);
                    } else {
                        System.out.println("Element not found");
                    }

                    // luu vao file OUTPUT5.TXT
                    algorithm.writeFileInt(urlOutput5, indexOf);
                    break;
            }
        }
    }
}

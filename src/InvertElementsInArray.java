import java.util.Scanner;

public class InvertElementsInArray {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int size;
        //Nhap vao so phan tu trong mang
        do {
            System.out.print("Nhap vao so phan tu cua mang:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("khong duoc nhap qua 20 phan tu!");
        } while (size > 20);

        //Nhap vao gia tri cac phan tu cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("\tNhap vao gia tri phan tu " + (i + 1) + ": ");
                array[i] = sc.nextInt();
                i++;
        }

        //in ra mang da nhap
        System.out.print("Danh sach cac phan tu cua mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Dao nguoc thu tu cac phan tu mang
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - j - 1];
            array[size - j - 1] = temp;
        }

        //in ra mang da dao nguoc
        System.out.print("\nMang sau khi dao nguoc: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

import java.util.Scanner;

public class Cau6 {
    //Tạo mảng và thêm phần tử vào mảng
    public static int[][] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhập phần tử thứ arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    //In mảng
    public static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Tìm đường chéo chính
    public static void findDiagonalLine(int[][] arr){
        System.out.print("Đường chéo chính: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    System.out.print(arr[i][j] + "\t");
                }
            }

        }
    }
}


public class Main {
    public static void main(String[] args) {
        // System.out.println("Câu 1: ");
        // Cau1.printSquare();

        System.out.println("Câu 2: ");
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("Số từ có trong chuỗi là: " + Cau2.countWord(str));
        Cau2.countCharater(str);

        System.out.println("Câu 3: ");
        Cau3.randomNumber();

        System.out.println("Câu 4: ");
        Cau4.printFirst10PrimeNumber(10);
        System.out.println();
        Cau4.printPrimeNumberLessThan10(20);

        System.out.println("Câu 5: ");
        Cau5.standardizeString();
        Cau5.checkPalindrome();

        System.out.println("Câu 6: ");
        int[][] arr = Cau6.createArray();
        Cau6.printArray(arr);
        Cau6.findDiagonalLine(arr);
    }
}

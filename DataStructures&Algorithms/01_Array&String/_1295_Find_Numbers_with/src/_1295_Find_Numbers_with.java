public class _1295_Find_Numbers_with {
    public static int findNumbers(int[] nums) {
        int count = 0; // Dùng để đếm số chữ số trong mảng
        for (int a : nums){
            //Kiểm tra số chữ số của a
            //Nếu số chữ số là chẵn, tăng biến count
            if (countDigit(a) % 2 == 0){
                count++;
            }
    }
    return count;
}

    private static int countDigit(int a){
        // Sử dụng chia lấy nguyên
        int count = 0;
        while (a!=0){
            a = a / 10;
            count++; // Tăng biến đếm sau mỗi lần lặp
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
    package bai_tap.bai12.DaoNguoc;

    import java.util.Arrays;
    import java.util.Stack;

    public class DaoNguocSoNguyenStack {
        public static void main(String[] args) {
            int[] mang = {10, 20, 30, 40, 50};
            System.out.println("Mảng ban đầu: " + Arrays.toString(mang));
            Stack<Integer> stack = new Stack<>();
            for (int num : mang) {
                stack.push(num);
            }

            for (int i = 0; i < mang.length; i++) {
                mang[i] = stack.pop();
            }

            System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(mang));
        }
    }

package Arrays;

import java.util.Stack;

public class equalstk {
    /*
     * h1[] = 3 2 1 1 1
     * h2[] = 4 3 2
     * h3[] = 1 1 4 1
     */
    public static int stk(int[] h1, int[] h2, int[] h3) {
        int maxheight = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        fillingstacks(s1, h1, s2, h2, s3, h3);
        while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            int stack1Height = s1.peek();
            int stack2Height = s2.peek();
            int stack3Height = s3.peek();

            if (stack1Height == stack2Height && stack2Height == stack3Height) {
                maxheight = s1.peek();
                break;
            }
            if (stack1Height >= stack2Height && stack1Height >= stack3Height) {
                s1.pop();
            }

            else if (stack2Height >= stack1Height && stack2Height >= stack3Height) {

                s2.pop();
            } else if (stack3Height >= stack2Height && stack3Height >= stack1Height) {

                s3.pop();
            }

        }
        return maxheight;

    }

    public static void fillingstacks(Stack<Integer> st1, int[] h1, Stack<Integer> st2, int[] h2, Stack<Integer> st3,
            int[] h3) {

        int stack1Height = 0, stack2Height = 0, stack3Height = 0;
        for (int i = h1.length - 1; i >= 0; i--) {
            stack1Height += h1[i];
            st1.push(stack1Height);
        }
        for (int i = h2.length - 1; i >= 0; i--) {
            stack2Height += h2[i];
            st2.push(stack2Height);
        }
        for (int i = h3.length - 1; i >= 0; i--) {
            stack3Height += h3[i];
            st3.push(stack3Height);
        }

    }

    public static void main(String[] args) {

        int h1[] = { 3, 2, 1, 1, 1 };
        int h2[] = { 4, 3, 2 };
        int h3[] = { 1, 1, 4, 1 };
        System.out.println(stk(h1, h2, h3));

    }
}

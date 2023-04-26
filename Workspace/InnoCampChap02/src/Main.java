import java.util.Scanner;

public class Main {

    public static void Operator1_1(){
        int x = 10;
        int y = 20;

        // + 연산자는 피연산자가 2개인 이항 연산자 임으로 단항 연산자인 -x 의 -가 먼저 실행된다.
        System.out.print("-x + 3 = ");
        System.out.println(-x + 3); // -10 + 3 = -7

        System.out.print("x + 3 * y = ");
        System.out.println(x + 3 * y); // 10 + (3 * 20) = 70

        System.out.print("x + 3 > y - 2 = ");
        System.out.println(x + 3 > y - 2); // false
        System.out.print("x + 3 < y - 2 = ");
        System.out.println(x + 3 < y - 2); // true

        System.out.print("x > 3 && y < 2 = ");
        System.out.println(x > 3 && y < 2); // false

        int result = x + y * 3;
        System.out.println("result = " + result); // 10 + (20 * 3), result = 70
    }

    public static void main(String[] args){
        /*
        int[] arr1 = {-1, 2, 3, -9};
        int[] arr2 = {-1, 2, 3, -9, 11};
        int[] arr3 = {-2, -1, 1, 2};
        int[] arr4 = {100, -9, 2, -3, 5};
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {-1, -2, -3};
        int[] arr7 = {2, -8, 5, -1, 2, -3, 2};


        System.out.println(getMaxSubSum(arr7));*/

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i, result = 0;
        for(i = 0; i < num; i++)
            if(i % 3 != 0) result += i;

        System.out.println(result);
    }

}

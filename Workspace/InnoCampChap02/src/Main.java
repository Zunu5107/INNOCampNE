import java.time.LocalTime;
import java.util.Arrays;
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

        /* 2739 구구단
//        Scanner sc = new Scanner(System.in);
//        // 입력 N
//        int num = sc.nextInt();
//        // 2 - 9 검사
//        if(!(num >= 2 && num <= 9))
//            return;
//        // 구구단 출력
//        for(int i = 1; i <= 9; i++)
//        {
//            System.out.println(num + " * " + i + " = " + (num * i));
//        }

 */

        /*
        //2439 별찍기 - 2
        Scanner sc = new Scanner(System.in);
        // 입력
        int num = sc.nextInt();
        if(num < 1 || num > 100)
            return;
        for(int i = 0;i < num;i++)
        {
            for(int j = 1;j <= num;j++)
            {
                if ((j >= num - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/

        /*
        // 10430 나머지
        Scanner sc = new Scanner(System.in);

        int apla = sc.nextInt();
        int beta = sc.nextInt();
        int gamma = sc.nextInt();

        System.out.println((apla + beta) % gamma);
        System.out.println(((apla % gamma) + (beta % gamma)) % gamma);
        System.out.println((apla * beta) % gamma);
        System.out.println(((apla % gamma) * (beta % gamma)) % gamma);
        */

        /*
        // 3003 킹, 퀸, 룩, 비숍, 나이트, 폰
        Scanner sc = new Scanner(System.in);

        final int King = 1;
        final int Queen = 1;
        final int Rook = 2;
        final int Bishop = 2;
        final int Knight = 2;
        final int Pawn = 8;

        final int KingS = sc.nextInt();
        final int QueenS = sc.nextInt();
        final int RookS = sc.nextInt();
        final int BishopS = sc.nextInt();
        final int KnightS = sc.nextInt();
        final int PawnS = sc.nextInt();

        System.out.print(King - KingS);
        System.out.print(" ");
        System.out.print(Queen - QueenS);
        System.out.print(" ");
        System.out.print(Rook - RookS);
        System.out.print(" ");
        System.out.print(Bishop - BishopS);
        System.out.print(" ");
        System.out.print(Knight - KnightS);
        System.out.print(" ");
        System.out.print(Pawn - PawnS);
        System.out.println();
        */

        Scanner sc = new Scanner(System.in);
        // 입력
        int num = 5;//sc.nextInt();
        if(num < 1 || num > 100)
            return;
        for(int i = 0;i < num;i++)
        {
            for(int j = 1;j <= num + i;j++)
            {
                if ((j >= num - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        /*for(int i = num - 2;i >= 0;i--)
        {
            for(int j = 1;j <= num + i;j++)
            {
                if ((j >= num - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/
         //System.out.println(count);
    }

}

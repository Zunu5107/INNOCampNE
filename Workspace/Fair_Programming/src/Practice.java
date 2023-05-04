import javax.print.attribute.standard.OrientationRequested;
import java.lang.invoke.StringConcatFactory;
import java.lang.reflect.Array;
import java.text.FieldPosition;
import java.util.Arrays;
import java.util.Scanner;
public class Practice {
    //두 수의 합
    public static void Q1(Scanner sc){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = num1 + num2;
        System.out.println(answer);
    }

    //두 수의 차
    public static void Q2(Scanner sc){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = num1 - num2;
        System.out.println(answer);
    }

    //두 수의 곱
    public static void Q3(Scanner sc){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = num1 * num2;
        System.out.println(answer);
    }

    //몫 구하기
    public static void Q4(Scanner sc){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = num1 / num2;
        System.out.println(answer);
    }

    //나머지 구하기
    public static void Q5(Scanner sc){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = num1 % num2;
        System.out.println(answer);
    }

    //나이 출력
    public static void Q6(Scanner sc){

        int age = sc.nextInt();
        int answer = 2022 - age + 1;
        System.out.println(answer);
    }

    //숫자 비교하기
    public static void Q7(Scanner sc){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = (num1 == num2) ? 1 : -1;
        System.out.println(answer);
    }

    // 각도기 구하기
    public static void Q8(Scanner sc){

        int angle = sc.nextInt();
        int answer = angle / 90 * 2 + ((angle % 90 > 0) ? 1 : 0);
        System.out.println(answer);
    }

    // 짝수의 합
    public static void Q9(Scanner sc){

        // n 값을 2로 나눠줍시다.
        int num = sc.nextInt() / 2 , answer = 0; // num = n / 2
        // 1 ~ n / 2 까지 도는
        int replysd = num / 2; // i = reply ( n / 4 )
        for(int i = 0;i < replysd; i++) answer += (num + 1) * 2;
        // 홀수 일 때
        if( num % 2 > 0 ) answer += num + 1;
        System.out.println(answer);
    }
    public static void Q9_2(Scanner sc)
    {
        int n = sc.nextInt();
        int answer = 0;
        if(n % 2 == 0 && n != 2) {
            answer = (2 + n) * n / 4;
        } else if (n % 2 != 0 && n != 2) {
            answer = (2 + n-1) * (n - 1) / 4;
        } else {
            answer= 2;
        }
        System.out.println(answer);
    }
    public static void Q9_3(Scanner sc)
    {
        int n = sc.nextInt();
        //n = n % 2 == 0 ? n/2*(n/2+1) : (n-1)/2*((n-1)/2+1);
        int answer = n/2*(n/2+1);
        System.out.println(answer);
    }

    public int solutionR(int n) {
        return (Math.sqrt(n) % 1 % 7 != 0) ? (n / 7) + 1 : (n / 7);
    }

    public String solutionW(String my_string) {
        return my_string.replaceAll("[a|e|i|o|u]","");
    }

    public int solutionQ(int price) {
        if(price > 100000)
            if(price > 300000)
                return (int) (price * 0.05 * ((price < 500000) ? 2 : 4));
            else
                return (int) (price * 0.05);
        return price;
    }

    public int solutionX(String str1, String str2) {
        return (str1.contains(str2) ? 1 : 2);
    }
    public static boolean seetion(int[] a){
        System.out.println(a.toString());
        return true;
    }
    public int solution(int[] array, int n) {
        //int[] ans = Arrays.asList(array).stream().toList().;
        //System.out.println(Arrays.toString());
        return 1;
    }
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/12935
    문제 설명
        정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
        단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
        예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
    제한 조건
        arr은 길이 1 이상인 배열입니다.
        인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
    입출력 예
        arr	            return
        [4,3,2,1]	    [4,3,2]
        [5,1,3,8]	    [5,3,8]
        [10]	        [-1]
    */
    public int[] solutionQ(int[] arr)
    {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int i;
        int min = arr[0];
        int index = 0;
        for(i = 1; i < arr.length; i++)
        {
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        // [10 50 8 43 9 0  0]
        answer = new int[arr.length];
        for(i = 0; i < arr.length;i++)
        {
            if(index <= i){
                if (index == i)
                    continue;
                else
                    answer[i-1] = arr[i];
            }
            else
                answer[i] = arr[i];
        }
        return answer;
    }

    public int ps(int answer)
    {
        return answer;
    }
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        Practice pr = new Practice();

        int[] str = {1, 1, 2, 3, 4, 5};
        int str2 = 1;
        System.out.println(pr.solution(str,str2));

    /*
        Q9(sc);
        Q9_2(sc);
        Q9_3(sc);
    */

        return;
    }
}

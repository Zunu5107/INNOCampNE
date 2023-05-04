import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlivePr {

    public int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    /*
    정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

    제한사항
        -50,000 ≤ num1 ≤ 50,000
        -50,000 ≤ num2 ≤ 50,000
    입출력 예
        num1	num2	result
        2	    3	    5
        100	    2	    102
    입출력 예 설명
    입출력 예 #1
        num1이 2이고 num2가 3이므로 2 + 3 = 5를 return합니다.
    입출력 예 #2
        num1이 100이고 num2가 2이므로 100 + 2 = 102를 return합니다.
     */
    public int solutionC(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    /*  두 수의 차

    문제 설명
        정수 num1, num2가 매개변수 주어집니다. num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
    제한사항
        0 ≤ num1 ≤ 100
        0 ≤ num2 ≤ 100
    입출력 예
        num1	num2	result
        2	    3	    -1
        100	    2	    98
    입출력 예 설명
        입출력 예 #1
            num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.
        입출력 예 #2
            num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.
 */
    public int solutionD(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    /*  두 수의 곱

        문제 설명
            정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
        제한사항
            0 ≤ num1 ≤ 100
            0 ≤ num2 ≤ 100
        입출력 예
            num1	num2	result
            3	    4	    12
            27	    19	    513
        입출력 예 설명
            입출력 예 #1
                num1이 3, num2가 4이므로 3 * 4 = 12를 return합니다.
            입출력 예 #2
                num1이 27, num2가 19이므로 27 * 19 = 513을 return합니다.
     */
    public int solutionE(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    /*  몫 구하기

        문제 설명
            정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
        제한사항
            0 ≤ num1 ≤ 100
            0 ≤ num2 ≤ 100
        입출력 예
            num1	num2	result
            10	    5	    2
            7	    2	    3
        입출력 예 설명
            입출력 예 #1
                num1이 10, num2가 5이므로 10을 5로 나눈 몫 2를 return 합니다.
            입출력 예 #2
                num1이 7, num2가 2이므로 7을 2로 나눈 몫 3을 return 합니다.
     */
    public int solutionF(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    /*  나머지 구하기

        문제 설명
            정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
        제한사항
            0 ≤ num1 ≤ 100
            0 ≤ num2 ≤ 100
        입출력 예
            num1	num2	result
            3	    2       1
            10	    5	    0
        입출력 예 설명
            입출력 예 #1
                num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.
            입출력 예 #2
                num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
     */
    public int solutionG(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }

    /*  나이 출력

        문제 설명
            머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
        제한사항
            0 < age ≤ 120
            나이는 태어난 연도에 1살이며 1년마다 1씩 증가합니다.
        입출력 예
            age	    result
            40	    1983
            23	    2000
        입출력 예 설명
            입출력 예 #1
                2022년 기준 40살이므로 1983년생입니다.
            입출력 예 #2
                2022년 기준 23살이므로 2000년생입니다.
     */
    public int solutionH(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    /*  숫자 비교하기

        문제 설명
            정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
        제한사항
            0 ≤ num1 ≤ 10,000
            0 ≤ num2 ≤ 10,000
        입출력 예
            num1	num2	result
            2	    3	    -1
            11	    11	    1
            7	    99	    -1
        입출력 예 설명
            입출력 예 #1
                num1이 2이고 num2가 3이므로 다릅니다. 따라서 -1을 return합니다.
            입출력 예 #2
                num1이 11이고 num2가 11이므로 같습니다. 따라서 1을 return합니다.
            입출력 예 설명 #3
                num1이 7이고 num2가 99이므로 다릅니다. 따라서 -1을 return합니다.
     */
    public int solutionI(int num1, int num2) {
        int answer;
        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }

    /*  각도기

        문제 설명
            각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
             각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
                예각 : 0 < angle < 90
                직각 : angle = 90
                둔각 : 90 < angle < 180
                평각 : angle = 180
        제한사항
            0 < angle ≤ 180
            angle은 정수입니다.
        입출력 예
            angle	result
            70	    1
            91	    3
            180	    4
        입출력 예 설명
            입출력 예 #1
                angle이 70이므로 예각입니다. 따라서 1을 return합니다.
            입출력 예 #2
                angle이 91이므로 둔각입니다. 따라서 3을 return합니다.
            입출력 예 설명 #3
                angle이 180이므로 평각입니다. 따라서 4를 return합니다.
     */
    public int solutionJ(int angle) {
        int answer;
        if (angle > 0 && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }

    /*  짝수의 합

    문제 설명
        정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
    제한사항
        0 < n ≤ 1000
    입출력 예
        n	    result
        10	    30
        4	    6
    입출력 예 설명
        입출력 예 #1
            n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
        입출력 예 #2
            n이 4이므로 2 + 4 = 6을 return 합니다.
    */

    // a부터 시작해서 b까지 c씩 늘어나는 거 반복해주세요
    //for (A; B; C)
    // A는 선언 ( 몇부터 시작하는 지 )
    // B는 조건 ( B가 참일 때 반복한다 )
    // C는 증감 ( 반복문이 끝날 때 마다 선언 되는 것 )
    public int solutionK(int n) {
        int answer = 0;
        /*for (int i = 2; i <= n; i += 2)
        {
            answer += i;
        }*/
        if (n % 2 != 0) { // == 같을 때 / != 같지 않을 때
            answer = (11 - 1) / 2 * ((11 - 1) / 2 + 1);
            //          10   /  2 * ( 10 / 2 + 1 )
            //              5 * ( 5 + 1)
            //              5 * 6 = 30
            // (2 + 10) / 2 * 5
        } else {
            answer = n / 2 * (n / 2 + 1);
        }
        return answer;
    }

    /*  양꼬치
            문제 설명
            머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
            양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
            정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
        제한사항
            0 < n < 1,000
            n / 10 ≤ k < 1,000
            서비스로 받은 음료수는 모두 마십니다.
        입출력 예
            n	    k	    result
            10	    3	    124,000
            64	    6	    768,000
        입출력 예 설명
            입출력 예 #1
                10인분을 시켜 서비스로 음료수를 하나 받아 총 10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원입니다.
            입출력 예 #2
                64인분을 시켜 서비스로 음료수를 6개 받아 총 64 * 12000 + 6 * 2000 - 6 * 2000 = 768,000원입니다.
    */
    public int solutionL(int n, int k) {
        //k -= n / 10;// 양꼬치 10개당 음료수 하나 무료
        int answer = 12000 * n + 2000 * k - (n / 10) * 2000; // 양꼬치 12000원 음료수 2000원 - (양꼬치 10인분 마다 2000원 할인) 만큼 계산
        return answer;
    }
    //뭘까요? 이해 됐나영
    // 양꼬치 10인분 마다 2000원씩 무료야
    // 14 인분을 먹으면 1밖에 안나와 나머지는 % 계산해야하니까 ?
    // 14 / 10 = 1
    // 19 / 10 = 1
    // 20 / 10 = 2
//넵

    /*  피자 나눠 먹기 (1)
            문제 설명
                머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
                모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요..
            제한사항
                1 ≤ n ≤ 100
            입출력 예
                n	    result
                7	    1
                1	    1
                15	    3
            입출력 예 설명
                입출력 예 #1
                    7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.
                입출력 예 #2
                    1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.
                입출력 예 #3
                    15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
    */
    public int solutionM(int n) {
        int answer = (n % 7 == 0) ? n / 7 : 1 + n / 7; // 삼항 연산자 (A) ? (A가 참일 때) : (A가 거짓일 때)
//        if(n % 7 == 0)
//            answer = n / 7;
//        else
//            answer = 1 + n / 7;
        return answer;
    }
    // 삼항 연산자
    //double int \\ double / double = double \\ int / int = int
    // double 2.0 / double 4.0 = double 0.5
    //

    /*  피자 나눠 먹기 (3)
            문제 설명
                머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
                피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
                n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
            제한사항
                2 ≤ slice ≤ 10
                1 ≤ n ≤ 100
            입출력 예
                slice	n	    result
                7	    10	    2
                4	    12	    3
            입출력 예 설명
                입출력 예 #1
                    10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
                입출력 예 #2
                    12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.
    */
    public int solutionN(int slice, int n) {
        int answer = 0;
        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }

    /*  점의 위치 구하기
            문제 설명
                사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
                    x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
                    x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
                    x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
                    x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.

                x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
                좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
            제한사항
                dot의 길이 = 2
                dot[0]은 x좌표를, dot[1]은 y좌표를 나타냅니다
                -500 ≤ dot의 원소 ≤ 500
                dot의 원소는 0이 아닙니다.
            입출력 예
                dot	        result
                [2, 4]	    1
                [-7, 9]	    2
            입출력 예 설명
                입출력 예 #1
                    dot이 [2, 4]로 x 좌표와 y 좌표 모두 양수이므로 제 1 사분면에 속합니다. 따라서 1을 return 합니다.
                입출력 예 #2
                    dot이 [-7, 9]로 x 좌표가 음수, y 좌표가 양수이므로 제 2 사분면에 속합니다. 따라서 2를 return 합니다.

            //좌표가 (+, +)일 떄, 제 1사분면
            //좌표가 (-,+)일 떄, 제 2사분면
            //좌표가 (-,-)일 떄, 제 3사분면
            //좌표가 (+,-)일 떄, 제 4사분면
    */
    public int solutionO(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer = 0; // 1, 2, 3, 4
        if (x > 0 && y > 0) {
            return answer = 1;
        }
        if (x < 0 && y > 0) {
            return answer = 2;
        }
        if (x < 0 && y < 0) {
            return answer = 3;
        }
        if (x > 0 && y < 0) {
            return answer = 4;
        } else
            return answer = -1;
    }

    /*  아이스 아메리카노
                문제 설명
                    머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
                    머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
                    머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
                제한사항
                    0 < money ≤ 1,000,000
                입출력 예
                    money	    result
                    5,500	    [1, 0]
                    15,000	    [2, 4000]
                입출력 예 설명
                    입출력 예 #1
                        5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
                    입출력 예 #2
                        15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.

        */
    public int[] solutionP(int money) {
        int[] answer = {money / 5500, money % 5500};
        return answer;
    }
    // 형은 자유
    // int[] A = {B,C,D, .. }
    // A라는 배열 안에 B,C,D 등등 여러가지 리터럴이 들어간다고 생각하시면 됨
    // 첨자 0부터 시작하는데
    // A에 안에 B를 꺼내고 싶다
    // A[첨자] = 값
    // A[0] = B
    // A[1] = C

//우선 아메리카노 값/가지고 잇는 돈=몫과 나머지를 동시에 구해서
    //소수점 앞자리와 소수점 아래의 수를 구분지어 놓아야 할 것 같아요.
    //어, 네, 그 배열
    //가지고 있는 돈의 값 / 아메리카노 값을 구하면 최대 두자리 수 아메리카노 수
    //
    // money / 5500 , money % 5500
    //Arrays.toString

    /*  옷가게 할인 받기
                문제 설명
                    머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
                    구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
                제한사항
                    10 ≤ price ≤ 1,000,000
                        price는 10원 단위로(1의 자리가 0) 주어집니다.
                    소수점 이하를 버린 정수를 return합니다.
                입출력 예
                    price	    result
                    150,000	    142,500
                    580,000	    464,000
                입출력 예 설명
                    입출력 예 #1
                        150,000원에서 5%를 할인한 142,500원을 return 합니다.
                    입출력 예 #2
                        580,000원에서 20%를 할인한 464,000원을 return 합니다.
    */
    public int solutionQ(int price) {
        int answer = price;

        if( price >= 100000 ){
            answer = (int)(price * 0.95);
        }
        if( price >= 300000 ){
            answer = (int)(price * 0.9);
        }
        if( price >= 500000 ){
            answer = (int) (price * 0.8);
        }
        return answer;
    }
    //10만원==5% 30만원==10 50만원==20
    //IF(Price<=100000)

    /*  제곱수 판별하기
                문제 설명
                    어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
                    정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
                제한사항
                    1 ≤ n ≤ 1,000,000
                입출력 예
                    n	    result
                    144	    1
                    976	    2
                입출력 예 설명
                    입출력 예 #1
                        144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
                    입출력 예 #2
                        976은 제곱수가 아닙니다. 따라서 2를 return합니다.
    */
    public int solutionR(int n) {
        int answer = n;
        if(Math.sqrt(n)/*제곱근*/ % 1 == 0)
            answer = 1;
        else
            answer = 2;
        return answer;
    }

    /*  문자열 뒤집기
                문제 설명
                    문자열 my_string이 매개변수로 주어집니다.
                    my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
                제한사항
                    1 ≤ my_string의 길이 ≤ 1,000
                입출력 예
                    my_string	return
                    "jaron"	    "noraj"
                    "bread"	    "daerb"
                입출력 예 설명
                    입출력 예 #1
                        my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
                    입출력 예 #2
                        my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.
    */
    public String solution(String my_string) {
        String answer = "";
        return answer;
    }
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    // "[^0-9|,]", ""




























    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        AlivePr pr = new AlivePr();

        /*
        int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        //int[] numarr = {num1, num2};

        System.out.println(pr.solution(num1));
        //System.out.println(pr.solution(num1, num2));
        //System.out.println(pr.solution(numarr));
        //System.out.println(Arrays.toString(pr.solution(num1)));
        */

        String LineS = sc.nextLine();
        String[] K = LineS.replaceAll("[^0-9|,]", "").split(",");
        int[] numarr = new int[K.length];
        for(int i = 0; i < K.length;i++)
            numarr[i] = Integer.parseInt(K[i]);
        System.out.println(Arrays.toString(numarr));
    }
}

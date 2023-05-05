import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        long nTime = System.nanoTime();
        System.out.println(nTime);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long eTime = System.nanoTime();
        System.out.println(eTime);
        System.out.println(String.format("%.2f",(eTime-nTime)/1000000.0) + "ms");
        /*String LineS = sc.nextLine();
        String[] K = LineS.replaceAll("[^0-9|,]", "").split(",");
        int i;
        int[] numarr = new int[K.length];
        for(i = 0; i < K.length;i++)
            numarr[i] = Integer.parseInt(K[i]);
        long millis = System.currentTimeMillis();
        System.out.println(Arrays.toString(numarr));
        System.out.println();*/
    }
    public int solutionAE(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length] * numbers[numbers.length - 1];


        //System.currentTimeMillis();
    }
}

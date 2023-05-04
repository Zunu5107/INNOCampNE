import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String LineS = sc.nextLine();
        String[] K = LineS.replaceAll("[^0-9|,]", "").split(",");
        int i;
        int[] numarr = new int[K.length];
        for(i = 0; i < K.length;i++)
            numarr[i] = Integer.parseInt(K[i]);
        System.out.println(Arrays.toString(numarr));
        System.out.println();
    }
}

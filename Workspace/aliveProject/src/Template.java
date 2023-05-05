import java.util.*;

public class Template {
    public int[] solution(String my_string) {
        int count = 0;
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.substring(i,i+1).equals("0")){
                count++;
            } else if (my_string.substring(i,i+1).equals("1")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("2")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("3")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("4")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("5")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("6")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("7")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("8")) {
                count++;
            } else if (my_string.substring(i,i+1).equals("9")) {
                count++;
            }
        }

        int[] answer = new int[count];

        int index=0;

        for(int i=0; i<my_string.length(); i++) {
            if(my_string.substring(i,i+1).equals("0")){
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("1")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("2")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("3")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("4")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("5")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("6")) {
                answer[index] =Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("7")) {
                answer[index] =Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("8")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            } else if (my_string.substring(i,i+1).equals("9")) {
                answer[index] = Integer.parseInt(my_string.substring(i,i+1));
                index++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

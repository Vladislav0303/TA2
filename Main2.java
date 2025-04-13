import java.util.Arrays;

//  ["Apple", "avocado", "banana", "cherry"] - Вивід
public class Main2 {
    public static void main(String[] args) {
        String[] words = {"banana", "Apple", "cherry", "avocado"};
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].charAt(0) > words[j + 1].charAt(0)) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}


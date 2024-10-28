import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = {4, 2, 3,  7, 1, 2, 5, 3, 6};
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}

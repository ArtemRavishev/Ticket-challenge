import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String s = "1234aaaa";
        int split = s.length()/2;
        String[] parth = { s.substring(0,split), s.substring(split)};
        System.out.println(Arrays.toString(parth));
    }

}

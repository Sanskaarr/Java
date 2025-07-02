package spring_pratice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {
        List<String> ab = new ArrayList<>();
        ab.add("Sanskar");
        ab.add("Shubhang");
        ab.add("Anshul");

        for (String e : ab) {
            System.out.println(e);
        }
    }
}

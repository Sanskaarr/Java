package spring_pratice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_02{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);       
        nums.add(40);

        for(Integer number : nums){
            System.out.println(number);
        }
    }
}
package me.brunosantana.exam4.package1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test37 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]
        
        //---------------
        
        //Predicate -> boolean test(T t);
        //Predicate<Integer> predicate = (x) -> {return x % 2 == 0;};
        Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
        	
        };
        List<Integer> collect2 = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(collect2);
	}
	
}

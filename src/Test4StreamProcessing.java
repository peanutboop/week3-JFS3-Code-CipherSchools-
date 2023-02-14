import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4StreamProcessing {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,-44,19,21,-55,77);


        List<Integer> result1 = nums.stream().filter(e ->e<0).collect(Collectors.toList());

        System.out.println(result1);

        //Quick task
        List<Object> myList = Arrays.asList(true,100,"hello",200,false,"welcome",300,true,false);


        List<Object> result = myList.stream().filter(e ->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());

        System.out.println(result);

        myList.forEach(m->{
            System.out.println(m+" ->  " +m.getClass().getSimpleName());
        });
        int totalIntegers =(int) myList.stream().filter(e->e.getClass().getSimpleName().equals("Integers")).count();
        System.out.println("Total Integers " +totalIntegers);


        List<String> colors = Arrays.asList("Red","Green","Red","Orange","Green","Red");

        List<String> result2 = colors.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());

        System.out.println(result2);

        
    }
}

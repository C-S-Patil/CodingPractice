package stream;
//1. Filtering and Mapping

import java.util.List;

public class FilteringAndMapping {

  public static void main(String Args[]){
    //Given a list of integers, find all even numbers, square them, and collect the results in a list.
    List<Integer> ints = List.of(1,32,58,7,3,45,22);
    PrintUsingStream obj =
        new PrintUsingStream();
    obj.solution(ints);

    //From a list of strings, extract the unique words, convert them to uppercase, and store them in a list.
    List<String> list = List.of("abc", "ABC", "zys", "xuv");
    obj.solution2(list);

  }
}
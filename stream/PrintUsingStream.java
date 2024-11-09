package stream;

import java.util.List;

public class PrintUsingStream {
  public void solution(List<Integer> list) {
    List<Integer> ans = list.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n*n)
        .toList();
    System.out.println(ans);
  }

  public void solution2(List<String> list) {
    List<String> ans = list.stream()
        .map(String:: toUpperCase)
        .distinct()
        .toList();
    System.out.println(ans);
  }
}

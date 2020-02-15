package academy.softserve.elementarytasks.task9.palindrome;

import java.util.HashSet;
import java.util.Set;

public class PalindromeValidator {

  public Set<String> findPalindromes(String input) {
    Set<String> palindromes = new HashSet<>();
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 2; j <= input.length(); j++) {
        if (isPalindrome(input.substring(i, j))) {
          palindromes.add(input.substring(i, j));
        }
      }
    }
    return palindromes;
  }

  public boolean isPalindrome(String input) {
    StringBuilder plain = new StringBuilder(input);
    StringBuilder reverse = plain.reverse();
    return (reverse.toString()).equals(input);
  }
}

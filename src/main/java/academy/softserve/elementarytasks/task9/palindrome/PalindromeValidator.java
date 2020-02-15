package academy.softserve.elementarytasks.task9.palindrome;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PalindromeValidator {

  public Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
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

  public void countDigits(String[] myListt) {
    ArrayList<String> max = new ArrayList<String>();
    for (int i = 1; i < myListt.length; i++) {
      if (getCountsOfDigits(myListt[i]) >= 2) max.add(String.valueOf(myListt[i]));
    }
    System.out.println("elements: " + max);
  }

  public int getCountsOfDigits(String number) {
    return String.valueOf(Math.abs(Integer.parseInt(String.valueOf(number)))).length();
  }

}

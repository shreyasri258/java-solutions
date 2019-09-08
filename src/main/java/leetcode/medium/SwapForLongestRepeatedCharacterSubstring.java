package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 2019-08-10 20:35
 */

public class SwapForLongestRepeatedCharacterSubstring {

  public int maxRepOpt1(String text) {

    Set<Character> x = new HashSet<>();
    for (int i = 0; i < text.length(); i++) {
      x.add(text.charAt(i));
    }
    if (x.size() == 1)
      return text.length();

    int maxlen = 1;
    for (int i = 0; i < text.length(); i++) {
      StringBuilder sb = new StringBuilder(text);
      char c = text.charAt(i);
      sb.deleteCharAt(i);
      maxlen = Math.max(maxlen, findLen(sb.toString(), c));
    }
    return maxlen;
  }

  static int findLen(String text, char ch)
  {
    int maxlen = 1;
    int cnt = 0;
    int l = 0, r = 0;

    while (r < text.length()) {

      if (text.charAt(r) != ch) ++cnt;
      while (cnt > 1) {
        if (text.charAt(l) != ch)
          --cnt;
        ++l;
      }

      maxlen = Math.max(maxlen, r - l + 1);
      ++r;
    }
    return maxlen;
  }

  public static void main(String[] args) {
    SwapForLongestRepeatedCharacterSubstring swapForLongestRepeatedCharacterSubstring = new SwapForLongestRepeatedCharacterSubstring();

    System.out.println(swapForLongestRepeatedCharacterSubstring.maxRepOpt1("ababa"));
    System.out.println(swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aaabaaa"));
    System.out.println(swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aaabbaaa"));
    System.out.println(swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aaaaa"));
    System.out.println(swapForLongestRepeatedCharacterSubstring.maxRepOpt1("abcdef"));
    System.out.println(swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aabbbbabaabaabbaaaaaaabaaaaaabbbabaaaababbbaabbbbbbaabbaaaabbaaabbbabbbabababaaaaabababbbabbbbabababbbbbbbabbabbbbbaaabaababbbbaabababbaabbbaaabbbbbbbbbbabbaabababbbbbbaabbaabbbaaababbaabbabbababbabaaaabbababaaabababaabbabbaababbaabbbaabbbaabbaaaaabaabbbaabaabbaabaaaaabaabbbbbbabbababbbbbbaaaaabbaaababaaabbababaaababbaaabababbbaabaabbabbaaabaaabbabababbaaabaababaaaaaaaaaaababaaabbbabaaabaabbbbbbbabaaaaababbabababbaaaabaaaababbaababbabbaaabaaabbababaaaaaabaaaaaaabbaaaaaaababaabaabababbaababaaabaaabaababababaaaaaababaaabbbbbabaabbaabaaabaabaaabaababbbabaababbabbbbbbabbabbaabbbaaaaabbbaabaaabababbabaaaaaababbabbaaaaabaabaaabbaabbbaababbaaabbaaabbbbbbbbabbaaaababbaabbbbabbaaabaabaabbbbababbaaaabbbbaaaaaaaabaabbabaaabbbbabbbaaaababbabbbbbbbbbabbabababbaabbaaabbbbbbabaaabbbbbaaababbbbaaaaabbbaaaaaabbbaabbaabbabbabbbaabbabbaabbbbaababbbbabbaabaaabbaaabbaabbbbaabaaababbabbbbbbbaabaaabaabbbbbbbaababbaaaababbabbaaabbbbbbaaababaababaaabbbabbaaabbaababaabbaaabbbababbabaababbabaaabbbababaaabbabbbababbabbabbbbbbaaaaaaaabaaabbababbaabaaabbbbaabaabbbbbaaababbaaabbaaaaaabaaabbbababbaabbaaaabbbababaababaaabbaaaabbbaaabbbaaaabbabbbbbaaababbaabbbababbabaaabbabbababbabbbaaabababaabababbbaaaaabbaaaabbbababbbbabbbabbaabababababaaaabaaaaaaababbaabbbabababbabbbaabbaaaabaaabaaaababaabbbabbabbbaaabababaabbabbbaaaababbbababbbbaabbaabbabbbaaabbbabaabaabbbaabbabbaabbbbbbabaabbaababbabbbbabaaaaaaabbbbbaabababbabbabaabbabaaaabaaabbbbbbbbaaaaabbbabaaabaaaabaababbaabaababbbabababbbbbaaaabbabbbbaabbabbbabbbabbbbaabbabbbbaaabbabaaaaaaabbbababaaabbabaababbbaabbbaaaaabababbbbabbbbababaabbabbabbbabbbbabbbabbbbaabaababbaaaaaaaabbbbaaaababbbaaaaabbabaabaaaaabaabaaaaabaaabbbabbabaababbbabbbabaabbabababbbbabbaaababbbaaaabbabbbababbaaaabaaabbaaaaabbbbbaababbaabbaabbbaaababbbbbbabababbabaabaaababbbaaabbbabbbabbbbbaaaabaaabbbbbabbbaaaaabaabaaaaaaabbabbbaabaaaabbbaaabaabaaabbbbaabaaabaaaaaababaababaaaaaaabbbaabbaaaaaaaaababaaaaaabbbbbbaaaabaabbbbbaababababaabaaaabbbbbaabbbbbbbaaabbabaabbbbabaaaabbabbbaabaaaaaababbababbaabbbabbbaaabbbaabaaabababbaaababbaaabbaaababbbabaababababbababbbabaabbbaabbbaaabbababaabbbaabbbbaaaabbbbbababaaaabababaabbbbbbbbbababaaababaaabbbabbaababbbbaabbbabbaabbabbbbabbbbabbbbaaabbaaabbaaaaaabbbbabaabbaabaababababbaabababbbbaabbababbbaaabaaababababaaababbabbbaababbbaaaababbbaabaabaaababbaaaaaabbbbbabbbaabaaabbbabaaabaaaaababbbbbabbbaaaaabaabaaababaabbbbaabaaaaabbaaabaaaaaabbbaaaabbabbbabaaabbbbaabbaabbabbbabbabababbbbbaaabbabbbbbbbaaaaababbbbbbbaaababaaabaaabaaabbabbbbbbbbaabababababbaabaaaababbbbabbbbabaabbabbabbbaaaaababaaaabbbabababbbbbababbaaabbababbbaaaaabaabbbababaaaabbbaaaaaaaabbbaabaaabbbabbbabaabbbbbabbaabbbabaaaabbbabaabbaabbbababbbababbaaaaaabbabaabbbabababaabaababababaabbabbababbaabbbabaaabbaabaabbbbabaabbbbaabbbbaaaaababbaabbbaabababaaabaabababbbbababbbabbaaaaabaaaaaaabbabaabababaabababbbbaabbabbaababbaababbababbbabababbbabaabbbbaabaabaaaaabaaaabaaabbaaabbababaababbaaaabbbababbaababaabbababbababbaabaababbbaaababbabbabaaaaaabbbaababbbaabaabbbabaabbaaaaaabbaabbbaababababaaabaaaabbaabaaabbabbaabbaaabaaabbbbbaaababaaabaabbabbbabbbabaabaabbbabaaabbbaabbbbbbbabbabaaabbababaabaabaababbbaaaaabaabbababbbabbaabaababaabaaaabaaabbbbbabbbaaaabbaaaaabbbabbababbbaababaaabbaabbbababaaaaaaaabbabbaaabbababaabbaaaabaaaabababbaabaabbbaaababbaaaabbaaabaaabbbbababaaabbbaaaaabbbbabaabaaabbbaabbabaaabbbaaabbaabaabbbbbabbbbabaabbbbbaabbabbbababaabbabaaabaabaabababaaababababbaabaababaaabaaabbabbbbbbbaabaababbababbbabaaaaaaabbbbababbbaaabaabbaaaaaaaabbbaaabbbababaabaaababbabbbabaaaaabbaabbbbbabbabbbaaaaaabbababbaaaaabbabbbbbbbaaabbaaabababbaaaaababbbaaabbaaaabaababbabbbaaababababababaabbbbbbbbaaaaaaaaaabaabbabababbaabbbbbbabaaaabbabbabbbabaabaaababaaababbbbbbaaabbbbaabaabbabbabaabbabbbaaababbbbbaabbbbaababbaabbababbabaabaaabbbabbaababaabbaaaaabaaabababbbaaababbbabababababaaaabbbbaababbabbbaababbbbbbabaaaabaabbbbbabbbbbbbaaaaabbaabbbababaabbbbbaaaabbaabbbbabbbbbaaaaabbbbbbaabbaaaabbbaabbabaaabbabaaabbbaabaabbaabaaaabaabababbabbaaaabbababbbaaabbbabbaabbababbbbaabaaababaababbaaaaabbbbbbabbbbbabbbbbaababaabbaabbbbbbabaaabbaaababbabbbabaaababbabbabaabaabbbbaaabbbbbabbabbbbabaabbbbbbaaaaaabbabababaaaaaaaaaababbbaabbabaaaaabbbabababbaaabbaabbabbabbbaabababaaaaaabbbbaaaaaabbaabaaaabaaaabaaabaabbbbbbabbbbbaaabaaaaaaaababbbbbbbbbabbbaaaaaaaaaabaabbbbabaaaaaabaabbbaaabbaabbbaabaabbabbababbbabbaabbaaaaaaaabbbbaaaabbaaaaababaabbbbbaaaaababaaaaabbaabaabaabbbbbabbabaaabbaaaaaabaabaaaaabbaaaaababbbabaaabbbbabbbbbbabaabbbbabbbabbbbaabbbaabbbbabbbbabbaaabaabbaabbbbbbaababbbbbaabababbbabbaaabbaabababaabbbbbbaaababbbbbaabababbabbabaaabababbabbbbaaaabababaabbbbabbabbbbaabbaaababababbbababbbbbaaabbbaababbbabababaabbbbabbbaabbbbbaaaababaaabbbbaabbabbbabbabbaabaabaaaabaaaabbaabbbababaaaabaabbbaabaaaaababaaabbaaaaabbbbbbaabbabaabaaaaaaaaaabbabbbabbaababbaaaabababaabbbbaaaabbbbbaaaaabbabbbbbbaaaaabababaaabbabbbbababbbbbabbabbbaaabbbbabbbabaababbbbaabaaaabababababbabababbabbbaabbbaaabababbabaabaaaabababaabbbabbaababbbbbbabbbaabbbabbabbaabaaabaaaabbbbbabaaabbabbbabbbabaabbabbabbaababbaaaaaaabbbaaabaaaabbbbbabaabbbbaabaaabaabbabbbbabaababbbaabbaabbbbbbbababaabaababbbabaaabbbabaabbababababababaababbabbbabbabbaabbbbbabbaaabbaaabbbbabaaaaabaababbbbaabaababbbbbaabbbabababaabbabbaabbabbbabbaaaaaaaabbbbaaaababbbababaaababbaabbbbabaabbababbbbaaaaaabbaaababaabbbaaababbbaabbbababbabbabbabbbbabbabaaabbaabbaaabbaaababbaaaaaabbaaaaaabbabbbbabbbbabbbaabbbbbbaaaaaaaaabaaabbbbbaabbbbabbbabbbaaabaabbbbbbaaabbbbbbababbbababbaababbabaaaaaaabbabbabbbbababbbbbaabbaaaababbbaabbbaaabbbaabbbabbaabbabbbbbbaabbaabaababababbbabbabbbabbbaaababbabaabaabbaabbaabbbabbbbaababbaaaabbbabbbabbabbbbbbbaabaaabbbabbabbbaaaabbaabaabbbbaabbaabbbababaaaabaaabbbaaabaaaabaabbbababababbbbbbabbaabaabababbabababbaaabbabaaabbaaababbabbbbaaaabbaaaabaabaaabbababbbbaaaabbbaabbbbababbaaabbabaababbaaaaabbaaaabbbbababbaabbababbbbabbaabbbbbbaababbbaaaabbababaabbbabbaaabbbabbaababababbbbbbbaaaabababaaaabaaababababaabbababbbbabaabbaabaabaababbbbaababbbaaababaababbabbababbbbaababaaabbabbaaabbaabbababbbabaabababbbbabaaaababaabbaaaababaababbbabbaaabaabbaabbbbbbbabbbaaaabaabbbaabaabaaaabbabbbbbaaabaaabbbbbbbbbabbaabbbbbabababbaabaaaabbbaaaabaaababbbabbaaabbbbbbbbbbaababaababaaababaaabaaaaabbbabababbbabbbbbaabbabbbabaabaabababbbaababababaaabbbabaaabbababbbabbbbbabbbaaabbaaabbbabbbbabbbbbaaaaabbaabaabababbbababaaabaabaabbababbbbbabbbbbabaabbbabbaaaaaaaabaababbabbaabababbbaaaabbbbabababbbbbbababababaabababaaaababbbbaababbabbabaabbbbabaabbabbbaabaabaaabbbabbaabbbbaabaabaabbaaabaababaaaababbababbbbabbbaaabaababaaaababbabaabbbabbabaabbaaababaababaabbaabbbbbbbaabaaaabbbbbbabbabaabaabbbaabababaabbbaaabbbbbbaaaaaababbaabbbaabbaababbaabbbabaaabaabbabaababbbbaabbaaaabbbbaaababbaabbabaaaaababbaaaabaabbabbaabbabbabbaabbaababbaaabaabaabbaaaaabbababababaaabaaaabaaabbbbbbbaaabaaaabbabaababababbbbabbaaababbbaaaaaaabbaaabbabbbbbabbbbbabbaababbbbbababbabababbaabbbbbbbbabbbaabaaabbabbbabaabbbbbabbabbaaaaaabaaababbaaaabaabbbaababbaabaabababbaaabbaaaabaabaaabaabbbbbabaabaaaaabababaaaaaababbaaaaaaababaaabbbabbaaababbaaaabbaabbbaaaabaaababbabbbabbbabababbabbaababbaaaabaaababbabbaabbabaabaaaaabbababbaabbaaaaaaabbaaababbaaaababaaaaabbbbbaaabbbaabaaaaaabaaababbbaababbabbaaababbaaaababaaabaaabaabaaaaaababbabaaabbabababaabbbbbabbbbbaabaaabbaaabbbbbbbaaabbabaaaabaaaabababaabbbbbbabababbabaaabbbabbabbaaaaaababaababbaababaabbabbbabbaaabbbaabbbbbbaabaaababaabaabaaaaababbaababbaaabbaababbbbabbbabaabbbbabbbababaaabaabaaaabaabaaaababaaaabababbbbabbabbaaabaaaabbbbaaabbaabaababbbabbbaabbbbbbbabbbbabbababbbbaaaaabbaaabaabbaaaabbaabbbbabbbbbabbbbbabaaaaaabbabbbabbbbbbabbabbabaaabababaaaabaabbaabbabaaaaabbabbabbabaaabbbababaabbbabababbbbbbbbabaabbabbabbaabbbbabbaabaaaabbaabbaaaabaabbabaabbaabbabbbaabababbbabbbaabbbaabaaabbbbaaabaaabbbbbbaabaaaaaabbbabaabaaabbabababaaabbabbaaabaabbaaaababbaabaaaaababbabaaaaaabaababbbaaabababbbabaababbaababbabaaabbabbabbabbbabaabbbbaabbbbabbababaaababaabababaaabaabbabbbbabbbaaaabbabbbbaabbbbabbababbabbabbaaabbaabaabbabbbbbbaaabaaaaabbbbaaabaaaaabaaabbbbbababbaaababbbbbaabbaabbaaaaabaabbaababaababbbbaabbbbabbabaaabbbababbaaaaaaaaabbbabaababbbbbbabaabaaaabbbbabaaabbabbabaaabaaaabbbbaaabbabaabaaabbbbbbababbbbbaaabbbabbbabaabbabbbabaababaaabbbabbaabbbbbbaabbaabaaabbabaaaaabbaaababaababbaabaaabbaaabbaabbbbbbaaaabaaaabbabaaaabbabbbbaaabbabaabaababababbabbabaabbabbabaabaaababbbaabaaabbaababaababbbbbbbabbaabbaaaabbabababaaabaababbabbbbabaaabaabaaabbaabbababababbbbaabaababbbbbabbbbaaaabaaabbbaabaabbababaabbbabaabbbaaabaabbbaababbbbbabbbbbabaaaaabbbabbabaabaaabaabbbbbaababbaabbbbbaaaabbbabbbbbabaabbbababababbaaababbbabbbbaabaaaaaabbababaaaaabbbbaabbbabaaaaabaaaaabbbbbaaaaababbababaababababbabbbaababbaabaabbbbaabaaababbababaaaaabbbaaabaababaaabbbabbbbabbabababaaabbbbaabbbababababbbabbbbbabbbaabbbbabaaaabbbbababbbbabbbababbbbbaaaababbbbbbaabbababababaaaaaaaabaaaaabbbabaabaababbbbabbaabbabbbaababaaabbbaabbabbbbbaabaabaaabbabbbabbbabbabaaababbbaababaaabaabbabaabaaabaabaababbbabbbabbaaaabbbaaaabbbabbaaaaabaaaabaabaaaabababbbbabaababbbbaababbabbbabbaaabbaaaabbbbbbbbbbbbbbbabaabbbaaaaaaaababbbaaaaababababbababbabbbbaababababbbbbbbabbbabbbaabaaabbabbbabbbbababbbbabbabbbbabbbbabaabbaaaababbbbababaaaabaabababbbababbbaabaabaaaababaababaaaaaaaaaaabbababaabbaabbbbbbababaaabaabaaaabbbaaaababbbabbaabaabaabaabaabaaaaaababbbaababbbababbbabbbaaabbbabbababbabaabbbbbbbaaaababbababaaabaabaabbbaaabbaabababbbbaabbabbbabbbbaaaaabaaaaabbbabaabbbabaaabbaaaabaabaaabbbabbaabbabaaaaabbaaabbbbbabaababaaaaababaabaabbbabaababaabbabbbaaaaaaaababbabbabbaabababbbaaaababaabbabaabbaaaabbabbbbaaaabaaaaabaabababbabbbbbabaaaababbaaaaaabaabbbbbabababaaabaaabbaaaaaabbababbbbabbabbaaaabbaaababbabaabbaaaabbaabbaababbbaabaaabbbbbbbbabbbaaaabbbbbaabbbababbbabaabaaabbbbbbbbbaabaababbbaaaabababbababaaabbaabaaababbabaaaabbbaababaaabababbbabbbbaabbaabbbbabbbaaabaaaabbababaabaaababbaaabaaaaaaaabbbbbabbababababbaaabbbbabbabbbabbaaabbababaaabaababaabbabbbbaaabaababbaabbababbabaababbabbbbabbbaabababbbababbbaaaaaaabbabbbbbaababbaabbabaaabbbbbbbabababbbbbbbabaababaaababaababbabbaabbbaabbaabababbabbbbbabaaabbbabaababbbbabbbbabaababbbabbaabbbbabbaabaaaabbbaaababbbaabaaaabbababbbbbbbabaabbababbbaaabbbbabbbbabbbabaabababaaabbbbbaababaaabababbabaaaabbaabbbaaababababaaaabbbbaaabbbaabaaabbaababbbaabaaababbabababaaaabbbabbbbaabaaabaaababaabbbbbabbbaabaaaaabbbbaaabbbabbabbbaabbababababaabbbbaaaaababbbabaabbbbababbaaaabbababaabaaabaababbabaaaaabaabbaababaabbaaabaabbbbbbabbaabbbbabaabaaaaaaababbabbabaababaaaabaabbababaababbabbababababbbabaababaaaaaaaabbabbbaaaababbabbbababbbaaabbababbbbaaabbbbabbaabbababbaabbaabaaaaaaababaaaaabbbbaabbabbbabbbbbaabbbaaaaaaaababbabaaaaaaaaabbbbabbabbbabbbaabbaabababbabbaabababaabbaabbababbabaabbbabbaaabbbbaaabaaaaababaaaababbabbbaaabbbaaabbaaaaabaabbabaabababbbaaaababbbabbabbabbaabbaababbbbaabaaaaabbaabbbbababaabbbabbaabbaabaabaabbabbabbabbbbabbaaababbbaaaabbbaaaaabbaabbbaababbbbbabbbaaabaababbbababbabaabbbaaabbababaabbabbaaabaabbaabbbbbbbbababbabbbaabaabbababbbbaababbbbbbbaaaaabaaaaabbaababbbbaabbabbaaabaabaababbbbbaabaababaaaaabbbbaaaabaabaababbaaaabbbabaaaaabbbabbabbaaabbbbaaabaaaaaabaabaaaaabaaaabaabbabababbaababbbaaababaabaaababaaaabababbbbaabaaaaabbaabaaaabbbaabbaaaaaababababbaaaabaababbabbbbaaaabaaaaaaaaaaabbbabaaabbababababbbbaaaabbbbbababbbbaabbbbaabaaaabaabaaaaaaababaabbbaaaabaababbaaaaaabaabaaaaaaaabbaabbababaabbbaabbaabbaabaaaaabbbabbaababbaabababbbbabbaabbbbabbbbbababaaaaabbababbabaaaaaaababaaabaabbbbabaabbbbaababbbbabaaaaabbaaaaaaabaabaabbabbabbaaaaabbaabbabaaabaabbbbaabbbabbbabbaaaaaababbaaaaababaaaababbaaaabbbbaababaaaaabbbabbaaaabbabaaaabbabaabababbbabbaabbaaaabbaaaabbaaaabbabaabbabaabaaabbbbababbaaabaaabaabaabaababaaabbbabaabbbaaaaabaabababababaababbbbbaabbaaaaabbababaaabababbaaaabbabaabbbabbaabbbabaaaabababababababaabaabaabbbabbaaaabbbaabaabbbbbbabbbbbbaababaababaabbaaaaaabbbabbaaaabbaababaaabbaababbbbbabbbabaaaaabbbbabbbbaaabaaaabbbbaabaaabaabbbaaabbbabbabbaabbbbbaabbaaaabbbbaaaaaabbababaabaabbbbaaaabbaaabbaababbaabaababbbbbababbaaabbababbaaabaabaaabaaaaabaaaaabbabaaaaababbbbbaabaabababaabbbabaaababbbabbbbabbaaaabaabbbbbabaaaabbbbabbbbabbabbabbbabbbbbbaabaabbbaaabbabbabbbabaababbababbbabababbbbbabaaaaaaaababbaaababbbaaababaabbbbaaababaabbbabaabbbbabaaabbbaaabababbabbabbbaabaabbbaabaabababbaaabaaabbaabbabbbbaabaabaaababaaabbbbabaaababbbabaaaabaaabababbabbbbabbbaaaababbabaaaaabbabaababbaaaaabbbabbabbbbaabbaaaabaabbbbaaababbbabbbaabaaabbbbabaaabababbabaabbaaabbabaabbbaabaabaababbbaaaabababaaaababaabaaaababbbaaaabababbaaaababbbababbaababaabbbabaabbbaaaababbbaabbbaabbbabaabaabaababbababbabababababaabaaaaabaabbaaabbbbabaabaabbbababbabbbaabbbabaabbaabaaabbabbababbababbabbbaabaabbaaaabbababbbbbabbaabbbaabaaaaababbbbaaabbbaaaaabbaaaababbbababbabababbaabbabaaabbabbabababbaaabaabbbbaabbaaaabbaaaababbaaaabaaaaaaaaaaaaababbbaababbbbababaabababbabbbaaabbbabaaaaababbbbabbbabbbaababbbabbbbbabaaaaabbbbbabaabbababbabaabbaaaabababbaabaabbbbabbbaaabbbababaababaabbaabbaabaabaababababbbbbbaabbaabaabbbbbbbbbbabbabbbaabaabbbaaaabaabbbabaabaaabababaabbbabbaabbbbbbaaababbbabbaabbababababbbaabbbbbbbaaabbbaabbbaababbabbaaabbbabbabaaaaaaaaabbaababaabbbabbaabaaaabbbaababaaabaaaabababbbaaabbbbbabbbabaabaababaaabbbabbababbbaabaabbbabbbbbbbaabaaabbaaabaaaaaabbbbaabababbaabaaaabaaababaaabbabbbabbabaaaababbaabaabaaabaabbbabababbbbbbbbbbbbaaaabbaaabaaabbbbaabbbaabbaaabbaababbaaabaabbaaaababbbbabaabbabbaabbaabbbaabbbbaaaabaabbbabbaabbaaaaabbabaabaaabbbaabbabbbbbabbbbaabbabababaabbbabbbaaabbbbababaaaaabbbaaabbbaabbbbbaabaaabaabababaabaabaabbbbbbaaaabbbbaabbaaaabbabbbbbbbaabaabbbababbabaaabaaaabbaabbbbabbbaaababbaabbaaaababaaabbbaabaababbbababaaabaabbaaaaabbaaaabbbabbabbbabbbabaaaabaaaaaaaaaaaaaabbbbbaaabbbbabaabbabbaaaabbbabababaabbababbbbbbaababbabaaaaaaabaaaaaabbbabbbbbbabbaababaabaabbbbbbbbbaabaabbababbbabbbbbbabbbbbbbaabaabaaaabbababaaaaaaabbaababbbbbbaaaaaabaaababbabbbbbbaabaaaabaabbaaaaaabaabbbbbaabbbaaaaaaabbbabbabbbabbabaaaaaabbabbbbaabbababbabaaabaabbbbbbbababaaaabbbababbaaaaaaaababaabaabbabbabbaabbabababaababbbaabaabbbbbababbbbbbabbaaababaabbaabaaababaaabababbbbbbbbaabbaabbabaabbabbaaababbabbaabbbbaaaabbbbabbbaaaabbbaaabbbaaabaaaababbabbabbaabbabbabaabbaabaaaababbabaaabbabaaababbbbbbabaaababbabbabbabaaabaaabaabbbbbbababbbbbababbbbbbabbbabbbabaabaaabaabbbaabaaaaabaabbabbbbbababbaabbaaaabbabbaaabbaabbabbaaababaabaaabaaabaababbabaaaaabaaaabbbbbabbbaabbaabbbabbaaabbbbbbabaaaaaaaabbababbbbbbababbbbabbbabbbaaabbbbbbaabbbbbaabaabbaaaaabaababababaaabbbaabaaabaaaaabbbababbbbabbbbaaaaaaabbbbabbabababbabaaaabbbbbbabaabbbbbbbaaababaabaabbaaaabbbaaaaaababbabbaaaabbabababaaaabaaababbbaabbbbbaaababaababbababaaabbaaabbaaaabaababbabbbbaaaabbabaaaaaaaabbbababbbaabbbabbbaaaabbbabbbaababaaaaabbbbbbaaaaaaaabababbabbbbaaaaaaabbbbbbabaabbbbbbaaababbbaaaaaaabbbbaaabbbbabbbbabaabaabaaababbaaaaababbbbababaaaabbbbaaabbaaaaabbbaaaababbababbbbbaaabbabaabaaaaabaabbbbbbbabaabaaaaababaabbbbbbbabbbbbabbaaaaaaababaabababbbbababbbbabaabbbababbaabbbabaaabbbabbbabaaaabbbababbbababaaabaabaaabaababbbaabaaabaababaaabbababaabbbabaabaababaaababaabbabbabaaabbaabbbabbabaabbaaabbabbbbbabbbabbaabbabbaaaaaababbbabaaabababaaaabaabaabbabababbbbbbabbbaaaaabbababbabaababbbbabbbaaaaabbbbbabaabbaaaabbabbabaaaabbbbbbbbaabaabbbabbabbabaababbaabbbaabbbaabababaaaaaabaaaaabbaabaabbbabbaabbabaaaaabbababbabbbabbaaabaaababbabbbaaabaababaaaabababababbaabaabaaabaabbabaaaaabbababbaababababaaaabababbbabbabbababbabbbabaaaabbbababbbbbbbbbbaabababbbaaabbbabbaaababbbbbabababbbbbabbbbbbbbaaabbabaababbbbaabbbaabaabaaabababbabbbabaaaabbbbbbabaabaaaabaabaaabaabbbbbaaababbbbbaaaabbaabaaabbaaaabaababaababbbabaabaabaabaabaaaaaaaaaaababbabaaaabbabaabbabbababbaaabbbaaaabbababaaababaaabbaabbbaababbabbbbaababaaabbaabaaababbbaaaababaaabbaabbaabaaababbaababbaabbabbabaabaaaaaabbbbaaabaabbbaabbaaaaabbaaaabbaabbbbaabbbaaababbbbabaabbaaaabbaaabaabbaaaabbbabbabbabbabaabababbabbbaaaabbbbabbaabbbbaaabbaaabbababbbababbaaaaaabbbbbbbbabbaabbabbbbabbabbabaabbaabbbaabaabbbaaabababbaabbbbabaaabbabaabaabaabaababbababbabbaaaaabbaabbababaaabaaabababbbaabaabbaabaabbabbaabaaaaababbbbaabbaabaaaabbababbbaaaabaaaaaaababababababbbbababaabbbbbabbbaaaaabaababbbbabbaaabaabbaabbbbaaabbababbabaaaabbbbbbbbaaaaabbabbbbabbbbaabbabaaaaabbbbbabbaababaabbbbbbababbbaabbbbbbbbbaabbbbaaaaabababaaabaabbbbbbbaabbaaabaabbbbbbabaaabababaaabbbbbabababbbabbbababbababbbabbabaababbbabbbaaabaabbaaaababbaabaabaaabaabbaabaaabaabbbababbaababbaaabbaabbaaabaabbabaaabbabbaabababbabaabbabbbaaabaaaaaaabbaaabbbaababaaabbbbababaabbabbaaaababbabbbbababaabababaaaaabababbbbbbabaabaaaaaaaabbaaaabaababbbbaaabbaaaababaabbabbabbbbaababaabbaabbbbaaaaababbabbabababbbabaabbaaaaaabbbaabbababbbbaabbbbabbbbabaababaaaaaabbaaabababbaabaaaaaaabaaaabbaaaaabaabaaabaaaaaaabbaaabaaabaaabaabbbabbbbaabaaaaaaabbaabbbbaabbbbbaaaaabaabbabbbbbaaababababaaaababbbaabababbbbbaaabababbbababaaaaabbaabaaaaaaabaaaaabbbbababbbbbababbbaababbaaabbbbbbaabbbaaabaaaaaabaabaababaabbbabaababaaaaaaababbaaabaabbaabaaabbabbababababaaabbabaaabaaabbbaababbbaaaabbbabbbbaabaaaaaaababbbaaaaabaaaaaabbbbbaaaaabbbababbbbbaaaaaaaaaabaabbbaaabaaabaaaabbabbbbaaaaaaaaabbbbaaaabaabbabababaabaabbbbabbabaabaaabbaaaaaaabbabbbaabbbabaaaabbbaabbbabbaaabbabaabbbbaaaabaabbababbabbbaaaabbbbbabbabbbabbbaaabbaabbabaaaababbaabbbbbbbbaaaabaabbabbbbabbbababbbabbabaabbabaabaaaabbbaaabbbaabbbbbaaabbbababbababbbbababaabaabbabbaabbabbbabbabaaabaaaabbabbabbaabbaabbaabbabaabababbbaabaabbaaabbbbbabbbabbbbbaabbbbabbababbabaaaabaaababbbbabbbabaaabbabbbbaabbbaaabaaabbbbaaabaaaaaabbabbaaaabbabaaabbaababbabbaaaabbbaabaaabbabaabbabababaaabbaabbbbabaabbbabbaaaabaaaaaabbabbbababbaabaababbababbaababababbbaababbabaabbbababaabababaabbababbaaaaaabaaaabaabbabbbaaaabaaababbbaabbbbabaaaaaabaaaabbbbaabbaabbbaabbabaabbbaaaaaabaaaaabbabababaabaaaabbabbbaaaabaaabababaabbabbababbaaabbbbbbabbbaabaabaaabaaabbbabaaababaaaababbbbbbbbaaaababbababbbbaabbbbbbabababbbbbbbabaaaababbabaabaaaababbbbabaaababbbaaabaaaaabbaaaaabbbbbbabbbbaaabbaaaababaababbbabababbaabaabbbbbabbaaaaaaabaaabaababbababaabbbbaaaababbabbabaabaababaaaabbabbaabaaabaabbabaabaababababbbbbaabbababaaaaaabaaabaababaabababaabbaabbabbbabaabbbaaabaabbabaabbbbbbbaabbabbabaabbbaabbbbbaaababbaababbbaabaabaaababbbabaaabbbbbabbbaabbbbabbbbbaaabbbaabaabbbbbaabbbaaaaabbbbabbbbbbaaaaaababbbbabbbbbaaaababbbbabbbaabaaababaaaaabbbbabbbbbaaabbaaabbbabaabbabbaaaabbbabbbbabbbbababaabaabaababababbaabaabaaabbbaaaaaaabbbbabbabaaabbababbbaaaababbababaabbaaabbaabaabbaabbbbbbbaababaaaababaabababaabbabbbaababbbaabaaaaaaaaababbbaaaaaababbbbbaaaaaabbbbbbbabaabbaababaaabbbbababaaabaaabbbbaaaabbaabbbbbabaabaaaaabbbabbaaababbbbaaabaaababaabbbaaabbabbabaabaaaaabaaabbbbabbaabaabbabbaaaabbbaabaabbbbbabbbbaaababaabaaaaabbabababbbbaabaaaaaabbbaababaababaaabaabbbbbaaaababbabbbbabababbbbabbabbaaaabbbaaabaababbaabbabbaabaabaaaaaaaabbabaabbbbaabaaabbbbabaaaaabbaaabababbaaaaabbabaaaaababababbabbabbbbaababbabababaababababbbaaaabbabbabbbbbbbbababbbbbbbbbabaaabbbaaaaabbbbaaabbaabbabababaaabbaaabaaababababababaaabbababbababbbbaabbbbbbaabaababbbbbabbbbbaaaaaaabaabaaaaabaabaaababaabaaaabbbbbbbbbbbbbbababbabaaaabbbbbaabbbbbaabaabbaaaaabbbbabbabbbbbabbaabaabbbbbbbbbaaabbbbbababbbabbbaabbbabbbabbaabbbbabababbbaaabaababaaabaabbbbbaaaabbababbbaabbaaabbbabaaabaaaaaababaabbaababaabbbaaababaaabbbbabbbaababbabaababbabababbaababbbbaaababbbbaaaabaaabaababbbbbabbababbabaaabaaaabababbabaaaaaaabbaabbaabbaaaaaaaabaababababababbbbbbbbbaaaabbbbababaabaaaabbbbbbaabaabbbbabbbabaaaaaaabaabababbabbbababbbaaababbbabbabbbbbbbaabaababababbaabbbaabbabaaabbaabbabaaabbaabbababaaabaabaaaaaaabaaabbabaabbabaaababbbaaaaabbbbbbaabaabbbbbaaabbbabababbbaababbaaabaabbabbbaaababaabaabbbaabbababbababbabbbbbaaaaaabbaabaabaabbbabaaaababbbabababbbaaaabaabbbaababaaabbaabaabaaaabbbbbbbaababbaabbbaaaaaaababbabbbaaaaabbabbbbbbbbbaabaaabbbbbaaababbaabaaabbbaabaabbbaabbabbbbabbbabaaaabbaabaabababbaaababbabaaaabbabbbbbbbbaababbbaaabababbabbbbbaababaaaabaaabbbbabbaaabbaaaabbaaaaaaaaabaaababbaaabaabaaabbabbbbbbabababaaababaababbbbaaaaaaaaabbbbaabbbbabaaababbbbbbbbabbabaabababbaaaabababbbaaaabbbabbabaaaabababaabbaabaaabaaaabaaaabbaaaabbbaaabaabaabbaaabbbaaabbbabbabbbbbaaabaabaaaaaabbababbbbbaabbabaabaababababaaaaabbbaaaabaabaaabbbababbabbababaabaaabaabbababbbaabb"));

  }

}

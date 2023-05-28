package PracticalBased;
//Converting non palindrome words to palindrome in a sentence which may be terminated by '.','?','!' only
import java.util.*;

public class Pract5
{

    public static boolean isPalindrome(String word) 
    {
        boolean palin = true;

        int len = word.length();
        for (int i = 0; i <= len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) 
            {
                palin = false;
                break;
            }
        }

        return palin;
    }

    public static String makePalindrome(String word) 
    {
        int len = word.length();
        char lastChar = word.charAt(len - 1);
        int i = len - 1;
        while (word.charAt(i) == lastChar) 
        {
            i--;
        }

        StringBuffer sb = new StringBuffer(word);
        for (int j = i; j >= 0; j--) 
        {
            sb.append(word.charAt(j));
        }

        return sb.toString();
    }

    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE:");
        String ipStr = in.nextLine().trim().toUpperCase();
        int len = ipStr.length();

        char lastChar = ipStr.charAt(len - 1);
        if (lastChar != '.' && lastChar != '?' && lastChar != '!') 
        {
            System.out.println("INVALID INPUT");
            return;
        }

        String str = ipStr.substring(0, len - 1);

        StringTokenizer st = new StringTokenizer(str);
        StringBuffer sb = new StringBuffer();

        while (st.hasMoreTokens()) 
        {
            String word = st.nextToken();
            boolean isPalinWord = isPalindrome(word);
            if (isPalinWord) 
            {
                sb.append(word);
            }
            else 
            {
                String palinWord = makePalindrome(word);
                sb.append(palinWord);
            }
            sb.append(" ");
        }

        String convertedStr = sb.toString().trim();

        System.out.println();
        System.out.println(ipStr);
        System.out.println(convertedStr);
    }
}
 
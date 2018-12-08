import java.util.Arrays;

class Geeks {

    static int coutChars(String s1, String s2) {

        
        int count1[] = new int[26];
        int count2[] = new int[26];
        for (int i = 0; i < s1.length(); i++)
            count1[s1.charAt(i) - 'a']++;
        for (int i = 0; i < s2.length(); i++)
            count2[s2.charAt(i) - 'a']++;
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] - count2[i]);
        return result;

    }
}

public class string {

    public static void main(String[] args) {
        int n = 10;
        String s = "";
        s = s + n;
        String str = s.valueOf(n);
        System.out.println(countPS("abbaeae"));

    }

    public static int countPS(String s) {
        // code here
        int l = s.length();
        if (l <= 1) {
            return 0;
        }
        int cnt = 0;
        // char[] ch=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j+1);
                if (str.length() > 1) {
                    if (ispalindrome(str)) {
                        cnt++;
                    }
                }

            }
        }

        return cnt;
    }

    public static boolean ispalindrome(String s) {
        int i = 0;
        int j = s.length();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j - 1)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

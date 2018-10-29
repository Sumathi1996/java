import java.util.Scanner;
 class TestIsomorphic {
     public static void main(String[] args) {
           String a;
           String b;
           String str;
String[] input = new String[2]; 
Scanner scan = new Scanner(System.in);
input= scan.nextLine().split(" ");
a= input[0];
b= input[1];

           String res = TestIsomorphic.checkIsomorphic(a,b);
           System.out.println(res);
     }

     static String checkIsomorphic(String a, String b) {
           int length = a.length();
           /* length of both strings must be same */
           if (length != b.length()) {
                 return "no";
           }

           // To mark visited characters in str2
           char visited[] = new char[26];
           for (int i = 0; i < visited.length; i++) {
                 visited[i] = '#';
           }

           char[] strArr1 = a.toCharArray();
           char[] strArr2 = b.toCharArray();

           // Process all characters one by on
           for (int i = 0; i<length; i++) {
                 char ch = visited[strArr1[i]-'a'];
                 if(ch=='#') {
                       visited[strArr1[i]-'a'] = strArr2[i];
                 } else if (ch != strArr2[i]) {
                       return "no";                      
                 }
           }
           return "yes";
     }
}

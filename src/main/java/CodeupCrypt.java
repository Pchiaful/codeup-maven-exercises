public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String s) {
       String output = "";
       for (int i = 0; i < s.length(); i += 1) {
//           if (s.charAt(i) == 'a' || s.charAt(i) == 'A'){
//               output += 4;
//           }else if (s.charAt(i) == 'e' || s.charAt(i) == 'E'){
//               output += 3;
//           }else if (s.charAt(i) == 'i' || s.charAt(i) == 'I'){
//               output += 1;
//           }else if (s.charAt(i) == 'o' || s.charAt(i) == 'O'){
//               output += 0;
//           }else if (s.charAt(i) == 'u' || s.charAt(i) == 'U'){
//               output += 9;
//           } else{
//               output += s.charAt(i);

           switch (Character.toLowerCase(s.charAt(i))) {
               case 'a':
                   output += 4;
                   break;
               case 'e':
                   ;
                   output += 3;
                   break;
               case 'i':
                   ;
                   output += 1;
                   break;
               case 'o':
                   ;
                   output += 0;
                   break;
               case 'u':
                   ;
                   output += 9;
                   break;
               default:
                   output += s.charAt(i);
           }
       }
       return output;
    }

    public static boolean checkPassword(String hashed, String original) {
        return hashed.equals(hashPassword(original));
    }
}

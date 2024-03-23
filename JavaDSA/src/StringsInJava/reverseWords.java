


package StringsInJava;
import java.util.*;
public class reverseWords {
    public static String reverseWords(String S)
    {
        // code here
        Stack<String> s = new Stack();
        String temp = "";
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch == '.'){
                if(!s.isEmpty()){
                    temp += ".";
                }
                s.push(temp);
                temp ="";
            }
            else{
                temp += ch + "";
            }

        }
         if(!s.isEmpty()){
           s.push(temp + ".");
        }
         else{
          s.push(temp);

        }
        String revStr = "";
        while(!s.isEmpty()){
            revStr += s.pop();
        }
        return revStr;
    }

    public static void main(String[] args) {
        String St = "i.like.this.book.of.maths";
        String str = reverseWords(St);
        System.out.println(str);
    }
}

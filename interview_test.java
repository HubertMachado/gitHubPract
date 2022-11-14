import java.util.HashMap;
import java.util.regex.Pattern;

public class interview_test {
    public static void main(String[] args) {
        String inp_str = "My name is 'Hubert' and who are you?";
        
        String split_inp_str[] = inp_str.split(" ");
        String reverse_str="";
        String inpStringWOSpecialChar ="";
        int i;
        HashMap<Integer,Character> specialChar = new HashMap<Integer,Character>();

        for(i=0;i<split_inp_str.length;i++){
            Boolean specialCharCheck = checkSpecialChar(split_inp_str[i]);
            int len = split_inp_str[i].length();
            if(specialCharCheck){
                char special_char = split_inp_str[i].charAt(len-1);
                specialChar.put(i+1,special_char);
                String inp_data_wo_punc =split_inp_str[i].replaceAll("\\p{Punct}","");
                inpStringWOSpecialChar= inpStringWOSpecialChar+" "+inpWOSpecialChar(inp_data_wo_punc,inpStringWOSpecialChar);
            }
            else{
                inpStringWOSpecialChar=inpStringWOSpecialChar+" "+inpWOSpecialChar(split_inp_str[i],inpStringWOSpecialChar);
            }
                      
        }
        String stringWOSpecialChar[] =  inpStringWOSpecialChar.trim().split(" ");
        for(i=stringWOSpecialChar.length-1;i>=0;i--){
            String inp_special_char = " ";
            reverse_str = reverse_str + " " +stringWOSpecialChar[i];
        }

        String reverseStringSplit[] = reverse_str.split(" ");
        reverse_str="";
        for(i=0;i<reverseStringSplit.length;i++){
        if(specialChar.containsKey(i)){
            reverseStringSplit[i] = reverseStringSplit[i].trim()+specialChar.get(i)+" ";
          }
          reverse_str = reverse_str + reverseStringSplit[i] +" ";
        }

        System.out.println(reverse_str);
    }

    public static Boolean checkSpecialChar(String inp_data){

        if(Pattern.matches("(.*)[\\p{P}](.*)",inp_data)){
            return true;
        }
        else{
            return false;
        }

    }

    public static String inpWOSpecialChar(String noSpecialChar,String inpStringWOSpecialChar){
            return noSpecialChar+"";
        
   }

}

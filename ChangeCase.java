import java.util.List;

class ChangeCase {
    public static void main(String[] args) {

        toSentenceCase(
            "this is a long string for testing purposes. it contains various words and characters to assess the performance of different functions and algorithms. feel free to use this string for any testing or development needs. happy testing! this long string is meant to provide a more extensive dataset for your testing scenarios. it includes a diverse range of words, symbols, and patterns to evaluate the robustness and accuracy of your applications. ensure to thoroughly test the functionality of your software with this extended string to identify and address any potential issues. testing is a crucial step in the development process, and using a comprehensive string like this can help uncover hidden bugs and improve the overall reliability of your code. remember to analyze the results of your tests carefully and make necessary adjustments to enhance the performance of your software. happy coding and testing"
        );

    }

    private static void extracted(String _passedString) {
        try {

            String str = new String(_passedString);
            str=str.toLowerCase();
            String[] stringArray = str.split(" ");
            str="";
            for(String s:stringArray){
                
                String firstCharacter=s.substring(0, 1).toUpperCase();
                s=firstCharacter+s.substring(1, s.length());
                str=str+" "+s;
             
                
            }
            
               System.out.println(str);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    private static void toSentenceCase(String _passedString) {
        try {

            String str = new String(_passedString);
            str=str.toLowerCase();
            String[] stringArray = str.split("\\.");
            str="";
            int count=0;
            for(String s:stringArray){
                s=s.trim();
                
                String firstCharacter=s.substring(0, 1).toUpperCase();
                s=firstCharacter+s.substring(1, s.length());
               
                if(count==0){
                        str=str+""+s;
                }else{
                    str=str+". "+s;
                }
                 count++;

             
                
            }
            str=str+".";
               System.out.println(str);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
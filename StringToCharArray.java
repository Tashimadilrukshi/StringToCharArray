import java.util.Scanner;

class StringToCharArray{
  
  public static void main(String args[]){
  
      Scanner s = new Scanner(System.in);
      
      String word = s.nextLine();
      
      stringToCharArray(word);
      
  }
  
  
  static int stringToCharArray(String word) {

        
        char[] chars = word.toCharArray();
       
        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
        

}
© 2018 GitHub, Inc.

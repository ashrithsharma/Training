// Missing Braces
// 
// In Java, braces are used to group statements and declarations together. 
//Each opening brace ‘{‘ should be accompanied with a closing brace ‘}’ otherwise 
//compilation of the code would result in a failure.
// 
// Given a piece of code in java, 
//determine whether the code will give compilation error due to missing brace(s) or not.

//input="class Main{ public void fun(int a){int x= a*a for(int i=0;i<3;i++){x+=a;if(x>15){break;}}}" 

//proper braces or not  if proper we return correct else error

public class Main {

     public static void main(String[] args) {
       String input="class Main}public void fun(int a){int x= a*a for(int i=0;i<3;i++){x+=a;if(x>15){break;}}}{" ;
       System.out.println(findValid(input));

     }

    private static String findValid(String input) {
         Stack<Character> stack = new Stack<Character>();
         //for each 
         // for loop with charAt
         for(char indexElement:input.toCharArray()){
            if(indexElement == '{'){
                stack.push(indexElement);
            }
            else if(indexElement == '}'){
                //coresponding closing bracket
               try{ stack.pop();} catch(Exception e){
                return "error";
               }
         }
    }
    return stack.isEmpty()?"correct":"error";
}
}

package virtusa_Training;
//Anagrams
//An anagram is a word , phrase, or name formed by rearranging the letters of another word,
//phrase or name.
//Write a function to check if two given strings are anagrams or not . Return "yes" 
//if they are anagrams, otherwise return "no".

//Input Specifications:
//Input1: the first string
//Input2: the second string

//Output Specifications:
//Return "yes" if they are anagrams, otherwise return ''no''.
//EXAMPLE 1:
//input1: build
//input2: dubli
class Anagram{
 public static void main(String[] args) {
     System.out.println(FindAnagram("build","dukli"));
 }

 private static String FindAnagram(String StringOne, String StringTwo) {
     int count =0;
     if (StringOne.length() == StringTwo.length()){
         for(int i=0;i<StringOne.length();i++){
             for(int j=0;j<StringTwo.length();j++)
             {
                 if(StringOne.charAt(i)==StringTwo.charAt(j))
                 {
                     count++;
                     break;
                 }
             }
         }
         return  count==StringOne.length()?"yes":"no";

     }
     return "no";
 }
}

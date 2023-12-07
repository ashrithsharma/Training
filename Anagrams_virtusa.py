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

def findAnagram(String1,String2):
    count =0
    for char in String1:
        if char not in String2:
            return "no"
        count+=1
    return "yes" if count==len(String2) else "no"
print(findAnagram("build","dubli"))



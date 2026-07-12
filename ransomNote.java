class solution{
  public boolean canConstruct(string ransomNote, string magazine){
    // the question ask if we can construct the ransomNote string from the available characters of the magazine string we shall
    // only use the characters only the number of time they appear in the magazine string, no duplicates.

    // so if a ransomNote of the length greater than the magazine string, is required its impossible to create, therefore we return false.
    if(ransomNote.length()>magazine.length()) return false;
    int[] freq = new int[26];
    // we would be storing the frequency of the number of characters that appear in the magazine string, in a freq array
    // as the input string are only lowercase english alphabets we can use array of size 26 to store them all,
    // which will provide us a constant space complexity

    for(char c: magazine.toCharArray())
      freq[c-'a']++;
    //now we fill the constructed freq array with the characters of the magazine string, the charcter -'a' is used to store the 
    // alphabets in the array as their indices, by changing them to the ascii code difference a-a is 0, b-a is 1,
    // therefore the indices a->0, b->1,....z->25
    // the increment is for the characters that may repeat themselves in the string
    
    for(char c: ransomNote.toCharArray()){
      if(freq[c-'a']==0) return false;
      freq[c-'a']--;}
    //now the array stores the number of characters that appeared in the magazine, we now decrement the character that we require in the ransom note, 
    // if any character freq return 0, before we are done with constructing our ransomNote string, it is not possible to generate it anyhow, 
    //as the character required isn't present in the magazine string , then we return false,
    // if the characters do exist decrement their frequency form the array to check all the characters that are required,

    // even if we are left with something in the array, it doesn't concern us as long as we have created our ransomNote then we return true
    return true;
  }
}

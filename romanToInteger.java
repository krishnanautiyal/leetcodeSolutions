class solution{
  public int toInteger(String s){

    Map<Character,Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );

    int num=0;
    for(int i=0; i<s.length()-1; i++){
      // if the character on the right has a greater value then the current character, then the current character is meant to be subtracted from the sum 
      if(map.get(s.charAt(i))<map.get(s.charAt(i+1))
         num-=map.get(s.charAt(i));
      // else if the characters are in decreasing order, then simply add them together 
      else num+= map.get(s.charAt(i));
    }

    // the last element is left uncalculated so we add it in last
    return num + map.get(s.charAt(s.length() -1);
  }
}

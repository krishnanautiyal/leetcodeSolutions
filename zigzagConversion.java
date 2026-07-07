class Solution {
    public String convert(String s, int numRows) {

        if(numRows==1) return s;
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");

        int curr=0;
        boolean down = true;

        for(int i=0; i< s.length();i++){
            arr[curr]+=s.charAt(i);
            if(i!=0) if(curr==0 || curr == numRows-1) down = !down;
            if(down)curr++;
            else curr--;
        }

        String st="";
        for(int i=0; i<numRows; i++){
            st+=arr[i];
        }

        return st;
    }
}

  

class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder();


        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else{
                sb.append(ch);
            }
        }

        for(char c : t.toCharArray()){
            if(c == '#'){
                if(str.length()>0){
                    str.deleteCharAt(str.length() - 1);
                }
            }else{
                str.append(c);
            }
        }

        return sb.toString().equals(str.toString());
    }
}
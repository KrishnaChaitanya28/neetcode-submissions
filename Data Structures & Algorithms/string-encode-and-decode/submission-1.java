class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0)
            return Character.toString((char)258);
        String sep = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i));
            sb.append(sep);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258)))
            return new ArrayList<>();

        // List<String> res = new ArrayList<>();
        // String sep = Character.toString((char)257);
        // String st[] = str.split(Pattern.quote(sep));
        // for(int i=0; i<st.length; i++){
        //     res.add(st[i]);
        // }
        String sep = Character.toString((char)257);
        List<String> res = Arrays.asList(str.split(sep,-1));
        return res;
    }
}

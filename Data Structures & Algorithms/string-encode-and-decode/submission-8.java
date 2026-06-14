class Solution {

    public String encode(List<String> strs) {
        if(!strs.isEmpty()){
            StringBuilder stringBuilder = new StringBuilder("");

            for(int i = 0; i < strs.size(); i++) {
                stringBuilder.append(strs.get(i));
                stringBuilder.append(';' + String.valueOf(i) + ';');
            }
            
            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();
        }
        return null;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        if(str != null) {
            String[] split = str.split("[;]\\d+[;]");
            if(split.length != 0)
                result = Arrays.asList(split);
            else   
                result.add("");
        }

        return result;
    }
}

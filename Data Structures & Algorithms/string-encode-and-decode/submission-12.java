class Solution {

    public String encode(List<String> strs) {
        if(!strs.isEmpty()){
            StringBuilder stringBuilder = new StringBuilder("");

            for(int i = 0; i < strs.size(); i++) {
                stringBuilder.append(';' + String.valueOf(strs.get(i).length()) + ';');
                stringBuilder.append(strs.get(i));
            }
            
            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();
        }
        return null;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();

        if(str != null) {
            Pattern p = Pattern.compile("[;]\\d+[;]");
            Matcher m = p.matcher(str);

            while(m.find()) {
                StringBuilder sb = new StringBuilder("");
                int start = m.start();
                int end = m.end() - 1;

                
                Integer size = Integer.valueOf(str.substring(start + 1, end));
                System.out.print(start);
                System.out.print(' ');
                System.out.print(end);
                System.out.print(' ');
                System.out.println(size);

                for(int i = end + 1; i < end + 1 + size; i++) {
                    sb.append(str.charAt(i));
                }
                result.add(sb.toString());
            }

        }

        return result;
    }
}

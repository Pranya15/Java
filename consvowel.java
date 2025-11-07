class consvowel {
    public static void main(String[] args){
        String str="java";
        int v=0;
        for(char ch : str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }
        System.out.println(v);
    }

}

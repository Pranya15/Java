class spalindrome {
    public static void main(String[] args){
        String a="abc";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+= a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("it  is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
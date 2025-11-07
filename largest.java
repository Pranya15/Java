class largest{
    public static void main(String[] args){
        String str="hello is powerfull";
        String a[]=str.split(" ");
        String largest="";
        for(String val:a){
            if(val.length()>largest.length()){
                largest=val;
            }
        }
        System.out.println(largest);
    }
}
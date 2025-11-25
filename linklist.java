class arraylist2{
    int data;
    arraylist2 next;
    public arraylist2(int data){
        this.data=data;
        this.next=null;
    }
}
class mylink{
    arraylist2 head;
    arraylist2 curr;
    public void addToLast(int data){
        arraylist2 newarraylist = new arraylist2(data);
        if(head==null){
            head=curr=new arraylist2(data);
        }else{
            curr.next=new arraylist2(data);
            curr=new arraylist2((data));
        }
    }
}
    class node{
        public static void main(String[] args){
            mylink obj= new mylink();
            obj.addToLast(10);
        }
    }

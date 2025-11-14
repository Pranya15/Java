class Book {
    void read(){
        System.out.println("book has been read");
    }
}
class Novel extends Book{
    void StoryLine(){
        System.out.println("the storyline was great");
    }
}
class b{
    public static void main(String[] args){
        Novel n=new Novel();
            n.read();
            n.StoryLine();
        }
    }


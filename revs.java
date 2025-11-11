public class revs {
    public static void main(String[] args){
        String str1 = "i love java";
        String[] words = str1.split(" ");
        StringBuilder result1 = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result1.append(rev.reverse()).append(" ");
        }

        System.out.println("8. Reverse each word: " + result1); 

    }
}

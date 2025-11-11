public class compare {
    public static void main(String[] args){
        String str2 = "bbhhnn";
        StringBuilder result2 = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str2.length(); i++) {
            if (str2.charAt(i) == str2.charAt(i - 1)) {
                count++;
            } else {
                result2.append(str2.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result2.append(str2.charAt(str2.length() - 1)).append(count);
        System.out.println("9. String Compression: " + result2);
    }
}

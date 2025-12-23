package LearnRecursion;

public class ReplaceVowelsWithDollar {
    public static void main(String[] args) {
        String str = "go to noo";
        System.out.println(replaceVowels(str));
    }

    public static String replaceVowels(String str){
        if (str.isEmpty()){
            return str;
        }
        char ch =str.charAt(0);
        if (ch =='a' ||ch =='e' ||ch =='i' ||ch =='o' ||ch =='u' ||ch =='A' ||ch =='E' ||ch =='I' ||ch =='O' ||ch =='U'){
            return "$" +replaceVowels(str.substring(1));
        }
        return ch+ replaceVowels(str.substring(1));
    }
}

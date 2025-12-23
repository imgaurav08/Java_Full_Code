package StringUsingRecursiom.src.com.Gaurav;

public class MobilePad {
    public static void main(String[] args) {
        String up ="12";
        String p="";
    mobilePad(p,up);
    }

    public static void mobilePad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i< (digit *3); i++){
            char ch = (char)('a'+i);
            mobilePad(p+ch,up.substring(1));
        }


    }
}

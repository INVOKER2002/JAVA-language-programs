

public class strques1 {
    public static void main(String[] args) {
        String str = "aabbccddaa";
        String ans = "";
        int k = 0;
        System.out.println(ques(str,k, ans));
        
    }
    static String ques(String str, int k,String ans){
        if(k == str.length()){
            return ans;
        }
        if(str.charAt(k)!='a'){
            ans += str.charAt(k);
        }
        return ques(str, k+1, ans);
    }
    
}

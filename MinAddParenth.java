public class MinAddParenth {
    public static void main(String[] args) {
        String s1 = "())";
        String s2 = "(((";
        System.out.println("The minimum number of moves required to make" + s1 + " valid is " + minAddToMakeValid(s1));
        System.out.println("The minimum number of moves required to make" + s2 + " valid is " + minAddToMakeValid(s2));
    }

    public static int minAddToMakeValid(String s) {
        int leftParentheses = 0;
        int rightParentheses = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                leftParentheses++;
            } else if (leftParentheses > 0){
                leftParentheses--;
            } else{
                rightParentheses++;
            }
        }
        return leftParentheses + rightParentheses;
    }
}

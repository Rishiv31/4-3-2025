class main {
    String sub = "";
    String target = "";
    void substring(String name, String subString){
        int end = 0;
        for(int i = 0;  i <= name.length() - subString.length();i++){ // 0 5 -3 2
            if(name.charAt(i)==subString.charAt(0)){
               end += i;
        
            }
            
        }
        sub = name.substring(end,subString.length());
        // System.out.println(sub); name.substring(end, end + subString.length())
        if(name.substring(end, end + subString.length()).equals(subString)) System.out.println("substring of " +name+ " is " +sub);
        else System.out.println("not an substring");    
    }
  
}
class extract extends main{
    public static void main(String[] args) {
        extract ex = new extract();
        ex.substring("rishi", "shi");
    }
}
// extract a substring from a string
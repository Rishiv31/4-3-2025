class print{
   static void times(String input){
        StringBuilder result = new StringBuilder();
        StringBuilder segment = new StringBuilder();
        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int repeatCount = Character.getNumericValue(ch);
                for (int j = 0; j < repeatCount; j++) {
                    result.append(segment);
                }
                segment.setLength(0); 
            } else {
                segment.append(ch);
    
            }
        }
        System.out.println(result.toString());
     
        
    }
}
public class printing {
    public static void main(String[] args) {
        print.times("r5i4s3h2");
       
    }
}

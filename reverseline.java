class reverse{
   static void rev_line(String line){
     String[] array = line.split("\\s+");
     for(int i = array.length-1; i>=0;i-- ){
        System.out.print(array[i]+ " ");
     }
    }
}
public class reverseline extends reverse{
    public static void main(String [] args){
        reverseline.rev_line("i love  java   programming");
    }
    
}

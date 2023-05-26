package StringQuestion;

public class GoalParserInterpretation {
    public static void main(String[] args) {
    	String command="(al)G(al)()()G";
    	 StringBuilder sb=new StringBuilder();
         StringBuilder sb1=new StringBuilder();
        for(int i=0;i<command.length();i++){
           sb.append(command.charAt(i));
        }
        if(sb.toString().contains("G")){
            sb1.append("G");
        }if(sb.toString().contains("()")){
            sb1.append("o");
        }if(sb.toString().contains("(al)")){
            sb1.append("al");
        }
        System.out.println(sb1.toString());
	}
}

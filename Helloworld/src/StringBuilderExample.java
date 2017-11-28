
public class StringBuilderExample {

	public static void main(String[] args) {

		String info = "";
		
		info += "My name is Sam.";
		info += " ";
		info += "I am a student.";
		
		System.out.println(info);
		
		
		StringBuilder sBuilder = new StringBuilder();
		
		sBuilder.append("My name is Bob.");
		sBuilder.append(" ");
		sBuilder.append("I am a clerk.");
		
		System.out.println(sBuilder.toString());
		
		
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("My name is Jane")
			   .append(" ")
			   .append("I am a doctor.");
		
		System.out.println(sBuffer.toString());

	}

}

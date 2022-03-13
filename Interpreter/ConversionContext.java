package Interpreter;

public class ConversionContext {

	private String conversionQuestion = "";
	private String conversionResponse = "";
	private String fromConversion = "";
	private String toConversion = "";
	private double quantity;
	
	String[] partsOfQuestions;
	public ConversionContext(String input) {
		conversionQuestion = input;
		partsOfQuestions = getInput().split(" ");
		fromConversion = getCapitalized(partsOfQuestions[1]);
		toConversion = getLowercase(partsOfQuestions[3]);
		quantity = Double.valueOf(partsOfQuestions[0]);
		
		conversionResponse = partsOfQuestions[0] + " " + partsOfQuestions[1] + " equals ";
	}
	
	public String getInput() { return conversionQuestion; }
	
	public String getFromConversion() { return fromConversion; }
	
	public String getToConversion() { return toConversion; }
	
	public String getResponse() { return conversionResponse; }
	
	public double getQuantity() { return quantity; }
	
	public String getCapitalized(String wordToCapitalize) {
		wordToCapitalize = wordToCapitalize.toLowerCase();
		wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);
		
		int lengthOfWord = wordToCapitalize.length();
		
		if ((wordToCapitalize.charAt(lengthOfWord -1)) != 's') {
			wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();
		}
		return wordToCapitalize;
	}
	
	public String getLowercase(String wordToLowercase) {
		return wordToLowercase.toLowerCase();
	}
}

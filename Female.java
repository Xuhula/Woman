public class Female {
	private String name;
	private String RememberMe;
	String and = "and ";
	String adjectives = "";
	public Female(String name) {
		RememberMe = name;
		this.name = name + " is ";
	}

	public String Compliment(String ... definition) {
		if (definition.length == 1){
			return name + definition[0] + ".";
		}
		else if (definition.length == 2){
			return name + definition[0] + " and " + definition[1] + ".";
		}
		else{
			for (int i = 0; i < definition.length; i++){
				if (i != definition.length - 1){
					adjectives += definition[i] += ", ";
				}
				else {
					adjectives += and += definition[i] += '.';
				}


			}}
		return name + adjectives;
	}
	public Period Blood(){
		Period period = new Period(RememberMe);
		return period;

	}
}
	


package snakecamel;

public class main{
	public static void main(String[] args){
		
		SnakeCamelUtil.snakeToCamelcase("orange_juice");
		SnakeCamelUtil.snakeToCamelcase("OrangeJuice");
		SnakeCamelUtil.capitalize("orange");
		SnakeCamelUtil.uncapitalize("Orange");
	}

}

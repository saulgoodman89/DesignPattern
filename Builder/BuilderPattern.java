public class BuilderPattern {
	public static void main(String[] args) {
		PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
		PersonInfo result = personInfoBuilder.setName("KEG"
		.setAge(33)
		.setFavoriteAnimal("Cat")
		.setFavoriteColor("Red")
		.setFavoriteNumber(10)
		.build();

		System.out.println(result.getPersonInfo());

	}

}

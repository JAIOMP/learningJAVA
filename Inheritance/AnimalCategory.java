public class AnimalCategory {
 	String category;
 	String name;

	public AnimalCategory(String category,String name){
		this.name = name;
		this.category = category;
	}

	public void giveName(){
		System.out.println("The Animal name is"+this.name);
	}

	public void giveCategory(){
		System.out.println("The Animal category is"+this.category);
	}

}
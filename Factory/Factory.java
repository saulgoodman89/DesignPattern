
public abstract class Factory {


	//template 패턴 
	public final Product create(String owner) {

		Product p = createProduct(owner);
		registerProduct(p);
		System.out.println("Factory.java / create(String owner)");
		return p;
	}

	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);


}

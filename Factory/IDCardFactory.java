import java.util.*;
public class IDCardFactory extends Factory {
	private List owners = new ArrayList();
	protected Product createProduct(String owner) {
		System.out.println("IDCardFactory.java / createProduct(String owner)");
		return new IDCard(owner);
	}

	protected void registerProduct(Product product) {
		System.out.println("IDCardFactory.java / registerProduct(Product product)");
		owners.add(((IDCard)product).getOwner());
	}

	public List getOwners() {
		System.out.println("IDCardFactory.java / getOwners()");
		return owners;
	}

}

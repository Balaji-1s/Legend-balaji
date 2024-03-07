//driver program for the customer entity class
package executer;

import corejava2.corejava2;

public class classexcuter {

	public static void main(String[] args) {
		corejava2 c1= new corejava2();
		c1.setId(727);
		c1.setCname("legend balaji");
		c1.setAddress("Green land");
        System.out.println("  customer id :"+c1.getId()+"  customer name :"+c1.getCname()+"  customer addreess :"+c1.getAddress());
	}

}

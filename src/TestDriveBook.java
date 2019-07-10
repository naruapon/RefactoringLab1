
public class TestDriveBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
	    System.out.print(b1.getDetailbook());
	    
	    b1.setBook("1", "Computer", "573568144521", "Java", 250f);
	    
	    System.out.print(b1.getDetailbook());
	}

}

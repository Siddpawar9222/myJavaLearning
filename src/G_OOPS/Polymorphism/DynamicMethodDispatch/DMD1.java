package G_OOPS.DynamicMethodDispatch;

interface Grandparent1 {
	void dance();

	void singer();
}

interface parent1 extends Grandparent1 {
	void actor();

	void producer();
}

class Children implements parent1 {

	void director() {
		System.out.println("Children Director");
	}

	@Override
	public void dance() {
		System.out.println("Children Dance");
    }

	@Override
	public void singer() {
		System.out.println("Children Singer");
	}

	@Override
	public void actor() {
		System.out.println("Children Actor");

	}

	@Override
	public void producer() {
       System.out.println("Children Producer");
  }

}

public class DMD1 {
	public static void main(String[] args) {

		 Grandparent1 c = new Children();
         c.dance();
         c.singer();
        // c.director() ;
         
       ((parent1) c ).actor(); //casting
	}
}

package second_project;

public class IncreaseDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=10;
		int z;
		
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x="+x);
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y="+y);

	}

}


public class TestCircleWithPrivateDateFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 myCircle=new Circle1(5.0);
		System.out.println("The area of the circle of radius "
				+myCircle.getArea()+" is "+myCircle.getArea());
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The erea of the circle of radius "
				+myCircle.getArea()+" is "+myCircle.getArea());
		System.out.println("The number of the objects created is "
				+Circle1.getNumberOfObjects());
	}

}

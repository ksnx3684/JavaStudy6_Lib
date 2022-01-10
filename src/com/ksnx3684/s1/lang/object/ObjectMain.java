package com.ksnx3684.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectStudy1 objectstudy1 = new ObjectStudy1();
		// 참조변수명.멤버메서드명
		objectstudy1.study1(); // 참조변수 : 객체를 가리키는 주소를 담고 있는 변수
		
		Car car = new Car();
		System.out.println("Car : " + car);
		System.out.println(car.toString());
		
		Object obj = car;
		
		FireCar fc = new FireCar();
		fc.hashCode();
		obj = fc;
		
		boolean check = car.equals(fc);
		System.out.println(check);
		

	}

}

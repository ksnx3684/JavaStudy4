package com.ksnx3684.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		c1.company = "Samsung";
		c1.brand = "galay book";
		c1.cpu = "i7";
		c1.price = 200;
		c1.point = 2;
		
		Phone p1 = new Phone();
		p1.company = "Apple";
		p1.brand = "iphone13";
		p1.pixel = 1200;
		p1.price = 100;
		p1.point = 1;
		
		Tv t1 = new Tv();
		t1.company = "LG";
		t1.brand = "signature TV";
		t1.size = 78;
		t1.price = 500;
		t1.point = 5;
		
		Client me = new Client();
		me.money = 1000;
		me.point = 0;
		me.buy(t1);

	}

}

package Kethua;


public class test {
    public static void main(String[] args) {
//		System.out.println("Kiểm tra");
//		ConNguoi cn = new ConNguoi("TITV" , 2021);
//
//		SinhVien hs = new SinhVien("TITV", 2021, "Lớp 1", "Trường 1");
//		hs.an();
//		hs.uong();
//		hs.ngu();
//		hs.lamBaiTap();
		Dog d = new Dog();
		d.eat();
		d.bark();
		System.out.println("-----------BABY DOG-----------");
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
		bd.name = "Baby Dog";
		System.out.println("-------------- Hierarchical ------------- ");
		cat c = new cat("Cat");
		c.eat();
		c.meow();
		bird b = new bird();
		b.eat();
		b.fly();
	}
}

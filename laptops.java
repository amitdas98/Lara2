
public class laptops {
	private int id;
	private String name;
	private String brand;
	private String model;
	private String cpu;
	private String ram;
	private String gpu;
	private String ssd;
	private String hdd;
	private double price;

	
	laptops (int id, String name, String brand, String model, String cpu,String ram, String gpu, String ssd, String hdd, double d) {
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.model=model;
		this.cpu=cpu;
		this.ram=ram;
		this.gpu=gpu;
		this.ssd=ssd;
		this.hdd=hdd;
		this.price=d;
	}

	public String toString() {
		return id+","+name+","+brand+","+model+","+cpu+","+ram+","+gpu+","+ssd+","+hdd+","+price+"\n";
	}
	
}

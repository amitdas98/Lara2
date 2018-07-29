import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class main {

	//variables to set user inputs into list
	String name;
	String brand;
	String model;
	String cpu;
	String ram;
	String gpu;
	String ssd;
	String hdd;
	double price;
    
	//intisialied an arraylist of objects of laptops class
	public static ArrayList<laptops> list = new ArrayList<laptops>();

	public static void  main(String[] args) throws IOException {
	    
		  laptopFileReader lr = new laptopFileReader("Laptops.csv");
		  ArrayList<laptops> list = lr.getLaptopsFromCsv();
		  
		  for(laptops laptop : list) {
			  System.out.println(laptop.toString());
		  }

	}


	public void writer() throws IOException {

        Scanner sc = new Scanner (System.in);

        FileWriter pw = new FileWriter("Test.csv");
		pw.write("ID,NAME,BRAND,MODEL,CPU,RAM,GPU,SSD,HDD,Price\n");
		int i = 0;
		int j= 0;
		while (i==0){

            System.out.print("Enter Laptop's name: ");
            name = sc.next();
            System.out.print("Enter Brand name: ");
            brand = sc.next();
            System.out.print("Enter Model: ");
            model = sc.next();
            System.out.print("Enter CPU model: ");
            cpu = sc.next();
            System.out.print("Enter RAM: ");
            ram = sc.next();
            System.out.print("Enter GPU: ");
            gpu = sc.next();
            System.out.print("Enter SSD: ");
            ssd = sc.next();
            System.out.print("Enter HDD: ");
            hdd = sc.next();
            System.out.print("Enter Price: ");
            price = sc.nextDouble();
            int size=list.size();
            list.add(new laptops(size,name,brand,model,cpu,ram,gpu,ssd,hdd,price));
            pw.write(list.get(j).toString());
            System.out.println("Enter 1 to quit or zero to continue");
            i = sc.nextInt();
            j++;
            sc.reset();
        }

		pw.close();
		return;


	}
}
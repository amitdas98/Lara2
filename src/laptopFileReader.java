import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class laptopFileReader {
	private static String filePath;
	public laptopFileReader (String filePath) {
		this.filePath = filePath;
		
	}
	
	public ArrayList<laptops> getLaptopsFromCsv() throws IOException {
				
        File file = new File("Laptops.csv");
        ArrayList<laptops> list = new ArrayList<laptops>();
        
		try (Scanner inputStream = new Scanner(file)) {
        	
            while(inputStream.hasNext()){
                //read single line, put in string
            	String[] nextRecord = inputStream.next().split(",");    
            	
            	laptops laptop = null;
            	
            	String name ;
    			String brand;
    			String model;
    			String cpu;
    			String ram;
    			String gpu;
    			String ssd;
    			String hdd;
            	
            	for (int n=0; n < 9; ++n) {
            		
            		int id = Integer.parseInt(nextRecord[0]);
        			name = nextRecord[1];
        			brand= nextRecord[2];
        			model= nextRecord[3];
        			cpu= nextRecord[4];
        			ram= nextRecord[5];
        			gpu= nextRecord[6];
        			ssd= nextRecord[7];
        			hdd= nextRecord[8];
        			double price= Double.parseDouble(nextRecord[9]);
        			
        			laptop = new laptops(id, name, brand, model, cpu, ram, gpu, ssd, hdd, price);
            	}
            	
    			
                list.add(laptop);
                
            }
            inputStream.close();
        }
		
		return list;
		
	}

}

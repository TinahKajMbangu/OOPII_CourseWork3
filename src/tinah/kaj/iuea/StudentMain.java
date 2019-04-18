package tinah.kaj.iuea;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Studentminor std1 = new Studentminor("18/896/BSCS-S","Tinah Kaj Mbangu ",1998);	
		
		System.out.println("\nStudent Name :"+std1.getName());
		
		System.out.println("Student Year Of Birth :" +std1.getYOB());		
		
		System.out.println("Student Registration Number :"  +std1.getRegNO());
		
		std1.getCourseWork();
	}

}

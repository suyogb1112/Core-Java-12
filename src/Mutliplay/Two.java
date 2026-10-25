package Mutliplay;

public class Two {

public static void main(String[] args) {
	
	One o = new One ();
	
	int totalObtainedMarks = o.math + o.science + o.english + o.biology ;
	System.out.println("totalObtainedMarks by One :" + totalObtainedMarks);
	
	
	int totalMarks =o.mathTotal + o.scienceTotal + o.englishTotal + o.biologyTotal;
	System.out.println("totalMarks by One : " + totalMarks); 
	
	
	double onepercentage = (totalObtainedMarks * 100 ) / totalMarks ; 
	System.out.println("percentage obtained by one :" + onepercentage);
	
	
}	
	

	
	
}

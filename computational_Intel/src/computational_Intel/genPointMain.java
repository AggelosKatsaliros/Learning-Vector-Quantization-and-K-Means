package computational_Intel;

import java.io.IOException;

import lvq.LVQ;

public class genPointMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        generatePoint genone=new generatePoint();
        genone.writeToFile();
        
        generatePointTwo gentwo=new generatePointTwo();
        gentwo.writeToFile();
        
       // LVQ lvq =new LVQ();
        //lvq.PointsFromFile();
	}

}

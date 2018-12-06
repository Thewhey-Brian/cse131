package matrix;

public class Gaussian {
	
	Matrix coeff;
	Matrix constants;
	
	public Gaussian(Matrix matCoeff, Matrix matConst){
		this.coeff = matCoeff;
		this.constants = matConst;
	}
	
	
	/**
	 * The hard part!
	 * @return
	 */
	public Matrix getSolution(){
//		left end
		for(int i=0; i<coeff.getNumRows()-1; ++i) {
			for(int j=i+1; j<coeff.getNumRows(); ++j) {
				// cast to 1
				double a = -coeff.getValue(j, i)/coeff.getValue(i, i);
				coeff.scaleRow(i, a);
				constants.scaleRow(i, a);
//				// change it to kill other line
//				coeff.scaleRow(i, -1*coeff.getValue(j, i));
//				constants.scaleRow(i, -1*coeff.getValue(j, i));
				// kill
				coeff.addRows(i, j);
				constants.addRows(i, j);
				// recover
				double b = 1/coeff.getValue(i, i);
				coeff.scaleRow(i, b);
				constants.scaleRow(i, b);
			}
		}
		double c = 1/coeff.getValue(coeff.getNumRows()-1, coeff.getNumRows()-1);
		coeff.scaleRow(coeff.getNumRows()-1, c);
		constants.scaleRow(coeff.getNumRows()-1, c);
		//upper right
				for(int t=coeff.getNumRows()-1; t>0; --t) {
					for(int k=t-1; k>=0; --k) {
//						coeff.scaleRow(t, -1/coeff.getValue(t, t)*coeff.getValue(k, t));
//						constants.scaleRow(t, -1/coeff.getValue(t, t)*coeff.getValue(k, t));
//						 change it to kill other line
						double d = -coeff.getValue(k, t);
						coeff.scaleRow(t, d);
						constants.scaleRow(t, d);//? "-"
						// kill
						coeff.addRows(t, k);
						constants.addRows(t, k);
						// recover		
						double e = 1/coeff.getValue(t, t);
						coeff.scaleRow(t, e);
						constants.scaleRow(t, e);
					}
				}
				return constants;
		
		
				//the old version
				
		
//		//left end
//		for(int i=0; i<coeff.getNumRows()-1; ++i) {
//			for(int j=i+1; j<coeff.getNumRows(); ++j) {
//				coeff.scaleRow(i, -1/coeff.getValue(i, i)*coeff.getValue(j, i));
//				constants.scaleRow(i, -1/coeff.getValue(i, i)*coeff.getValue(j, i));
//				coeff.addRows(i, j);
//				constants.addRows(i, j);
//			}
//				coeff.scaleRow(i, 1/coeff.getValue(i, i));
//				constants.scaleRow(i, 1/coeff.getValue(i, i));
//			
//		}
//		coeff.scaleRow(coeff.getNumRows()-1, 1/coeff.getValue(coeff.getNumRows()-1, coeff.getNumRows()-1));
//		constants.scaleRow(coeff.getNumRows()-1, 1/coeff.getValue(coeff.getNumRows()-1, coeff.getNumRows()-1));
//		//upper right
//		for(int t=coeff.getNumRows()-1; t>0; --t) {
//			for(int k=t-1; k>=0; --k) {
////				coeff.scaleRow(t, -1/coeff.getValue(t, t)*coeff.getValue(k, t));
////				constants.scaleRow(t, -1/coeff.getValue(t, t)*coeff.getValue(k, t));
//				coeff.scaleRow(t, -1*coeff.getValue(k, t));
//				constants.scaleRow(t, -1*coeff.getValue(k, t));
//				coeff.addRows(t, k);
//				coeff.addRows(t, k);
//			}
//		}
//		return constants;
//		
	}
	
	public String toString(){
		String string ="";
		for(int i=0; i<this.coeff.getNumRows(); i++){
			string+="\n";
			for(int j=0; j<this.coeff.getNumCols()+1; j++){
				if(j==this.coeff.getNumCols()){
					string+= this.constants.getValue(i,0)+ "  ";
				}else{
					string+= this.coeff.getValue(i,j) + "  ";
				}
			}
		}
		System.out.println(string);

		return string;
	}

}

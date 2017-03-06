package pl.lodz.uni.math.java;

public class TeachingConstructor extends BaseConstructor implements GlobalConstructor
{
	OtherConstructor other;
	
	public TeachingConstructor( int x ){
		System.out.println("Block A");
	};
	public TeachingConstructor(){
		System.out.println("Block B");
		other = new OtherConstructor();
	};
	
	
	
	{ // blok inicjalizacji
		System.out.println("Block C");
	}
	
	static { // wykona sie pierwszy bo jest static
		System.out.println("Block D");
	}
	
	public void coolFunction() {

	}
}

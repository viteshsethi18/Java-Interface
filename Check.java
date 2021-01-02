interface Calculate{
	int division();
	int modulus();
}
public class Check implements Calculate {
	int di,mo,x,y;
	Check(int a, int b){
		x=a;
		y=b;
	}
	public int division(){
		di=x/y;
		return di;
	}
	public int modulus(){
		mo = x%y;
		return mo;
	}

}

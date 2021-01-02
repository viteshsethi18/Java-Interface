interface Area{
	static final double c=3.14;
	float calculation(float a, float b);	
}
public class Rectaangle implements Area {
	public float calculation(float a, float b){
		return (a*b);
	}

}


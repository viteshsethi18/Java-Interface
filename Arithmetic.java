interface Test{
	int square();
}
public class Arithmetic implements Test {
int a;
Arithmetic (int b){
	a=b;
}
public int square(){
	return (a*a);
}
}

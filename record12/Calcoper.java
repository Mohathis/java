package mathutils;

public class Calcoper{

	public int add(int a, int b){
	return a+b;
}

public int sub(int a, int b){
	return a-b;
}

public int mul(int a, int b){
	return a*b;
}

public double div(int a, int b){
	if (b==0){
	System.out.println("Division by zero is not allowed");
	return 0;
	}
	return (double) a/b;
}


}

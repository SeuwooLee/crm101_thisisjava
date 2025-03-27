package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}


//소수점 자리는 부정확하기때문에 확실히 계산하려면 정수로 만들어서 하도록~
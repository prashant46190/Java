package lambdaExpresssion;

public class RunnerObjectCreationOfInterface {
public static void main(String[] args) {
	lam lam=new lam()
			{
		@Override
		public void m1()
		{
			System.out.println("Implemenetation is done");
		}
			};
			lam.m1();
}
}

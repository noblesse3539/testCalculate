import java.util.Scanner;


public class Application {

	private Calculate _calculate;
	
	public void evalExpression(){
		int finalValue;
		System.out.println("[Infix�� Postfix��]");
		if ( this._calculate.infixToPostfix()) {
			System.out.println("[Postfix] " + this._calculate.postfix());
			finalValue = this._calculate.evalPostfix();
			System.out.println("[������] "+ finalValue );
		}
		else
			System.out.println("[����] �Էµ� ���Ŀ� ������ �ֽ��ϴ�.");
	}
	
	public void run (){
		Scanner scan = new Scanner(System.in);
		String input;
		
		this._calculate = new Calculate();
		
		System.out.print("> ������ �Է��Ͻÿ�: ");
		while(scan.hasNext()) {
			input = scan.nextLine();
			this._calculate.setInfix(input);
			this.evalExpression();
			System.out.print("> ������ �Է��Ͻÿ�: ");
		}
	}
	
}

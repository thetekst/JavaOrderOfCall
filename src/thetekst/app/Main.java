package thetekst.app;

public class Main extends Parent {
	static {
		System.out.println("[class]: static fields");
	}

	{
		System.out.println("[class]: fields");
	}

	public Main() {
		System.out.println("[class]: constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		new Main();
	}


	/* output:

	[super class]: static fields
	[class]: static fields
	main
	[super class]: fields
	[super class]: constructor
	[class]: fields
	[class]: constructor*/
}

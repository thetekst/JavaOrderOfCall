package thetekst.app;

public class Parent {
	static {
		System.out.println("[super class]: static fields");
	}

	{
		System.out.println("[super class]: fields");
	}

	public Parent() {
		System.out.println("[super class]: constructor");
	}
}

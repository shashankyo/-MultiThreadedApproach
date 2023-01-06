package multiThreadedApproach;

public class ProgramApp {
public static void main(String[] args) {
	Program1 p1 = new Program1();
	Program2 p2 = new Program2();
	Program3 p3 = new Program3();
	p1.start();
	p2.start();
	p3.start();
}
}

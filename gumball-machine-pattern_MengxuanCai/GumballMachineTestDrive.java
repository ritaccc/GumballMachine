

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		gumballMachine.insertNickel();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		gumballMachine.insertNickel();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}

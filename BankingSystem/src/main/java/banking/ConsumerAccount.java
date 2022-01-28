package banking;

public class ConsumerAccount extends Account {
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		//AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit
		super(new AccountHolder(person.getIdNumber()), accountNumber, pin, currentBalance);

	}
}

package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts = new LinkedHashMap<>();
	private  Long createAccountNumber = 0l; // I created this variable

	public Bank() {
		// complete the function	???
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		// AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit
		CommercialAccount commercialAccount = new CommercialAccount(company, createAccountNumber, pin, startingDeposit);
		accounts.put(++createAccountNumber, commercialAccount);
        return createAccountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function

		ConsumerAccount consumerAccount = new ConsumerAccount(person, createAccountNumber, pin, startingDeposit);
		accounts.put(++createAccountNumber, consumerAccount);
        return createAccountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) throws Exception {
		if (!accounts.get(accountNumber).validatePin(pin)) throw new Exception("Account validation failed.");
        return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return accounts.get(accountNumber).debitAccount(amount);
	}
}

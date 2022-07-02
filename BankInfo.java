package Bank;

public class BankInfo {
	
	public static void main(String [] args)
	{
	BankInfo bank = new BankInfo();
	long deposit = bank.deposit();
	System.out.println("deposit is" + deposit);
	long fixed = bank.fixed();
	System.out.println("fixed account number is" + fixed);
	long saving = bank.saving();
	System.out.println("savings account number is" + saving);
	}

	public long saving()
	{
	long savingaccno = 23456789L;
	return savingaccno;
	}

	public long fixed()
	{
	long fixedaccno = 6790028202L;
	return fixedaccno;
	}

	public long deposit()
	{
	long depositamount = 2348890L;
	return depositamount;
	}
	}



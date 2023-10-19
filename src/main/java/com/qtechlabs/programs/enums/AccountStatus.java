package com.qtechlabs.programs.enums;

import java.util.Arrays;
import java.util.Optional;

public enum AccountStatus {
	
	PURGED("PUR", "purged", -1),
	INACTIVE("INA", "inactive", 0), 
	ACTIVE("ACT", "active", 1);

	private final String shortName;
	private final String fullName;
	private final int code;

	AccountStatus(String shortName, String fullName, int code) {
		this.shortName = shortName;
		this.fullName = fullName;
		this.code = code;
		System.out.println("Constructor Called");
	}

	public String getShortName() {
		return shortName;
	}

	public String getFullName() {
		return fullName;
	}

	public int getCode() {
		return code;
	}

	public static Optional<AccountStatus> getAccountStatusByValue(String value) {
		return Arrays.stream(AccountStatus.values())
				.filter(accStatus -> accStatus.shortName.equals(value) || accStatus.fullName.equals(value)).findFirst();
	}

	public static Optional<AccountStatus> getAccountStatusByValue(int value) {
		return Arrays.stream(AccountStatus.values()).filter(accStatus -> accStatus.code == value).findFirst();
	}
	

	public static void main(String[] args) {
		System.out.println("Enum Rocks !!!");
		AccountStatus[] values = AccountStatus.values();
		for (AccountStatus accountStatus : values) {
			System.out.print(accountStatus.ordinal() + " --> ");
			System.out.println("Status " + accountStatus.getCode() + " is : " + accountStatus.getFullName());
		}

		Optional<AccountStatus> statusEnum = AccountStatus.getAccountStatusByValue(0);

		if (statusEnum.isPresent()) {
			System.out.println("Account Status Full Name: " + statusEnum.get().getFullName());
			System.out.println("Account Status Short name: " + statusEnum.get().getShortName());
		}

		Optional<AccountStatus> activeStatusEnum = AccountStatus.getAccountStatusByValue("INA");

		if (statusEnum.isPresent()) {
			System.out.println("Account Status Full Name : " + activeStatusEnum.get().getFullName());
			System.out.println("Account Status Code : " + activeStatusEnum.get().getCode());
		}
	}

}

class Main {

	public enum AccountType {
		SAVING_ACCOUNT,
		CURRENT_ACCOUNT,
		DEMAT_ACCOUNT;

	}

}
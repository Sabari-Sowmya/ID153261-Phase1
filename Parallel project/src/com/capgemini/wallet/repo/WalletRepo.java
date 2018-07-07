package com.capgemini.wallet.repo;

import com.capgemini.wallwt.beans.Customer;

public interface WalletRepo {
	public boolean save(Customer customer);
	public Customer findOne(String mobileNo);
}

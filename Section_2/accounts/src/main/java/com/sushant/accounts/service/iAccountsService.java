package com.sushant.accounts.service;

import com.sushant.accounts.dto.CustomerDto;

public interface iAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}

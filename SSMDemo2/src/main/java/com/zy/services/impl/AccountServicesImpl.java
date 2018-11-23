package com.zy.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.dao.AccountDao;
import com.zy.entity.Account;
import com.zy.services.AccountServices;
@Service("aservices")
public class AccountServicesImpl implements AccountServices {

	@Resource(name="accountDao")
	private AccountDao adao;
	
	public List<Account> selectAccount() {
		return adao.selectAccount();
	}

	public Account selectAccountById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertAccount(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateAccount(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

}

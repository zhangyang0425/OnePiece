package com.zy.services;

import java.util.List;

import com.zy.entity.Account;

public interface AccountServices {

	/**
	 * 查询所有
	 * @return
	 */
	public List<Account> selectAccount();
	/**
	 * 查询单个
	 * @return
	 */
	public Account selectAccountById(Integer id);
	/**
	 * 添加单个
	 * @param account
	 * @return
	 */
	public int insertAccount(Account account);
	/**
	 * 修改单个
	 * @param account
	 * @return
	 */
	public int updateAccount(Account account);
	/**
	 * 删除单个
	 * @param id
	 * @return
	 */
	public int deleteAccount(Integer id);
}

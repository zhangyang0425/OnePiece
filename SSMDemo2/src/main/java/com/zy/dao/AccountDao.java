package com.zy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zy.entity.Account;
@Mapper
public interface AccountDao {

	/**
	 * 查询所有
	 * @return
	 */
	@Select("select * from account ")
	public List<Account> selectAccount();
	/**
	 * 查询单个
	 * @return
	 */
	@Select("select * from account where id=#{id}")
	public Account selectAccountById(Integer id);
	/**
	 * 添加单个
	 * @param account
	 * @return
	 */
	@Insert("insert into account(name,money) values(#{name},#{money})")
	public int insertAccount(Account account);
	/**
	 * 修改单个
	 * @param account
	 * @return
	 */
	@Update("update account set name=#{name},money=#{money} where id=#{id}")
	public int updateAccount(Account account);
	/**
	 * 删除单个
	 * @param id
	 * @return
	 */
	@Delete("delete from account where id=#{id}")
	public int deleteAccount(Integer id);
}

package com.Lien.mapper;

public interface UserMapper {
	/**
	 * 	添加用户
	 * @throws Exception
	 */
	public void inserUser() throws Exception;
	/**
	 * 	根据用户id来删除用户
	 * @param id
	 * @throws Exception
	 */
	public  void deleteUser(Integer id) throws Exception;
	/**
	 * 	根据用户姓名查找用户
	 * @param name
	 * @throws Exception
	 */
	public void selectUserByName(String name) throws Exception;
}

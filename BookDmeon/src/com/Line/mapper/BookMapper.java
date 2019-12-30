package com.Line.mapper;

import java.util.List;


import com.Line.entity.Book;



public interface BookMapper {
	/**
	 * 	查询书籍
	 * @return
	 * @throws Exception
	 */
   public List<Book> selectAllBook() throws Exception;
   
   /**
    * 	根据名字查询(模糊查询)
    * @param BookName
    * @return
    * @throws Exception
    */
   public List<Book> selectBookByName(String BookName) throws Exception;
   /**
    * 	添加书籍
    * @param book
    * @return
    * @throws Exception
    */
   public int insertBook(Book book) throws Exception;
   /**
    * 
    * @param book
    * @param id
    * @return
    * @throws Exception
    */
   public int updateBook(Book book,int id) throws Exception;
   /**
    * 	删除书籍
    * @param id
    * @return
    * @throws Exception
    */
   public int deleteBook(int id) throws Exception;
}

package com.Line.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.Line.entity.Book;
import com.Line.mapper.BookMapper;
import com.Line.tools.DBTools;
/**
 * 	测试文件
 * @author Administrator
 *
 */
public class BookService {
	@Test
	public void selectBooksByName() {
		System.out.print("请输入您要查找的书名：");
		Scanner sc = new Scanner(System.in);
		String condition = sc.next();
		selectBookByName(condition);
	}
	@Test
	public void selectAllBooks() {
		selectAllBook();
	}
	@Test
	public void insertBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您要插入的书籍名字：");
		String bookname = sc.next();
		System.out.print("\n"+"请输入您要插入书籍的价钱：");
		Double bookprice =sc.nextDouble();
		System.out.print("\n"+"请输入您要插入书籍的图片：");
		String bookimgs = sc.next();
		insertBook(bookname,bookprice,bookimgs);
	}
	 /**
     * 	根据用户名模糊查询
     */
    private static void selectBookByName(String BookNames){	
        SqlSession session=DBTools.getSession();
        BookMapper mapper=session.getMapper(BookMapper.class);
        try {
        	List<Book> user = mapper.selectBookByName(BookNames);
        	//判断数据库返回的值是否为空
        	if(user.size()>0) {
        		//返回值不为空继续下部操作
        		for (Book book : user) {
            		System.out.println("书名："+book.getBookName()+"\0");
    				System.out.println("价格："+book.getBookPrice()+"\0");
    				System.out.println("图片："+book.getBookImg()+"\0");
    				System.out.println();
    			}
        	}else {
        		//提示用户没有书籍
        		System.out.println("没有该书籍！！");
        	}
        	
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally {
        	session.close();
        }
       
    }
    /**
     * 	查询所有的图书信息
     */
    public static void selectAllBook() {
    	SqlSession session = DBTools.getSession();
    	BookMapper mapper = session.getMapper(BookMapper.class);
    	try {
    		List<Book> book = mapper.selectAllBook();
    		for (Book book2 : book) {
				System.out.println("书名："+book2.getBookName()+"\0");
				System.out.println("价格："+book2.getBookPrice()+"\0");
				System.out.println("图片："+book2.getBookImg()+"\0");
				System.out.println();
			}
    		session.commit();
    	}catch(Exception e){
    		e.printStackTrace();
    		session.rollback();
    	}finally {
			session.close();
		}
    }
    public static void insertBook(String BookName,Double BookPrice,String BookImg) {
    	SqlSession session  = DBTools.getSession();
    	BookMapper mapper = session.getMapper(BookMapper.class);
    	Book book = new Book();
    	book.setBookName(BookName);
    	book.setBookPrice(BookPrice);
    	book.setBookImg(BookImg);
    	try {
    		int s =mapper.insertBook(book);
    		if(s>0) {
    			System.out.println("插入成功！");
    		}else {
    			System.out.println("插入失败！");
    		}
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
    }
}

package org.bookmate.test;

import java.util.ArrayList;
import java.util.Random;

import org.bookmate.entities.Book;
import org.bookmate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 图书相关单元测试类
 * @author yangyuhao
 */
public class BookTest {
	
	private ApplicationContext applicationContext = null;
	private BookService bookService = null;
	
	{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		bookService = applicationContext.getBean(BookService.class);
	}
	
	/**
	 * 测试通过图书id获取图书信息
	 */
	@Test
	public void testGetBookById() {
		Integer id = 3;
		Book book = bookService.getBookById(id);
		Integer bookId = book.getBookId();
		Integer bookNumber = book.getBookNumber();
		String bookName = book.getBookName();
		String bookAuthor = book.getBookAuthor();
		String bookPress = book.getBookPress();
		String bookImageBig = book.getBookImageBig();
		String bookImageSmall = book.getBookImageSmall();
		String bookClassifyOne = book.getBookClassifyOne();
		String bookClassifyTwo = book.getBookClassifyTwo();
		String bookDesc = book.getBookDesc();
		
		System.out.println("bookId: " + bookId);
		System.out.println("bookNumber: " + bookNumber);
		System.out.println("bookName: " + bookName);
		System.out.println("bookAuthor: " + bookAuthor);
		System.out.println("bookPress: " + bookPress);
		System.out.println("bookImageBig: " + bookImageBig);
		System.out.println("bookImageSmall: " + bookImageSmall);
		System.out.println("bookClassifyOne: " + bookClassifyOne);
		System.out.println("bookClassifyTwo: " + bookClassifyTwo);
		System.out.println("bookDesc: " + bookDesc);
	}
	
	/**
	 * 测试新增图书
	 */
	@Test
	public void testAddBook() {
		Integer bookNumber = 123456;
		String bookName = "图书名";
		String bookAuthor = "作者名";
		String bookPress = "出版社";
		String bookImageBig = "testImageBig";
		String bookImageSmall = "testImageSmall";
		String bookClassifyOne = "一级分类";
		String bookClassifyTwo = "二级分类";
		String bookDesc = "";
		bookService.addBook(bookNumber, bookName, bookAuthor, bookPress, 
				bookImageBig, bookImageSmall, bookClassifyOne, bookClassifyTwo, bookDesc);
	}
	
	@Test
	public void testAddBook2() {
		Integer bookNumber = 123456;
		String bookName = "图书名";
		String bookAuthor = "作者名";
		String bookPress = "出版社";
		String bookImageBig = "testImageBig";
		String bookImageSmall = "testImageSmall";
		String bookClassifyOne = "一级分类";
		String bookClassifyTwo = "二级分类";
		String bookDesc = "";
		Double bookGrade = 1.5;
		bookService.addBook2(bookNumber, bookName, bookAuthor, bookPress, bookImageBig, bookImageSmall, 
				bookClassifyOne, bookClassifyTwo, bookDesc, bookGrade);
	}
	
	/**
	 * 测试获取全部图书一级分类
	 */
	@Test
	public void testGetAllClassifyOne() {
		ArrayList<String> list = (ArrayList<String>) bookService.getAllClassifyOne();
		System.out.println(list.size());
		System.out.println(list.get(0));
	}
	
	/**
	 * 测试根据图书一级分类获取对应图书列表
	 */
	@Test
	public void testGetBookByClassifyOne() {
		ArrayList<Book> list = (ArrayList<Book>) bookService.getBookByClassifyOne("文学");
		System.out.println(list.size());
		System.out.println(list.get(0).getBookName());
	}
	
	/**
	 * 为图书插入评分
	 */
	@Test
	public void insertBookAddGrade() {
		bookService.addBookAddGrade();
	}
	
	/**
	 * 测试根据图书名模糊查询图书信息
	 */
	@Test
	public void testGetBookByNameLike() {
		String search = "物理";
		ArrayList<Book> list = (ArrayList<Book>) bookService.getBookByNameLike(search);
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).getBookName());
		}
	}
	
	/**
	 * 将图书二级分类信息插入到二级分类表中
	 */
	@Test
	public void insertBookClassifyTwo() {
		bookService.insertBookClassifyTwo();
	}
	
	/**
	 * 测试获取热门图书
	 */
	@Test
	public void testGetHotBook() {
		System.out.println(bookService.getHotBook().size());
	}
	
	/**
	 * 测试获取推荐图书
	 */
	@Test
	public void testGetRecommendBook() {
		System.out.println(bookService.getRecommendBook(1).size());
	}
	
	/**
	 * 测试获取最新图书
	 */
	@Test
	public void testGetNewBook() {
		System.out.println(bookService.getNewBook().size());
	}
	
	/**
	 * 测试获取图书的推荐图书
	 */
	@Test
	public void testGetBookRecommendBook() {
		System.out.println(bookService.getBookRecommendBook(1).size());
	}
	
}

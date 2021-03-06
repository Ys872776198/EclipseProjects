package org.bookmate.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.Literal;
import org.bookmate.entities.Book;

/**
 * 图书相关业务逻辑接口层
 * @author yangyuhao
 */
public interface BookService {
	
	/**
	 * 通过图书id获取图书信息
	 * @param id
	 * @return
	 */
	public Book getBookById(Integer id);
	
	/**
	 * 添加一本新书
	 * @param bookNumber 图书编号
	 * @param bookName 图书名
	 * @param bookAuthor 图书作者
	 * @param bookPress 图书出版社
	 * @param bookImageBig 图书封皮图
	 * @param bookImageSmall 图书封皮缩略图
	 * @param bookClassifyOne 图书一级分类
	 * @param bookClassifyTwo 图书二级分类
	 * @param bookDesc 图书内容概述
	 */
	public void addBook(Integer bookNumber, String bookName, String bookAuthor, 
			String bookPress, String bookImageBig, String bookImageSmall, 
			String bookClassifyOne, String bookClassifyTwo, String bookDesc);
	
	public void addBook2(Integer bookNumber, String bookName, String bookAuthor, 
			String bookPress, String bookImageBig, String bookImageSmall, 
			String bookClassifyOne, String bookClassifyTwo, String bookDesc, 
			Double bookGrade);
	
	/**
	 * 获取全部图书分类
	 * @return list 分类集合
	 */
	public List<String> getAllClassifyOne();
	
	/**
	 * 根据一级分类获取图书列表
	 * @param classifyOne 一级分类
	 * @return list 图书列表集合
	 */
	public List<Book> getBookByClassifyOne(String classifyOne);
	
	/**
	 * 批量添加图书评分
	 */
	public void addBookAddGrade();
	
	/**
	 * 根据图书名模糊获取查询图书
	 * @param bookName 图书名
	 * @return list 图书实体类集合
	 */
	public List<Book> getBookByNameLike(String bookName);
	
	/**
	 * 获取全部图书信息
	 * @return list 图书实体类集合
	 */
	public List<Book> getAllBook();
	
	/**
	 * 添加所有二级分类信息到二级分类表
	 */
	public void insertBookClassifyTwo();
	
	/**
	 * 更新图书信息
	 * @param bookId
	 * @param bookNumber
	 * @param bookName
	 * @param bookAuthor
	 * @param bookPress
	 * @param bookImageBig
	 * @param bookImageSmall
	 * @param bookClassifyOne
	 * @param bookClassifyTwo
	 * @param bookDesc
	 * @param bookAddress
	 * @param bookSum
	 * @param bookResidue
	 * @param bookGrade
	 */
	public void updateBook(Integer bookId, Integer bookNumber, String bookName, String bookAuthor, 
			String bookPress, String bookImageBig, String bookImageSmall, 
			String bookClassifyOne, String bookClassifyTwo, String bookDesc);
	
	/**
	 * 移除一本书
	 * @param bookId
	 */
	public boolean deleteBook(Integer id);
	
	/**
	 * 获取热门图书
	 * @return
	 */
	public List<Book> getHotBook();
	
	/**
	 * 获取为用户推荐图书
	 * @return
	 */
	public List<Book> getRecommendBook(Integer userId);
	
	/**
	 * 获取最新图书
	 * @return
	 */
	public List<Book> getNewBook();
	
	/**
	 * 获取为图书推荐的图书
	 * @param bookId
	 * @return
	 */
	public List<Book> getBookRecommendBook(Integer bookId);
	
	
}

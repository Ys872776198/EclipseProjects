package org.bookmate.handler.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bookmate.entities.Book;
import org.bookmate.entities.Borrow;
import org.bookmate.service.BookService;
import org.bookmate.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 信息流推送接口
 * @author ys
 *
 */
@Controller
public class MainHandler {
	
	@Autowired
	private BorrowService borrowService;
	
	@Autowired
	private BookService bookService;
	
	/**
	 * 获取热门图书接口
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="api-index-getHotBook")
	public Set<Book> getHotBook() {
		ArrayList<Book> bookList = (ArrayList<Book>) bookService.getHotBook();
		HashSet<Book> bookSet = new HashSet<>();
		bookSet.addAll(bookList);
		return bookSet;
	}
	
	/**
	 * 获取热门图书接口
	 * @param userId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="api-index-getRecommendBook/{userId}")
	public Set<Book> getRecommendBook(@PathVariable("userId") Integer userId) {
		ArrayList<Book> bookList = (ArrayList<Book>) bookService.getRecommendBook(userId);
		HashSet<Book> bookSet = new HashSet<>();
		bookSet.addAll(bookList);
		return bookSet;
	}
	
	/**
	 * 获取最新图书接口
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="api-index-getNewBook")
	public Set<Book> getNewBook() {
		ArrayList<Book> bookList = (ArrayList<Book>) bookService.getNewBook();
		HashSet<Book> bookSet = new HashSet<>();
		bookSet.addAll(bookList);
		return bookSet;
	}
}

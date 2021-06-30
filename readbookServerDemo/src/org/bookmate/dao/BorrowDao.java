package org.bookmate.dao;

import java.util.List;

import org.bookmate.entities.Book;
import org.bookmate.entities.Borrow;

/**
 * 借阅相关数据访问接口层
 * @author yangyuhao
 */
public interface BorrowDao {
	
	public static final String BORROW_NAMESPACE = "org.bookmate.mapper.BorrowMapper.";
	
	/**
	 * 插入一条新借阅记录
	 * @param borrow 借阅图书实体类
	 */
	public void insertBorrow(Borrow borrow);
	
	/**
	 * 通过用户id,图书id,状态查找借阅记录
	 * @param userId
	 * @param bookId
	 * @return
	 */
	public List<Borrow> selectBorrowByUserAndBook(Integer userId, Integer bookId);
	
	/**
	 * 通过用户id,图书id,状态删除借阅记录
	 * @param userId
	 * @param bookId
	 */
	public void deleteBorrowByUserAndBook(Integer userId, Integer bookId);
	
	/**
	 * 通过用户id,状态查找借阅记录
	 * @param userId
	 * @param status
	 * @return
	 */
	public List<Borrow> selectBorrowByUser(Integer userId);
	
	/**
	 * 通过id获取借阅信息
	 * @param id
	 * @return
	 */
	public Borrow selectBorrowById(Integer id);
	
	/**
	 * 更新借阅信息
	 */
	public void updateBorrow(Borrow borrow);
	
	/**
	 * 查找所有借阅
	 * @return
	 */
	public List<Borrow> selectAllBorrow(); 
	
	/**
	 * 通过id删除借阅信息
	 * @param id
	 */
	public void deleteBorrowById(Integer id);
	
}

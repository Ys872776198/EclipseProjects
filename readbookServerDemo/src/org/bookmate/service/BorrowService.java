package org.bookmate.service;

import java.util.List;

import org.bookmate.entities.Borrow;

/**
 * 借书相关业务逻辑接口层
 * @author yangyuhao
 */
public interface BorrowService {
	
	/**
	 * 借阅图书
	 * @param bookId 图书id
	 * @param userId 用户id
	 * @return -1失败 / 插入记录的主键
	 */
	public boolean addBorrow(Integer bookId, Integer userId);
	
	/**
	 * 通过用户id,图书id,状态获取借阅信息
	 * @param bookId
	 * @param userId
	 * @return borrow
	 */
	public List<Borrow> getBorrowByUserAndBook(Integer bookId, Integer userId);
	
	/**
	 * 通过用户id,图书id,状态删除借阅信息
	 * @param bookId
	 * @param userId
	 * @return
	 */
	public void removeBorrowByUserAndBook(Integer bookId, Integer userId);
	
	/**
	 * 通过id获取借阅信息
	 * @param id
	 * @return
	 */
	public Borrow getBorrowById(Integer id);
	/**
	 * 添加虚拟借阅记录,用于充当算法结果集
	 */
	public void addShamBorrowData();
	
	public List<Borrow> getAllBorrow();
	
}

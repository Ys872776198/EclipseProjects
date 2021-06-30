package org.bookmate.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bookmate.dao.BorrowDao;
import org.bookmate.entities.Borrow;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * 借阅数据访问实现类
 * @author ys
 */
@Repository
public class BorrowDaoImpl extends SqlSessionDaoSupport implements BorrowDao {

	@Override
	public void insertBorrow(Borrow borrow) {
		this.getSqlSession().insert(BORROW_NAMESPACE + "insertBorrow", borrow);
	}
	
	@SuppressWarnings("unchecked")
	public List<Borrow> selectBorrowByUserAndBook(Integer userId, Integer bookId) {
		Map<String, Integer> queryMap = new HashMap<>();
		queryMap.put("userId", userId);
		queryMap.put("bookId", bookId);
		ArrayList<Borrow> borrows = (ArrayList<Borrow>) this.getSqlSession()
				.selectList(BORROW_NAMESPACE + "selectBorrowByUserAndBookAndStatus", queryMap);
		return borrows;
	}

	@Override
	public void deleteBorrowByUserAndBook(Integer userId, Integer bookId) {
		Map<String, Integer> queryMap = new HashMap<>();
		queryMap.put("userId", userId);
		queryMap.put("bookId", bookId);
		this.getSqlSession().delete(BORROW_NAMESPACE + "deleteBorrowByUserAndBookAndStatus", queryMap);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Borrow> selectBorrowByUser(Integer userId) {
		Map<String, Integer> queryMap = new HashMap<>();
		queryMap.put("userId", userId);
		return this.getSqlSession().selectList(BORROW_NAMESPACE + "selectBorrowByUserAndStatus", queryMap);
	}

	@Override
	public Borrow selectBorrowById(Integer id) {
		return (Borrow) this.getSqlSession().selectOne(BORROW_NAMESPACE + "selectBorrowById", id);
	}

	@Override
	public void updateBorrow(Borrow borrow) {
		this.getSqlSession().update(BORROW_NAMESPACE + "updateBorrow", borrow);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Borrow> selectAllBorrow() {
		return this.getSqlSession().selectList(BORROW_NAMESPACE + "selectAllBorrow");
	}

	@Override
	public void deleteBorrowById(Integer id) {
		this.getSqlSession().delete(BORROW_NAMESPACE + "deleteBorrowById", id);
	}
	
}

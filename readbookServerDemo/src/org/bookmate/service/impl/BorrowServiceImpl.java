package org.bookmate.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.bookmate.dao.BookDao;
import org.bookmate.dao.BorrowDao;
import org.bookmate.dao.UserDao;
import org.bookmate.entities.Book;
import org.bookmate.entities.BookClassifyTwo;
import org.bookmate.entities.Borrow;
import org.bookmate.entities.BorrowRecord;
import org.bookmate.entities.User;
import org.bookmate.service.BookService;
import org.bookmate.service.BorrowService;
import org.bookmate.service.RecordService;
import org.bookmate.util.QRCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * 借书相关业务逻辑实现类
 * @author ys
 */
@Service
public class BorrowServiceImpl implements BorrowService {

	@Autowired
	private BorrowDao borrowDao;
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private RecordService recordService;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean addBorrow(Integer bookId, Integer userId) {
		
		//保存借阅记录
		Borrow borrow = new Borrow();
		borrow.setBorrowBookId(bookId);
		borrow.setBorrowUserId(userId);
		borrowDao.insertBorrow(borrow);
		
		//记录借阅类别数据
		recordService.recordBorrow(userId, bookId);
        		
		return true;
	}

	@Override
	public List<Borrow> getBorrowByUserAndBook(Integer bookId, Integer userId) {
		return borrowDao.selectBorrowByUserAndBook(userId, bookId);
	}

	@Override
	public void removeBorrowByUserAndBook(Integer bookId, Integer userId) {
		borrowDao.deleteBorrowByUserAndBook(userId, bookId);
	}

	@Override
	public Borrow getBorrowById(Integer id) {
		return borrowDao.selectBorrowById(id);
	}

	@Override
	public void addShamBorrowData() {
		
		ArrayList<User> userList = (ArrayList<User>) userDao.selectAllUser();
		
		//遍历每一个用户
		for (int i= 0; i < userList.size(); ++i) {
			Integer userId = userList.get(i).getUserId();
			//获取当前用户的借阅记录统计
			ArrayList<BorrowRecord> borrowRecordList = 
					(ArrayList<BorrowRecord>) recordService.getBorrowRecordByUserId(userId);
			//遍历当前用户所有的借阅类别
			for (int j = 0; j < borrowRecordList.size(); ++j) {
				//当前借阅类别的类别id
				Integer borrowClassifyTwoId = borrowRecordList.get(j).getBorrowRecordClassifyId();
				String borrowClassifyTwoName = 
						bookDao.selectClassifyTwoById(borrowClassifyTwoId).getBookClassifyOneName();
				//获取当前类别的所有图书
				ArrayList<Book> bookList = (ArrayList<Book>) 
						bookDao.selectBookByClassifyTwoName(borrowClassifyTwoName);
			}
		}
		
	}

	@Override
	public List<Borrow> getAllBorrow() {
		return borrowDao.selectAllBorrow();
	}
}

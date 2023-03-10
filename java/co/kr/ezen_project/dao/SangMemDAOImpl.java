package co.kr.ezen_project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.ezen_project.vo.CouponVO;
import co.kr.ezen_project.vo.ReviewVO;
import co.kr.ezen_project.vo.PaymentVO;
import co.kr.ezen_project.vo.SangMemVO;

@Repository
public class SangMemDAOImpl implements SangMemDAO {

	@Autowired
	SqlSession session;
	
	@Override
	public List<SangMemVO> getSangMemAll() {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getSangMemAll");
	}

	@Override
	public SangMemVO getSangMem(int orderNum) {
		return session.selectOne("co.kr.ezen_project.dao.SangMemDAO.getSangMem", orderNum);
	}

	@Override
	public int addSangMemPay(SangMemVO vo) {
		return session.insert("co.kr.ezen_project.dao.SangMemDAO.addSangMemPay", vo);
	}
	
	@Override
	public int addSangMemCart(SangMemVO vo) {
		return session.insert("co.kr.ezen_project.dao.SangMemDAO.addSangMemCart", vo);
	}

	@Override
	public int delSangMem(SangMemVO vo) {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delSangMem", vo);
	}
	
	@Override
	public int delSangMemAll() {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delSangMemAll");
	}
	
	@Override
	public int updSangMem(SangMemVO vo) {
		return session.update("co.kr.ezen_project.dao.SangMemDAO.updSangMem", vo);
	}
	
	@Override
	public List<CouponVO> getCouponAll() {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getCouponAll");
	}

	@Override
	public CouponVO getCoupon(int coupNum) {
		return session.selectOne("co.kr.ezen_project.dao.SangMemDAO.getCoupon", coupNum);
	}
	
	@Override
	public List<CouponVO> getCoupMemId(String memId) {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getCoupMemId", memId);
	}
	
	@Override
	public List<CouponVO> getCoupWorkCond(int workCond) {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getCoupWorkCond", workCond);
	}

	@Override
	public int addCoupon(CouponVO vo) {
		return session.insert("co.kr.ezen_project.dao.SangMemDAO.addCoupon", vo);
	}

	@Override
	public int delCoupon(CouponVO vo) {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delCoupon", vo);
	}
	
	@Override
	public int delCouponAll() {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delCouponAll");
	}
	
	@Override
	public int updCoupon(CouponVO vo) {
		return session.update("co.kr.ezen_project.dao.SangMemDAO.updCoupon", vo);
	}
	
	@Override
	public List<ReviewVO> getReviewAll() {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getReviewAll");
	}

	@Override
	public ReviewVO getReviewON(int orderNum) {
		return session.selectOne("co.kr.ezen_project.dao.SangMemDAO.getReviewON", orderNum);
	}
	
	@Override
	public List<ReviewVO> getReviewSC(String sangCode) {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getReviewSC", sangCode);
	}
	
	@Override
	public List<ReviewVO> getReviewMI(String memId) {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getReviewMI", memId);
	}

	@Override
	public int addReview(ReviewVO vo) {
		return session.insert("co.kr.ezen_project.dao.SangMemDAO.addReview", vo);
	}

	@Override
	public int delReview(ReviewVO vo) {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delReview", vo);
	}
	
	@Override
	public int delReviewAll() {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delReviewAll");
	}
	
	@Override
	public int updReview(ReviewVO vo) {
		return session.update("co.kr.ezen_project.dao.SangMemDAO.updReview", vo);
	}
	
	@Override
	public List<PaymentVO> getPaymentAll() {
		return session.selectList("co.kr.ezen_project.dao.SangMemDAO.getPaymentAll");
	}

	@Override
	public PaymentVO getPayment(int payNum) {
		return session.selectOne("co.kr.ezen_project.dao.SangMemDAO.getPayment", payNum);
	}

	@Override
	public int addPayment(PaymentVO vo) {
		return session.insert("co.kr.ezen_project.dao.SangMemDAO.addPayment", vo);
	}

	@Override
	public int delPayment(PaymentVO vo) {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delPayment", vo);
	}
	
	@Override
	public int delPaymentAll() {
		return session.delete("co.kr.ezen_project.dao.SangMemDAO.delPaymentAll");
	}
	
	@Override
	public int updPayment(PaymentVO vo) {
		return session.update("co.kr.ezen_project.dao.SangMemDAO.updPayment", vo);
	}
}

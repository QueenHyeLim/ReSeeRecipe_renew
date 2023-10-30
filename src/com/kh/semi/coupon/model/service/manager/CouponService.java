package com.kh.semi.coupon.model.service.manager;

import java.util.ArrayList;

import com.kh.semi.common.model.vo.PageInfo;
import com.kh.semi.coupon.model.vo.Coupon;

public interface CouponService {
	
	
	/**
	 * 관리자 쿠폰함 리스트 조회
	 * @param pi
	 * @return 등록되어 있는 쿠폰함 리스트
	 * @author JH
	 * @Date : 2023. 10. 17.
	 * @Update : 2023. 10.28.
	 */
	public ArrayList<Coupon> selectCouponList(PageInfo pi);
		
	
	/**
	 * 관리자 쿠폰함 리스트 행 수 조회
	 * @return DB에 저장되어 있는 쿠폰함 리스트 수
	 * @author JH
	 * @Date : 2023. 10. 17.
	 * @Update : 2023. 10.28.
	 */
	public int selectCouponListCount();
	
	
	/**
	 * 관리자 쿠폰함 리스트 - 쿠폰 등록 요청
	 * @param coupon couponName(쿠폰이름) / startCoupon(쿠폰시작일) / endCoupon(쿠폰등록일) / couponReason(쿠폰등록사유) / couponRatio (쿠폰할인율)
	 * @return 쿠폰 등록 성공 여부
	 * @author JH
	 * @Date : 2023. 10. 18.
	 * @Update : 2023. 10.28.
	 */
	public int insertCoupon(Coupon coupon);

	
	/**
	 * 관리자 쿠폰함 리스트 - 쿠폰 삭제 요청
	 * @param categoryNo 쿠폰 번호 SEQ
	 * @return 쿠폰 삭제 성공 여부
	 * @author JH
	 * @Date : 2023. 10. 19.
	 * @Update : 2023. 10.28.
	 */
	public int deleteCoupon(int couponNo);
	

}	// end class

package com.newew.blog.dao;

import com.newew.blog.dto.NameDTO;


//DB등에서 읽어온 데이터 처리를 담당하는 객체인 DAO
public interface NameDAO {
//여기서 선언되는 메소드명은 마이바티스 매퍼 호출에서 사용 될 이름이다
	public NameDTO getName();
}

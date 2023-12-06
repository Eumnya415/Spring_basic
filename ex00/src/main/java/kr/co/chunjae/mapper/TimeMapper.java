package kr.co.chunjae.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT CURRENT_DATE FROM dual")
	public String getTime();
}

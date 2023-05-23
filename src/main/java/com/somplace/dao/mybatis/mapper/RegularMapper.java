package com.somplace.dao.mybatis.mapper;

import java.util.List;

import com.somplace.domain.Meeting;
import com.somplace.domain.Regular;

public interface RegularMapper {
	void createRegular(Regular regular);
	void updateRegular(Regular regular);
	List<Meeting> searchRegularByKey(String key, String category);
	List<Meeting> sortRegularByHeart(String category);
	List<Meeting> sortRegularByOrder(String category);
}

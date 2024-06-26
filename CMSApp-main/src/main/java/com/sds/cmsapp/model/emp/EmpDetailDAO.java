package com.sds.cmsapp.model.emp;

import org.apache.ibatis.annotations.Mapper;

import com.sds.cmsapp.domain.EmpDetail;

@Mapper
public interface EmpDetailDAO {

	public void insert(EmpDetail empDetail);
	public EmpDetail selectByEmpIdx(int emp_idx);
	public void update(EmpDetail empDetail);
	
}

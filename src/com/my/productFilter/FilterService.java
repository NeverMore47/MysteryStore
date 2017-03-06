package com.my.productFilter;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.my.entity.Category;
import com.my.entity.Product;

@Transactional
public class FilterService {

	private FilterDao dao;

	public void setDao(FilterDao dao) {
		this.dao = dao;
	}
	
	public List queryBrand() {
		String sql = "select proBrand,count(*) from Product GROUP BY proBrand";
		return dao.sqlQuery(sql);
	}
	
	public List queryCategory() {
		String hql = "select cateId,cateName from Category";
		return dao.hqlQuery(hql);
	}
	
	public List queryColor() {
		String hql = "select proColor from Product GROUP BY proColor";
		return dao.hqlQuery(hql);
	}
	
	public List queryProduct(String proBrand,String proCate) {
		String proBrandNew = "";
		String proCateNew = "";
		String hql = "select new Map(p.proId as proId ,p.proBrand as proBrand,p.proName as proName,p.proPrice as proPrice,p.proDiscount as proDiscount,p.proGender as proGender,p.proImgSrc as proImgSrc) from Product p";
		if(!proBrand.equals("")) {
			proBrandNew = proBrand.substring(0, proBrand.length()-1);
			hql += " where proBrand in (" + proBrandNew + ")";
			if(!proCate.equals("")) {
				proCateNew = proCate.substring(0,proCate.length()-1);
				hql += " and category in (" + proCateNew + ")";
			}
		} else if(!proCate.equals("")) {
			proCateNew = proCate.substring(0,proCate.length()-1);
			hql += " where cateId in (" + proCateNew + ")";
		}
		return dao.hqlQuery(hql);
	}
	
	
	

	
}

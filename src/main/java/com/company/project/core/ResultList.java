package com.company.project.core;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 分页统一返回对象
 * 
 * @author xushuai
 *
 */
@ApiModel(" 分页统一返回对象")
public class ResultList<T> {
	@ApiModelProperty("当前页码")
	private int pageNum;
	@ApiModelProperty("当前每页数量")
	private int pageSize;
	@ApiModelProperty("当前条数")
	private long currentCount;
	@ApiModelProperty("总数")
	private long count;
	@ApiModelProperty("总页数")
	private int pages;
	@ApiModelProperty("数据")
	private List<T> data;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public long getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(long currentCount) {
		this.currentCount = currentCount;
	}

	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public static<T> ResultList<T> genResultList(PageInfo<T> pageInfo) {
		ResultList<T> resultList = new ResultList<>();
		resultList.setCount(pageInfo.getTotal());
		resultList.setData(pageInfo.getList());
		resultList.setPages(pageInfo.getPages());
		resultList.setPageNum(pageInfo.getPageNum());
		resultList.setCurrentCount(pageInfo.getSize());
		resultList.setPageSize(pageInfo.getPageSize());
		return resultList;
	}
}

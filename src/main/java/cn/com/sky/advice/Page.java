package cn.com.sky.advice;

import java.util.List;

/**
 * 分页
 *
 */
public class Page<T> {

    /**
     * 当前是第几页，默认为1
     */
    private Integer pageNo = 1;

    /**
     * 页的大小，默认为20
     */
    private Integer pageSize = 20;

    /**
     * 数据总条数
     */
    private Integer totalCnt = 0;

    /**
     * 业务数据
     */
    private List<T> data;


    public Page() {

    }

    public Page(Integer pageNo, Integer pageSize) {
        if (pageNo != null) {
            this.pageNo = pageNo;
        }

        if (pageSize != null) {
            this.pageSize = pageSize;
        }
    }

    public Integer getPageNo() {
        return pageNo < 1 ? 1 : pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


    public Integer getLimit() {
        return pageSize;
    }

    public void setOffsetLimit(Integer offset, Integer limit) {
        if (limit != 0 && offset != null) {
            if (offset % limit == 0) {
                this.pageSize = limit;
                this.pageNo = offset / limit + 1;
            }
        }
    }


    public Integer getOffset() {
        return this.getPageSize() * (this.getPageNo() - 1);
    }

}

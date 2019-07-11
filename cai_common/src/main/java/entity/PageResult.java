package entity;

import java.util.List;

/**
 * Created by cai on 2019/2/24.
 * 用于返回分页结果
 */
public class PageResult<T> {

    private Long total;
    private List<T> rows;
    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

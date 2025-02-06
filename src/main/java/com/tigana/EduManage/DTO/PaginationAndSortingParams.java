package com.tigana.EduManage.DTO;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PaginationAndSortingParams {
    private int start;
    private int end;
    private String order;
    private String sort;

    public int getPage(){
        return start / (end - start);
    }

    public int getSize(){
        return end - start;
    }

    public Sort getSort2(){
        return Sort.by(Sort.Order.by(this.sort).with(Sort.Direction.fromString(order)));
    }

    public Pageable toPageable(){
        int page = this.getPage();
        int size = this.getSize();
        Sort sort = this.getSort2();
        return PageRequest.of(page, size, sort);
    }

    // GETTERS & SETTERS
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

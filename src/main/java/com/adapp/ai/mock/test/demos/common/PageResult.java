package com.adapp.ai.mock.test.demos.common;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private int currentPage;
    private int pageSize;
    private long totalRecords;
    private int totalPages;
    private List<T> data;

    public PageResult(int currentPage, int pageSize, long totalRecords, List<T> data) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalRecords = totalRecords;
        this.data = data;
        this.totalPages = (int) Math.ceil((double) totalRecords / pageSize);
    }
}

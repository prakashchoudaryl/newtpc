package com.synectiks.cms.model;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.Date;
import java.util.Set;

public class IssueBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long regiNo;
    private int code;
    private int quantity;
    private Date issueDate;
    private Date returnDate;
    private String Status;
    private Date created_at;
    private Date updated_at;

    @OneToMany(mappedBy = "issuebook", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Book> books;

    public IssueBook(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRegiNo() {
        return regiNo;
    }

    public void setRegiNo(long regiNo) {
        this.regiNo = regiNo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

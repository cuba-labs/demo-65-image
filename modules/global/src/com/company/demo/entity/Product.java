package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.FileDescriptor;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "DEMO_PRODUCT")
@Entity(name = "demo$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 4159081649636872521L;

    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Lob
    @Column(name = "SUMMARY")
    protected String summary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_ID")
    protected FileDescriptor image;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setImage(FileDescriptor image) {
        this.image = image;
    }

    public FileDescriptor getImage() {
        return image;
    }


}
package com.cl.code.springbootmybatis.model;


import java.sql.Timestamp;

public class Runoob {
    private Long runoobId;
    private String runoobTitle;
    private String runoobAuthor;
    private Timestamp submissionDate;

    public Runoob() {
    }

    public Runoob(Long runoobId, String runoobTitle, String runoobAuthor, Timestamp submissionDate) {
        this.runoobId = runoobId;
        this.runoobTitle = runoobTitle;
        this.runoobAuthor = runoobAuthor;
        this.submissionDate = submissionDate;
    }

    public Long getRunoobId() {
        return runoobId;
    }

    public void setRunoobId(Long runoobId) {
        this.runoobId = runoobId;
    }

    public String getRunoobTitle() {
        return runoobTitle;
    }

    public void setRunoobTitle(String runoobTitle) {
        this.runoobTitle = runoobTitle;
    }

    public String getRunoobAuthor() {
        return runoobAuthor;
    }

    public void setRunoobAuthor(String runoobAuthor) {
        this.runoobAuthor = runoobAuthor;
    }

    public Timestamp getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Timestamp submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "Runoob{" +
                "runoobId=" + runoobId +
                ", runoobTitle='" + runoobTitle + '\'' +
                ", runoobAuthor='" + runoobAuthor + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }
}

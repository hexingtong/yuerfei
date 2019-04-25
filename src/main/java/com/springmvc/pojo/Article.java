package com.springmvc.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Description： 文章表
 * @author boyang
 * @date 2019/4/25 14:15
 * @param
 * @return
 */
public class Article {
    /**
     主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     文章内容
     */
    private String content;

    /**
     发帖时间
     */
    private Date addtime;

    /**
     题目标题
     */
    private String title;

    /**
     用户id
     */
    private Integer adminid;

    /**
     阅读量
     */
    private Integer readingcount;

    /**
     回复数
     */
    private Integer replies;

    /**
     *
     点击数
     */
    private Integer click;

    /**
     审核状态(1审核中，2审核成功，0审核失败）
     */
    private Integer checkstatus;

    /**
     审核备注原因
     */
    private String statusreason;

    /**
     审核备注原因
     */
    private Integer stickstatus;

    public Integer getStickstatus() {
        return stickstatus;
    }

    public void setStickstatus(Integer stickstatus) {
        this.stickstatus = stickstatus;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", addtime=" + addtime +
                ", title='" + title + '\'' +
                ", adminid=" + adminid +
                ", readingcount=" + readingcount +
                ", replies=" + replies +
                ", click=" + click +
                ", checkstatus=" + checkstatus +
                ", statusreason='" + statusreason + '\'' +
                ", stickstatus=" + stickstatus +
                '}';
    }

    public String getStatusreason() {
        return statusreason;
    }

    public void setStatusreason(String statusreason) {
        this.statusreason = statusreason;
    }

    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.addTime
     *
     * @return the value of article.addTime
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.addTime
     *
     * @param addtime the value for article.addTime
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.adminId
     *
     * @return the value of article.adminId
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.adminId
     *
     * @param adminid the value for article.adminId
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.readingCount
     *
     * @return the value of article.readingCount
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getReadingcount() {
        return readingcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.readingCount
     *
     * @param readingcount the value for article.readingCount
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setReadingcount(Integer readingcount) {
        this.readingcount = readingcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.replies
     *
     * @return the value of article.replies
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getReplies() {
        return replies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.replies
     *
     * @param replies the value for article.replies
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.click
     *
     * @return the value of article.click
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getClick() {
        return click;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.click
     *
     * @param click the value for article.click
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setClick(Integer click) {
        this.click = click;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.checkStatus
     *
     * @return the value of article.checkStatus
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getCheckstatus() {
        return checkstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.checkStatus
     *
     * @param checkstatus the value for article.checkStatus
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }
}
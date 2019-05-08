package com.springmvc.pojo;
/**
 * Description：评论表
 * @author boyang
 * @date 2019/5/6 11:31
 * @param
 * @return
 */
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Comment {
    /**
     主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     文章id
     */
    private Integer articleid;

    /**
     用户id
     */
    private Integer adminid;

    /**
     评论内容
     */
    private String comment;

    /**
     *
     评论时间
     */
    private Date addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.articleId
     *
     * @return the value of comment.articleId
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getArticleid() {
        return articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.articleId
     *
     * @param articleid the value for comment.articleId
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.adminId
     *
     * @return the value of comment.adminId
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.adminId
     *
     * @param adminid the value for comment.adminId
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment
     *
     * @return the value of comment.comment
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment
     *
     * @param comment the value for comment.comment
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.addTime
     *
     * @return the value of comment.addTime
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.addTime
     *
     * @param addtime the value for comment.addTime
     *
     * @mbg.generated Thu Apr 25 14:07:08 CST 2019
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}
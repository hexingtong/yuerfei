package com.springmvc.pojo;

import java.util.Date;

public class MoneyInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column money_info.id
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column money_info.moneyName
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    private String moneyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column money_info.addTime
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    private Date addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column money_info.id
     *
     * @return the value of money_info.id
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column money_info.id
     *
     * @param id the value for money_info.id
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column money_info.moneyName
     *
     * @return the value of money_info.moneyName
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    public String getMoneyname() {
        return moneyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column money_info.moneyName
     *
     * @param moneyname the value for money_info.moneyName
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    public void setMoneyname(String moneyname) {
        this.moneyname = moneyname == null ? null : moneyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column money_info.addTime
     *
     * @return the value of money_info.addTime
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column money_info.addTime
     *
     * @param addtime the value for money_info.addTime
     *
     * @mbg.generated Tue Mar 12 10:33:24 CST 2019
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}
/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * JDCLOUD BILLING Services API
 * 用户中心消费管理查询API接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.billing.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询资源账单，消费记录中的费用信息
 */
public class QueryBillStatisticsInfoRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appCode
     * Required:true
     */
    @Required
    private String appCode;

    /**
     * serviceCode
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 支付状态
     * Required:true
     */
    @Required
    private Integer payState;

    /**
     * 时间类型
     * Required:true
     */
    @Required
    private Integer timeType;

    /**
     * 开始时间
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 结束时间
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 查询类型
     * Required:true
     */
    @Required
    private Integer queryType;

    /**
     * 支付类型
     * Required:true
     */
    @Required
    private Integer payType;

    /**
     * 计费类型
     * Required:true
     */
    @Required
    private Integer billingType;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 支付状态
     *
     * @return
     */
    public Integer getPayState() {
        return payState;
    }

    /**
     * set 支付状态
     *
     * @param payState
     */
    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    /**
     * get 时间类型
     *
     * @return
     */
    public Integer getTimeType() {
        return timeType;
    }

    /**
     * set 时间类型
     *
     * @param timeType
     */
    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 查询类型
     *
     * @return
     */
    public Integer getQueryType() {
        return queryType;
    }

    /**
     * set 查询类型
     *
     * @param queryType
     */
    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    /**
     * get 支付类型
     *
     * @return
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * set 支付类型
     *
     * @param payType
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set appCode
     *
     * @param appCode
     */
    public QueryBillStatisticsInfoRequest appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public QueryBillStatisticsInfoRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 支付状态
     *
     * @param payState
     */
    public QueryBillStatisticsInfoRequest payState(Integer payState) {
        this.payState = payState;
        return this;
    }

    /**
     * set 时间类型
     *
     * @param timeType
     */
    public QueryBillStatisticsInfoRequest timeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public QueryBillStatisticsInfoRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public QueryBillStatisticsInfoRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 查询类型
     *
     * @param queryType
     */
    public QueryBillStatisticsInfoRequest queryType(Integer queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * set 支付类型
     *
     * @param payType
     */
    public QueryBillStatisticsInfoRequest payType(Integer payType) {
        this.payType = payType;
        return this;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public QueryBillStatisticsInfoRequest billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public QueryBillStatisticsInfoRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}
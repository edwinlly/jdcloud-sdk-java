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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * updateAlarmBody
 */
public class UpdateAlarmBody  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min、总和&#x3D;sum
     * Required:true
     */
    @Required
    private String calculation;

    /**
     * 通知的联系组，如 [“联系组1”,”联系组2”]
     */
    private List<String> contactGroups;

    /**
     * 通知的联系人，如 [“联系人1”,”联系人2”]
     */
    private List<String> contactPersons;

    /**
     * 取样频次
     */
    private String downSample;

    /**
     * 根据产品线查询可用监控项列表 接口 返回的Metric字段
     * Required:true
     */
    @Required
    private String metric;

    /**
     * 通知周期 单位：小时
     */
    private Integer noticePeriod;

    /**
     * &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、!&#x3D;
     * Required:true
     */
    @Required
    private String operation;

    /**
     * 统计周期（单位：分钟），可选值：2,5,15,30,60
     * Required:true
     */
    @Required
    private Integer period;

    /**
     * 产品名称
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 阈值
     * Required:true
     */
    @Required
    private Double threshold;

    /**
     * 连续多少次后报警，可选值:1,2,3,5
     * Required:true
     */
    @Required
    private Integer times;


    /**
     * get 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min、总和&#x3D;sum
     *
     * @return
     */
    public String getCalculation() {
        return calculation;
    }

    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min、总和&#x3D;sum
     *
     * @param calculation
     */
    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    /**
     * get 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @return
     */
    public List<String> getContactGroups() {
        return contactGroups;
    }

    /**
     * set 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @param contactGroups
     */
    public void setContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
    }

    /**
     * get 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @return
     */
    public List<String> getContactPersons() {
        return contactPersons;
    }

    /**
     * set 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @param contactPersons
     */
    public void setContactPersons(List<String> contactPersons) {
        this.contactPersons = contactPersons;
    }

    /**
     * get 取样频次
     *
     * @return
     */
    public String getDownSample() {
        return downSample;
    }

    /**
     * set 取样频次
     *
     * @param downSample
     */
    public void setDownSample(String downSample) {
        this.downSample = downSample;
    }

    /**
     * get 根据产品线查询可用监控项列表 接口 返回的Metric字段
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 根据产品线查询可用监控项列表 接口 返回的Metric字段
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 通知周期 单位：小时
     *
     * @return
     */
    public Integer getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public void setNoticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    /**
     * get &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、!&#x3D;
     *
     * @return
     */
    public String getOperation() {
        return operation;
    }

    /**
     * set &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、!&#x3D;
     *
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * get 统计周期（单位：分钟），可选值：2,5,15,30,60
     *
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * set 统计周期（单位：分钟），可选值：2,5,15,30,60
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * get 产品名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 阈值
     *
     * @return
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * get 连续多少次后报警，可选值:1,2,3,5
     *
     * @return
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * set 连续多少次后报警，可选值:1,2,3,5
     *
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }


    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min、总和&#x3D;sum
     *
     * @param calculation
     */
    public UpdateAlarmBody calculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * set 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @param contactGroups
     */
    public UpdateAlarmBody contactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }

    /**
     * set 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @param contactPersons
     */
    public UpdateAlarmBody contactPersons(List<String> contactPersons) {
        this.contactPersons = contactPersons;
        return this;
    }

    /**
     * set 取样频次
     *
     * @param downSample
     */
    public UpdateAlarmBody downSample(String downSample) {
        this.downSample = downSample;
        return this;
    }

    /**
     * set 根据产品线查询可用监控项列表 接口 返回的Metric字段
     *
     * @param metric
     */
    public UpdateAlarmBody metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public UpdateAlarmBody noticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }

    /**
     * set &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、!&#x3D;
     *
     * @param operation
     */
    public UpdateAlarmBody operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * set 统计周期（单位：分钟），可选值：2,5,15,30,60
     *
     * @param period
     */
    public UpdateAlarmBody period(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * set 产品名称
     *
     * @param serviceCode
     */
    public UpdateAlarmBody serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public UpdateAlarmBody threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * set 连续多少次后报警，可选值:1,2,3,5
     *
     * @param times
     */
    public UpdateAlarmBody times(Integer times) {
        this.times = times;
        return this;
    }


    /**
     * add item to 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @param contactGroup
     */
    public void addContactGroup(String contactGroup) {
        if (this.contactGroups == null) {
            this.contactGroups = new ArrayList<>();
        }
        this.contactGroups.add(contactGroup);
    }

    /**
     * add item to 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @param contactPerson
     */
    public void addContactPerson(String contactPerson) {
        if (this.contactPersons == null) {
            this.contactPersons = new ArrayList<>();
        }
        this.contactPersons.add(contactPerson);
    }

}
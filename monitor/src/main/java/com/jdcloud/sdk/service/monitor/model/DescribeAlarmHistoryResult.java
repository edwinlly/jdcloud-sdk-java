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
 * 云监控规则相关接口
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.AlarmHistory;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询报警历史
 */
public class DescribeAlarmHistoryResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * alarmHistoryList
     */
    private List<AlarmHistory> alarmHistoryList;

    /**
     * 页码
     */
    private Number pageNumber;

    /**
     * 总页数
     */
    private Number numberPages;

    /**
     * 总记录数
     */
    private Number numberRecords;

    /**
     * 分页大小
     */
    private Number pageSize;


    /**
     * get alarmHistoryList
     *
     * @return
     */
    public List<AlarmHistory> getAlarmHistoryList() {
        return alarmHistoryList;
    }

    /**
     * set alarmHistoryList
     *
     * @param alarmHistoryList
     */
    public void setAlarmHistoryList(List<AlarmHistory> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Number getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Number pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Number getNumberPages() {
        return numberPages;
    }

    /**
     * set 总页数
     *
     * @param numberPages
     */
    public void setNumberPages(Number numberPages) {
        this.numberPages = numberPages;
    }

    /**
     * get 总记录数
     *
     * @return
     */
    public Number getNumberRecords() {
        return numberRecords;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public void setNumberRecords(Number numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Number getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Number pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * set alarmHistoryList
     *
     * @param alarmHistoryList
     */
    public DescribeAlarmHistoryResult alarmHistoryList(List<AlarmHistory> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeAlarmHistoryResult pageNumber(Number pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 总页数
     *
     * @param numberPages
     */
    public DescribeAlarmHistoryResult numberPages(Number numberPages) {
        this.numberPages = numberPages;
        return this;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public DescribeAlarmHistoryResult numberRecords(Number numberRecords) {
        this.numberRecords = numberRecords;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeAlarmHistoryResult pageSize(Number pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * add item to alarmHistoryList
     *
     * @param alarmHistoryList
     */
    public void addAlarmHistoryList(AlarmHistory alarmHistoryList) {
        if (this.alarmHistoryList == null) {
            this.alarmHistoryList = new ArrayList<>();
        }
        this.alarmHistoryList.add(alarmHistoryList);
    }

}
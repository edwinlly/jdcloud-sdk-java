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
 * 查询消费记录详情
 */
public class GetBillDetailRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * systemType
     */
    private Integer systemType;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * billId
     * Required:true
     */
    @Required
    private Number billId;


    /**
     * get systemType
     *
     * @return
     */
    public Integer getSystemType() {
        return systemType;
    }

    /**
     * set systemType
     *
     * @param systemType
     */
    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
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
     * get billId
     *
     * @return
     */
    public Number getBillId() {
        return billId;
    }

    /**
     * set billId
     *
     * @param billId
     */
    public void setBillId(Number billId) {
        this.billId = billId;
    }


    /**
     * set systemType
     *
     * @param systemType
     */
    public GetBillDetailRequest systemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public GetBillDetailRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set billId
     *
     * @param billId
     */
    public GetBillDetailRequest billId(Number billId) {
        this.billId = billId;
        return this;
    }


}
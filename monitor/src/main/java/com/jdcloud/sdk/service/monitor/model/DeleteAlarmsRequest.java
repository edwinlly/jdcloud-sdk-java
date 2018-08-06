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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量删除已创建的报警规则
 */
public class DeleteAlarmsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 待删除的规则id，用&quot;|&quot;间隔
     * Required:true
     */
    @Required
    private String ids;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 待删除的规则id，用&quot;|&quot;间隔
     *
     * @return
     */
    public String getIds() {
        return ids;
    }

    /**
     * set 待删除的规则id，用&quot;|&quot;间隔
     *
     * @param ids
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 待删除的规则id，用&quot;|&quot;间隔
     *
     * @param ids
     */
    public DeleteAlarmsRequest ids(String ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DeleteAlarmsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}
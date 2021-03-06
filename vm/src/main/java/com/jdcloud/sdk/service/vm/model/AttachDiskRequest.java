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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 为一台云主机挂载一块数据盘(云硬盘)，云主机和云硬盘没有正在进行中的的任务时才可挂载。&lt;br&gt;
云主机状态必须是&lt;b&gt;running&lt;/b&gt;或&lt;b&gt;stopped&lt;/b&gt;状态。&lt;br&gt;
本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。

 */
public class AttachDiskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID
     * Required:true
     */
    @Required
    private String diskId;

    /**
     * 数据盘的逻辑挂载点[vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi]，挂载系统盘时vda必传
     */
    private String deviceName;

    /**
     * 自动随主机删除此云硬盘，默认为False。仅按配置计费云硬盘支持修改此参数，包年包月云硬盘默认为False且不可修改。如果是共享型云硬盘，此参数无效。
     */
    private Boolean autoDelete;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 云硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * get 数据盘的逻辑挂载点[vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi]，挂载系统盘时vda必传
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 数据盘的逻辑挂载点[vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi]，挂载系统盘时vda必传
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 自动随主机删除此云硬盘，默认为False。仅按配置计费云硬盘支持修改此参数，包年包月云硬盘默认为False且不可修改。如果是共享型云硬盘，此参数无效。
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 自动随主机删除此云硬盘，默认为False。仅按配置计费云硬盘支持修改此参数，包年包月云硬盘默认为False且不可修改。如果是共享型云硬盘，此参数无效。
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public AttachDiskRequest diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * set 数据盘的逻辑挂载点[vda,vdb,vdc,vdd,vde,vdf,vdg,vdh,vdi]，挂载系统盘时vda必传
     *
     * @param deviceName
     */
    public AttachDiskRequest deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 自动随主机删除此云硬盘，默认为False。仅按配置计费云硬盘支持修改此参数，包年包月云硬盘默认为False且不可修改。如果是共享型云硬盘，此参数无效。
     *
     * @param autoDelete
     */
    public AttachDiskRequest autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public AttachDiskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public AttachDiskRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}
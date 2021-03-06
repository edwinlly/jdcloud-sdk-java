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

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * reinstallInstanceSpec
 */
public class ReinstallInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用区, 如cn-east-1a
     * Required:true
     */
    @Required
    private String az;

    /**
     * 镜像类型, 取值范围：standard、standard_app
     * Required:true
     */
    @Required
    private String imageType;

    /**
     * OS类型Id
     * Required:true
     */
    @Required
    private String osTypeId;

    /**
     * 系统盘raid类型Id
     * Required:true
     */
    @Required
    private String sysRaidTypeId;

    /**
     * 是否保留数据盘数据, 取值为：yes、no
     * Required:true
     */
    @Required
    private String keepData;

    /**
     * 数据盘raid类型Id
     * Required:true
     */
    @Required
    private String dataRaidTypeId;

    /**
     * 密码
     * Required:true
     */
    @Required
    private String password;

    /**
     * softwares
     */
    private List<Software> softwares;


    /**
     * get 可用区, 如cn-east-1a
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区, 如cn-east-1a
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 镜像类型, 取值范围：standard、standard_app
     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 镜像类型, 取值范围：standard、standard_app
     *
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * get OS类型Id
     *
     * @return
     */
    public String getOsTypeId() {
        return osTypeId;
    }

    /**
     * set OS类型Id
     *
     * @param osTypeId
     */
    public void setOsTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
    }

    /**
     * get 系统盘raid类型Id
     *
     * @return
     */
    public String getSysRaidTypeId() {
        return sysRaidTypeId;
    }

    /**
     * set 系统盘raid类型Id
     *
     * @param sysRaidTypeId
     */
    public void setSysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
    }

    /**
     * get 是否保留数据盘数据, 取值为：yes、no
     *
     * @return
     */
    public String getKeepData() {
        return keepData;
    }

    /**
     * set 是否保留数据盘数据, 取值为：yes、no
     *
     * @param keepData
     */
    public void setKeepData(String keepData) {
        this.keepData = keepData;
    }

    /**
     * get 数据盘raid类型Id
     *
     * @return
     */
    public String getDataRaidTypeId() {
        return dataRaidTypeId;
    }

    /**
     * set 数据盘raid类型Id
     *
     * @param dataRaidTypeId
     */
    public void setDataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
    }

    /**
     * get 密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get softwares
     *
     * @return
     */
    public List<Software> getSoftwares() {
        return softwares;
    }

    /**
     * set softwares
     *
     * @param softwares
     */
    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }


    /**
     * set 可用区, 如cn-east-1a
     *
     * @param az
     */
    public ReinstallInstanceSpec az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 镜像类型, 取值范围：standard、standard_app
     *
     * @param imageType
     */
    public ReinstallInstanceSpec imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set OS类型Id
     *
     * @param osTypeId
     */
    public ReinstallInstanceSpec osTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
        return this;
    }

    /**
     * set 系统盘raid类型Id
     *
     * @param sysRaidTypeId
     */
    public ReinstallInstanceSpec sysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
        return this;
    }

    /**
     * set 是否保留数据盘数据, 取值为：yes、no
     *
     * @param keepData
     */
    public ReinstallInstanceSpec keepData(String keepData) {
        this.keepData = keepData;
        return this;
    }

    /**
     * set 数据盘raid类型Id
     *
     * @param dataRaidTypeId
     */
    public ReinstallInstanceSpec dataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
        return this;
    }

    /**
     * set 密码
     *
     * @param password
     */
    public ReinstallInstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set softwares
     *
     * @param softwares
     */
    public ReinstallInstanceSpec softwares(List<Software> softwares) {
        this.softwares = softwares;
        return this;
    }


    /**
     * add item to softwares
     *
     * @param software
     */
    public void addSoftware(Software software) {
        if (this.softwares == null) {
            this.softwares = new ArrayList<>();
        }
        this.softwares.add(software);
    }

}
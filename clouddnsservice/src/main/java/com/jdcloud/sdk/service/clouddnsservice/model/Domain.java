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

package com.jdcloud.sdk.service.clouddnsservice.model;


/**
 * domain
 */
public class Domain  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名的唯一ID
     */
    private Integer id;

    /**
     * 域名字符串
     */
    private String domainName;

    /**
     * 创建时间，格式Unix timestamp，时间单位：毫秒
     */
    private Long createTime;

    /**
     * 过期时间，格式Unix timestamp，时间单位：毫秒
     */
    private Long expirationDate;

    /**
     * 套餐类型，0-&gt;免费 1-&gt;企业版 2-&gt;企业高级版
     */
    private Integer packId;


    /**
     * get 域名的唯一ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 域名的唯一ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 域名字符串
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 域名字符串
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * get 创建时间，格式Unix timestamp，时间单位：毫秒
     *
     * @return
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * get 过期时间，格式Unix timestamp，时间单位：毫秒
     *
     * @return
     */
    public Long getExpirationDate() {
        return expirationDate;
    }

    /**
     * set 过期时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param expirationDate
     */
    public void setExpirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * get 套餐类型，0-&gt;免费 1-&gt;企业版 2-&gt;企业高级版
     *
     * @return
     */
    public Integer getPackId() {
        return packId;
    }

    /**
     * set 套餐类型，0-&gt;免费 1-&gt;企业版 2-&gt;企业高级版
     *
     * @param packId
     */
    public void setPackId(Integer packId) {
        this.packId = packId;
    }


    /**
     * set 域名的唯一ID
     *
     * @param id
     */
    public Domain id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 域名字符串
     *
     * @param domainName
     */
    public Domain domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * set 创建时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param createTime
     */
    public Domain createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 过期时间，格式Unix timestamp，时间单位：毫秒
     *
     * @param expirationDate
     */
    public Domain expirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * set 套餐类型，0-&gt;免费 1-&gt;企业版 2-&gt;企业高级版
     *
     * @param packId
     */
    public Domain packId(Integer packId) {
        this.packId = packId;
        return this;
    }


}
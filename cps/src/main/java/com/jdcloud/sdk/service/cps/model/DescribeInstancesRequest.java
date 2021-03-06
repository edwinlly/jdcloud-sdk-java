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
 * 云物理服务器
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量查询云物理服务器详细信息&lt;br/&gt;
支持分页查询，默认每页10条&lt;br/&gt;

 */
public class DescribeInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为10；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * 可用区，精确匹配
     */
    private String az;

    /**
     * 云物理服务器名称，支持模糊匹配
     */
    private String name;

    /**
     * 网络类型，精确匹配，目前只支持basic
     */
    private String networkType;

    /**
     * 服务器类型，精确匹配，调用接口（describeDeviceTypes）获取物理服务器类型列表
     */
    private String deviceType;

    /**
     * 云物理服务器状态，参考云物理服务器状态
     */
    private String status;

    /**
     * instanceId - 云物理服务器ID，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为10；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为10；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 可用区，精确匹配
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区，精确匹配
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 云物理服务器名称，支持模糊匹配
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云物理服务器名称，支持模糊匹配
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 网络类型，精确匹配，目前只支持basic
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 网络类型，精确匹配，目前只支持basic
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * get 服务器类型，精确匹配，调用接口（describeDeviceTypes）获取物理服务器类型列表
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 服务器类型，精确匹配，调用接口（describeDeviceTypes）获取物理服务器类型列表
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 云物理服务器状态，参考云物理服务器状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云物理服务器状态，参考云物理服务器状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get instanceId - 云物理服务器ID，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set instanceId - 云物理服务器ID，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为10；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 可用区，精确匹配
     *
     * @param az
     */
    public DescribeInstancesRequest az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 云物理服务器名称，支持模糊匹配
     *
     * @param name
     */
    public DescribeInstancesRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 网络类型，精确匹配，目前只支持basic
     *
     * @param networkType
     */
    public DescribeInstancesRequest networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * set 服务器类型，精确匹配，调用接口（describeDeviceTypes）获取物理服务器类型列表
     *
     * @param deviceType
     */
    public DescribeInstancesRequest deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 云物理服务器状态，参考云物理服务器状态
     *
     * @param status
     */
    public DescribeInstancesRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set instanceId - 云物理服务器ID，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeInstancesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to instanceId - 云物理服务器ID，精确匹配，支持多个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}
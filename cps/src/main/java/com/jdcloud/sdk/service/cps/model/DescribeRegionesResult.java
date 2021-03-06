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
 * 云物理服务器区域操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cps.model.Region;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询云物理服务器区域列表
 */
public class DescribeRegionesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * regions
     */
    private List<Region> regions;


    /**
     * get regions
     *
     * @return
     */
    public List<Region> getRegions() {
        return regions;
    }

    /**
     * set regions
     *
     * @param regions
     */
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }


    /**
     * set regions
     *
     * @param regions
     */
    public DescribeRegionesResult regions(List<Region> regions) {
        this.regions = regions;
        return this;
    }


    /**
     * add item to regions
     *
     * @param region
     */
    public void addRegion(Region region) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(region);
    }

}
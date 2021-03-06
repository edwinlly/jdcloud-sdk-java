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

package com.jdcloud.sdk.service.redis.model;


/**
 * 缓存Redis实例所在区域可用区ID信息
 */
public class AzId  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 缓存Redis主实例所在区域可用区ID
     */
    private String master;

    /**
     * 缓存Redis从实例所在区域可用区ID
     */
    private String slave;


    /**
     * get 缓存Redis主实例所在区域可用区ID
     *
     * @return
     */
    public String getMaster() {
        return master;
    }

    /**
     * set 缓存Redis主实例所在区域可用区ID
     *
     * @param master
     */
    public void setMaster(String master) {
        this.master = master;
    }

    /**
     * get 缓存Redis从实例所在区域可用区ID
     *
     * @return
     */
    public String getSlave() {
        return slave;
    }

    /**
     * set 缓存Redis从实例所在区域可用区ID
     *
     * @param slave
     */
    public void setSlave(String slave) {
        this.slave = slave;
    }


    /**
     * set 缓存Redis主实例所在区域可用区ID
     *
     * @param master
     */
    public AzId master(String master) {
        this.master = master;
        return this;
    }

    /**
     * set 缓存Redis从实例所在区域可用区ID
     *
     * @param slave
     */
    public AzId slave(String slave) {
        this.slave = slave;
        return this;
    }


}
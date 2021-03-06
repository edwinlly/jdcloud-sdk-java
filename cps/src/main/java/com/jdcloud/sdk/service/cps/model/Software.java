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


/**
 * software
 */
public class Software  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 软件包名称
     */
    private String name;

    /**
     * 软件包版本
     */
    private String version;

    /**
     * OS类型ID
     */
    private String osTypeId;

    /**
     * 软件包描述
     */
    private String description;


    /**
     * get 软件包名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 软件包名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 软件包版本
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 软件包版本
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get OS类型ID
     *
     * @return
     */
    public String getOsTypeId() {
        return osTypeId;
    }

    /**
     * set OS类型ID
     *
     * @param osTypeId
     */
    public void setOsTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
    }

    /**
     * get 软件包描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 软件包描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 软件包名称
     *
     * @param name
     */
    public Software name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 软件包版本
     *
     * @param version
     */
    public Software version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set OS类型ID
     *
     * @param osTypeId
     */
    public Software osTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
        return this;
    }

    /**
     * set 软件包描述
     *
     * @param description
     */
    public Software description(String description) {
        this.description = description;
        return this;
    }


}
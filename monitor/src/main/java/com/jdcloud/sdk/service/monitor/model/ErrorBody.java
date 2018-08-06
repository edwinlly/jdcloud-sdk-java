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

package com.jdcloud.sdk.service.monitor.model;


/**
 * errorBody
 */
public class ErrorBody  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 错误状态
     */
    private String status;


    /**
     * get 错误码
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 错误码
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 错误信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 错误信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 错误状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 错误状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 错误码
     *
     * @param code
     */
    public ErrorBody code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 错误信息
     *
     * @param message
     */
    public ErrorBody message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 错误状态
     *
     * @param status
     */
    public ErrorBody status(String status) {
        this.status = status;
        return this;
    }


}
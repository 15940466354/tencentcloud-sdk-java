/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest  extends AbstractModel{

    /**
    * 实例所属的可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 实例类型：2 – 主从版，5-单机版
    */
    @SerializedName("TypeId")
    @Expose
    private Integer TypeId;

    /**
    * 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
    */
    @SerializedName("MemSize")
    @Expose
    private Integer MemSize;

    /**
    * 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
    */
    @SerializedName("GoodsNum")
    @Expose
    private Integer GoodsNum;

    /**
    * 购买时长，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 实例密码，密码规则：1.长度为8-16个字符；2:至少包含字母、数字和字符!@^*()中的两种
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 付费方式:0-按量计费，1-包年包月。
    */
    @SerializedName("BillingMode")
    @Expose
    private Integer BillingMode;

    /**
    * 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表 查询
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 基础网络下， subnetId无效； vpc子网下，取值以查询查询子网列表
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 自动续费表示。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Integer AutoRenew;

    /**
    * 安全组id数组
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * 用户自定义的端口 不填则默认为6379
    */
    @SerializedName("VPort")
    @Expose
    private Integer VPort;

    /**
     * 获取实例所属的可用区id
     * @return ZoneId 实例所属的可用区id
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置实例所属的可用区id
     * @param ZoneId 实例所属的可用区id
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取实例类型：2 – 主从版，5-单机版
     * @return TypeId 实例类型：2 – 主从版，5-单机版
     */
    public Integer getTypeId() {
        return this.TypeId;
    }

    /**
     * 设置实例类型：2 – 主从版，5-单机版
     * @param TypeId 实例类型：2 – 主从版，5-单机版
     */
    public void setTypeId(Integer TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * 获取实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     * @return MemSize 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     */
    public Integer getMemSize() {
        return this.MemSize;
    }

    /**
     * 设置实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     * @param MemSize 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     */
    public void setMemSize(Integer MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * 获取实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     * @return GoodsNum 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     */
    public Integer getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * 设置实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     * @param GoodsNum 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     */
    public void setGoodsNum(Integer GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * 获取购买时长，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @return Period 购买时长，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置购买时长，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @param Period 购买时长，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取实例密码，密码规则：1.长度为8-16个字符；2:至少包含字母、数字和字符!@^*()中的两种
     * @return Password 实例密码，密码规则：1.长度为8-16个字符；2:至少包含字母、数字和字符!@^*()中的两种
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置实例密码，密码规则：1.长度为8-16个字符；2:至少包含字母、数字和字符!@^*()中的两种
     * @param Password 实例密码，密码规则：1.长度为8-16个字符；2:至少包含字母、数字和字符!@^*()中的两种
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取付费方式:0-按量计费，1-包年包月。
     * @return BillingMode 付费方式:0-按量计费，1-包年包月。
     */
    public Integer getBillingMode() {
        return this.BillingMode;
    }

    /**
     * 设置付费方式:0-按量计费，1-包年包月。
     * @param BillingMode 付费方式:0-按量计费，1-包年包月。
     */
    public void setBillingMode(Integer BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * 获取私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表 查询
     * @return VpcId 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表 查询
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表 查询
     * @param VpcId 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表 查询
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取基础网络下， subnetId无效； vpc子网下，取值以查询查询子网列表
     * @return SubnetId 基础网络下， subnetId无效； vpc子网下，取值以查询查询子网列表
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置基础网络下， subnetId无效； vpc子网下，取值以查询查询子网列表
     * @param SubnetId 基础网络下， subnetId无效； vpc子网下，取值以查询查询子网列表
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准
     * @return ProjectId 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准
     * @param ProjectId 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取自动续费表示。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     * @return AutoRenew 自动续费表示。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public Integer getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * 设置自动续费表示。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     * @param AutoRenew 自动续费表示。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public void setAutoRenew(Integer AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * 获取安全组id数组
     * @return SecurityGroupIdList 安全组id数组
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * 设置安全组id数组
     * @param SecurityGroupIdList 安全组id数组
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * 获取用户自定义的端口 不填则默认为6379
     * @return VPort 用户自定义的端口 不填则默认为6379
     */
    public Integer getVPort() {
        return this.VPort;
    }

    /**
     * 设置用户自定义的端口 不填则默认为6379
     * @param VPort 用户自定义的端口 不填则默认为6379
     */
    public void setVPort(Integer VPort) {
        this.VPort = VPort;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamSimple(map, prefix + "VPort", this.VPort);

    }
}


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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo  extends AbstractModel{

    /**
    * 外网状态
    */
    @SerializedName("WanStatus")
    @Expose
    private Integer WanStatus;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 初始化标志
    */
    @SerializedName("InitFlag")
    @Expose
    private Integer InitFlag;

    /**
    * 只读vip信息
    */
    @SerializedName("RoVipInfo")
    @Expose
    private RoVipInfo RoVipInfo;

    /**
    * 内存容量
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * 备机信息
    */
    @SerializedName("SlaveInfo")
    @Expose
    private SlaveInfo SlaveInfo;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 硬盘容量
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 自动续费标志
    */
    @SerializedName("AutoRenew")
    @Expose
    private Integer AutoRenew;

    /**
    * 数据复制方式
    */
    @SerializedName("ProtectMode")
    @Expose
    private Integer ProtectMode;

    /**
    * 只读组信息
    */
    @SerializedName("RoGroups")
    @Expose
    private RoGroup [] RoGroups;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private Integer InstanceType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 到期时间
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 可用区部署方式
    */
    @SerializedName("DeployMode")
    @Expose
    private Integer DeployMode;

    /**
    * 实例任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;

    /**
    * 主实例信息
    */
    @SerializedName("MasterInfo")
    @Expose
    private MasterInfo MasterInfo;

    /**
    * 实例售卖机型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 内核版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 灾备实例信息
    */
    @SerializedName("DrInfo")
    @Expose
    private DrInfo [] DrInfo;

    /**
    * 外网域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网端口号
    */
    @SerializedName("WanPort")
    @Expose
    private Integer WanPort;

    /**
    * 付费类型
    */
    @SerializedName("PayType")
    @Expose
    private Integer PayType;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口号
    */
    @SerializedName("Vport")
    @Expose
    private Integer Vport;

    /**
    * 实例状态
    */
    @SerializedName("CdbError")
    @Expose
    private Integer CdbError;

    /**
    * 私有网络描述符
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网描述符
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
     * 获取外网状态
     * @return WanStatus 外网状态
     */
    public Integer getWanStatus() {
        return this.WanStatus;
    }

    /**
     * 设置外网状态
     * @param WanStatus 外网状态
     */
    public void setWanStatus(Integer WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * 获取可用区信息
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取初始化标志
     * @return InitFlag 初始化标志
     */
    public Integer getInitFlag() {
        return this.InitFlag;
    }

    /**
     * 设置初始化标志
     * @param InitFlag 初始化标志
     */
    public void setInitFlag(Integer InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * 获取只读vip信息
     * @return RoVipInfo 只读vip信息
     */
    public RoVipInfo getRoVipInfo() {
        return this.RoVipInfo;
    }

    /**
     * 设置只读vip信息
     * @param RoVipInfo 只读vip信息
     */
    public void setRoVipInfo(RoVipInfo RoVipInfo) {
        this.RoVipInfo = RoVipInfo;
    }

    /**
     * 获取内存容量
     * @return Memory 内存容量
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存容量
     * @param Memory 内存容量
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例状态
     * @return Status 实例状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态
     * @param Status 实例状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取备机信息
     * @return SlaveInfo 备机信息
     */
    public SlaveInfo getSlaveInfo() {
        return this.SlaveInfo;
    }

    /**
     * 设置备机信息
     * @param SlaveInfo 备机信息
     */
    public void setSlaveInfo(SlaveInfo SlaveInfo) {
        this.SlaveInfo = SlaveInfo;
    }

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取硬盘容量
     * @return Volume 硬盘容量
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置硬盘容量
     * @param Volume 硬盘容量
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取自动续费标志
     * @return AutoRenew 自动续费标志
     */
    public Integer getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * 设置自动续费标志
     * @param AutoRenew 自动续费标志
     */
    public void setAutoRenew(Integer AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * 获取数据复制方式
     * @return ProtectMode 数据复制方式
     */
    public Integer getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * 设置数据复制方式
     * @param ProtectMode 数据复制方式
     */
    public void setProtectMode(Integer ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * 获取只读组信息
     * @return RoGroups 只读组信息
     */
    public RoGroup [] getRoGroups() {
        return this.RoGroups;
    }

    /**
     * 设置只读组信息
     * @param RoGroups 只读组信息
     */
    public void setRoGroups(RoGroup [] RoGroups) {
        this.RoGroups = RoGroups;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例类型
     * @return InstanceType 实例类型
     */
    public Integer getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(Integer InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取地域信息
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取到期时间
     * @return DeadlineTime 到期时间
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * 设置到期时间
     * @param DeadlineTime 到期时间
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * 获取可用区部署方式
     * @return DeployMode 可用区部署方式
     */
    public Integer getDeployMode() {
        return this.DeployMode;
    }

    /**
     * 设置可用区部署方式
     * @param DeployMode 可用区部署方式
     */
    public void setDeployMode(Integer DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * 获取实例任务状态
     * @return TaskStatus 实例任务状态
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置实例任务状态
     * @param TaskStatus 实例任务状态
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取主实例信息
     * @return MasterInfo 主实例信息
     */
    public MasterInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * 设置主实例信息
     * @param MasterInfo 主实例信息
     */
    public void setMasterInfo(MasterInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * 获取实例售卖机型
     * @return DeviceType 实例售卖机型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置实例售卖机型
     * @param DeviceType 实例售卖机型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取内核版本
     * @return EngineVersion 内核版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * 设置内核版本
     * @param EngineVersion 内核版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取灾备实例信息
     * @return DrInfo 灾备实例信息
     */
    public DrInfo [] getDrInfo() {
        return this.DrInfo;
    }

    /**
     * 设置灾备实例信息
     * @param DrInfo 灾备实例信息
     */
    public void setDrInfo(DrInfo [] DrInfo) {
        this.DrInfo = DrInfo;
    }

    /**
     * 获取外网域名
     * @return WanDomain 外网域名
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * 设置外网域名
     * @param WanDomain 外网域名
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * 获取外网端口号
     * @return WanPort 外网端口号
     */
    public Integer getWanPort() {
        return this.WanPort;
    }

    /**
     * 设置外网端口号
     * @param WanPort 外网端口号
     */
    public void setWanPort(Integer WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * 获取付费类型
     * @return PayType 付费类型
     */
    public Integer getPayType() {
        return this.PayType;
    }

    /**
     * 设置付费类型
     * @param PayType 付费类型
     */
    public void setPayType(Integer PayType) {
        this.PayType = PayType;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实例IP
     * @return Vip 实例IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置实例IP
     * @param Vip 实例IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取端口号
     * @return Vport 端口号
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置端口号
     * @param Vport 端口号
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 获取实例状态
     * @return CdbError 实例状态
     */
    public Integer getCdbError() {
        return this.CdbError;
    }

    /**
     * 设置实例状态
     * @param CdbError 实例状态
     */
    public void setCdbError(Integer CdbError) {
        this.CdbError = CdbError;
    }

    /**
     * 获取私有网络描述符
     * @return UniqVpcId 私有网络描述符
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * 设置私有网络描述符
     * @param UniqVpcId 私有网络描述符
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * 获取子网描述符
     * @return UniqSubnetId 子网描述符
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * 设置子网描述符
     * @param UniqSubnetId 子网描述符
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamObj(map, prefix + "RoVipInfo.", this.RoVipInfo);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "SlaveInfo.", this.SlaveInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamArrayObj(map, prefix + "RoGroups.", this.RoGroups);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "MasterInfo.", this.MasterInfo);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "DrInfo.", this.DrInfo);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CdbError", this.CdbError);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);

    }
}


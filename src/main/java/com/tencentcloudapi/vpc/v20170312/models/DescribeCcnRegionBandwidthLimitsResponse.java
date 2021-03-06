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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnRegionBandwidthLimitsResponse  extends AbstractModel{

    /**
    * 云联网（CCN）各地域出带宽上限
    */
    @SerializedName("CcnRegionBandwidthLimitSet")
    @Expose
    private CcnRegionBandwidthLimit [] CcnRegionBandwidthLimitSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取云联网（CCN）各地域出带宽上限
     * @return CcnRegionBandwidthLimitSet 云联网（CCN）各地域出带宽上限
     */
    public CcnRegionBandwidthLimit [] getCcnRegionBandwidthLimitSet() {
        return this.CcnRegionBandwidthLimitSet;
    }

    /**
     * 设置云联网（CCN）各地域出带宽上限
     * @param CcnRegionBandwidthLimitSet 云联网（CCN）各地域出带宽上限
     */
    public void setCcnRegionBandwidthLimitSet(CcnRegionBandwidthLimit [] CcnRegionBandwidthLimitSet) {
        this.CcnRegionBandwidthLimitSet = CcnRegionBandwidthLimitSet;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CcnRegionBandwidthLimitSet.", this.CcnRegionBandwidthLimitSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


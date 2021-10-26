/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.model.UsageFargateHour;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Response containing the number of Fargate tasks run and hourly usage.
 */
@ApiModel(description = "Response containing the number of Fargate tasks run and hourly usage.")
@JsonPropertyOrder({ UsageFargateResponse.JSON_PROPERTY_USAGE })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageFargateResponse {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_USAGE = "usage";
    private List<UsageFargateHour> usage = null;

    public UsageFargateResponse usage(List<UsageFargateHour> usage) {
        this.usage = usage;
        for (UsageFargateHour item : usage) {
            this.unparsed |= item.unparsed;
        }
        return this;
    }

    public UsageFargateResponse addUsageItem(UsageFargateHour usageItem) {
        if (this.usage == null) {
            this.usage = new ArrayList<>();
        }
        this.usage.add(usageItem);
        this.unparsed |= usageItem.unparsed;
        return this;
    }

    /**
     * Array with the number of hourly Fargate tasks recorded for a given organization.
     * @return usage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Array with the number of hourly Fargate tasks recorded for a given organization.")
    @JsonProperty(JSON_PROPERTY_USAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<UsageFargateHour> getUsage() {
        return usage;
    }

    public void setUsage(List<UsageFargateHour> usage) {
        this.usage = usage;
    }

    /**
     * Return true if this UsageFargateResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageFargateResponse usageFargateResponse = (UsageFargateResponse) o;
        return Objects.equals(this.usage, usageFargateResponse.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageFargateResponse {\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

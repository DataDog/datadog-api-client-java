/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
import com.datadog.api.v2.client.model.MetricTagConfiguration;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response object which includes a single metric&#39;s tag configuration.
 */
@ApiModel(description = "Response object which includes a single metric's tag configuration.")
@JsonPropertyOrder({ MetricTagConfigurationResponse.JSON_PROPERTY_DATA })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricTagConfigurationResponse {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_DATA = "data";
    private MetricTagConfiguration data;

    public MetricTagConfigurationResponse data(MetricTagConfiguration data) {
        this.data = data;
        this.unparsed |= data.unparsed;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MetricTagConfiguration getData() {
        return data;
    }

    public void setData(MetricTagConfiguration data) {
        this.data = data;
    }

    /**
     * Return true if this MetricTagConfigurationResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricTagConfigurationResponse metricTagConfigurationResponse = (MetricTagConfigurationResponse) o;
        return Objects.equals(this.data, metricTagConfigurationResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricTagConfigurationResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

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
 * PagerDuty service object name.
 */
@ApiModel(description = "PagerDuty service object name.")
@JsonPropertyOrder({ PagerDutyServiceName.JSON_PROPERTY_SERVICE_NAME })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PagerDutyServiceName {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
    private String serviceName;

    public PagerDutyServiceName() {}

    @JsonCreator
    public PagerDutyServiceName(@JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_NAME) String serviceName) {
        this.serviceName = serviceName;
    }

    public PagerDutyServiceName serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Your service name associated service key in PagerDuty.
     * @return serviceName
     **/
    @ApiModelProperty(example = "", required = true, value = "Your service name associated service key in PagerDuty.")
    @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Return true if this PagerDutyServiceName object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagerDutyServiceName pagerDutyServiceName = (PagerDutyServiceName) o;
        return Objects.equals(this.serviceName, pagerDutyServiceName.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagerDutyServiceName {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

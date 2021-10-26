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
import com.datadog.api.v2.client.model.SecurityMonitoringSignalAttributes;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalType;
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
 * Object description of a security signal.
 */
@ApiModel(description = "Object description of a security signal.")
@JsonPropertyOrder(
    {
        SecurityMonitoringSignal.JSON_PROPERTY_ATTRIBUTES,
        SecurityMonitoringSignal.JSON_PROPERTY_ID,
        SecurityMonitoringSignal.JSON_PROPERTY_TYPE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringSignal {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private SecurityMonitoringSignalAttributes attributes;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private SecurityMonitoringSignalType type = SecurityMonitoringSignalType.SIGNAL;

    public SecurityMonitoringSignal attributes(SecurityMonitoringSignalAttributes attributes) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        return this;
    }

    /**
     * Get attributes
     * @return attributes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SecurityMonitoringSignalAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(SecurityMonitoringSignalAttributes attributes) {
        this.attributes = attributes;
    }

    public SecurityMonitoringSignal id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique ID of the security signal.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "AAAAAWgN8Xwgr1vKDQAAAABBV2dOOFh3ZzZobm1mWXJFYTR0OA", value = "The unique ID of the security signal.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SecurityMonitoringSignal type(SecurityMonitoringSignalType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SecurityMonitoringSignalType getType() {
        return type;
    }

    public void setType(SecurityMonitoringSignalType type) {
        if (!type.isValid()) {
            this.unparsed = true;
        }
        this.type = type;
    }

    /**
     * Return true if this SecurityMonitoringSignal object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityMonitoringSignal securityMonitoringSignal = (SecurityMonitoringSignal) o;
        return (
            Objects.equals(this.attributes, securityMonitoringSignal.attributes) &&
            Objects.equals(this.id, securityMonitoringSignal.id) &&
            Objects.equals(this.type, securityMonitoringSignal.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes, id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityMonitoringSignal {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

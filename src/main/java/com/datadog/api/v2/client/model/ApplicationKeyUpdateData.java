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
import com.datadog.api.v2.client.model.ApplicationKeyUpdateAttributes;
import com.datadog.api.v2.client.model.ApplicationKeysType;
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
 * Object used to update an application key.
 */
@ApiModel(description = "Object used to update an application key.")
@JsonPropertyOrder(
    {
        ApplicationKeyUpdateData.JSON_PROPERTY_ATTRIBUTES,
        ApplicationKeyUpdateData.JSON_PROPERTY_ID,
        ApplicationKeyUpdateData.JSON_PROPERTY_TYPE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationKeyUpdateData {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private ApplicationKeyUpdateAttributes attributes;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private ApplicationKeysType type = ApplicationKeysType.APPLICATION_KEYS;

    public ApplicationKeyUpdateData() {}

    @JsonCreator
    public ApplicationKeyUpdateData(
        @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES) ApplicationKeyUpdateAttributes attributes,
        @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
        @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ApplicationKeysType type
    ) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
    }

    public ApplicationKeyUpdateData attributes(ApplicationKeyUpdateAttributes attributes) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        return this;
    }

    /**
     * Get attributes
     * @return attributes
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ApplicationKeyUpdateAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ApplicationKeyUpdateAttributes attributes) {
        this.attributes = attributes;
    }

    public ApplicationKeyUpdateData id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the application key.
     * @return id
     **/
    @ApiModelProperty(example = "00112233-4455-6677-8899-aabbccddeeff", required = true, value = "ID of the application key.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationKeyUpdateData type(ApplicationKeysType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ApplicationKeysType getType() {
        return type;
    }

    public void setType(ApplicationKeysType type) {
        if (!type.isValid()) {
            this.unparsed = true;
        }
        this.type = type;
    }

    /**
     * Return true if this ApplicationKeyUpdateData object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationKeyUpdateData applicationKeyUpdateData = (ApplicationKeyUpdateData) o;
        return (
            Objects.equals(this.attributes, applicationKeyUpdateData.attributes) &&
            Objects.equals(this.id, applicationKeyUpdateData.id) &&
            Objects.equals(this.type, applicationKeyUpdateData.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes, id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationKeyUpdateData {\n");
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

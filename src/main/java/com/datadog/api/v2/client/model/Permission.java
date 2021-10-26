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
import com.datadog.api.v2.client.model.PermissionAttributes;
import com.datadog.api.v2.client.model.PermissionsType;
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
 * Permission object.
 */
@ApiModel(description = "Permission object.")
@JsonPropertyOrder({ Permission.JSON_PROPERTY_ATTRIBUTES, Permission.JSON_PROPERTY_ID, Permission.JSON_PROPERTY_TYPE })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Permission {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private PermissionAttributes attributes;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private PermissionsType type = PermissionsType.PERMISSIONS;

    public Permission() {}

    @JsonCreator
    public Permission(@JsonProperty(required = true, value = JSON_PROPERTY_TYPE) PermissionsType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
    }

    public Permission attributes(PermissionAttributes attributes) {
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
    public PermissionAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(PermissionAttributes attributes) {
        this.attributes = attributes;
    }

    public Permission id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the permission.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the permission.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Permission type(PermissionsType type) {
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
    public PermissionsType getType() {
        return type;
    }

    public void setType(PermissionsType type) {
        if (!type.isValid()) {
            this.unparsed = true;
        }
        this.type = type;
    }

    /**
     * Return true if this Permission object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission permission = (Permission) o;
        return (
            Objects.equals(this.attributes, permission.attributes) &&
            Objects.equals(this.id, permission.id) &&
            Objects.equals(this.type, permission.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes, id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Permission {\n");
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

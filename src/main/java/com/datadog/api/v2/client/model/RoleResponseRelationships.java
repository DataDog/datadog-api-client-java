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
import com.datadog.api.v2.client.model.RelationshipToPermissions;
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
 * Relationships of the role object returned by the API.
 */
@ApiModel(description = "Relationships of the role object returned by the API.")
@JsonPropertyOrder({ RoleResponseRelationships.JSON_PROPERTY_PERMISSIONS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleResponseRelationships {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
    private RelationshipToPermissions permissions;

    public RoleResponseRelationships permissions(RelationshipToPermissions permissions) {
        this.permissions = permissions;
        this.unparsed |= permissions.unparsed;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RelationshipToPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(RelationshipToPermissions permissions) {
        this.permissions = permissions;
    }

    /**
     * Return true if this RoleResponseRelationships object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleResponseRelationships roleResponseRelationships = (RoleResponseRelationships) o;
        return Objects.equals(this.permissions, roleResponseRelationships.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleResponseRelationships {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

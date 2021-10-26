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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes of the global variable.
 */
@ApiModel(description = "Attributes of the global variable.")
@JsonPropertyOrder({ SyntheticsGlobalVariableAttributes.JSON_PROPERTY_RESTRICTED_ROLES })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsGlobalVariableAttributes {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
    private List<String> restrictedRoles = null;

    public SyntheticsGlobalVariableAttributes restrictedRoles(List<String> restrictedRoles) {
        this.restrictedRoles = restrictedRoles;
        return this;
    }

    public SyntheticsGlobalVariableAttributes addRestrictedRolesItem(String restrictedRolesItem) {
        if (this.restrictedRoles == null) {
            this.restrictedRoles = new ArrayList<>();
        }
        this.restrictedRoles.add(restrictedRolesItem);
        return this;
    }

    /**
     * List of role identifiers that can be pulled from the Roles API.
     * @return restrictedRoles
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "List of role identifiers that can be pulled from the Roles API.")
    @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getRestrictedRoles() {
        return restrictedRoles;
    }

    public void setRestrictedRoles(List<String> restrictedRoles) {
        this.restrictedRoles = restrictedRoles;
    }

    /**
     * Return true if this SyntheticsGlobalVariable_attributes object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyntheticsGlobalVariableAttributes syntheticsGlobalVariableAttributes = (SyntheticsGlobalVariableAttributes) o;
        return Objects.equals(this.restrictedRoles, syntheticsGlobalVariableAttributes.restrictedRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restrictedRoles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyntheticsGlobalVariableAttributes {\n");
        sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
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

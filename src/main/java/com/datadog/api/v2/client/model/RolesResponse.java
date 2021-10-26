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
import com.datadog.api.v2.client.model.ResponseMetaAttributes;
import com.datadog.api.v2.client.model.Role;
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
 * Response containing information about multiple roles.
 */
@ApiModel(description = "Response containing information about multiple roles.")
@JsonPropertyOrder({ RolesResponse.JSON_PROPERTY_DATA, RolesResponse.JSON_PROPERTY_META })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RolesResponse {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_DATA = "data";
    private List<Role> data = null;

    public static final String JSON_PROPERTY_META = "meta";
    private ResponseMetaAttributes meta;

    public RolesResponse data(List<Role> data) {
        this.data = data;
        for (Role item : data) {
            this.unparsed |= item.unparsed;
        }
        return this;
    }

    public RolesResponse addDataItem(Role dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        this.unparsed |= dataItem.unparsed;
        return this;
    }

    /**
     * Array of returned roles.
     * @return data
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Array of returned roles.")
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Role> getData() {
        return data;
    }

    public void setData(List<Role> data) {
        this.data = data;
    }

    public RolesResponse meta(ResponseMetaAttributes meta) {
        this.meta = meta;
        this.unparsed |= meta.unparsed;
        return this;
    }

    /**
     * Get meta
     * @return meta
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ResponseMetaAttributes getMeta() {
        return meta;
    }

    public void setMeta(ResponseMetaAttributes meta) {
        this.meta = meta;
    }

    /**
     * Return true if this RolesResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolesResponse rolesResponse = (RolesResponse) o;
        return Objects.equals(this.data, rolesResponse.data) && Objects.equals(this.meta, rolesResponse.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolesResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

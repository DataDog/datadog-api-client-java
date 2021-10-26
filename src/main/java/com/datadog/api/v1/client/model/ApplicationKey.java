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
 * An application key with its associated metadata.
 */
@ApiModel(description = "An application key with its associated metadata.")
@JsonPropertyOrder({ ApplicationKey.JSON_PROPERTY_HASH, ApplicationKey.JSON_PROPERTY_NAME, ApplicationKey.JSON_PROPERTY_OWNER })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationKey {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_HASH = "hash";
    private String hash;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_OWNER = "owner";
    private String owner;

    /**
     * Hash of an application key.
     * @return hash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1234512345123459cda4eb9ced49a3d84fd0138c", value = "Hash of an application key.")
    @JsonProperty(JSON_PROPERTY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getHash() {
        return hash;
    }

    public ApplicationKey name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of an application key.
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "example user", value = "Name of an application key.")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Owner of an application key.
     * @return owner
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "example.com", value = "Owner of an application key.")
    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOwner() {
        return owner;
    }

    /**
     * Return true if this ApplicationKey object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationKey applicationKey = (ApplicationKey) o;
        return (
            Objects.equals(this.hash, applicationKey.hash) &&
            Objects.equals(this.name, applicationKey.name) &&
            Objects.equals(this.owner, applicationKey.owner)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash, name, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationKey {\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

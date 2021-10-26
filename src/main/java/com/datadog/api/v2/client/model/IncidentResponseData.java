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
import com.datadog.api.v2.client.model.IncidentResponseAttributes;
import com.datadog.api.v2.client.model.IncidentResponseRelationships;
import com.datadog.api.v2.client.model.IncidentType;
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
 * Incident data from a response.
 */
@ApiModel(description = "Incident data from a response.")
@JsonPropertyOrder(
    {
        IncidentResponseData.JSON_PROPERTY_ATTRIBUTES,
        IncidentResponseData.JSON_PROPERTY_ID,
        IncidentResponseData.JSON_PROPERTY_RELATIONSHIPS,
        IncidentResponseData.JSON_PROPERTY_TYPE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentResponseData {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private IncidentResponseAttributes attributes;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
    private IncidentResponseRelationships relationships;

    public static final String JSON_PROPERTY_TYPE = "type";
    private IncidentType type = IncidentType.INCIDENTS;

    public IncidentResponseData() {}

    @JsonCreator
    public IncidentResponseData(
        @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
        @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IncidentType type
    ) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
    }

    public IncidentResponseData attributes(IncidentResponseAttributes attributes) {
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
    public IncidentResponseAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(IncidentResponseAttributes attributes) {
        this.attributes = attributes;
    }

    public IncidentResponseData id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The incident&#39;s ID.
     * @return id
     **/
    @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The incident's ID.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IncidentResponseData relationships(IncidentResponseRelationships relationships) {
        this.relationships = relationships;
        this.unparsed |= relationships.unparsed;
        return this;
    }

    /**
     * Get relationships
     * @return relationships
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public IncidentResponseRelationships getRelationships() {
        return relationships;
    }

    public void setRelationships(IncidentResponseRelationships relationships) {
        this.relationships = relationships;
    }

    public IncidentResponseData type(IncidentType type) {
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
    public IncidentType getType() {
        return type;
    }

    public void setType(IncidentType type) {
        if (!type.isValid()) {
            this.unparsed = true;
        }
        this.type = type;
    }

    /**
     * Return true if this IncidentResponseData object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentResponseData incidentResponseData = (IncidentResponseData) o;
        return (
            Objects.equals(this.attributes, incidentResponseData.attributes) &&
            Objects.equals(this.id, incidentResponseData.id) &&
            Objects.equals(this.relationships, incidentResponseData.relationships) &&
            Objects.equals(this.type, incidentResponseData.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes, id, relationships, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentResponseData {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

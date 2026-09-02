/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The single JSON:API resource holding a computed Sankey diagram. Its attributes contain the
   * nodes of every column and the links that carry sessions between them.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsSankeyResponseData.JSON_PROPERTY_ATTRIBUTES,
  ProductAnalyticsSankeyResponseData.JSON_PROPERTY_ID,
  ProductAnalyticsSankeyResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyResponseData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ProductAnalyticsSankeyResponseAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsSankeyResponseType type;

  public ProductAnalyticsSankeyResponseData() {}

  @JsonCreator
  public ProductAnalyticsSankeyResponseData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)ProductAnalyticsSankeyResponseAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ProductAnalyticsSankeyResponseType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ProductAnalyticsSankeyResponseData attributes(ProductAnalyticsSankeyResponseAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes of a Sankey response, containing the nodes and the links between them.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsSankeyResponseAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(ProductAnalyticsSankeyResponseAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }
  public ProductAnalyticsSankeyResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Unique identifier for this response data object.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ProductAnalyticsSankeyResponseData type(ProductAnalyticsSankeyResponseType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The resource type identifier for a Sankey response.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsSankeyResponseType getType() {
        return type;
      }
  public void setType(ProductAnalyticsSankeyResponseType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsSankeyResponseData
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyResponseData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this ProductAnalyticsSankeyResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyResponseData productAnalyticsSankeyResponseData = (ProductAnalyticsSankeyResponseData) o;
    return Objects.equals(this.attributes, productAnalyticsSankeyResponseData.attributes) && Objects.equals(this.id, productAnalyticsSankeyResponseData.id) && Objects.equals(this.type, productAnalyticsSankeyResponseData.type) && Objects.equals(this.additionalProperties, productAnalyticsSankeyResponseData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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

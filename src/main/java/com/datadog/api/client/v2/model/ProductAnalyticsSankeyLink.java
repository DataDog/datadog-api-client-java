/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A link between two nodes in the Sankey diagram. */
@JsonPropertyOrder({
  ProductAnalyticsSankeyLink.JSON_PROPERTY_COLUMN,
  ProductAnalyticsSankeyLink.JSON_PROPERTY_ID,
  ProductAnalyticsSankeyLink.JSON_PROPERTY_SOURCE,
  ProductAnalyticsSankeyLink.JSON_PROPERTY_TARGET,
  ProductAnalyticsSankeyLink.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyLink {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private Long column;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public ProductAnalyticsSankeyLink column(Long column) {
    this.column = column;
    return this;
  }

  /**
   * The step column of the source node.
   *
   * @return column
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getColumn() {
    return column;
  }

  public void setColumn(Long column) {
    this.column = column;
  }

  public ProductAnalyticsSankeyLink id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Getid
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductAnalyticsSankeyLink source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source node ID.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ProductAnalyticsSankeyLink target(String target) {
    this.target = target;
    return this;
  }

  /**
   * The target node ID.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public ProductAnalyticsSankeyLink value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * The number of sessions through this link.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsSankeyLink
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyLink putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsSankeyLink object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyLink productAnalyticsSankeyLink = (ProductAnalyticsSankeyLink) o;
    return Objects.equals(this.column, productAnalyticsSankeyLink.column)
        && Objects.equals(this.id, productAnalyticsSankeyLink.id)
        && Objects.equals(this.source, productAnalyticsSankeyLink.source)
        && Objects.equals(this.target, productAnalyticsSankeyLink.target)
        && Objects.equals(this.value, productAnalyticsSankeyLink.value)
        && Objects.equals(
            this.additionalProperties, productAnalyticsSankeyLink.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, id, source, target, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyLink {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

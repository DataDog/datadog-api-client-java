/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Dataset object.
 *
 * <h3>Datasets Constraints</h3>
 *
 * <ul>
 *   <li><strong>Tag Limit per Dataset</strong>:
 *   <li>
 *       <p>Each restricted dataset supports a maximum of 10 key:value pairs per product.
 *   <li>
 *       <p><strong>Tag Key Rules per Telemetry Type</strong>:
 *   <li>Only one tag key or attribute may be used to define access within a single telemetry type.
 *   <li>
 *       <p>The same or different tag key may be used across different telemetry types.
 *   <li>
 *       <p><strong>Tag Value Uniqueness</strong>:
 *   <li>Tag values must be unique within a single dataset.
 *   <li>A tag value used in one dataset cannot be reused in another dataset of the same telemetry
 *       type.
 * </ul>
 */
@JsonPropertyOrder({
  Dataset.JSON_PROPERTY_ATTRIBUTES,
  Dataset.JSON_PROPERTY_ID,
  Dataset.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Dataset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DatasetAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Dataset() {}

  @JsonCreator
  public Dataset(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES) DatasetAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
  }

  public Dataset attributes(DatasetAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Dataset metadata and configuration(s).
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatasetAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DatasetAttributes attributes) {
    this.attributes = attributes;
  }

  public Dataset id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the dataset.
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

  public Dataset type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Resource type, always "dataset".
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return Dataset
   */
  @JsonAnySetter
  public Dataset putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Dataset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.attributes, dataset.attributes)
        && Objects.equals(this.id, dataset.id)
        && Objects.equals(this.type, dataset.type)
        && Objects.equals(this.additionalProperties, dataset.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

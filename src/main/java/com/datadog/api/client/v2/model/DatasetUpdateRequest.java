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

/** Edit request for a dataset. */
@JsonPropertyOrder({DatasetUpdateRequest.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private Dataset data;

  public DatasetUpdateRequest() {}

  @JsonCreator
  public DatasetUpdateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) Dataset data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public DatasetUpdateRequest data(Dataset data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

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
   *   <li>Only one tag key or attribute may be used to define access within a single telemetry
   *       type.
   *   <li>
   *       <p>The same or different tag key may be used across different telemetry types.
   *   <li>
   *       <p><strong>Tag Value Uniqueness</strong>:
   *   <li>Tag values must be unique within a single dataset.
   *   <li>A tag value used in one dataset cannot be reused in another dataset of the same telemetry
   *       type.
   * </ul>
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Dataset getData() {
    return data;
  }

  public void setData(Dataset data) {
    this.data = data;
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
   * @return DatasetUpdateRequest
   */
  @JsonAnySetter
  public DatasetUpdateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DatasetUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetUpdateRequest datasetUpdateRequest = (DatasetUpdateRequest) o;
    return Objects.equals(this.data, datasetUpdateRequest.data)
        && Objects.equals(this.additionalProperties, datasetUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetUpdateRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A page of temporary grant requests, ordered by UUID rather than creation time. */
@JsonPropertyOrder({
  TemporaryGrantRequestListResponse.JSON_PROPERTY_DATA,
  TemporaryGrantRequestListResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TemporaryGrantRequestListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TemporaryGrantRequestData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private TemporaryGrantRequestListMeta meta;

  public TemporaryGrantRequestListResponse() {}

  @JsonCreator
  public TemporaryGrantRequestListResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<TemporaryGrantRequestData> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_META)
          TemporaryGrantRequestListMeta meta) {
    this.data = data;
    for (TemporaryGrantRequestData item : data) {
      this.unparsed |= item.unparsed;
    }
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public TemporaryGrantRequestListResponse data(List<TemporaryGrantRequestData> data) {
    this.data = data;
    for (TemporaryGrantRequestData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TemporaryGrantRequestListResponse addDataItem(TemporaryGrantRequestData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Requests visible to the authenticated caller.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TemporaryGrantRequestData> getData() {
    return data;
  }

  public void setData(List<TemporaryGrantRequestData> data) {
    this.data = data;
    if (data != null) {
      for (TemporaryGrantRequestData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TemporaryGrantRequestListResponse meta(TemporaryGrantRequestListMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Pagination metadata.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TemporaryGrantRequestListMeta getMeta() {
    return meta;
  }

  public void setMeta(TemporaryGrantRequestListMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
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
   * @return TemporaryGrantRequestListResponse
   */
  @JsonAnySetter
  public TemporaryGrantRequestListResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TemporaryGrantRequestListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporaryGrantRequestListResponse temporaryGrantRequestListResponse =
        (TemporaryGrantRequestListResponse) o;
    return Objects.equals(this.data, temporaryGrantRequestListResponse.data)
        && Objects.equals(this.meta, temporaryGrantRequestListResponse.meta)
        && Objects.equals(
            this.additionalProperties, temporaryGrantRequestListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporaryGrantRequestListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

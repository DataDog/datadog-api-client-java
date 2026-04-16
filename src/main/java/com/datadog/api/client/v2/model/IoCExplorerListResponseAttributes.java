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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the IoC Explorer list response. */
@JsonPropertyOrder({
  IoCExplorerListResponseAttributes.JSON_PROPERTY_DATA,
  IoCExplorerListResponseAttributes.JSON_PROPERTY_METADATA,
  IoCExplorerListResponseAttributes.JSON_PROPERTY_PAGING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IoCExplorerListResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IoCIndicator> data = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private IoCExplorerListResponseMetadata metadata;

  public static final String JSON_PROPERTY_PAGING = "paging";
  private IoCExplorerListResponsePaging paging;

  public IoCExplorerListResponseAttributes data(List<IoCIndicator> data) {
    this.data = data;
    for (IoCIndicator item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IoCExplorerListResponseAttributes addDataItem(IoCIndicator dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of indicators of compromise.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IoCIndicator> getData() {
    return data;
  }

  public void setData(List<IoCIndicator> data) {
    this.data = data;
  }

  public IoCExplorerListResponseAttributes metadata(IoCExplorerListResponseMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Response metadata.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCExplorerListResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(IoCExplorerListResponseMetadata metadata) {
    this.metadata = metadata;
  }

  public IoCExplorerListResponseAttributes paging(IoCExplorerListResponsePaging paging) {
    this.paging = paging;
    this.unparsed |= paging.unparsed;
    return this;
  }

  /**
   * Pagination information.
   *
   * @return paging
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCExplorerListResponsePaging getPaging() {
    return paging;
  }

  public void setPaging(IoCExplorerListResponsePaging paging) {
    this.paging = paging;
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
   * @return IoCExplorerListResponseAttributes
   */
  @JsonAnySetter
  public IoCExplorerListResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IoCExplorerListResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCExplorerListResponseAttributes ioCExplorerListResponseAttributes =
        (IoCExplorerListResponseAttributes) o;
    return Objects.equals(this.data, ioCExplorerListResponseAttributes.data)
        && Objects.equals(this.metadata, ioCExplorerListResponseAttributes.metadata)
        && Objects.equals(this.paging, ioCExplorerListResponseAttributes.paging)
        && Objects.equals(
            this.additionalProperties, ioCExplorerListResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metadata, paging, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCExplorerListResponseAttributes {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

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

/** A scanning group of a target, with its rules included. */
@JsonPropertyOrder({
  SensitiveDataScannerTargetGroupResponse.JSON_PROPERTY_DATA,
  SensitiveDataScannerTargetGroupResponse.JSON_PROPERTY_INCLUDED,
  SensitiveDataScannerTargetGroupResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerTargetGroupResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SensitiveDataScannerTargetGroupData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<SensitiveDataScannerRuleIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, Object> meta = new HashMap<String, Object>();

  public SensitiveDataScannerTargetGroupResponse() {}

  @JsonCreator
  public SensitiveDataScannerTargetGroupResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          SensitiveDataScannerTargetGroupData data,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) Map<String, Object> meta) {
    this.data = data;
    this.unparsed |= data.unparsed;
    this.meta = meta;
  }

  public SensitiveDataScannerTargetGroupResponse data(SensitiveDataScannerTargetGroupData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * A scanning group of a target.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerTargetGroupData getData() {
    return data;
  }

  public void setData(SensitiveDataScannerTargetGroupData data) {
    this.data = data;
    if (data != null) {
      this.unparsed |= data.unparsed;
    }
  }

  public SensitiveDataScannerTargetGroupResponse included(
      List<SensitiveDataScannerRuleIncludedItem> included) {
    this.included = included;
    if (included != null) {
      for (SensitiveDataScannerRuleIncludedItem item : included) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SensitiveDataScannerTargetGroupResponse addIncludedItem(
      SensitiveDataScannerRuleIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Rules of the returned groups.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SensitiveDataScannerRuleIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<SensitiveDataScannerRuleIncludedItem> included) {
    this.included = included;
    if (included != null) {
      for (SensitiveDataScannerRuleIncludedItem item : included) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SensitiveDataScannerTargetGroupResponse meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public SensitiveDataScannerTargetGroupResponse putMetaItem(String key, Object metaItem) {
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Meta response. Always an empty object.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
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
   * @return SensitiveDataScannerTargetGroupResponse
   */
  @JsonAnySetter
  public SensitiveDataScannerTargetGroupResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerTargetGroupResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerTargetGroupResponse sensitiveDataScannerTargetGroupResponse =
        (SensitiveDataScannerTargetGroupResponse) o;
    return Objects.equals(this.data, sensitiveDataScannerTargetGroupResponse.data)
        && Objects.equals(this.included, sensitiveDataScannerTargetGroupResponse.included)
        && Objects.equals(this.meta, sensitiveDataScannerTargetGroupResponse.meta)
        && Objects.equals(
            this.additionalProperties,
            sensitiveDataScannerTargetGroupResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerTargetGroupResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

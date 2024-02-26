/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The counts of monitors per different criteria. */
@JsonPropertyOrder({
  MonitorSearchResponseCounts.JSON_PROPERTY_MUTED,
  MonitorSearchResponseCounts.JSON_PROPERTY_STATUS,
  MonitorSearchResponseCounts.JSON_PROPERTY_TAG,
  MonitorSearchResponseCounts.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResponseCounts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MUTED = "muted";
  private List<MonitorSearchCountItem> muted = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<MonitorSearchCountItem> status = null;

  public static final String JSON_PROPERTY_TAG = "tag";
  private List<MonitorSearchCountItem> tag = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<MonitorSearchCountItem> type = null;

  public MonitorSearchResponseCounts muted(List<MonitorSearchCountItem> muted) {
    this.muted = muted;
    for (MonitorSearchCountItem item : muted) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorSearchResponseCounts addMutedItem(MonitorSearchCountItem mutedItem) {
    if (this.muted == null) {
      this.muted = new ArrayList<>();
    }
    this.muted.add(mutedItem);
    this.unparsed |= mutedItem.unparsed;
    return this;
  }

  /**
   * Search facets.
   *
   * @return muted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorSearchCountItem> getMuted() {
    return muted;
  }

  public void setMuted(List<MonitorSearchCountItem> muted) {
    this.muted = muted;
  }

  public MonitorSearchResponseCounts status(List<MonitorSearchCountItem> status) {
    this.status = status;
    for (MonitorSearchCountItem item : status) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorSearchResponseCounts addStatusItem(MonitorSearchCountItem statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    this.unparsed |= statusItem.unparsed;
    return this;
  }

  /**
   * Search facets.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorSearchCountItem> getStatus() {
    return status;
  }

  public void setStatus(List<MonitorSearchCountItem> status) {
    this.status = status;
  }

  public MonitorSearchResponseCounts tag(List<MonitorSearchCountItem> tag) {
    this.tag = tag;
    for (MonitorSearchCountItem item : tag) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorSearchResponseCounts addTagItem(MonitorSearchCountItem tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    this.unparsed |= tagItem.unparsed;
    return this;
  }

  /**
   * Search facets.
   *
   * @return tag
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorSearchCountItem> getTag() {
    return tag;
  }

  public void setTag(List<MonitorSearchCountItem> tag) {
    this.tag = tag;
  }

  public MonitorSearchResponseCounts type(List<MonitorSearchCountItem> type) {
    this.type = type;
    for (MonitorSearchCountItem item : type) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorSearchResponseCounts addTypeItem(MonitorSearchCountItem typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    this.unparsed |= typeItem.unparsed;
    return this;
  }

  /**
   * Search facets.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorSearchCountItem> getType() {
    return type;
  }

  public void setType(List<MonitorSearchCountItem> type) {
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
   * @return MonitorSearchResponseCounts
   */
  @JsonAnySetter
  public MonitorSearchResponseCounts putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorSearchResponseCounts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResponseCounts monitorSearchResponseCounts = (MonitorSearchResponseCounts) o;
    return Objects.equals(this.muted, monitorSearchResponseCounts.muted)
        && Objects.equals(this.status, monitorSearchResponseCounts.status)
        && Objects.equals(this.tag, monitorSearchResponseCounts.tag)
        && Objects.equals(this.type, monitorSearchResponseCounts.type)
        && Objects.equals(
            this.additionalProperties, monitorSearchResponseCounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(muted, status, tag, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResponseCounts {\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

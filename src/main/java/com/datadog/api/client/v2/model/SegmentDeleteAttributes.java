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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a deleted segment. */
@JsonPropertyOrder({
  SegmentDeleteAttributes.JSON_PROPERTY_DISABLED_AT,
  SegmentDeleteAttributes.JSON_PROPERTY_DISABLED_BY,
  SegmentDeleteAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentDeleteAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED_AT = "disabled_at";
  private OffsetDateTime disabledAt;

  public static final String JSON_PROPERTY_DISABLED_BY = "disabled_by";
  private SegmentUser disabledBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SegmentDeleteAttributes() {}

  @JsonCreator
  public SegmentDeleteAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISABLED_AT) OffsetDateTime disabledAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.disabledAt = disabledAt;
    this.name = name;
  }

  public SegmentDeleteAttributes disabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
    return this;
  }

  /**
   * Time the segment was deleted.
   *
   * @return disabledAt
   */
  @JsonProperty(JSON_PROPERTY_DISABLED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDisabledAt() {
    return disabledAt;
  }

  public void setDisabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
  }

  public SegmentDeleteAttributes disabledBy(SegmentUser disabledBy) {
    this.disabledBy = disabledBy;
    this.unparsed |= disabledBy.unparsed;
    return this;
  }

  /**
   * A Datadog user who created, modified, or disabled a segment.
   *
   * @return disabledBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SegmentUser getDisabledBy() {
    return disabledBy;
  }

  public void setDisabledBy(SegmentUser disabledBy) {
    this.disabledBy = disabledBy;
    if (disabledBy != null) {
      this.unparsed |= disabledBy.unparsed;
    }
  }

  public SegmentDeleteAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the segment.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return SegmentDeleteAttributes
   */
  @JsonAnySetter
  public SegmentDeleteAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentDeleteAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDeleteAttributes segmentDeleteAttributes = (SegmentDeleteAttributes) o;
    return Objects.equals(this.disabledAt, segmentDeleteAttributes.disabledAt)
        && Objects.equals(this.disabledBy, segmentDeleteAttributes.disabledBy)
        && Objects.equals(this.name, segmentDeleteAttributes.name)
        && Objects.equals(this.additionalProperties, segmentDeleteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledAt, disabledBy, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDeleteAttributes {\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    disabledBy: ").append(toIndentedString(disabledBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

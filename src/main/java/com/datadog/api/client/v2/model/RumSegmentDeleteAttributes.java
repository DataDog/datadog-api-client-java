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

/** Attributes of a deleted segment response. */
@JsonPropertyOrder({
  RumSegmentDeleteAttributes.JSON_PROPERTY_DISABLED_AT,
  RumSegmentDeleteAttributes.JSON_PROPERTY_DISABLED_BY,
  RumSegmentDeleteAttributes.JSON_PROPERTY_NAME,
  RumSegmentDeleteAttributes.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentDeleteAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED_AT = "disabled_at";
  private OffsetDateTime disabledAt;

  public static final String JSON_PROPERTY_DISABLED_BY = "disabled_by";
  private RumSegmentUser disabledBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public RumSegmentDeleteAttributes() {}

  @JsonCreator
  public RumSegmentDeleteAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISABLED_AT) OffsetDateTime disabledAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISABLED_BY) RumSegmentUser disabledBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) String uuid) {
    this.disabledAt = disabledAt;
    this.disabledBy = disabledBy;
    this.unparsed |= disabledBy.unparsed;
    this.name = name;
    this.uuid = uuid;
  }

  public RumSegmentDeleteAttributes disabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
    return this;
  }

  /**
   * The timestamp when the segment was disabled in RFC 3339 format.
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

  public RumSegmentDeleteAttributes disabledBy(RumSegmentUser disabledBy) {
    this.disabledBy = disabledBy;
    this.unparsed |= disabledBy.unparsed;
    return this;
  }

  /**
   * A user who performed an action on a segment.
   *
   * @return disabledBy
   */
  @JsonProperty(JSON_PROPERTY_DISABLED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentUser getDisabledBy() {
    return disabledBy;
  }

  public void setDisabledBy(RumSegmentUser disabledBy) {
    this.disabledBy = disabledBy;
  }

  public RumSegmentDeleteAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the deleted segment.
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

  public RumSegmentDeleteAttributes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The unique identifier of the deleted segment.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
   * @return RumSegmentDeleteAttributes
   */
  @JsonAnySetter
  public RumSegmentDeleteAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentDeleteAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentDeleteAttributes rumSegmentDeleteAttributes = (RumSegmentDeleteAttributes) o;
    return Objects.equals(this.disabledAt, rumSegmentDeleteAttributes.disabledAt)
        && Objects.equals(this.disabledBy, rumSegmentDeleteAttributes.disabledBy)
        && Objects.equals(this.name, rumSegmentDeleteAttributes.name)
        && Objects.equals(this.uuid, rumSegmentDeleteAttributes.uuid)
        && Objects.equals(
            this.additionalProperties, rumSegmentDeleteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledAt, disabledBy, name, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentDeleteAttributes {\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    disabledBy: ").append(toIndentedString(disabledBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

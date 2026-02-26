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

/** Pagination metadata. */
@JsonPropertyOrder({
  IncidentNotificationRuleArrayMetaPage.JSON_PROPERTY_NEXT_OFFSET,
  IncidentNotificationRuleArrayMetaPage.JSON_PROPERTY_OFFSET,
  IncidentNotificationRuleArrayMetaPage.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationRuleArrayMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT_OFFSET = "next_offset";
  private Long nextOffset;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public IncidentNotificationRuleArrayMetaPage nextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  /**
   * The offset for the next page of results.
   *
   * @return nextOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
  }

  public IncidentNotificationRuleArrayMetaPage offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The current offset in the results.
   *
   * @return offset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public IncidentNotificationRuleArrayMetaPage size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The number of results returned per page.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
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
   * @return IncidentNotificationRuleArrayMetaPage
   */
  @JsonAnySetter
  public IncidentNotificationRuleArrayMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentNotificationRuleArrayMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationRuleArrayMetaPage incidentNotificationRuleArrayMetaPage =
        (IncidentNotificationRuleArrayMetaPage) o;
    return Objects.equals(this.nextOffset, incidentNotificationRuleArrayMetaPage.nextOffset)
        && Objects.equals(this.offset, incidentNotificationRuleArrayMetaPage.offset)
        && Objects.equals(this.size, incidentNotificationRuleArrayMetaPage.size)
        && Objects.equals(
            this.additionalProperties, incidentNotificationRuleArrayMetaPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextOffset, offset, size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationRuleArrayMetaPage {\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

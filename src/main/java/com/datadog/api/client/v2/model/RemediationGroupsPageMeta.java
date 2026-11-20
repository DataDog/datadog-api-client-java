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

/** Pagination of the search. */
@JsonPropertyOrder({
  RemediationGroupsPageMeta.JSON_PROPERTY_NUMBER,
  RemediationGroupsPageMeta.JSON_PROPERTY_SIZE,
  RemediationGroupsPageMeta.JSON_PROPERTY_TOTAL_FILTERED_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupsPageMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NUMBER = "number";
  private Long number;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public RemediationGroupsPageMeta() {}

  @JsonCreator
  public RemediationGroupsPageMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMBER) Long number,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_FILTERED_COUNT)
          Long totalFilteredCount) {
    this.number = number;
    this.size = size;
    this.totalFilteredCount = totalFilteredCount;
  }

  public RemediationGroupsPageMeta number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * Page number, starting at 1.
   *
   * @return number
   */
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public RemediationGroupsPageMeta size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Page size.
   *
   * @return size
   */
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public RemediationGroupsPageMeta totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * Number of groups that match the search across all pages.
   *
   * @return totalFilteredCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalFilteredCount() {
    return totalFilteredCount;
  }

  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
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
   * @return RemediationGroupsPageMeta
   */
  @JsonAnySetter
  public RemediationGroupsPageMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupsPageMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupsPageMeta remediationGroupsPageMeta = (RemediationGroupsPageMeta) o;
    return Objects.equals(this.number, remediationGroupsPageMeta.number)
        && Objects.equals(this.size, remediationGroupsPageMeta.size)
        && Objects.equals(this.totalFilteredCount, remediationGroupsPageMeta.totalFilteredCount)
        && Objects.equals(
            this.additionalProperties, remediationGroupsPageMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, size, totalFilteredCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupsPageMeta {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
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

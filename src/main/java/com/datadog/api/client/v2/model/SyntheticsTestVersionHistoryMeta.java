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
import org.openapitools.jackson.nullable.JsonNullable;

/** Pagination metadata for a version history response. */
@JsonPropertyOrder({
  SyntheticsTestVersionHistoryMeta.JSON_PROPERTY_NEXT_LAST_VERSION_NUMBER,
  SyntheticsTestVersionHistoryMeta.JSON_PROPERTY_RETENTION_PERIOD_IN_DAYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestVersionHistoryMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT_LAST_VERSION_NUMBER = "next_last_version_number";
  private JsonNullable<Long> nextLastVersionNumber = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RETENTION_PERIOD_IN_DAYS = "retention_period_in_days";
  private Long retentionPeriodInDays;

  public SyntheticsTestVersionHistoryMeta nextLastVersionNumber(Long nextLastVersionNumber) {
    this.nextLastVersionNumber = JsonNullable.<Long>of(nextLastVersionNumber);
    return this;
  }

  /**
   * The version number to use as the <code>last_version_number</code> query parameter to fetch the
   * next page. <code>null</code> indicates there are no more pages.
   *
   * @return nextLastVersionNumber
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNextLastVersionNumber() {
    return nextLastVersionNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_LAST_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNextLastVersionNumber_JsonNullable() {
    return nextLastVersionNumber;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_LAST_VERSION_NUMBER)
  public void setNextLastVersionNumber_JsonNullable(JsonNullable<Long> nextLastVersionNumber) {
    this.nextLastVersionNumber = nextLastVersionNumber;
  }

  public void setNextLastVersionNumber(Long nextLastVersionNumber) {
    this.nextLastVersionNumber = JsonNullable.<Long>of(nextLastVersionNumber);
  }

  public SyntheticsTestVersionHistoryMeta retentionPeriodInDays(Long retentionPeriodInDays) {
    this.retentionPeriodInDays = retentionPeriodInDays;
    return this;
  }

  /**
   * The number of days that version history is retained.
   *
   * @return retentionPeriodInDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION_PERIOD_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRetentionPeriodInDays() {
    return retentionPeriodInDays;
  }

  public void setRetentionPeriodInDays(Long retentionPeriodInDays) {
    this.retentionPeriodInDays = retentionPeriodInDays;
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
   * @return SyntheticsTestVersionHistoryMeta
   */
  @JsonAnySetter
  public SyntheticsTestVersionHistoryMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestVersionHistoryMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestVersionHistoryMeta syntheticsTestVersionHistoryMeta =
        (SyntheticsTestVersionHistoryMeta) o;
    return Objects.equals(
            this.nextLastVersionNumber, syntheticsTestVersionHistoryMeta.nextLastVersionNumber)
        && Objects.equals(
            this.retentionPeriodInDays, syntheticsTestVersionHistoryMeta.retentionPeriodInDays)
        && Objects.equals(
            this.additionalProperties, syntheticsTestVersionHistoryMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextLastVersionNumber, retentionPeriodInDays, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestVersionHistoryMeta {\n");
    sb.append("    nextLastVersionNumber: ")
        .append(toIndentedString(nextLastVersionNumber))
        .append("\n");
    sb.append("    retentionPeriodInDays: ")
        .append(toIndentedString(retentionPeriodInDays))
        .append("\n");
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

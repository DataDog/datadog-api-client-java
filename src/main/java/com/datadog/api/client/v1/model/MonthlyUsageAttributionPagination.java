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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The metadata for the current pagination. */
@JsonPropertyOrder({MonthlyUsageAttributionPagination.JSON_PROPERTY_NEXT_RECORD_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyUsageAttributionPagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT_RECORD_ID = "next_record_id";
  private JsonNullable<String> nextRecordId = JsonNullable.<String>undefined();

  public MonthlyUsageAttributionPagination nextRecordId(String nextRecordId) {
    this.nextRecordId = JsonNullable.<String>of(nextRecordId);
    return this;
  }

  /**
   * The cursor to use to get the next results, if any. To make the next request, use the same
   * parameters with the addition of the <code>next_record_id</code>.
   *
   * @return nextRecordId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNextRecordId() {
    return nextRecordId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNextRecordId_JsonNullable() {
    return nextRecordId;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_RECORD_ID)
  public void setNextRecordId_JsonNullable(JsonNullable<String> nextRecordId) {
    this.nextRecordId = nextRecordId;
  }

  public void setNextRecordId(String nextRecordId) {
    this.nextRecordId = JsonNullable.<String>of(nextRecordId);
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
   * @return MonthlyUsageAttributionPagination
   */
  @JsonAnySetter
  public MonthlyUsageAttributionPagination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonthlyUsageAttributionPagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyUsageAttributionPagination monthlyUsageAttributionPagination =
        (MonthlyUsageAttributionPagination) o;
    return Objects.equals(this.nextRecordId, monthlyUsageAttributionPagination.nextRecordId)
        && Objects.equals(
            this.additionalProperties, monthlyUsageAttributionPagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextRecordId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyUsageAttributionPagination {\n");
    sb.append("    nextRecordId: ").append(toIndentedString(nextRecordId)).append("\n");
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

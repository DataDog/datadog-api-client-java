/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Product Analytics retention scale configuration.</p>
 */
@JsonPropertyOrder({
  RUMProductAnalyticsRetentionScale.JSON_PROPERTY_LAST_MODIFIED_AT,
  RUMProductAnalyticsRetentionScale.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMProductAnalyticsRetentionScale {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_MODIFIED_AT = "last_modified_at";
  private Long lastModifiedAt;

  public static final String JSON_PROPERTY_STATE = "state";
  private RUMProductAnalyticsRetentionState state;

  public RUMProductAnalyticsRetentionScale lastModifiedAt(Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * <p>Timestamp in milliseconds when this scale was last modified.</p>
   * @return lastModifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLastModifiedAt() {
        return lastModifiedAt;
      }
  public void setLastModifiedAt(Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }
  public RUMProductAnalyticsRetentionScale state(RUMProductAnalyticsRetentionState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * <p>Controls the retention policy for Product Analytics data derived from RUM events.</p>
   * @return state
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RUMProductAnalyticsRetentionState getState() {
        return state;
      }
  public void setState(RUMProductAnalyticsRetentionState state) {
    if (!state.isValid()) {
        this.unparsed = true;
    }
    this.state = state;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RUMProductAnalyticsRetentionScale
   */
  @JsonAnySetter
  public RUMProductAnalyticsRetentionScale putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this RUMProductAnalyticsRetentionScale object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMProductAnalyticsRetentionScale rumProductAnalyticsRetentionScale = (RUMProductAnalyticsRetentionScale) o;
    return Objects.equals(this.lastModifiedAt, rumProductAnalyticsRetentionScale.lastModifiedAt) && Objects.equals(this.state, rumProductAnalyticsRetentionScale.state) && Objects.equals(this.additionalProperties, rumProductAnalyticsRetentionScale.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedAt,state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMProductAnalyticsRetentionScale {\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

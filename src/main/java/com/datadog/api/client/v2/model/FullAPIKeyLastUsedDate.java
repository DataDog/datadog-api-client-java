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

/** Attributes for the last time the specific API key was used. */
@JsonPropertyOrder({
  FullAPIKeyLastUsedDate.JSON_PROPERTY_DESCRIPTION,
  FullAPIKeyLastUsedDate.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FullAPIKeyLastUsedDate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private JsonNullable<String> timestamp = JsonNullable.<String>undefined();

  public FullAPIKeyLastUsedDate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the what the API key was used for.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FullAPIKeyLastUsedDate timestamp(String timestamp) {
    this.timestamp = JsonNullable.<String>of(timestamp);
    return this;
  }

  /**
   * The data and time of when the API key was last used.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTimestamp() {
    return timestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTimestamp_JsonNullable() {
    return timestamp;
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  public void setTimestamp_JsonNullable(JsonNullable<String> timestamp) {
    this.timestamp = timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = JsonNullable.<String>of(timestamp);
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
   * @return FullAPIKeyLastUsedDate
   */
  @JsonAnySetter
  public FullAPIKeyLastUsedDate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FullAPIKeyLastUsedDate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIKeyLastUsedDate fullApiKeyLastUsedDate = (FullAPIKeyLastUsedDate) o;
    return Objects.equals(this.description, fullApiKeyLastUsedDate.description)
        && Objects.equals(this.timestamp, fullApiKeyLastUsedDate.timestamp)
        && Objects.equals(this.additionalProperties, fullApiKeyLastUsedDate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIKeyLastUsedDate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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

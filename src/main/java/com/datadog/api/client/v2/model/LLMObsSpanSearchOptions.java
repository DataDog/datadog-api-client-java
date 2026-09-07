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

/** Additional options for a span search request. */
@JsonPropertyOrder({
  LLMObsSpanSearchOptions.JSON_PROPERTY_INCLUDE_ATTACHMENTS,
  LLMObsSpanSearchOptions.JSON_PROPERTY_TIME_OFFSET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpanSearchOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ATTACHMENTS = "include_attachments";
  private Boolean includeAttachments;

  public static final String JSON_PROPERTY_TIME_OFFSET = "time_offset";
  private Long timeOffset;

  public LLMObsSpanSearchOptions includeAttachments(Boolean includeAttachments) {
    this.includeAttachments = includeAttachments;
    return this;
  }

  /**
   * Whether to include attachment data in the response. Defaults to <code>true</code>.
   *
   * @return includeAttachments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeAttachments() {
    return includeAttachments;
  }

  public void setIncludeAttachments(Boolean includeAttachments) {
    this.includeAttachments = includeAttachments;
  }

  public LLMObsSpanSearchOptions timeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  /**
   * Offset in seconds applied to both <code>from</code> and <code>to</code> timestamps.
   *
   * @return timeOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeOffset() {
    return timeOffset;
  }

  public void setTimeOffset(Long timeOffset) {
    this.timeOffset = timeOffset;
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
   * @return LLMObsSpanSearchOptions
   */
  @JsonAnySetter
  public LLMObsSpanSearchOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpanSearchOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpanSearchOptions llmObsSpanSearchOptions = (LLMObsSpanSearchOptions) o;
    return Objects.equals(this.includeAttachments, llmObsSpanSearchOptions.includeAttachments)
        && Objects.equals(this.timeOffset, llmObsSpanSearchOptions.timeOffset)
        && Objects.equals(this.additionalProperties, llmObsSpanSearchOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeAttachments, timeOffset, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpanSearchOptions {\n");
    sb.append("    includeAttachments: ").append(toIndentedString(includeAttachments)).append("\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
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

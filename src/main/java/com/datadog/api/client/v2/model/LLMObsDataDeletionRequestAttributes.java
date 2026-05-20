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

/** Attributes for an LLM Observability data deletion request. */
@JsonPropertyOrder({
  LLMObsDataDeletionRequestAttributes.JSON_PROPERTY_DELAY,
  LLMObsDataDeletionRequestAttributes.JSON_PROPERTY_FROM,
  LLMObsDataDeletionRequestAttributes.JSON_PROPERTY_QUERY,
  LLMObsDataDeletionRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDataDeletionRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELAY = "delay";
  private Long delay;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Map<String, String> query = new HashMap<String, String>();

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public LLMObsDataDeletionRequestAttributes() {}

  @JsonCreator
  public LLMObsDataDeletionRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) Map<String, String> query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.to = to;
  }

  public LLMObsDataDeletionRequestAttributes delay(Long delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Optional delay in seconds before the deletion is executed.
   *
   * @return delay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDelay() {
    return delay;
  }

  public void setDelay(Long delay) {
    this.delay = delay;
  }

  public LLMObsDataDeletionRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the deletion time range in milliseconds since Unix epoch.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public LLMObsDataDeletionRequestAttributes query(Map<String, String> query) {
    this.query = query;
    return this;
  }

  public LLMObsDataDeletionRequestAttributes putQueryItem(String key, String queryItem) {
    this.query.put(key, queryItem);
    return this;
  }

  /**
   * Query filters selecting the data to delete. Must include a <code>query</code> key with an
   * <code>@trace_id</code> filter.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getQuery() {
    return query;
  }

  public void setQuery(Map<String, String> query) {
    this.query = query;
  }

  public LLMObsDataDeletionRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the deletion time range in milliseconds since Unix epoch.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
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
   * @return LLMObsDataDeletionRequestAttributes
   */
  @JsonAnySetter
  public LLMObsDataDeletionRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDataDeletionRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDataDeletionRequestAttributes llmObsDataDeletionRequestAttributes =
        (LLMObsDataDeletionRequestAttributes) o;
    return Objects.equals(this.delay, llmObsDataDeletionRequestAttributes.delay)
        && Objects.equals(this.from, llmObsDataDeletionRequestAttributes.from)
        && Objects.equals(this.query, llmObsDataDeletionRequestAttributes.query)
        && Objects.equals(this.to, llmObsDataDeletionRequestAttributes.to)
        && Objects.equals(
            this.additionalProperties, llmObsDataDeletionRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, from, query, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDataDeletionRequestAttributes {\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

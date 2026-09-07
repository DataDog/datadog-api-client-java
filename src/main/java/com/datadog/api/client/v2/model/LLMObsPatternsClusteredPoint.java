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

/** A single data point grouped into a topic. */
@JsonPropertyOrder({
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_EVENT_ID,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_ID,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_INPUT,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_IS_INCLUDED,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_IS_SUGGESTED,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_SESSION_ID,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_SPAN_ID,
  LLMObsPatternsClusteredPoint.JSON_PROPERTY_TOPIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsClusteredPoint {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUT = "input";
  private String input;

  public static final String JSON_PROPERTY_IS_INCLUDED = "is_included";
  private Boolean isIncluded;

  public static final String JSON_PROPERTY_IS_SUGGESTED = "is_suggested";
  private Boolean isSuggested;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_TOPIC_ID = "topic_id";
  private String topicId;

  public LLMObsPatternsClusteredPoint() {}

  @JsonCreator
  public LLMObsPatternsClusteredPoint(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_ID) String eventId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT) String input,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_INCLUDED) Boolean isIncluded,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_SUGGESTED) Boolean isSuggested,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_ID) String sessionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_ID) String spanId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOPIC_ID) String topicId) {
    this.eventId = eventId;
    this.id = id;
    this.input = input;
    this.isIncluded = isIncluded;
    this.isSuggested = isSuggested;
    this.sessionId = sessionId;
    this.spanId = spanId;
    this.topicId = topicId;
  }

  public LLMObsPatternsClusteredPoint eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Identifier of the source event.
   *
   * @return eventId
   */
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public LLMObsPatternsClusteredPoint id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the clustered point.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsPatternsClusteredPoint input(String input) {
    this.input = input;
    return this;
  }

  /**
   * Input text of the source span.
   *
   * @return input
   */
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public LLMObsPatternsClusteredPoint isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

  /**
   * Whether the point is included in the patterns dataset.
   *
   * @return isIncluded
   */
  @JsonProperty(JSON_PROPERTY_IS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public LLMObsPatternsClusteredPoint isSuggested(Boolean isSuggested) {
    this.isSuggested = isSuggested;
    return this;
  }

  /**
   * Whether the point is suggested for inclusion in the patterns dataset.
   *
   * @return isSuggested
   */
  @JsonProperty(JSON_PROPERTY_IS_SUGGESTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsSuggested() {
    return isSuggested;
  }

  public void setIsSuggested(Boolean isSuggested) {
    this.isSuggested = isSuggested;
  }

  public LLMObsPatternsClusteredPoint sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Identifier of the source session.
   *
   * @return sessionId
   */
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public LLMObsPatternsClusteredPoint spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Identifier of the source span.
   *
   * @return spanId
   */
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public LLMObsPatternsClusteredPoint topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

  /**
   * Identifier of the topic the point belongs to.
   *
   * @return topicId
   */
  @JsonProperty(JSON_PROPERTY_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
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
   * @return LLMObsPatternsClusteredPoint
   */
  @JsonAnySetter
  public LLMObsPatternsClusteredPoint putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsClusteredPoint object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsClusteredPoint llmObsPatternsClusteredPoint = (LLMObsPatternsClusteredPoint) o;
    return Objects.equals(this.eventId, llmObsPatternsClusteredPoint.eventId)
        && Objects.equals(this.id, llmObsPatternsClusteredPoint.id)
        && Objects.equals(this.input, llmObsPatternsClusteredPoint.input)
        && Objects.equals(this.isIncluded, llmObsPatternsClusteredPoint.isIncluded)
        && Objects.equals(this.isSuggested, llmObsPatternsClusteredPoint.isSuggested)
        && Objects.equals(this.sessionId, llmObsPatternsClusteredPoint.sessionId)
        && Objects.equals(this.spanId, llmObsPatternsClusteredPoint.spanId)
        && Objects.equals(this.topicId, llmObsPatternsClusteredPoint.topicId)
        && Objects.equals(
            this.additionalProperties, llmObsPatternsClusteredPoint.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventId,
        id,
        input,
        isIncluded,
        isSuggested,
        sessionId,
        spanId,
        topicId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsClusteredPoint {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    isSuggested: ").append(toIndentedString(isSuggested)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
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

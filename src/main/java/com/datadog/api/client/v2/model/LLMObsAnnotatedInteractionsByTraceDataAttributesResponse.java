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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the cross-queue annotated interactions response. */
@JsonPropertyOrder({
  LLMObsAnnotatedInteractionsByTraceDataAttributesResponse.JSON_PROPERTY_ANNOTATED_INTERACTIONS,
  LLMObsAnnotatedInteractionsByTraceDataAttributesResponse.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotatedInteractionsByTraceDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATED_INTERACTIONS = "annotated_interactions";
  private List<LLMObsAnnotatedInteractionByTraceItem> annotatedInteractions = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Integer totalCount;

  public LLMObsAnnotatedInteractionsByTraceDataAttributesResponse() {}

  @JsonCreator
  public LLMObsAnnotatedInteractionsByTraceDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATED_INTERACTIONS)
          List<LLMObsAnnotatedInteractionByTraceItem> annotatedInteractions,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_COUNT) Integer totalCount) {
    this.annotatedInteractions = annotatedInteractions;
    this.totalCount = totalCount;
  }

  public LLMObsAnnotatedInteractionsByTraceDataAttributesResponse annotatedInteractions(
      List<LLMObsAnnotatedInteractionByTraceItem> annotatedInteractions) {
    this.annotatedInteractions = annotatedInteractions;
    for (LLMObsAnnotatedInteractionByTraceItem item : annotatedInteractions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotatedInteractionsByTraceDataAttributesResponse addAnnotatedInteractionsItem(
      LLMObsAnnotatedInteractionByTraceItem annotatedInteractionsItem) {
    this.annotatedInteractions.add(annotatedInteractionsItem);
    this.unparsed |= annotatedInteractionsItem.unparsed;
    return this;
  }

  /**
   * List of annotated interactions across all queues for the requested content IDs.
   *
   * @return annotatedInteractions
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATED_INTERACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsAnnotatedInteractionByTraceItem> getAnnotatedInteractions() {
    return annotatedInteractions;
  }

  public void setAnnotatedInteractions(
      List<LLMObsAnnotatedInteractionByTraceItem> annotatedInteractions) {
    this.annotatedInteractions = annotatedInteractions;
  }

  public LLMObsAnnotatedInteractionsByTraceDataAttributesResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of annotated interactions matching the query. maximum: 2147483647
   *
   * @return totalCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
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
   * @return LLMObsAnnotatedInteractionsByTraceDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsAnnotatedInteractionsByTraceDataAttributesResponse putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this LLMObsAnnotatedInteractionsByTraceDataAttributesResponse object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotatedInteractionsByTraceDataAttributesResponse
        llmObsAnnotatedInteractionsByTraceDataAttributesResponse =
            (LLMObsAnnotatedInteractionsByTraceDataAttributesResponse) o;
    return Objects.equals(
            this.annotatedInteractions,
            llmObsAnnotatedInteractionsByTraceDataAttributesResponse.annotatedInteractions)
        && Objects.equals(
            this.totalCount, llmObsAnnotatedInteractionsByTraceDataAttributesResponse.totalCount)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotatedInteractionsByTraceDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotatedInteractions, totalCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotatedInteractionsByTraceDataAttributesResponse {\n");
    sb.append("    annotatedInteractions: ")
        .append(toIndentedString(annotatedInteractions))
        .append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

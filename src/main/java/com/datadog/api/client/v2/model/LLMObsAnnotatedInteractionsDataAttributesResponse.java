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

/** Attributes containing the list of annotated interactions. */
@JsonPropertyOrder({
  LLMObsAnnotatedInteractionsDataAttributesResponse.JSON_PROPERTY_ANNOTATED_INTERACTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotatedInteractionsDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATED_INTERACTIONS = "annotated_interactions";
  private List<LLMObsAnnotatedInteractionItem> annotatedInteractions = new ArrayList<>();

  public LLMObsAnnotatedInteractionsDataAttributesResponse() {}

  @JsonCreator
  public LLMObsAnnotatedInteractionsDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATED_INTERACTIONS)
          List<LLMObsAnnotatedInteractionItem> annotatedInteractions) {
    this.annotatedInteractions = annotatedInteractions;
  }

  public LLMObsAnnotatedInteractionsDataAttributesResponse annotatedInteractions(
      List<LLMObsAnnotatedInteractionItem> annotatedInteractions) {
    this.annotatedInteractions = annotatedInteractions;
    for (LLMObsAnnotatedInteractionItem item : annotatedInteractions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotatedInteractionsDataAttributesResponse addAnnotatedInteractionsItem(
      LLMObsAnnotatedInteractionItem annotatedInteractionsItem) {
    this.annotatedInteractions.add(annotatedInteractionsItem);
    this.unparsed |= annotatedInteractionsItem.unparsed;
    return this;
  }

  /**
   * List of interactions with their annotations.
   *
   * @return annotatedInteractions
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATED_INTERACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsAnnotatedInteractionItem> getAnnotatedInteractions() {
    return annotatedInteractions;
  }

  public void setAnnotatedInteractions(List<LLMObsAnnotatedInteractionItem> annotatedInteractions) {
    this.annotatedInteractions = annotatedInteractions;
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
   * @return LLMObsAnnotatedInteractionsDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsAnnotatedInteractionsDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this LLMObsAnnotatedInteractionsDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotatedInteractionsDataAttributesResponse
        llmObsAnnotatedInteractionsDataAttributesResponse =
            (LLMObsAnnotatedInteractionsDataAttributesResponse) o;
    return Objects.equals(
            this.annotatedInteractions,
            llmObsAnnotatedInteractionsDataAttributesResponse.annotatedInteractions)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotatedInteractionsDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotatedInteractions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotatedInteractionsDataAttributesResponse {\n");
    sb.append("    annotatedInteractions: ")
        .append(toIndentedString(annotatedInteractions))
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

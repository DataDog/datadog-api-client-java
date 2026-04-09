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

/** Attributes of the interaction addition response. */
@JsonPropertyOrder({
  LLMObsAnnotationQueueInteractionsDataAttributesResponse.JSON_PROPERTY_INTERACTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationQueueInteractionsDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERACTIONS = "interactions";
  private List<LLMObsAnnotationQueueInteractionResponseItem> interactions = new ArrayList<>();

  public LLMObsAnnotationQueueInteractionsDataAttributesResponse() {}

  @JsonCreator
  public LLMObsAnnotationQueueInteractionsDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERACTIONS)
          List<LLMObsAnnotationQueueInteractionResponseItem> interactions) {
    this.interactions = interactions;
  }

  public LLMObsAnnotationQueueInteractionsDataAttributesResponse interactions(
      List<LLMObsAnnotationQueueInteractionResponseItem> interactions) {
    this.interactions = interactions;
    for (LLMObsAnnotationQueueInteractionResponseItem item : interactions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotationQueueInteractionsDataAttributesResponse addInteractionsItem(
      LLMObsAnnotationQueueInteractionResponseItem interactionsItem) {
    this.interactions.add(interactionsItem);
    this.unparsed |= interactionsItem.unparsed;
    return this;
  }

  /**
   * List of interactions that were processed.
   *
   * @return interactions
   */
  @JsonProperty(JSON_PROPERTY_INTERACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsAnnotationQueueInteractionResponseItem> getInteractions() {
    return interactions;
  }

  public void setInteractions(List<LLMObsAnnotationQueueInteractionResponseItem> interactions) {
    this.interactions = interactions;
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
   * @return LLMObsAnnotationQueueInteractionsDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsAnnotationQueueInteractionsDataAttributesResponse putAdditionalProperty(
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
   * Return true if this LLMObsAnnotationQueueInteractionsDataAttributesResponse object is equal to
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
    LLMObsAnnotationQueueInteractionsDataAttributesResponse
        llmObsAnnotationQueueInteractionsDataAttributesResponse =
            (LLMObsAnnotationQueueInteractionsDataAttributesResponse) o;
    return Objects.equals(
            this.interactions, llmObsAnnotationQueueInteractionsDataAttributesResponse.interactions)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotationQueueInteractionsDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationQueueInteractionsDataAttributesResponse {\n");
    sb.append("    interactions: ").append(toIndentedString(interactions)).append("\n");
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

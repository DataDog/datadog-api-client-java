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

/** A partial error for a single annotation that could not be processed. */
@JsonPropertyOrder({
  LLMObsAnnotationError.JSON_PROPERTY_ANNOTATION_ID,
  LLMObsAnnotationError.JSON_PROPERTY_ERROR,
  LLMObsAnnotationError.JSON_PROPERTY_INTERACTION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATION_ID = "annotation_id";
  private String annotationId;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_INTERACTION_ID = "interaction_id";
  private String interactionId;

  public LLMObsAnnotationError() {}

  @JsonCreator
  public LLMObsAnnotationError(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR) String error,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERACTION_ID) String interactionId) {
    this.error = error;
    this.interactionId = interactionId;
  }

  public LLMObsAnnotationError annotationId(String annotationId) {
    this.annotationId = annotationId;
    return this;
  }

  /**
   * ID of the annotation that failed, if applicable.
   *
   * @return annotationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAnnotationId() {
    return annotationId;
  }

  public void setAnnotationId(String annotationId) {
    this.annotationId = annotationId;
  }

  public LLMObsAnnotationError error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message.
   *
   * @return error
   */
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public LLMObsAnnotationError interactionId(String interactionId) {
    this.interactionId = interactionId;
    return this;
  }

  /**
   * ID of the interaction that failed.
   *
   * @return interactionId
   */
  @JsonProperty(JSON_PROPERTY_INTERACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInteractionId() {
    return interactionId;
  }

  public void setInteractionId(String interactionId) {
    this.interactionId = interactionId;
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
   * @return LLMObsAnnotationError
   */
  @JsonAnySetter
  public LLMObsAnnotationError putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnnotationError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationError llmObsAnnotationError = (LLMObsAnnotationError) o;
    return Objects.equals(this.annotationId, llmObsAnnotationError.annotationId)
        && Objects.equals(this.error, llmObsAnnotationError.error)
        && Objects.equals(this.interactionId, llmObsAnnotationError.interactionId)
        && Objects.equals(this.additionalProperties, llmObsAnnotationError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationId, error, interactionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationError {\n");
    sb.append("    annotationId: ").append(toIndentedString(annotationId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
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

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

/** Attributes of the annotations response. */
@JsonPropertyOrder({
  LLMObsAnnotationsDataAttributesResponse.JSON_PROPERTY_ANNOTATIONS,
  LLMObsAnnotationsDataAttributesResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationsDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<LLMObsAnnotationItemResponse> annotations = new ArrayList<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<LLMObsAnnotationError> errors = null;

  public LLMObsAnnotationsDataAttributesResponse() {}

  @JsonCreator
  public LLMObsAnnotationsDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATIONS)
          List<LLMObsAnnotationItemResponse> annotations) {
    this.annotations = annotations;
  }

  public LLMObsAnnotationsDataAttributesResponse annotations(
      List<LLMObsAnnotationItemResponse> annotations) {
    this.annotations = annotations;
    for (LLMObsAnnotationItemResponse item : annotations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotationsDataAttributesResponse addAnnotationsItem(
      LLMObsAnnotationItemResponse annotationsItem) {
    this.annotations.add(annotationsItem);
    this.unparsed |= annotationsItem.unparsed;
    return this;
  }

  /**
   * Successfully created or updated annotations.
   *
   * @return annotations
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsAnnotationItemResponse> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<LLMObsAnnotationItemResponse> annotations) {
    this.annotations = annotations;
  }

  public LLMObsAnnotationsDataAttributesResponse errors(List<LLMObsAnnotationError> errors) {
    this.errors = errors;
    for (LLMObsAnnotationError item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotationsDataAttributesResponse addErrorsItem(LLMObsAnnotationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * Partial errors for annotations that could not be processed.
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsAnnotationError> getErrors() {
    return errors;
  }

  public void setErrors(List<LLMObsAnnotationError> errors) {
    this.errors = errors;
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
   * @return LLMObsAnnotationsDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsAnnotationsDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnnotationsDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationsDataAttributesResponse llmObsAnnotationsDataAttributesResponse =
        (LLMObsAnnotationsDataAttributesResponse) o;
    return Objects.equals(this.annotations, llmObsAnnotationsDataAttributesResponse.annotations)
        && Objects.equals(this.errors, llmObsAnnotationsDataAttributesResponse.errors)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotationsDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, errors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationsDataAttributesResponse {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

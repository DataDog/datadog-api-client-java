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

/** Attributes of the annotation deletion response. */
@JsonPropertyOrder({
  LLMObsDeleteAnnotationsDataAttributesResponse.JSON_PROPERTY_ANNOTATION_IDS,
  LLMObsDeleteAnnotationsDataAttributesResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDeleteAnnotationsDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATION_IDS = "annotation_ids";
  private List<String> annotationIds = new ArrayList<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<LLMObsDeleteAnnotationError> errors = new ArrayList<>();

  public LLMObsDeleteAnnotationsDataAttributesResponse() {}

  @JsonCreator
  public LLMObsDeleteAnnotationsDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATION_IDS)
          List<String> annotationIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERRORS)
          List<LLMObsDeleteAnnotationError> errors) {
    this.annotationIds = annotationIds;
    this.errors = errors;
  }

  public LLMObsDeleteAnnotationsDataAttributesResponse annotationIds(List<String> annotationIds) {
    this.annotationIds = annotationIds;
    return this;
  }

  public LLMObsDeleteAnnotationsDataAttributesResponse addAnnotationIdsItem(
      String annotationIdsItem) {
    this.annotationIds.add(annotationIdsItem);
    return this;
  }

  /**
   * IDs of the successfully deleted annotations.
   *
   * @return annotationIds
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATION_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getAnnotationIds() {
    return annotationIds;
  }

  public void setAnnotationIds(List<String> annotationIds) {
    this.annotationIds = annotationIds;
  }

  public LLMObsDeleteAnnotationsDataAttributesResponse errors(
      List<LLMObsDeleteAnnotationError> errors) {
    this.errors = errors;
    for (LLMObsDeleteAnnotationError item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsDeleteAnnotationsDataAttributesResponse addErrorsItem(
      LLMObsDeleteAnnotationError errorsItem) {
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * Errors for annotations that could not be deleted.
   *
   * @return errors
   */
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsDeleteAnnotationError> getErrors() {
    return errors;
  }

  public void setErrors(List<LLMObsDeleteAnnotationError> errors) {
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
   * @return LLMObsDeleteAnnotationsDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsDeleteAnnotationsDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this LLMObsDeleteAnnotationsDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDeleteAnnotationsDataAttributesResponse llmObsDeleteAnnotationsDataAttributesResponse =
        (LLMObsDeleteAnnotationsDataAttributesResponse) o;
    return Objects.equals(
            this.annotationIds, llmObsDeleteAnnotationsDataAttributesResponse.annotationIds)
        && Objects.equals(this.errors, llmObsDeleteAnnotationsDataAttributesResponse.errors)
        && Objects.equals(
            this.additionalProperties,
            llmObsDeleteAnnotationsDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationIds, errors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDeleteAnnotationsDataAttributesResponse {\n");
    sb.append("    annotationIds: ").append(toIndentedString(annotationIds)).append("\n");
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

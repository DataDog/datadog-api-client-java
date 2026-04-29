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

/** Attributes for creating an LLM Observability annotation queue. */
@JsonPropertyOrder({
  LLMObsAnnotationQueueDataAttributesRequest.JSON_PROPERTY_ANNOTATION_SCHEMA,
  LLMObsAnnotationQueueDataAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  LLMObsAnnotationQueueDataAttributesRequest.JSON_PROPERTY_NAME,
  LLMObsAnnotationQueueDataAttributesRequest.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationQueueDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATION_SCHEMA = "annotation_schema";
  private LLMObsAnnotationSchema annotationSchema;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public LLMObsAnnotationQueueDataAttributesRequest() {}

  @JsonCreator
  public LLMObsAnnotationQueueDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId) {
    this.name = name;
    this.projectId = projectId;
  }

  public LLMObsAnnotationQueueDataAttributesRequest annotationSchema(
      LLMObsAnnotationSchema annotationSchema) {
    this.annotationSchema = annotationSchema;
    this.unparsed |= annotationSchema.unparsed;
    return this;
  }

  /**
   * Schema defining the labels for an annotation queue.
   *
   * @return annotationSchema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATION_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsAnnotationSchema getAnnotationSchema() {
    return annotationSchema;
  }

  public void setAnnotationSchema(LLMObsAnnotationSchema annotationSchema) {
    this.annotationSchema = annotationSchema;
  }

  public LLMObsAnnotationQueueDataAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the annotation queue.
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

  public LLMObsAnnotationQueueDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the annotation queue.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LLMObsAnnotationQueueDataAttributesRequest projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Identifier of the project this queue belongs to.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
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
   * @return LLMObsAnnotationQueueDataAttributesRequest
   */
  @JsonAnySetter
  public LLMObsAnnotationQueueDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this LLMObsAnnotationQueueDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationQueueDataAttributesRequest llmObsAnnotationQueueDataAttributesRequest =
        (LLMObsAnnotationQueueDataAttributesRequest) o;
    return Objects.equals(
            this.annotationSchema, llmObsAnnotationQueueDataAttributesRequest.annotationSchema)
        && Objects.equals(this.description, llmObsAnnotationQueueDataAttributesRequest.description)
        && Objects.equals(this.name, llmObsAnnotationQueueDataAttributesRequest.name)
        && Objects.equals(this.projectId, llmObsAnnotationQueueDataAttributesRequest.projectId)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotationQueueDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationSchema, description, name, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationQueueDataAttributesRequest {\n");
    sb.append("    annotationSchema: ").append(toIndentedString(annotationSchema)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

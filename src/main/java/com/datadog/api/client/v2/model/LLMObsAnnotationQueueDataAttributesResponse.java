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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an LLM Observability annotation queue. */
@JsonPropertyOrder({
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_CREATED_BY,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_MODIFIED_BY,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_NAME,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_OWNED_BY,
  LLMObsAnnotationQueueDataAttributesResponse.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationQueueDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNED_BY = "owned_by";
  private String ownedBy;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public LLMObsAnnotationQueueDataAttributesResponse() {}

  @JsonCreator
  public LLMObsAnnotationQueueDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) String modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNED_BY) String ownedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.description = description;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.name = name;
    this.ownedBy = ownedBy;
    this.projectId = projectId;
  }

  public LLMObsAnnotationQueueDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the queue was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LLMObsAnnotationQueueDataAttributesResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Identifier of the user who created the queue.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LLMObsAnnotationQueueDataAttributesResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the annotation queue.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LLMObsAnnotationQueueDataAttributesResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the queue was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public LLMObsAnnotationQueueDataAttributesResponse modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Identifier of the user who last modified the queue.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public LLMObsAnnotationQueueDataAttributesResponse name(String name) {
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

  public LLMObsAnnotationQueueDataAttributesResponse ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Identifier of the user who owns the queue.
   *
   * @return ownedBy
   */
  @JsonProperty(JSON_PROPERTY_OWNED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }

  public LLMObsAnnotationQueueDataAttributesResponse projectId(String projectId) {
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
   * @return LLMObsAnnotationQueueDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsAnnotationQueueDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this LLMObsAnnotationQueueDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationQueueDataAttributesResponse llmObsAnnotationQueueDataAttributesResponse =
        (LLMObsAnnotationQueueDataAttributesResponse) o;
    return Objects.equals(this.createdAt, llmObsAnnotationQueueDataAttributesResponse.createdAt)
        && Objects.equals(this.createdBy, llmObsAnnotationQueueDataAttributesResponse.createdBy)
        && Objects.equals(this.description, llmObsAnnotationQueueDataAttributesResponse.description)
        && Objects.equals(this.modifiedAt, llmObsAnnotationQueueDataAttributesResponse.modifiedAt)
        && Objects.equals(this.modifiedBy, llmObsAnnotationQueueDataAttributesResponse.modifiedBy)
        && Objects.equals(this.name, llmObsAnnotationQueueDataAttributesResponse.name)
        && Objects.equals(this.ownedBy, llmObsAnnotationQueueDataAttributesResponse.ownedBy)
        && Objects.equals(this.projectId, llmObsAnnotationQueueDataAttributesResponse.projectId)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotationQueueDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        description,
        modifiedAt,
        modifiedBy,
        name,
        ownedBy,
        projectId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationQueueDataAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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

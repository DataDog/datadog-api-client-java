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

/** A frontend interaction with its associated annotations. */
@JsonPropertyOrder({
  LLMObsFrontendAnnotatedInteractionItem.JSON_PROPERTY_ANNOTATIONS,
  LLMObsFrontendAnnotatedInteractionItem.JSON_PROPERTY_CAN_ANNOTATE,
  LLMObsFrontendAnnotatedInteractionItem.JSON_PROPERTY_CONTENT_ID,
  LLMObsFrontendAnnotatedInteractionItem.JSON_PROPERTY_FRONTEND,
  LLMObsFrontendAnnotatedInteractionItem.JSON_PROPERTY_ID,
  LLMObsFrontendAnnotatedInteractionItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsFrontendAnnotatedInteractionItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<LLMObsAnnotationItemResponse> annotations = new ArrayList<>();

  public static final String JSON_PROPERTY_CAN_ANNOTATE = "can_annotate";
  private Boolean canAnnotate;

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_FRONTEND = "frontend";
  private LLMObsFrontendContent frontend;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsFrontendInteractionType type;

  public LLMObsFrontendAnnotatedInteractionItem() {}

  @JsonCreator
  public LLMObsFrontendAnnotatedInteractionItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATIONS)
          List<LLMObsAnnotationItemResponse> annotations,
      @JsonProperty(required = true, value = JSON_PROPERTY_CAN_ANNOTATE) Boolean canAnnotate,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_ID) String contentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FRONTEND) LLMObsFrontendContent frontend,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LLMObsFrontendInteractionType type) {
    this.annotations = annotations;
    for (LLMObsAnnotationItemResponse item : annotations) {
      this.unparsed |= item.unparsed;
    }
    this.canAnnotate = canAnnotate;
    this.contentId = contentId;
    this.frontend = frontend;
    this.unparsed |= frontend.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsFrontendAnnotatedInteractionItem annotations(
      List<LLMObsAnnotationItemResponse> annotations) {
    this.annotations = annotations;
    for (LLMObsAnnotationItemResponse item : annotations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsFrontendAnnotatedInteractionItem addAnnotationsItem(
      LLMObsAnnotationItemResponse annotationsItem) {
    this.annotations.add(annotationsItem);
    this.unparsed |= annotationsItem.unparsed;
    return this;
  }

  /**
   * List of annotations for this interaction.
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
    if (annotations != null) {
      for (LLMObsAnnotationItemResponse item : annotations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsFrontendAnnotatedInteractionItem canAnnotate(Boolean canAnnotate) {
    this.canAnnotate = canAnnotate;
    return this;
  }

  /**
   * Whether the current caller can annotate this interaction.
   *
   * @return canAnnotate
   */
  @JsonProperty(JSON_PROPERTY_CAN_ANNOTATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getCanAnnotate() {
    return canAnnotate;
  }

  public void setCanAnnotate(Boolean canAnnotate) {
    this.canAnnotate = canAnnotate;
  }

  public LLMObsFrontendAnnotatedInteractionItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Server-generated deterministic identifier derived from the content.
   *
   * @return contentId
   */
  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  public LLMObsFrontendAnnotatedInteractionItem frontend(LLMObsFrontendContent frontend) {
    this.frontend = frontend;
    this.unparsed |= frontend.unparsed;
    return this;
  }

  /**
   * Web content that makes up a <code>frontend</code> interaction.
   *
   * @return frontend
   */
  @JsonProperty(JSON_PROPERTY_FRONTEND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsFrontendContent getFrontend() {
    return frontend;
  }

  public void setFrontend(LLMObsFrontendContent frontend) {
    this.frontend = frontend;
    if (frontend != null) {
      this.unparsed |= frontend.unparsed;
    }
  }

  public LLMObsFrontendAnnotatedInteractionItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the interaction.
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

  public LLMObsFrontendAnnotatedInteractionItem type(LLMObsFrontendInteractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type discriminator for a <code>frontend</code> interaction.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsFrontendInteractionType getType() {
    return type;
  }

  public void setType(LLMObsFrontendInteractionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return LLMObsFrontendAnnotatedInteractionItem
   */
  @JsonAnySetter
  public LLMObsFrontendAnnotatedInteractionItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsFrontendAnnotatedInteractionItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsFrontendAnnotatedInteractionItem llmObsFrontendAnnotatedInteractionItem =
        (LLMObsFrontendAnnotatedInteractionItem) o;
    return Objects.equals(this.annotations, llmObsFrontendAnnotatedInteractionItem.annotations)
        && Objects.equals(this.canAnnotate, llmObsFrontendAnnotatedInteractionItem.canAnnotate)
        && Objects.equals(this.contentId, llmObsFrontendAnnotatedInteractionItem.contentId)
        && Objects.equals(this.frontend, llmObsFrontendAnnotatedInteractionItem.frontend)
        && Objects.equals(this.id, llmObsFrontendAnnotatedInteractionItem.id)
        && Objects.equals(this.type, llmObsFrontendAnnotatedInteractionItem.type)
        && Objects.equals(
            this.additionalProperties, llmObsFrontendAnnotatedInteractionItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotations, canAnnotate, contentId, frontend, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsFrontendAnnotatedInteractionItem {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    canAnnotate: ").append(toIndentedString(canAnnotate)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    frontend: ").append(toIndentedString(frontend)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

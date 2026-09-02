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
import java.util.UUID;

/** Attributes of the annotations on a page. */
@JsonPropertyOrder({
  PageAnnotationsAttributes.JSON_PROPERTY_ANNOTATIONS,
  PageAnnotationsAttributes.JSON_PROPERTY_GLOBAL_ANNOTATIONS,
  PageAnnotationsAttributes.JSON_PROPERTY_WIDGET_MAPPING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PageAnnotationsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private Map<String, AnnotationInPage> annotations = new HashMap<String, AnnotationInPage>();

  public static final String JSON_PROPERTY_GLOBAL_ANNOTATIONS = "global_annotations";
  private List<UUID> globalAnnotations = new ArrayList<>();

  public static final String JSON_PROPERTY_WIDGET_MAPPING = "widget_mapping";
  private Map<String, List<UUID>> widgetMapping = new HashMap<String, List<UUID>>();

  public PageAnnotationsAttributes() {}

  @JsonCreator
  public PageAnnotationsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATIONS)
          Map<String, AnnotationInPage> annotations,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_ANNOTATIONS)
          List<UUID> globalAnnotations,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGET_MAPPING)
          Map<String, List<UUID>> widgetMapping) {
    this.annotations = annotations;
    this.globalAnnotations = globalAnnotations;
    this.widgetMapping = widgetMapping;
  }

  public PageAnnotationsAttributes annotations(Map<String, AnnotationInPage> annotations) {
    this.annotations = annotations;
    return this;
  }

  public PageAnnotationsAttributes putAnnotationsItem(
      String key, AnnotationInPage annotationsItem) {
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Map of annotation UUID to annotation object, keyed by annotation ID.
   *
   * @return annotations
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, AnnotationInPage> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, AnnotationInPage> annotations) {
    this.annotations = annotations;
  }

  public PageAnnotationsAttributes globalAnnotations(List<UUID> globalAnnotations) {
    this.globalAnnotations = globalAnnotations;
    return this;
  }

  public PageAnnotationsAttributes addGlobalAnnotationsItem(UUID globalAnnotationsItem) {
    this.globalAnnotations.add(globalAnnotationsItem);
    return this;
  }

  /**
   * List of annotation IDs that apply to the entire page rather than a specific widget.
   *
   * @return globalAnnotations
   */
  @JsonProperty(JSON_PROPERTY_GLOBAL_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<UUID> getGlobalAnnotations() {
    return globalAnnotations;
  }

  public void setGlobalAnnotations(List<UUID> globalAnnotations) {
    this.globalAnnotations = globalAnnotations;
  }

  public PageAnnotationsAttributes widgetMapping(Map<String, List<UUID>> widgetMapping) {
    this.widgetMapping = widgetMapping;
    return this;
  }

  public PageAnnotationsAttributes putWidgetMappingItem(String key, List<UUID> widgetMappingItem) {
    this.widgetMapping.put(key, widgetMappingItem);
    return this;
  }

  /**
   * Map from widget ID to the list of annotation IDs displayed on that widget.
   *
   * @return widgetMapping
   */
  @JsonProperty(JSON_PROPERTY_WIDGET_MAPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, List<UUID>> getWidgetMapping() {
    return widgetMapping;
  }

  public void setWidgetMapping(Map<String, List<UUID>> widgetMapping) {
    this.widgetMapping = widgetMapping;
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
   * @return PageAnnotationsAttributes
   */
  @JsonAnySetter
  public PageAnnotationsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PageAnnotationsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageAnnotationsAttributes pageAnnotationsAttributes = (PageAnnotationsAttributes) o;
    return Objects.equals(this.annotations, pageAnnotationsAttributes.annotations)
        && Objects.equals(this.globalAnnotations, pageAnnotationsAttributes.globalAnnotations)
        && Objects.equals(this.widgetMapping, pageAnnotationsAttributes.widgetMapping)
        && Objects.equals(
            this.additionalProperties, pageAnnotationsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, globalAnnotations, widgetMapping, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageAnnotationsAttributes {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    globalAnnotations: ").append(toIndentedString(globalAnnotations)).append("\n");
    sb.append("    widgetMapping: ").append(toIndentedString(widgetMapping)).append("\n");
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

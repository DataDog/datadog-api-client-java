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

/** A single Agent Observability patterns template in a list response. */
@JsonPropertyOrder({
  LLMObsPatternsTemplateItem.JSON_PROPERTY_CLUSTERING_INSTRUCTIONS,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_CREATED_AT,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_DESCRIPTION,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_EVP_QUERY_PREFIX,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_ID,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_NAME,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_SCOPE,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_TEMPLATE,
  LLMObsPatternsTemplateItem.JSON_PROPERTY_TIME_FRAME_DURATION_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsTemplateItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLUSTERING_INSTRUCTIONS = "clustering_instructions";
  private String clusteringInstructions;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVP_QUERY_PREFIX = "evp_query_prefix";
  private String evpQueryPrefix;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public static final String JSON_PROPERTY_TIME_FRAME_DURATION_MS = "time_frame_duration_ms";
  private Long timeFrameDurationMs;

  public LLMObsPatternsTemplateItem() {}

  @JsonCreator
  public LLMObsPatternsTemplateItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLUSTERING_INSTRUCTIONS)
          String clusteringInstructions,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVP_QUERY_PREFIX) String evpQueryPrefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE) String template,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_FRAME_DURATION_MS)
          Long timeFrameDurationMs) {
    this.clusteringInstructions = clusteringInstructions;
    this.createdAt = createdAt;
    this.description = description;
    this.evpQueryPrefix = evpQueryPrefix;
    this.id = id;
    this.name = name;
    this.scope = scope;
    this.template = template;
    this.timeFrameDurationMs = timeFrameDurationMs;
  }

  public LLMObsPatternsTemplateItem clusteringInstructions(String clusteringInstructions) {
    this.clusteringInstructions = clusteringInstructions;
    return this;
  }

  /**
   * Instructions guiding how topics are clustered for configurations linked to this template.
   *
   * @return clusteringInstructions
   */
  @JsonProperty(JSON_PROPERTY_CLUSTERING_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClusteringInstructions() {
    return clusteringInstructions;
  }

  public void setClusteringInstructions(String clusteringInstructions) {
    this.clusteringInstructions = clusteringInstructions;
  }

  public LLMObsPatternsTemplateItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the template was created.
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

  public LLMObsPatternsTemplateItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of what the template is for.
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

  public LLMObsPatternsTemplateItem evpQueryPrefix(String evpQueryPrefix) {
    this.evpQueryPrefix = evpQueryPrefix;
    return this;
  }

  /**
   * Prefix merged into the query that selects spans for configurations linked to this template.
   *
   * @return evpQueryPrefix
   */
  @JsonProperty(JSON_PROPERTY_EVP_QUERY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEvpQueryPrefix() {
    return evpQueryPrefix;
  }

  public void setEvpQueryPrefix(String evpQueryPrefix) {
    this.evpQueryPrefix = evpQueryPrefix;
  }

  public LLMObsPatternsTemplateItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the template.
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

  public LLMObsPatternsTemplateItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the template.
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

  public LLMObsPatternsTemplateItem scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Scope the template applies to.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public LLMObsPatternsTemplateItem template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Template used to guide topic generation for configurations linked to this template.
   *
   * @return template
   */
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public LLMObsPatternsTemplateItem timeFrameDurationMs(Long timeFrameDurationMs) {
    this.timeFrameDurationMs = timeFrameDurationMs;
    return this;
  }

  /**
   * Default lookback window, in milliseconds, for configurations linked to this template.
   *
   * @return timeFrameDurationMs
   */
  @JsonProperty(JSON_PROPERTY_TIME_FRAME_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTimeFrameDurationMs() {
    return timeFrameDurationMs;
  }

  public void setTimeFrameDurationMs(Long timeFrameDurationMs) {
    this.timeFrameDurationMs = timeFrameDurationMs;
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
   * @return LLMObsPatternsTemplateItem
   */
  @JsonAnySetter
  public LLMObsPatternsTemplateItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsTemplateItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsTemplateItem llmObsPatternsTemplateItem = (LLMObsPatternsTemplateItem) o;
    return Objects.equals(
            this.clusteringInstructions, llmObsPatternsTemplateItem.clusteringInstructions)
        && Objects.equals(this.createdAt, llmObsPatternsTemplateItem.createdAt)
        && Objects.equals(this.description, llmObsPatternsTemplateItem.description)
        && Objects.equals(this.evpQueryPrefix, llmObsPatternsTemplateItem.evpQueryPrefix)
        && Objects.equals(this.id, llmObsPatternsTemplateItem.id)
        && Objects.equals(this.name, llmObsPatternsTemplateItem.name)
        && Objects.equals(this.scope, llmObsPatternsTemplateItem.scope)
        && Objects.equals(this.template, llmObsPatternsTemplateItem.template)
        && Objects.equals(this.timeFrameDurationMs, llmObsPatternsTemplateItem.timeFrameDurationMs)
        && Objects.equals(
            this.additionalProperties, llmObsPatternsTemplateItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusteringInstructions,
        createdAt,
        description,
        evpQueryPrefix,
        id,
        name,
        scope,
        template,
        timeFrameDurationMs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsTemplateItem {\n");
    sb.append("    clusteringInstructions: ")
        .append(toIndentedString(clusteringInstructions))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    evpQueryPrefix: ").append(toIndentedString(evpQueryPrefix)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    timeFrameDurationMs: ")
        .append(toIndentedString(timeFrameDurationMs))
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

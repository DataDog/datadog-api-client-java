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

/**
 * Attributes for creating a new version of an LLM Observability prompt. <code>template</code> is
 * required; all other attributes are optional.
 */
@JsonPropertyOrder({
  LLMObsCreatePromptVersionDataAttributes.JSON_PROPERTY_DESCRIPTION,
  LLMObsCreatePromptVersionDataAttributes.JSON_PROPERTY_ENV_IDS,
  LLMObsCreatePromptVersionDataAttributes.JSON_PROPERTY_LABELS,
  LLMObsCreatePromptVersionDataAttributes.JSON_PROPERTY_TEMPLATE,
  LLMObsCreatePromptVersionDataAttributes.JSON_PROPERTY_USER_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCreatePromptVersionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENV_IDS = "env_ids";
  private List<String> envIds = null;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<LLMObsPromptVersionLabel> labels = null;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private LLMObsPromptTemplate template;

  public static final String JSON_PROPERTY_USER_VERSION = "user_version";
  private String userVersion;

  public LLMObsCreatePromptVersionDataAttributes() {}

  @JsonCreator
  public LLMObsCreatePromptVersionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE)
          LLMObsPromptTemplate template) {
    this.template = template;
    this.unparsed |= template.unparsed;
  }

  public LLMObsCreatePromptVersionDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional description of this version.
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

  public LLMObsCreatePromptVersionDataAttributes envIds(List<String> envIds) {
    this.envIds = envIds;
    return this;
  }

  public LLMObsCreatePromptVersionDataAttributes addEnvIdsItem(String envIdsItem) {
    if (this.envIds == null) {
      this.envIds = new ArrayList<>();
    }
    this.envIds.add(envIdsItem);
    return this;
  }

  /**
   * Optional feature-flag environment UUIDs the service attempts to enable and configure to use
   * this version as their default after creation.
   *
   * @return envIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnvIds() {
    return envIds;
  }

  public void setEnvIds(List<String> envIds) {
    this.envIds = envIds;
  }

  public LLMObsCreatePromptVersionDataAttributes labels(List<LLMObsPromptVersionLabel> labels) {
    this.labels = labels;
    return this;
  }

  public LLMObsCreatePromptVersionDataAttributes addLabelsItem(
      LLMObsPromptVersionLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    this.unparsed |= !labelsItem.isValid();
    return this;
  }

  /**
   * Optional labels to attach to this version. Do not use this attribute for new integrations.
   *
   * @return labels
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsPromptVersionLabel> getLabels() {
    return labels;
  }

  @Deprecated
  public void setLabels(List<LLMObsPromptVersionLabel> labels) {
    this.labels = labels;
  }

  public LLMObsCreatePromptVersionDataAttributes template(LLMObsPromptTemplate template) {
    this.template = template;
    this.unparsed |= template.unparsed;
    return this;
  }

  /**
   * A text template or a list of chat messages.
   *
   * @return template
   */
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsPromptTemplate getTemplate() {
    return template;
  }

  public void setTemplate(LLMObsPromptTemplate template) {
    this.template = template;
    if (template != null) {
      this.unparsed |= template.unparsed;
    }
  }

  public LLMObsCreatePromptVersionDataAttributes userVersion(String userVersion) {
    this.userVersion = userVersion;
    return this;
  }

  /**
   * Optional user-supplied version identifier for this version.
   *
   * @return userVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserVersion() {
    return userVersion;
  }

  public void setUserVersion(String userVersion) {
    this.userVersion = userVersion;
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
   * @return LLMObsCreatePromptVersionDataAttributes
   */
  @JsonAnySetter
  public LLMObsCreatePromptVersionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCreatePromptVersionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCreatePromptVersionDataAttributes llmObsCreatePromptVersionDataAttributes =
        (LLMObsCreatePromptVersionDataAttributes) o;
    return Objects.equals(this.description, llmObsCreatePromptVersionDataAttributes.description)
        && Objects.equals(this.envIds, llmObsCreatePromptVersionDataAttributes.envIds)
        && Objects.equals(this.labels, llmObsCreatePromptVersionDataAttributes.labels)
        && Objects.equals(this.template, llmObsCreatePromptVersionDataAttributes.template)
        && Objects.equals(this.userVersion, llmObsCreatePromptVersionDataAttributes.userVersion)
        && Objects.equals(
            this.additionalProperties,
            llmObsCreatePromptVersionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, envIds, labels, template, userVersion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCreatePromptVersionDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envIds: ").append(toIndentedString(envIds)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    userVersion: ").append(toIndentedString(userVersion)).append("\n");
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

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

/** Attributes of a single End User Device Monitoring issue definition. */
@JsonPropertyOrder({
  IssueDefinitionDataAttributes.JSON_PROPERTY_CATEGORY,
  IssueDefinitionDataAttributes.JSON_PROPERTY_LABEL,
  IssueDefinitionDataAttributes.JSON_PROPERTY_LEVEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueDefinitionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private String level;

  public IssueDefinitionDataAttributes() {}

  @JsonCreator
  public IssueDefinitionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label,
      @JsonProperty(required = true, value = JSON_PROPERTY_LEVEL) String level) {
    this.category = category;
    this.label = label;
    this.level = level;
  }

  public IssueDefinitionDataAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the issue (for example, <code>battery</code>, <code>network</code>, or <code>
   * performance</code>).
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IssueDefinitionDataAttributes label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Human-readable label describing the issue, suitable for display in the Datadog UI.
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public IssueDefinitionDataAttributes level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Severity level of the issue (for example, <code>warning</code> or <code>critical</code>).
   *
   * @return level
   */
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
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
   * @return IssueDefinitionDataAttributes
   */
  @JsonAnySetter
  public IssueDefinitionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueDefinitionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueDefinitionDataAttributes issueDefinitionDataAttributes = (IssueDefinitionDataAttributes) o;
    return Objects.equals(this.category, issueDefinitionDataAttributes.category)
        && Objects.equals(this.label, issueDefinitionDataAttributes.label)
        && Objects.equals(this.level, issueDefinitionDataAttributes.level)
        && Objects.equals(
            this.additionalProperties, issueDefinitionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, label, level, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueDefinitionDataAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

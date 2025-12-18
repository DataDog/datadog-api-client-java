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
 * The <code>parse_grok</code> processor extracts structured fields from unstructured log messages
 * using Grok patterns.
 */
@JsonPropertyOrder({
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_DISABLE_LIBRARY_RULES,
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_RULES,
  ObservabilityPipelineParseGrokProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineParseGrokProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLE_LIBRARY_RULES = "disable_library_rules";
  private Boolean disableLibraryRules = false;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<ObservabilityPipelineParseGrokProcessorRule> rules = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineParseGrokProcessorType type =
      ObservabilityPipelineParseGrokProcessorType.PARSE_GROK;

  public ObservabilityPipelineParseGrokProcessor() {}

  @JsonCreator
  public ObservabilityPipelineParseGrokProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULES)
          List<ObservabilityPipelineParseGrokProcessorRule> rules,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineParseGrokProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.rules = rules;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineParseGrokProcessor disableLibraryRules(Boolean disableLibraryRules) {
    this.disableLibraryRules = disableLibraryRules;
    return this;
  }

  /**
   * If set to <code>true</code>, disables the default Grok rules provided by Datadog.
   *
   * @return disableLibraryRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_LIBRARY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableLibraryRules() {
    return disableLibraryRules;
  }

  public void setDisableLibraryRules(Boolean disableLibraryRules) {
    this.disableLibraryRules = disableLibraryRules;
  }

  public ObservabilityPipelineParseGrokProcessor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name for a component.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ObservabilityPipelineParseGrokProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this processor is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ObservabilityPipelineParseGrokProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for this processor.
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

  public ObservabilityPipelineParseGrokProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets.
   *
   * @return include
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public ObservabilityPipelineParseGrokProcessor rules(
      List<ObservabilityPipelineParseGrokProcessorRule> rules) {
    this.rules = rules;
    for (ObservabilityPipelineParseGrokProcessorRule item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineParseGrokProcessor addRulesItem(
      ObservabilityPipelineParseGrokProcessorRule rulesItem) {
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * The list of Grok parsing rules. If multiple matching rules are provided, they are evaluated in
   * order. The first successful match is applied.
   *
   * @return rules
   */
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineParseGrokProcessorRule> getRules() {
    return rules;
  }

  public void setRules(List<ObservabilityPipelineParseGrokProcessorRule> rules) {
    this.rules = rules;
  }

  public ObservabilityPipelineParseGrokProcessor type(
      ObservabilityPipelineParseGrokProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>parse_grok</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineParseGrokProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineParseGrokProcessorType type) {
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
   * @return ObservabilityPipelineParseGrokProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineParseGrokProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineParseGrokProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineParseGrokProcessor observabilityPipelineParseGrokProcessor =
        (ObservabilityPipelineParseGrokProcessor) o;
    return Objects.equals(
            this.disableLibraryRules, observabilityPipelineParseGrokProcessor.disableLibraryRules)
        && Objects.equals(this.displayName, observabilityPipelineParseGrokProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineParseGrokProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineParseGrokProcessor.id)
        && Objects.equals(this.include, observabilityPipelineParseGrokProcessor.include)
        && Objects.equals(this.rules, observabilityPipelineParseGrokProcessor.rules)
        && Objects.equals(this.type, observabilityPipelineParseGrokProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineParseGrokProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        disableLibraryRules, displayName, enabled, id, include, rules, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineParseGrokProcessor {\n");
    sb.append("    disableLibraryRules: ")
        .append(toIndentedString(disableLibraryRules))
        .append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

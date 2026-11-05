/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Summary of the signal the investigation is about. */
@JsonPropertyOrder({
  SecurityAgentInvestigationSignal.JSON_PROPERTY_SEVERITY,
  SecurityAgentInvestigationSignal.JSON_PROPERTY_SOURCES,
  SecurityAgentInvestigationSignal.JSON_PROPERTY_TACTIC,
  SecurityAgentInvestigationSignal.JSON_PROPERTY_TAGS,
  SecurityAgentInvestigationSignal.JSON_PROPERTY_TECHNIQUE,
  SecurityAgentInvestigationSignal.JSON_PROPERTY_TIMESTAMP,
  SecurityAgentInvestigationSignal.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationSignal {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = null;

  public static final String JSON_PROPERTY_TACTIC = "tactic";
  private String tactic;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TECHNIQUE = "technique";
  private String technique;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public SecurityAgentInvestigationSignal severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Severity of the signal: <code>info</code>, <code>low</code>, <code>medium</code>, <code>high
   * </code>, or <code>critical</code>.
   *
   * @return severity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public SecurityAgentInvestigationSignal sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public SecurityAgentInvestigationSignal addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Sources of the signal.
   *
   * @return sources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public SecurityAgentInvestigationSignal tactic(String tactic) {
    this.tactic = tactic;
    return this;
  }

  /**
   * MITRE ATT&amp;CK tactic, from the signal's <code>tactic</code> tag.
   *
   * @return tactic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TACTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTactic() {
    return tactic;
  }

  public void setTactic(String tactic) {
    this.tactic = tactic;
  }

  public SecurityAgentInvestigationSignal tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityAgentInvestigationSignal addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags of the signal, written <code>key:value</code>.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SecurityAgentInvestigationSignal technique(String technique) {
    this.technique = technique;
    return this;
  }

  /**
   * MITRE ATT&amp;CK technique, from the signal's <code>technique</code> tag.
   *
   * @return technique
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNIQUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTechnique() {
    return technique;
  }

  public void setTechnique(String technique) {
    this.technique = technique;
  }

  public SecurityAgentInvestigationSignal timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Time the signal was generated.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public SecurityAgentInvestigationSignal title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the signal.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return SecurityAgentInvestigationSignal
   */
  @JsonAnySetter
  public SecurityAgentInvestigationSignal putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationSignal object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationSignal securityAgentInvestigationSignal =
        (SecurityAgentInvestigationSignal) o;
    return Objects.equals(this.severity, securityAgentInvestigationSignal.severity)
        && Objects.equals(this.sources, securityAgentInvestigationSignal.sources)
        && Objects.equals(this.tactic, securityAgentInvestigationSignal.tactic)
        && Objects.equals(this.tags, securityAgentInvestigationSignal.tags)
        && Objects.equals(this.technique, securityAgentInvestigationSignal.technique)
        && Objects.equals(this.timestamp, securityAgentInvestigationSignal.timestamp)
        && Objects.equals(this.title, securityAgentInvestigationSignal.title)
        && Objects.equals(
            this.additionalProperties, securityAgentInvestigationSignal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        severity, sources, tactic, tags, technique, timestamp, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationSignal {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    tactic: ").append(toIndentedString(tactic)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    technique: ").append(toIndentedString(technique)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

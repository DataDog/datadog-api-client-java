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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A script that can be used to remediate the issue. */
@JsonPropertyOrder({
  AgentHealthRemediationScript.JSON_PROPERTY_CONTENT,
  AgentHealthRemediationScript.JSON_PROPERTY_FILENAME,
  AgentHealthRemediationScript.JSON_PROPERTY_LANGUAGE,
  AgentHealthRemediationScript.JSON_PROPERTY_LANGUAGE_VERSION,
  AgentHealthRemediationScript.JSON_PROPERTY_REQUIRES_ROOT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthRemediationScript {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LANGUAGE_VERSION = "language_version";
  private String languageVersion;

  public static final String JSON_PROPERTY_REQUIRES_ROOT = "requires_root";
  private Boolean requiresRoot;

  public AgentHealthRemediationScript content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The content of the script.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public AgentHealthRemediationScript filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The filename of the script.
   *
   * @return filename
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AgentHealthRemediationScript language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of the script.
   *
   * @return language
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public AgentHealthRemediationScript languageVersion(String languageVersion) {
    this.languageVersion = languageVersion;
    return this;
  }

  /**
   * The language version used by the script.
   *
   * @return languageVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguageVersion() {
    return languageVersion;
  }

  public void setLanguageVersion(String languageVersion) {
    this.languageVersion = languageVersion;
  }

  public AgentHealthRemediationScript requiresRoot(Boolean requiresRoot) {
    this.requiresRoot = requiresRoot;
    return this;
  }

  /**
   * Whether the script requires root privileges.
   *
   * @return requiresRoot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRES_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequiresRoot() {
    return requiresRoot;
  }

  public void setRequiresRoot(Boolean requiresRoot) {
    this.requiresRoot = requiresRoot;
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
   * @return AgentHealthRemediationScript
   */
  @JsonAnySetter
  public AgentHealthRemediationScript putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AgentHealthRemediationScript object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentHealthRemediationScript agentHealthRemediationScript = (AgentHealthRemediationScript) o;
    return Objects.equals(this.content, agentHealthRemediationScript.content)
        && Objects.equals(this.filename, agentHealthRemediationScript.filename)
        && Objects.equals(this.language, agentHealthRemediationScript.language)
        && Objects.equals(this.languageVersion, agentHealthRemediationScript.languageVersion)
        && Objects.equals(this.requiresRoot, agentHealthRemediationScript.requiresRoot)
        && Objects.equals(
            this.additionalProperties, agentHealthRemediationScript.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        content, filename, language, languageVersion, requiresRoot, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentHealthRemediationScript {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    languageVersion: ").append(toIndentedString(languageVersion)).append("\n");
    sb.append("    requiresRoot: ").append(toIndentedString(requiresRoot)).append("\n");
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

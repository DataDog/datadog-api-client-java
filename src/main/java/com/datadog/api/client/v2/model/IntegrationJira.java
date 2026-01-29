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

/** Jira integration settings */
@JsonPropertyOrder({
  IntegrationJira.JSON_PROPERTY_AUTO_CREATION,
  IntegrationJira.JSON_PROPERTY_ENABLED,
  IntegrationJira.JSON_PROPERTY_METADATA,
  IntegrationJira.JSON_PROPERTY_SYNC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationJira {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_CREATION = "auto_creation";
  private IntegrationJiraAutoCreation autoCreation;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private IntegrationJiraMetadata metadata;

  public static final String JSON_PROPERTY_SYNC = "sync";
  private IntegrationJiraSync sync;

  public IntegrationJira autoCreation(IntegrationJiraAutoCreation autoCreation) {
    this.autoCreation = autoCreation;
    this.unparsed |= autoCreation.unparsed;
    return this;
  }

  /**
   * GetautoCreation
   *
   * @return autoCreation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationJiraAutoCreation getAutoCreation() {
    return autoCreation;
  }

  public void setAutoCreation(IntegrationJiraAutoCreation autoCreation) {
    this.autoCreation = autoCreation;
  }

  public IntegrationJira enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Jira integration is enabled
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IntegrationJira metadata(IntegrationJiraMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Getmetadata
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationJiraMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(IntegrationJiraMetadata metadata) {
    this.metadata = metadata;
  }

  public IntegrationJira sync(IntegrationJiraSync sync) {
    this.sync = sync;
    this.unparsed |= sync.unparsed;
    return this;
  }

  /**
   * Getsync
   *
   * @return sync
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationJiraSync getSync() {
    return sync;
  }

  public void setSync(IntegrationJiraSync sync) {
    this.sync = sync;
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
   * @return IntegrationJira
   */
  @JsonAnySetter
  public IntegrationJira putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationJira object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationJira integrationJira = (IntegrationJira) o;
    return Objects.equals(this.autoCreation, integrationJira.autoCreation)
        && Objects.equals(this.enabled, integrationJira.enabled)
        && Objects.equals(this.metadata, integrationJira.metadata)
        && Objects.equals(this.sync, integrationJira.sync)
        && Objects.equals(this.additionalProperties, integrationJira.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCreation, enabled, metadata, sync, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationJira {\n");
    sb.append("    autoCreation: ").append(toIndentedString(autoCreation)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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

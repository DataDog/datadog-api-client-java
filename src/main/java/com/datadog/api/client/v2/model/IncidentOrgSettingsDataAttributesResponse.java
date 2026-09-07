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

/** Attributes of an incident org settings resource in a response. */
@JsonPropertyOrder({
  IncidentOrgSettingsDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentOrgSettingsDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentOrgSettingsDataAttributesResponse.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentOrgSettingsDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Map<String, Object> settings = new HashMap<String, Object>();

  public IncidentOrgSettingsDataAttributesResponse() {}

  @JsonCreator
  public IncidentOrgSettingsDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS) Map<String, Object> settings) {
    this.created = created;
    this.modified = modified;
    this.settings = settings;
  }

  public IncidentOrgSettingsDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the settings were created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentOrgSettingsDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the settings were last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentOrgSettingsDataAttributesResponse settings(Map<String, Object> settings) {
    this.settings = settings;
    return this;
  }

  public IncidentOrgSettingsDataAttributesResponse putSettingsItem(
      String key, Object settingsItem) {
    this.settings.put(key, settingsItem);
    return this;
  }

  /**
   * The settings configuration for an incident org settings resource.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getSettings() {
    return settings;
  }

  public void setSettings(Map<String, Object> settings) {
    this.settings = settings;
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
   * @return IncidentOrgSettingsDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentOrgSettingsDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentOrgSettingsDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentOrgSettingsDataAttributesResponse incidentOrgSettingsDataAttributesResponse =
        (IncidentOrgSettingsDataAttributesResponse) o;
    return Objects.equals(this.created, incidentOrgSettingsDataAttributesResponse.created)
        && Objects.equals(this.modified, incidentOrgSettingsDataAttributesResponse.modified)
        && Objects.equals(this.settings, incidentOrgSettingsDataAttributesResponse.settings)
        && Objects.equals(
            this.additionalProperties,
            incidentOrgSettingsDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, modified, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentOrgSettingsDataAttributesResponse {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

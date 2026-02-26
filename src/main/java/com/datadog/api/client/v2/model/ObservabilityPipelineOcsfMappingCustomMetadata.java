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

/** Metadata for the custom OCSF mapping. */
@JsonPropertyOrder({
  ObservabilityPipelineOcsfMappingCustomMetadata.JSON_PROPERTY_CLASS,
  ObservabilityPipelineOcsfMappingCustomMetadata.JSON_PROPERTY_PROFILES,
  ObservabilityPipelineOcsfMappingCustomMetadata.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOcsfMappingCustomMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLASS = "class";
  private String _class;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private List<String> profiles = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public ObservabilityPipelineOcsfMappingCustomMetadata() {}

  @JsonCreator
  public ObservabilityPipelineOcsfMappingCustomMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLASS) String _class,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this._class = _class;
    this.version = version;
  }

  public ObservabilityPipelineOcsfMappingCustomMetadata _class(String _class) {
    this._class = _class;
    return this;
  }

  /**
   * The OCSF event class name.
   *
   * @return _class
   */
  @JsonProperty(JSON_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClassAttribute() {
    return _class;
  }

  public void setClassAttribute(String _class) {
    this._class = _class;
  }

  public ObservabilityPipelineOcsfMappingCustomMetadata profiles(List<String> profiles) {
    this.profiles = profiles;
    return this;
  }

  public ObservabilityPipelineOcsfMappingCustomMetadata addProfilesItem(String profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * A list of OCSF profiles to apply.
   *
   * @return profiles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }

  public ObservabilityPipelineOcsfMappingCustomMetadata version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The OCSF schema version.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return ObservabilityPipelineOcsfMappingCustomMetadata
   */
  @JsonAnySetter
  public ObservabilityPipelineOcsfMappingCustomMetadata putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineOcsfMappingCustomMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOcsfMappingCustomMetadata observabilityPipelineOcsfMappingCustomMetadata =
        (ObservabilityPipelineOcsfMappingCustomMetadata) o;
    return Objects.equals(this._class, observabilityPipelineOcsfMappingCustomMetadata._class)
        && Objects.equals(this.profiles, observabilityPipelineOcsfMappingCustomMetadata.profiles)
        && Objects.equals(this.version, observabilityPipelineOcsfMappingCustomMetadata.version)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineOcsfMappingCustomMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_class, profiles, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOcsfMappingCustomMetadata {\n");
    sb.append("    _class: ").append(toIndentedString(_class)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

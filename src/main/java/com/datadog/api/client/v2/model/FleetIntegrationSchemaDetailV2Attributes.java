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

/** Attributes for a single integration's configuration schema. */
@JsonPropertyOrder({
  FleetIntegrationSchemaDetailV2Attributes.JSON_PROPERTY_FILES,
  FleetIntegrationSchemaDetailV2Attributes.JSON_PROPERTY_FOLDER,
  FleetIntegrationSchemaDetailV2Attributes.JSON_PROPERTY_NAME,
  FleetIntegrationSchemaDetailV2Attributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetIntegrationSchemaDetailV2Attributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILES = "files";
  private List<FleetIntegrationSchemaFileSpecV2> files = new ArrayList<>();

  public static final String JSON_PROPERTY_FOLDER = "folder";
  private String folder;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public FleetIntegrationSchemaDetailV2Attributes() {}

  @JsonCreator
  public FleetIntegrationSchemaDetailV2Attributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILES)
          List<FleetIntegrationSchemaFileSpecV2> files) {
    this.files = files;
    for (FleetIntegrationSchemaFileSpecV2 item : files) {
      this.unparsed |= item.unparsed;
    }
  }

  public FleetIntegrationSchemaDetailV2Attributes files(
      List<FleetIntegrationSchemaFileSpecV2> files) {
    this.files = files;
    for (FleetIntegrationSchemaFileSpecV2 item : files) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetIntegrationSchemaDetailV2Attributes addFilesItem(
      FleetIntegrationSchemaFileSpecV2 filesItem) {
    this.files.add(filesItem);
    this.unparsed |= filesItem.unparsed;
    return this;
  }

  /**
   * The configuration file specifications for the integration. Always present, returned as an empty
   * array when there are none.
   *
   * @return files
   */
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FleetIntegrationSchemaFileSpecV2> getFiles() {
    return files;
  }

  public void setFiles(List<FleetIntegrationSchemaFileSpecV2> files) {
    this.files = files;
    if (files != null) {
      for (FleetIntegrationSchemaFileSpecV2 item : files) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetIntegrationSchemaDetailV2Attributes folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * The integration folder key. Absent from the response when empty.
   *
   * @return folder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public FleetIntegrationSchemaDetailV2Attributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the integration. Absent from the response when empty.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FleetIntegrationSchemaDetailV2Attributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The integration version. Absent from the response when empty.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return FleetIntegrationSchemaDetailV2Attributes
   */
  @JsonAnySetter
  public FleetIntegrationSchemaDetailV2Attributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetIntegrationSchemaDetailV2Attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetIntegrationSchemaDetailV2Attributes fleetIntegrationSchemaDetailV2Attributes =
        (FleetIntegrationSchemaDetailV2Attributes) o;
    return Objects.equals(this.files, fleetIntegrationSchemaDetailV2Attributes.files)
        && Objects.equals(this.folder, fleetIntegrationSchemaDetailV2Attributes.folder)
        && Objects.equals(this.name, fleetIntegrationSchemaDetailV2Attributes.name)
        && Objects.equals(this.version, fleetIntegrationSchemaDetailV2Attributes.version)
        && Objects.equals(
            this.additionalProperties,
            fleetIntegrationSchemaDetailV2Attributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, folder, name, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetIntegrationSchemaDetailV2Attributes {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

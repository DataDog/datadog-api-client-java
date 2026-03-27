/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A configuration file for an integration.</p>
 */
@JsonPropertyOrder({
  FleetConfigurationFile.JSON_PROPERTY_FILE_CONTENT,
  FleetConfigurationFile.JSON_PROPERTY_FILE_PATH,
  FleetConfigurationFile.JSON_PROPERTY_FILENAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetConfigurationFile {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE_CONTENT = "file_content";
  private String fileContent;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public FleetConfigurationFile fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

  /**
   * <p>The raw content of the configuration file.</p>
   * @return fileContent
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILE_CONTENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFileContent() {
        return fileContent;
      }
  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }
  public FleetConfigurationFile filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * <p>Path to the configuration file.</p>
   * @return filePath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILE_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFilePath() {
        return filePath;
      }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  public FleetConfigurationFile filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * <p>Name of the configuration file.</p>
   * @return filename
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILENAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFilename() {
        return filename;
      }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return FleetConfigurationFile
   */
  @JsonAnySetter
  public FleetConfigurationFile putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this FleetConfigurationFile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetConfigurationFile fleetConfigurationFile = (FleetConfigurationFile) o;
    return Objects.equals(this.fileContent, fleetConfigurationFile.fileContent) && Objects.equals(this.filePath, fleetConfigurationFile.filePath) && Objects.equals(this.filename, fleetConfigurationFile.filename) && Objects.equals(this.additionalProperties, fleetConfigurationFile.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fileContent,filePath,filename, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetConfigurationFile {\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

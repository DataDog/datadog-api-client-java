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
   * <p>A single configuration file operation to perform on the target hosts.</p>
 */
@JsonPropertyOrder({
  FleetDeploymentOperation.JSON_PROPERTY_FILE_OP,
  FleetDeploymentOperation.JSON_PROPERTY_FILE_PATH,
  FleetDeploymentOperation.JSON_PROPERTY_PATCH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentOperation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE_OP = "file_op";
  private FleetDeploymentFileOp fileOp;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public static final String JSON_PROPERTY_PATCH = "patch";
  private Map<String, Object> patch = null;

  public FleetDeploymentOperation() {}

  @JsonCreator
  public FleetDeploymentOperation(
            @JsonProperty(required=true, value=JSON_PROPERTY_FILE_OP)FleetDeploymentFileOp fileOp,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILE_PATH)String filePath) {
        this.fileOp = fileOp;
        this.unparsed |= !fileOp.isValid();
        this.filePath = filePath;
  }
  public FleetDeploymentOperation fileOp(FleetDeploymentFileOp fileOp) {
    this.fileOp = fileOp;
    this.unparsed |= !fileOp.isValid();
    return this;
  }

  /**
   * <p>Type of file operation to perform on the target configuration file.
   * - <code>merge-patch</code>: Merges the provided patch data with the existing configuration file.
   *   Creates the file if it doesn't exist.
   * - <code>delete</code>: Removes the specified configuration file from the target hosts.</p>
   * @return fileOp
  **/
      @JsonProperty(JSON_PROPERTY_FILE_OP)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FleetDeploymentFileOp getFileOp() {
        return fileOp;
      }
  public void setFileOp(FleetDeploymentFileOp fileOp) {
    if (!fileOp.isValid()) {
        this.unparsed = true;
    }
    this.fileOp = fileOp;
  }
  public FleetDeploymentOperation filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * <p>Absolute path to the target configuration file on the host.</p>
   * @return filePath
  **/
      @JsonProperty(JSON_PROPERTY_FILE_PATH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFilePath() {
        return filePath;
      }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  public FleetDeploymentOperation patch(Map<String, Object> patch) {
    this.patch = patch;
    return this;
  }
  public FleetDeploymentOperation putPatchItem(String key, Object patchItem) {
    if (this.patch == null) {
      this.patch = new HashMap<>();
    }
    this.patch.put(key, patchItem);
    return this;
  }

  /**
   * <p>Patch data in JSON format to apply to the configuration file.
   * When using <code>merge-patch</code>, this object is merged with the existing configuration,
   * allowing you to add, update, or override specific fields without replacing the entire file.
   * The structure must match the target configuration file format (for example, YAML structure
   * for Datadog Agent config). Not applicable when using the <code>delete</code> operation.</p>
   * @return patch
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATCH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getPatch() {
        return patch;
      }
  public void setPatch(Map<String, Object> patch) {
    this.patch = patch;
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
   * @return FleetDeploymentOperation
   */
  @JsonAnySetter
  public FleetDeploymentOperation putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetDeploymentOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentOperation fleetDeploymentOperation = (FleetDeploymentOperation) o;
    return Objects.equals(this.fileOp, fleetDeploymentOperation.fileOp) && Objects.equals(this.filePath, fleetDeploymentOperation.filePath) && Objects.equals(this.patch, fleetDeploymentOperation.patch) && Objects.equals(this.additionalProperties, fleetDeploymentOperation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fileOp,filePath,patch, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentOperation {\n");
    sb.append("    fileOp: ").append(toIndentedString(fileOp)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

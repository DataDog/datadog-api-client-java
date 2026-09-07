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
   * <p>Package version information for a host, showing the initial version before deployment,
   * the target version to deploy, and the current version on the host.</p>
 */
@JsonPropertyOrder({
  FleetDeploymentHostPackage.JSON_PROPERTY_CURRENT_VERSION,
  FleetDeploymentHostPackage.JSON_PROPERTY_INITIAL_VERSION,
  FleetDeploymentHostPackage.JSON_PROPERTY_PACKAGE_NAME,
  FleetDeploymentHostPackage.JSON_PROPERTY_TARGET_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentHostPackage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_VERSION = "current_version";
  private String currentVersion;

  public static final String JSON_PROPERTY_INITIAL_VERSION = "initial_version";
  private String initialVersion;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "package_name";
  private String packageName;

  public static final String JSON_PROPERTY_TARGET_VERSION = "target_version";
  private String targetVersion;

  public FleetDeploymentHostPackage currentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * <p>The current version of the package on the host.</p>
   * @return currentVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CURRENT_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCurrentVersion() {
        return currentVersion;
      }
  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }
  public FleetDeploymentHostPackage initialVersion(String initialVersion) {
    this.initialVersion = initialVersion;
    return this;
  }

  /**
   * <p>The initial version of the package on the host before the deployment started.</p>
   * @return initialVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INITIAL_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getInitialVersion() {
        return initialVersion;
      }
  public void setInitialVersion(String initialVersion) {
    this.initialVersion = initialVersion;
  }
  public FleetDeploymentHostPackage packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * <p>The name of the package.</p>
   * @return packageName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPackageName() {
        return packageName;
      }
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }
  public FleetDeploymentHostPackage targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * <p>The target version that the deployment is attempting to install.</p>
   * @return targetVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTargetVersion() {
        return targetVersion;
      }
  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
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
   * @return FleetDeploymentHostPackage
   */
  @JsonAnySetter
  public FleetDeploymentHostPackage putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetDeploymentHostPackage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentHostPackage fleetDeploymentHostPackage = (FleetDeploymentHostPackage) o;
    return Objects.equals(this.currentVersion, fleetDeploymentHostPackage.currentVersion) && Objects.equals(this.initialVersion, fleetDeploymentHostPackage.initialVersion) && Objects.equals(this.packageName, fleetDeploymentHostPackage.packageName) && Objects.equals(this.targetVersion, fleetDeploymentHostPackage.targetVersion) && Objects.equals(this.additionalProperties, fleetDeploymentHostPackage.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(currentVersion,initialVersion,packageName,targetVersion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentHostPackage {\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    initialVersion: ").append(toIndentedString(initialVersion)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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

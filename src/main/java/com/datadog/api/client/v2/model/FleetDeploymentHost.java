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

/** A host that is part of a deployment with its current status. */
@JsonPropertyOrder({
  FleetDeploymentHost.JSON_PROPERTY_ERROR,
  FleetDeploymentHost.JSON_PROPERTY_HOSTNAME,
  FleetDeploymentHost.JSON_PROPERTY_STATUS,
  FleetDeploymentHost.JSON_PROPERTY_VERSIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentHost {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_VERSIONS = "versions";
  private List<FleetDeploymentHostPackage> versions = null;

  public FleetDeploymentHost error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message if the deployment failed on this host.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public FleetDeploymentHost hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The hostname of the agent.
   *
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public FleetDeploymentHost status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Current deployment status for this specific host.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FleetDeploymentHost versions(List<FleetDeploymentHostPackage> versions) {
    this.versions = versions;
    for (FleetDeploymentHostPackage item : versions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentHost addVersionsItem(FleetDeploymentHostPackage versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    this.unparsed |= versionsItem.unparsed;
    return this;
  }

  /**
   * List of packages and their versions currently installed on this host.
   *
   * @return versions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentHostPackage> getVersions() {
    return versions;
  }

  public void setVersions(List<FleetDeploymentHostPackage> versions) {
    this.versions = versions;
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
   * @return FleetDeploymentHost
   */
  @JsonAnySetter
  public FleetDeploymentHost putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentHost object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentHost fleetDeploymentHost = (FleetDeploymentHost) o;
    return Objects.equals(this.error, fleetDeploymentHost.error)
        && Objects.equals(this.hostname, fleetDeploymentHost.hostname)
        && Objects.equals(this.status, fleetDeploymentHost.status)
        && Objects.equals(this.versions, fleetDeploymentHost.versions)
        && Objects.equals(this.additionalProperties, fleetDeploymentHost.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, hostname, status, versions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentHost {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

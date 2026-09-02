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
   * <p>Per-host status entry for a deployment.</p>
 */
@JsonPropertyOrder({
  FleetDeploymentV2DetailAgent.JSON_PROPERTY_ERROR,
  FleetDeploymentV2DetailAgent.JSON_PROPERTY_HOSTNAME,
  FleetDeploymentV2DetailAgent.JSON_PROPERTY_RUNNING_STEP,
  FleetDeploymentV2DetailAgent.JSON_PROPERTY_STATUS,
  FleetDeploymentV2DetailAgent.JSON_PROPERTY_STATUS_DETAILS,
  FleetDeploymentV2DetailAgent.JSON_PROPERTY_VERSIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentV2DetailAgent {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_RUNNING_STEP = "running_step";
  private String runningStep;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_DETAILS = "status_details";
  private String statusDetails;

  public static final String JSON_PROPERTY_VERSIONS = "versions";
  private List<FleetDeploymentHostPackage> versions = null;

  public FleetDeploymentV2DetailAgent error(String error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Error message if the deployment failed on this host.</p>
   * @return error
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getError() {
        return error;
      }
  public void setError(String error) {
    this.error = error;
  }
  public FleetDeploymentV2DetailAgent hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * <p>Hostname of the agent.</p>
   * @return hostname
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOSTNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHostname() {
        return hostname;
      }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }
  public FleetDeploymentV2DetailAgent runningStep(String runningStep) {
    this.runningStep = runningStep;
    return this;
  }

  /**
   * <p>Name of the step currently executing on this host.</p>
   * @return runningStep
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUNNING_STEP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRunningStep() {
        return runningStep;
      }
  public void setRunningStep(String runningStep) {
    this.runningStep = runningStep;
  }
  public FleetDeploymentV2DetailAgent status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Deployment status for this host (for example, "pending", "running", "succeeded", "failed").</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public FleetDeploymentV2DetailAgent statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * <p>Additional details about the current deployment status on this host.</p>
   * @return statusDetails
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatusDetails() {
        return statusDetails;
      }
  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }
  public FleetDeploymentV2DetailAgent versions(List<FleetDeploymentHostPackage> versions) {
    this.versions = versions;
    if (versions != null) {
    for (FleetDeploymentHostPackage item : versions) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetDeploymentV2DetailAgent addVersionsItem(FleetDeploymentHostPackage versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    this.unparsed |= versionsItem.unparsed;
    return this;
  }

  /**
   * <p>Package version details for this host.</p>
   * @return versions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetDeploymentHostPackage> getVersions() {
        return versions;
      }
  public void setVersions(List<FleetDeploymentHostPackage> versions) {
    this.versions = versions;
    if (versions != null) {
      for (FleetDeploymentHostPackage item : versions) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return FleetDeploymentV2DetailAgent
   */
  @JsonAnySetter
  public FleetDeploymentV2DetailAgent putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetDeploymentV2DetailAgent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentV2DetailAgent fleetDeploymentV2DetailAgent = (FleetDeploymentV2DetailAgent) o;
    return Objects.equals(this.error, fleetDeploymentV2DetailAgent.error) && Objects.equals(this.hostname, fleetDeploymentV2DetailAgent.hostname) && Objects.equals(this.runningStep, fleetDeploymentV2DetailAgent.runningStep) && Objects.equals(this.status, fleetDeploymentV2DetailAgent.status) && Objects.equals(this.statusDetails, fleetDeploymentV2DetailAgent.statusDetails) && Objects.equals(this.versions, fleetDeploymentV2DetailAgent.versions) && Objects.equals(this.additionalProperties, fleetDeploymentV2DetailAgent.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(error,hostname,runningStep,status,statusDetails,versions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentV2DetailAgent {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    runningStep: ").append(toIndentedString(runningStep)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

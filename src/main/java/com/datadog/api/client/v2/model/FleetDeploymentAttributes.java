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

/** Attributes of a deployment in the response. */
@JsonPropertyOrder({
  FleetDeploymentAttributes.JSON_PROPERTY_CONFIG_OPERATIONS,
  FleetDeploymentAttributes.JSON_PROPERTY_ESTIMATED_END_TIME_UNIX,
  FleetDeploymentAttributes.JSON_PROPERTY_FILTER_QUERY,
  FleetDeploymentAttributes.JSON_PROPERTY_HIGH_LEVEL_STATUS,
  FleetDeploymentAttributes.JSON_PROPERTY_HOSTS,
  FleetDeploymentAttributes.JSON_PROPERTY_PACKAGES,
  FleetDeploymentAttributes.JSON_PROPERTY_TOTAL_HOSTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG_OPERATIONS = "config_operations";
  private List<FleetDeploymentOperation> configOperations = null;

  public static final String JSON_PROPERTY_ESTIMATED_END_TIME_UNIX = "estimated_end_time_unix";
  private Long estimatedEndTimeUnix;

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private String filterQuery;

  public static final String JSON_PROPERTY_HIGH_LEVEL_STATUS = "high_level_status";
  private String highLevelStatus;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<FleetDeploymentHost> hosts = null;

  public static final String JSON_PROPERTY_PACKAGES = "packages";
  private List<FleetDeploymentPackage> packages = null;

  public static final String JSON_PROPERTY_TOTAL_HOSTS = "total_hosts";
  private Long totalHosts;

  public FleetDeploymentAttributes configOperations(
      List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    for (FleetDeploymentOperation item : configOperations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentAttributes addConfigOperationsItem(
      FleetDeploymentOperation configOperationsItem) {
    if (this.configOperations == null) {
      this.configOperations = new ArrayList<>();
    }
    this.configOperations.add(configOperationsItem);
    this.unparsed |= configOperationsItem.unparsed;
    return this;
  }

  /**
   * Ordered list of configuration file operations to perform on the target hosts.
   *
   * @return configOperations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentOperation> getConfigOperations() {
    return configOperations;
  }

  public void setConfigOperations(List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
  }

  public FleetDeploymentAttributes estimatedEndTimeUnix(Long estimatedEndTimeUnix) {
    this.estimatedEndTimeUnix = estimatedEndTimeUnix;
    return this;
  }

  /**
   * Estimated completion time of the deployment as a Unix timestamp (seconds since epoch).
   *
   * @return estimatedEndTimeUnix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_END_TIME_UNIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEstimatedEndTimeUnix() {
    return estimatedEndTimeUnix;
  }

  public void setEstimatedEndTimeUnix(Long estimatedEndTimeUnix) {
    this.estimatedEndTimeUnix = estimatedEndTimeUnix;
  }

  public FleetDeploymentAttributes filterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
    return this;
  }

  /**
   * Query used to filter and select target hosts for the deployment. Uses the Datadog query syntax.
   *
   * @return filterQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilterQuery() {
    return filterQuery;
  }

  public void setFilterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
  }

  public FleetDeploymentAttributes highLevelStatus(String highLevelStatus) {
    this.highLevelStatus = highLevelStatus;
    return this;
  }

  /**
   * Current high-level status of the deployment (for example, "pending", "running", "completed",
   * "failed").
   *
   * @return highLevelStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_LEVEL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHighLevelStatus() {
    return highLevelStatus;
  }

  public void setHighLevelStatus(String highLevelStatus) {
    this.highLevelStatus = highLevelStatus;
  }

  public FleetDeploymentAttributes hosts(List<FleetDeploymentHost> hosts) {
    this.hosts = hosts;
    for (FleetDeploymentHost item : hosts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentAttributes addHostsItem(FleetDeploymentHost hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    this.unparsed |= hostsItem.unparsed;
    return this;
  }

  /**
   * Paginated list of hosts in this deployment with their individual statuses. Only included when
   * fetching a single deployment by ID. Use the <code>limit</code> and <code>page</code> query
   * parameters to navigate through pages. Pagination metadata is included in the response <code>
   * meta.hosts</code> field.
   *
   * @return hosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentHost> getHosts() {
    return hosts;
  }

  public void setHosts(List<FleetDeploymentHost> hosts) {
    this.hosts = hosts;
  }

  public FleetDeploymentAttributes packages(List<FleetDeploymentPackage> packages) {
    this.packages = packages;
    for (FleetDeploymentPackage item : packages) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentAttributes addPackagesItem(FleetDeploymentPackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    this.unparsed |= packagesItem.unparsed;
    return this;
  }

  /**
   * List of packages to deploy to target hosts. Present only for package upgrade deployments.
   *
   * @return packages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentPackage> getPackages() {
    return packages;
  }

  public void setPackages(List<FleetDeploymentPackage> packages) {
    this.packages = packages;
  }

  public FleetDeploymentAttributes totalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
    return this;
  }

  /**
   * Total number of hosts targeted by this deployment.
   *
   * @return totalHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalHosts() {
    return totalHosts;
  }

  public void setTotalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
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
   * @return FleetDeploymentAttributes
   */
  @JsonAnySetter
  public FleetDeploymentAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentAttributes fleetDeploymentAttributes = (FleetDeploymentAttributes) o;
    return Objects.equals(this.configOperations, fleetDeploymentAttributes.configOperations)
        && Objects.equals(this.estimatedEndTimeUnix, fleetDeploymentAttributes.estimatedEndTimeUnix)
        && Objects.equals(this.filterQuery, fleetDeploymentAttributes.filterQuery)
        && Objects.equals(this.highLevelStatus, fleetDeploymentAttributes.highLevelStatus)
        && Objects.equals(this.hosts, fleetDeploymentAttributes.hosts)
        && Objects.equals(this.packages, fleetDeploymentAttributes.packages)
        && Objects.equals(this.totalHosts, fleetDeploymentAttributes.totalHosts)
        && Objects.equals(
            this.additionalProperties, fleetDeploymentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configOperations,
        estimatedEndTimeUnix,
        filterQuery,
        highLevelStatus,
        hosts,
        packages,
        totalHosts,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentAttributes {\n");
    sb.append("    configOperations: ").append(toIndentedString(configOperations)).append("\n");
    sb.append("    estimatedEndTimeUnix: ")
        .append(toIndentedString(estimatedEndTimeUnix))
        .append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    highLevelStatus: ").append(toIndentedString(highLevelStatus)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    totalHosts: ").append(toIndentedString(totalHosts)).append("\n");
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

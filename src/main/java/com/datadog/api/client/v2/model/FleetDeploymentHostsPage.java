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

/** Pagination details for the list of hosts in a deployment. */
@JsonPropertyOrder({
  FleetDeploymentHostsPage.JSON_PROPERTY_CURRENT_PAGE,
  FleetDeploymentHostsPage.JSON_PROPERTY_PAGE_SIZE,
  FleetDeploymentHostsPage.JSON_PROPERTY_TOTAL_HOSTS,
  FleetDeploymentHostsPage.JSON_PROPERTY_TOTAL_PAGES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentHostsPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_PAGE = "current_page";
  private Long currentPage;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Long pageSize;

  public static final String JSON_PROPERTY_TOTAL_HOSTS = "total_hosts";
  private Long totalHosts;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
  private Long totalPages;

  public FleetDeploymentHostsPage currentPage(Long currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page index (zero-based).
   *
   * @return currentPage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
  }

  public FleetDeploymentHostsPage pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Number of hosts returned per page.
   *
   * @return pageSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public FleetDeploymentHostsPage totalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
    return this;
  }

  /**
   * Total number of hosts in this deployment.
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

  public FleetDeploymentHostsPage totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages available.
   *
   * @return totalPages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
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
   * @return FleetDeploymentHostsPage
   */
  @JsonAnySetter
  public FleetDeploymentHostsPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentHostsPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentHostsPage fleetDeploymentHostsPage = (FleetDeploymentHostsPage) o;
    return Objects.equals(this.currentPage, fleetDeploymentHostsPage.currentPage)
        && Objects.equals(this.pageSize, fleetDeploymentHostsPage.pageSize)
        && Objects.equals(this.totalHosts, fleetDeploymentHostsPage.totalHosts)
        && Objects.equals(this.totalPages, fleetDeploymentHostsPage.totalPages)
        && Objects.equals(this.additionalProperties, fleetDeploymentHostsPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, pageSize, totalHosts, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentHostsPage {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalHosts: ").append(toIndentedString(totalHosts)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

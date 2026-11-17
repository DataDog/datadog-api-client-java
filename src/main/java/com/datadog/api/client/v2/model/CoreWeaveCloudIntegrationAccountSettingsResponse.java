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

/** Settings configured on the CoreWeave integration account. */
@JsonPropertyOrder({
  CoreWeaveCloudIntegrationAccountSettingsResponse.JSON_PROPERTY_ACCOUNT_TAGS,
  CoreWeaveCloudIntegrationAccountSettingsResponse.JSON_PROPERTY_CLUSTER_FILTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoreWeaveCloudIntegrationAccountSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private List<String> accountTags = null;

  public static final String JSON_PROPERTY_CLUSTER_FILTERS = "cluster_filters";
  private List<String> clusterFilters = null;

  public CoreWeaveCloudIntegrationAccountSettingsResponse accountTags(List<String> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public CoreWeaveCloudIntegrationAccountSettingsResponse addAccountTagsItem(
      String accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

  /**
   * Tags added to all data collected from this CoreWeave account.
   *
   * @return accountTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccountTags() {
    return accountTags;
  }

  public void setAccountTags(List<String> accountTags) {
    this.accountTags = accountTags;
  }

  public CoreWeaveCloudIntegrationAccountSettingsResponse clusterFilters(
      List<String> clusterFilters) {
    this.clusterFilters = clusterFilters;
    return this;
  }

  public CoreWeaveCloudIntegrationAccountSettingsResponse addClusterFiltersItem(
      String clusterFiltersItem) {
    if (this.clusterFilters == null) {
      this.clusterFilters = new ArrayList<>();
    }
    this.clusterFilters.add(clusterFiltersItem);
    return this;
  }

  /**
   * Tag-filter rules limiting metric collection to matching clusters. Absent when no filters are
   * configured.
   *
   * @return clusterFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getClusterFilters() {
    return clusterFilters;
  }

  public void setClusterFilters(List<String> clusterFilters) {
    this.clusterFilters = clusterFilters;
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
   * @return CoreWeaveCloudIntegrationAccountSettingsResponse
   */
  @JsonAnySetter
  public CoreWeaveCloudIntegrationAccountSettingsResponse putAdditionalProperty(
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

  /** Return true if this CoreWeaveCloudIntegrationAccountSettingsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWeaveCloudIntegrationAccountSettingsResponse
        coreWeaveCloudIntegrationAccountSettingsResponse =
            (CoreWeaveCloudIntegrationAccountSettingsResponse) o;
    return Objects.equals(
            this.accountTags, coreWeaveCloudIntegrationAccountSettingsResponse.accountTags)
        && Objects.equals(
            this.clusterFilters, coreWeaveCloudIntegrationAccountSettingsResponse.clusterFilters)
        && Objects.equals(
            this.additionalProperties,
            coreWeaveCloudIntegrationAccountSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTags, clusterFilters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWeaveCloudIntegrationAccountSettingsResponse {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    clusterFilters: ").append(toIndentedString(clusterFilters)).append("\n");
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

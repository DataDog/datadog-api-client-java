/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Settings for updating the CoreWeave integration account. Only the fields provided are changed.
 */
@JsonPropertyOrder({
  CoreWeaveCloudIntegrationAccountSettingsUpdate.JSON_PROPERTY_ACCOUNT_TAGS,
  CoreWeaveCloudIntegrationAccountSettingsUpdate.JSON_PROPERTY_CLUSTER_FILTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoreWeaveCloudIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private List<String> accountTags = null;

  public static final String JSON_PROPERTY_CLUSTER_FILTERS = "cluster_filters";
  private List<String> clusterFilters = null;

  public CoreWeaveCloudIntegrationAccountSettingsUpdate accountTags(List<String> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public CoreWeaveCloudIntegrationAccountSettingsUpdate addAccountTagsItem(String accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

  /**
   * Tags added to all metrics and logs collected from this CoreWeave account. Sending it replaces
   * the whole list; send an empty array to remove all tags, or omit it to keep the stored list.
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

  public CoreWeaveCloudIntegrationAccountSettingsUpdate clusterFilters(
      List<String> clusterFilters) {
    this.clusterFilters = clusterFilters;
    return this;
  }

  public CoreWeaveCloudIntegrationAccountSettingsUpdate addClusterFiltersItem(
      String clusterFiltersItem) {
    if (this.clusterFilters == null) {
      this.clusterFilters = new ArrayList<>();
    }
    this.clusterFilters.add(clusterFiltersItem);
    return this;
  }

  /**
   * Tag-filter rules limiting metric collection to matching clusters. Sending it replaces the whole
   * list; send an empty array to remove all filters and collect every cluster, or omit it to keep
   * the stored list. Include rules (<code>key:value</code>) are combined with OR, exclusion rules (
   * <code>!key:value</code>) are then applied with AND, and <code>?</code> and <code>*</code> are
   * wildcards.
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

  /** Return true if this CoreWeaveCloudIntegrationAccountSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWeaveCloudIntegrationAccountSettingsUpdate coreWeaveCloudIntegrationAccountSettingsUpdate =
        (CoreWeaveCloudIntegrationAccountSettingsUpdate) o;
    return Objects.equals(
            this.accountTags, coreWeaveCloudIntegrationAccountSettingsUpdate.accountTags)
        && Objects.equals(
            this.clusterFilters, coreWeaveCloudIntegrationAccountSettingsUpdate.clusterFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTags, clusterFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWeaveCloudIntegrationAccountSettingsUpdate {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    clusterFilters: ").append(toIndentedString(clusterFilters)).append("\n");
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

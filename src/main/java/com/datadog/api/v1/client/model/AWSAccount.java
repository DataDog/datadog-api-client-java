/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Returns the AWS account associated with this integration. */
@JsonPropertyOrder({
  AWSAccount.JSON_PROPERTY_ACCESS_KEY_ID,
  AWSAccount.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccount.JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES,
  AWSAccount.JSON_PROPERTY_CSPM_RESOURCE_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_EXCLUDED_REGIONS,
  AWSAccount.JSON_PROPERTY_FILTER_TAGS,
  AWSAccount.JSON_PROPERTY_HOST_TAGS,
  AWSAccount.JSON_PROPERTY_METRICS_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_ROLE_NAME,
  AWSAccount.JSON_PROPERTY_SECRET_ACCESS_KEY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccount {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES =
      "account_specific_namespace_rules";
  private Map<String, Boolean> accountSpecificNamespaceRules = null;

  public static final String JSON_PROPERTY_CSPM_RESOURCE_COLLECTION_ENABLED =
      "cspm_resource_collection_enabled";
  private Boolean cspmResourceCollectionEnabled = false;

  public static final String JSON_PROPERTY_EXCLUDED_REGIONS = "excluded_regions";
  private List<String> excludedRegions = null;

  public static final String JSON_PROPERTY_FILTER_TAGS = "filter_tags";
  private List<String> filterTags = null;

  public static final String JSON_PROPERTY_HOST_TAGS = "host_tags";
  private List<String> hostTags = null;

  public static final String JSON_PROPERTY_METRICS_COLLECTION_ENABLED =
      "metrics_collection_enabled";
  private Boolean metricsCollectionEnabled = true;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled = false;

  public static final String JSON_PROPERTY_ROLE_NAME = "role_name";
  private String roleName;

  public static final String JSON_PROPERTY_SECRET_ACCESS_KEY = "secret_access_key";
  private String secretAccessKey;

  public AWSAccount accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.
   *
   * @return accessKeyId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AWSAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Your AWS Account ID without dashes.
   *
   * @return accountId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSAccount accountSpecificNamespaceRules(
      Map<String, Boolean> accountSpecificNamespaceRules) {
    this.accountSpecificNamespaceRules = accountSpecificNamespaceRules;
    return this;
  }

  public AWSAccount putAccountSpecificNamespaceRulesItem(
      String key, Boolean accountSpecificNamespaceRulesItem) {
    if (this.accountSpecificNamespaceRules == null) {
      this.accountSpecificNamespaceRules = new HashMap<>();
    }
    this.accountSpecificNamespaceRules.put(key, accountSpecificNamespaceRulesItem);
    return this;
  }

  /**
   * An object, (in the form <code>{"namespace1":true/false, "namespace2":true/false}</code>), that
   * enables or disables metric collection for specific AWS namespaces for this AWS account only.
   *
   * @return accountSpecificNamespaceRules
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Boolean> getAccountSpecificNamespaceRules() {
    return accountSpecificNamespaceRules;
  }

  public void setAccountSpecificNamespaceRules(Map<String, Boolean> accountSpecificNamespaceRules) {
    this.accountSpecificNamespaceRules = accountSpecificNamespaceRules;
  }

  public AWSAccount cspmResourceCollectionEnabled(Boolean cspmResourceCollectionEnabled) {
    this.cspmResourceCollectionEnabled = cspmResourceCollectionEnabled;
    return this;
  }

  /**
   * Whether Datadog collects cloud security posture management resources from your AWS account.
   * This includes additional resources not covered under the general <code>resource_collection
   * </code>.
   *
   * @return cspmResourceCollectionEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCspmResourceCollectionEnabled() {
    return cspmResourceCollectionEnabled;
  }

  public void setCspmResourceCollectionEnabled(Boolean cspmResourceCollectionEnabled) {
    this.cspmResourceCollectionEnabled = cspmResourceCollectionEnabled;
  }

  public AWSAccount excludedRegions(List<String> excludedRegions) {
    this.excludedRegions = excludedRegions;
    return this;
  }

  public AWSAccount addExcludedRegionsItem(String excludedRegionsItem) {
    if (this.excludedRegions == null) {
      this.excludedRegions = new ArrayList<>();
    }
    this.excludedRegions.add(excludedRegionsItem);
    return this;
  }

  /**
   * An array of AWS regions to exclude from metrics collection.
   *
   * @return excludedRegions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedRegions() {
    return excludedRegions;
  }

  public void setExcludedRegions(List<String> excludedRegions) {
    this.excludedRegions = excludedRegions;
  }

  public AWSAccount filterTags(List<String> filterTags) {
    this.filterTags = filterTags;
    return this;
  }

  public AWSAccount addFilterTagsItem(String filterTagsItem) {
    if (this.filterTags == null) {
      this.filterTags = new ArrayList<>();
    }
    this.filterTags.add(filterTagsItem);
    return this;
  }

  /**
   * The array of EC2 tags (in the form <code>key:value</code>) defines a filter that Datadog uses
   * when collecting metrics from EC2. Wildcards, such as <code>?</code> (for single characters) and
   * <code>*</code> (for multiple characters) can also be used. Only hosts that match one of the
   * defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag
   * can also be excluded by adding <code>!</code> before the tag. For example, <code>
   * env:production,instance-type:c1.*,!region:us-east-1</code>
   *
   * @return filterTags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFilterTags() {
    return filterTags;
  }

  public void setFilterTags(List<String> filterTags) {
    this.filterTags = filterTags;
  }

  public AWSAccount hostTags(List<String> hostTags) {
    this.hostTags = hostTags;
    return this;
  }

  public AWSAccount addHostTagsItem(String hostTagsItem) {
    if (this.hostTags == null) {
      this.hostTags = new ArrayList<>();
    }
    this.hostTags.add(hostTagsItem);
    return this;
  }

  /**
   * Array of tags (in the form <code>key:value</code>) to add to all hosts and metrics reporting
   * through this integration.
   *
   * @return hostTags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHostTags() {
    return hostTags;
  }

  public void setHostTags(List<String> hostTags) {
    this.hostTags = hostTags;
  }

  public AWSAccount metricsCollectionEnabled(Boolean metricsCollectionEnabled) {
    this.metricsCollectionEnabled = metricsCollectionEnabled;
    return this;
  }

  /**
   * Whether Datadog collects metrics for this AWS account.
   *
   * @return metricsCollectionEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMetricsCollectionEnabled() {
    return metricsCollectionEnabled;
  }

  public void setMetricsCollectionEnabled(Boolean metricsCollectionEnabled) {
    this.metricsCollectionEnabled = metricsCollectionEnabled;
  }

  public AWSAccount resourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * Whether Datadog collects a standard set of resources from your AWS account.
   *
   * @return resourceCollectionEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResourceCollectionEnabled() {
    return resourceCollectionEnabled;
  }

  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }

  public AWSAccount roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Your Datadog role delegation name.
   *
   * @return roleName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public AWSAccount secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * Your AWS secret access key. Only required if your AWS account is a GovCloud or China account.
   *
   * @return secretAccessKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  /** Return true if this AWSAccount object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccount awsAccount = (AWSAccount) o;
    return Objects.equals(this.accessKeyId, awsAccount.accessKeyId)
        && Objects.equals(this.accountId, awsAccount.accountId)
        && Objects.equals(
            this.accountSpecificNamespaceRules, awsAccount.accountSpecificNamespaceRules)
        && Objects.equals(
            this.cspmResourceCollectionEnabled, awsAccount.cspmResourceCollectionEnabled)
        && Objects.equals(this.excludedRegions, awsAccount.excludedRegions)
        && Objects.equals(this.filterTags, awsAccount.filterTags)
        && Objects.equals(this.hostTags, awsAccount.hostTags)
        && Objects.equals(this.metricsCollectionEnabled, awsAccount.metricsCollectionEnabled)
        && Objects.equals(this.resourceCollectionEnabled, awsAccount.resourceCollectionEnabled)
        && Objects.equals(this.roleName, awsAccount.roleName)
        && Objects.equals(this.secretAccessKey, awsAccount.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessKeyId,
        accountId,
        accountSpecificNamespaceRules,
        cspmResourceCollectionEnabled,
        excludedRegions,
        filterTags,
        hostTags,
        metricsCollectionEnabled,
        resourceCollectionEnabled,
        roleName,
        secretAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccount {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountSpecificNamespaceRules: ")
        .append(toIndentedString(accountSpecificNamespaceRules))
        .append("\n");
    sb.append("    cspmResourceCollectionEnabled: ")
        .append(toIndentedString(cspmResourceCollectionEnabled))
        .append("\n");
    sb.append("    excludedRegions: ").append(toIndentedString(excludedRegions)).append("\n");
    sb.append("    filterTags: ").append(toIndentedString(filterTags)).append("\n");
    sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
    sb.append("    metricsCollectionEnabled: ")
        .append(toIndentedString(metricsCollectionEnabled))
        .append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("}");
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

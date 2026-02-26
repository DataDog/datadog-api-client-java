/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Returns the AWS account associated with this integration.</p>
 */
@JsonPropertyOrder({
  AWSAccount.JSON_PROPERTY_ACCESS_KEY_ID,
  AWSAccount.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccount.JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES,
  AWSAccount.JSON_PROPERTY_CSPM_RESOURCE_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_EXCLUDED_REGIONS,
  AWSAccount.JSON_PROPERTY_EXTENDED_RESOURCE_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_FILTER_TAGS,
  AWSAccount.JSON_PROPERTY_HOST_TAGS,
  AWSAccount.JSON_PROPERTY_METRICS_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  AWSAccount.JSON_PROPERTY_ROLE_NAME,
  AWSAccount.JSON_PROPERTY_SECRET_ACCESS_KEY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccount {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES = "account_specific_namespace_rules";
  private Map<String, Boolean> accountSpecificNamespaceRules = null;

  public static final String JSON_PROPERTY_CSPM_RESOURCE_COLLECTION_ENABLED = "cspm_resource_collection_enabled";
  private Boolean cspmResourceCollectionEnabled = false;

  public static final String JSON_PROPERTY_EXCLUDED_REGIONS = "excluded_regions";
  private List<String> excludedRegions = null;

  public static final String JSON_PROPERTY_EXTENDED_RESOURCE_COLLECTION_ENABLED = "extended_resource_collection_enabled";
  private Boolean extendedResourceCollectionEnabled = false;

  public static final String JSON_PROPERTY_FILTER_TAGS = "filter_tags";
  private List<String> filterTags = null;

  public static final String JSON_PROPERTY_HOST_TAGS = "host_tags";
  private List<String> hostTags = null;

  public static final String JSON_PROPERTY_METRICS_COLLECTION_ENABLED = "metrics_collection_enabled";
  private Boolean metricsCollectionEnabled = true;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED = "resource_collection_enabled";
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
   * <p>Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.</p>
   * @return accessKeyId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Your AWS Account ID without dashes.</p>
   * @return accountId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AWSAccount accountSpecificNamespaceRules(Map<String, Boolean> accountSpecificNamespaceRules) {
    this.accountSpecificNamespaceRules = accountSpecificNamespaceRules;
    return this;
  }
  public AWSAccount putAccountSpecificNamespaceRulesItem(String key, Boolean accountSpecificNamespaceRulesItem) {
    if (this.accountSpecificNamespaceRules == null) {
      this.accountSpecificNamespaceRules = new HashMap<>();
    }
    this.accountSpecificNamespaceRules.put(key, accountSpecificNamespaceRulesItem);
    return this;
  }

  /**
   * <p>An object (in the form <code>{"namespace1":true/false, "namespace2":true/false}</code>) containing user-supplied overrides
   * for AWS namespace metric collection. <strong>Important</strong>: This field only contains namespaces explicitly configured through API calls,
   * not the comprehensive enabled or disabled status of all namespaces. If a namespace is absent from this field, it uses Datadog's
   * internal defaults (all namespaces enabled by default, except <code>AWS/SQS</code>, <code>AWS/ElasticMapReduce</code>, and <code>AWS/Usage</code>).
   * For a complete view of all namespace statuses, use the V2 AWS Integration API instead.</p>
   * @return accountSpecificNamespaceRules
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether Datadog collects cloud security posture management resources from your AWS account. This includes additional resources not covered under the general <code>resource_collection</code>.</p>
   * @return cspmResourceCollectionEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CSPM_RESOURCE_COLLECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>An array of <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints">AWS regions</a>
   * to exclude from metrics collection.</p>
   * @return excludedRegions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUDED_REGIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getExcludedRegions() {
        return excludedRegions;
      }
  public void setExcludedRegions(List<String> excludedRegions) {
    this.excludedRegions = excludedRegions;
  }
  public AWSAccount extendedResourceCollectionEnabled(Boolean extendedResourceCollectionEnabled) {
    this.extendedResourceCollectionEnabled = extendedResourceCollectionEnabled;
    return this;
  }

  /**
   * <p>Whether Datadog collects additional attributes and configuration information about the resources in your AWS account. Required for <code>cspm_resource_collection</code>.</p>
   * @return extendedResourceCollectionEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTENDED_RESOURCE_COLLECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getExtendedResourceCollectionEnabled() {
        return extendedResourceCollectionEnabled;
      }
  public void setExtendedResourceCollectionEnabled(Boolean extendedResourceCollectionEnabled) {
    this.extendedResourceCollectionEnabled = extendedResourceCollectionEnabled;
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
   * <p>The array of EC2 tags (in the form <code>key:value</code>) defines a filter that Datadog uses when collecting metrics from EC2.
   * Wildcards, such as <code>?</code> (for single characters) and <code>*</code> (for multiple characters) can also be used.
   * Only hosts that match one of the defined tags
   * will be imported into Datadog. The rest will be ignored.
   * Host matching a given tag can also be excluded by adding <code>!</code> before the tag.
   * For example, <code>env:production,instance-type:c1.*,!region:us-east-1</code></p>
   * @return filterTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Array of tags (in the form <code>key:value</code>) to add to all hosts
   * and metrics reporting through this integration.</p>
   * @return hostTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether Datadog collects metrics for this AWS account.</p>
   * @return metricsCollectionEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRICS_COLLECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Deprecated in favor of 'extended_resource_collection_enabled'. Whether Datadog collects a standard set of resources from your AWS account.</p>
   * @return resourceCollectionEnabled
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getResourceCollectionEnabled() {
        return resourceCollectionEnabled;
      }
  @Deprecated
  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }
  public AWSAccount roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * <p>Your Datadog role delegation name.</p>
   * @return roleName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ROLE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Your AWS secret access key. Only required if your AWS account is a GovCloud or China account.</p>
   * @return secretAccessKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSecretAccessKey() {
        return secretAccessKey;
      }
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
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
   * @return AWSAccount
   */
  @JsonAnySetter
  public AWSAccount putAdditionalProperty(String key, Object value) {
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
   * Return true if this AWSAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccount awsAccount = (AWSAccount) o;
    return Objects.equals(this.accessKeyId, awsAccount.accessKeyId) && Objects.equals(this.accountId, awsAccount.accountId) && Objects.equals(this.accountSpecificNamespaceRules, awsAccount.accountSpecificNamespaceRules) && Objects.equals(this.cspmResourceCollectionEnabled, awsAccount.cspmResourceCollectionEnabled) && Objects.equals(this.excludedRegions, awsAccount.excludedRegions) && Objects.equals(this.extendedResourceCollectionEnabled, awsAccount.extendedResourceCollectionEnabled) && Objects.equals(this.filterTags, awsAccount.filterTags) && Objects.equals(this.hostTags, awsAccount.hostTags) && Objects.equals(this.metricsCollectionEnabled, awsAccount.metricsCollectionEnabled) && Objects.equals(this.resourceCollectionEnabled, awsAccount.resourceCollectionEnabled) && Objects.equals(this.roleName, awsAccount.roleName) && Objects.equals(this.secretAccessKey, awsAccount.secretAccessKey) && Objects.equals(this.additionalProperties, awsAccount.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId,accountId,accountSpecificNamespaceRules,cspmResourceCollectionEnabled,excludedRegions,extendedResourceCollectionEnabled,filterTags,hostTags,metricsCollectionEnabled,resourceCollectionEnabled,roleName,secretAccessKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccount {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountSpecificNamespaceRules: ").append(toIndentedString(accountSpecificNamespaceRules)).append("\n");
    sb.append("    cspmResourceCollectionEnabled: ").append(toIndentedString(cspmResourceCollectionEnabled)).append("\n");
    sb.append("    excludedRegions: ").append(toIndentedString(excludedRegions)).append("\n");
    sb.append("    extendedResourceCollectionEnabled: ").append(toIndentedString(extendedResourceCollectionEnabled)).append("\n");
    sb.append("    filterTags: ").append(toIndentedString(filterTags)).append("\n");
    sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
    sb.append("    metricsCollectionEnabled: ").append(toIndentedString(metricsCollectionEnabled)).append("\n");
    sb.append("    resourceCollectionEnabled: ").append(toIndentedString(resourceCollectionEnabled)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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

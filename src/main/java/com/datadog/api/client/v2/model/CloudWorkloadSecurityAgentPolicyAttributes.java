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
   * <p>A Cloud Workload Security Agent policy returned by the API</p>
 */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_BLOCKING_RULES_COUNT,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_DATADOG_MANAGED,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_DISABLED_RULES_COUNT,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_HOST_TAGS,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_HOST_TAGS_LISTS,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_MONITORING_RULES_COUNT,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_NAME,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_PINNED,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_POLICY_TYPE,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_POLICY_VERSION,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_PRIORITY,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_RULE_COUNT,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_UPDATE_DATE,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_UPDATED_AT,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_UPDATER,
  CloudWorkloadSecurityAgentPolicyAttributes.JSON_PROPERTY_VERSIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentPolicyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BLOCKING_RULES_COUNT = "blockingRulesCount";
  private Integer blockingRulesCount;

  public static final String JSON_PROPERTY_DATADOG_MANAGED = "datadogManaged";
  private Boolean datadogManaged;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED_RULES_COUNT = "disabledRulesCount";
  private Integer disabledRulesCount;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_HOST_TAGS = "hostTags";
  private List<String> hostTags = null;

  public static final String JSON_PROPERTY_HOST_TAGS_LISTS = "hostTagsLists";
  private List<List<String>> hostTagsLists = null;

  public static final String JSON_PROPERTY_MONITORING_RULES_COUNT = "monitoringRulesCount";
  private Integer monitoringRulesCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PINNED = "pinned";
  private Boolean pinned;

  public static final String JSON_PROPERTY_POLICY_TYPE = "policyType";
  private String policyType;

  public static final String JSON_PROPERTY_POLICY_VERSION = "policyVersion";
  private String policyVersion;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_RULE_COUNT = "ruleCount";
  private Integer ruleCount;

  public static final String JSON_PROPERTY_UPDATE_DATE = "updateDate";
  private Long updateDate;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private CloudWorkloadSecurityAgentPolicyUpdaterAttributes updater;

  public static final String JSON_PROPERTY_VERSIONS = "versions";
  private List<CloudWorkloadSecurityAgentPolicyVersion> versions = null;

  public CloudWorkloadSecurityAgentPolicyAttributes blockingRulesCount(Integer blockingRulesCount) {
    this.blockingRulesCount = blockingRulesCount;
    return this;
  }

  /**
   * <p>The number of rules with the blocking feature in this policy</p>
   * maximum: 2147483647
   * @return blockingRulesCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BLOCKING_RULES_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getBlockingRulesCount() {
        return blockingRulesCount;
      }
  public void setBlockingRulesCount(Integer blockingRulesCount) {
    this.blockingRulesCount = blockingRulesCount;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes datadogManaged(Boolean datadogManaged) {
    this.datadogManaged = datadogManaged;
    return this;
  }

  /**
   * <p>Whether the policy is managed by Datadog</p>
   * @return datadogManaged
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATADOG_MANAGED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getDatadogManaged() {
        return datadogManaged;
      }
  public void setDatadogManaged(Boolean datadogManaged) {
    this.datadogManaged = datadogManaged;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The description of the policy</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes disabledRulesCount(Integer disabledRulesCount) {
    this.disabledRulesCount = disabledRulesCount;
    return this;
  }

  /**
   * <p>The number of rules that are disabled in this policy</p>
   * maximum: 2147483647
   * @return disabledRulesCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISABLED_RULES_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getDisabledRulesCount() {
        return disabledRulesCount;
      }
  public void setDisabledRulesCount(Integer disabledRulesCount) {
    this.disabledRulesCount = disabledRulesCount;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the Agent policy is enabled</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes hostTags(List<String> hostTags) {
    this.hostTags = hostTags;
    return this;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes addHostTagsItem(String hostTagsItem) {
    if (this.hostTags == null) {
      this.hostTags = new ArrayList<>();
    }
    this.hostTags.add(hostTagsItem);
    return this;
  }

  /**
   * <p>The host tags defining where this policy is deployed</p>
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
  public CloudWorkloadSecurityAgentPolicyAttributes hostTagsLists(List<List<String>> hostTagsLists) {
    this.hostTagsLists = hostTagsLists;
    return this;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes addHostTagsListsItem(List<String> hostTagsListsItem) {
    if (this.hostTagsLists == null) {
      this.hostTagsLists = new ArrayList<>();
    }
    this.hostTagsLists.add(hostTagsListsItem);
    return this;
  }

  /**
   * <p>The host tags defining where this policy is deployed, the inner values are linked with AND, the outer values are linked with OR</p>
   * @return hostTagsLists
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST_TAGS_LISTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<List<String>> getHostTagsLists() {
        return hostTagsLists;
      }
  public void setHostTagsLists(List<List<String>> hostTagsLists) {
    this.hostTagsLists = hostTagsLists;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes monitoringRulesCount(Integer monitoringRulesCount) {
    this.monitoringRulesCount = monitoringRulesCount;
    return this;
  }

  /**
   * <p>The number of rules in the monitoring state in this policy</p>
   * maximum: 2147483647
   * @return monitoringRulesCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITORING_RULES_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getMonitoringRulesCount() {
        return monitoringRulesCount;
      }
  public void setMonitoringRulesCount(Integer monitoringRulesCount) {
    this.monitoringRulesCount = monitoringRulesCount;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the policy</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

  /**
   * <p>Whether the policy is pinned</p>
   * @return pinned
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PINNED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPinned() {
        return pinned;
      }
  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * <p>The type of the policy</p>
   * @return policyType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_POLICY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPolicyType() {
        return policyType;
      }
  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes policyVersion(String policyVersion) {
    this.policyVersion = policyVersion;
    return this;
  }

  /**
   * <p>The version of the policy</p>
   * @return policyVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_POLICY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPolicyVersion() {
        return policyVersion;
      }
  public void setPolicyVersion(String policyVersion) {
    this.policyVersion = policyVersion;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p>The priority of the policy</p>
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPriority() {
        return priority;
      }
  public void setPriority(Long priority) {
    this.priority = priority;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes ruleCount(Integer ruleCount) {
    this.ruleCount = ruleCount;
    return this;
  }

  /**
   * <p>The number of rules in this policy</p>
   * maximum: 2147483647
   * @return ruleCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getRuleCount() {
        return ruleCount;
      }
  public void setRuleCount(Integer ruleCount) {
    this.ruleCount = ruleCount;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes updateDate(Long updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * <p>Timestamp in milliseconds when the policy was last updated</p>
   * @return updateDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUpdateDate() {
        return updateDate;
      }
  public void setUpdateDate(Long updateDate) {
    this.updateDate = updateDate;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>When the policy was last updated, timestamp in milliseconds</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes updater(CloudWorkloadSecurityAgentPolicyUpdaterAttributes updater) {
    this.updater = updater;
    this.unparsed |= updater.unparsed;
    return this;
  }

  /**
   * <p>The attributes of the user who last updated the policy</p>
   * @return updater
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CloudWorkloadSecurityAgentPolicyUpdaterAttributes getUpdater() {
        return updater;
      }
  public void setUpdater(CloudWorkloadSecurityAgentPolicyUpdaterAttributes updater) {
    this.updater = updater;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes versions(List<CloudWorkloadSecurityAgentPolicyVersion> versions) {
    this.versions = versions;
    for (CloudWorkloadSecurityAgentPolicyVersion item : versions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CloudWorkloadSecurityAgentPolicyAttributes addVersionsItem(CloudWorkloadSecurityAgentPolicyVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    this.unparsed |= versionsItem.unparsed;
    return this;
  }

  /**
   * <p>The versions of the policy</p>
   * @return versions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CloudWorkloadSecurityAgentPolicyVersion> getVersions() {
        return versions;
      }
  public void setVersions(List<CloudWorkloadSecurityAgentPolicyVersion> versions) {
    this.versions = versions;
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
   * @return CloudWorkloadSecurityAgentPolicyAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentPolicyAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudWorkloadSecurityAgentPolicyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentPolicyAttributes cloudWorkloadSecurityAgentPolicyAttributes = (CloudWorkloadSecurityAgentPolicyAttributes) o;
    return Objects.equals(this.blockingRulesCount, cloudWorkloadSecurityAgentPolicyAttributes.blockingRulesCount) && Objects.equals(this.datadogManaged, cloudWorkloadSecurityAgentPolicyAttributes.datadogManaged) && Objects.equals(this.description, cloudWorkloadSecurityAgentPolicyAttributes.description) && Objects.equals(this.disabledRulesCount, cloudWorkloadSecurityAgentPolicyAttributes.disabledRulesCount) && Objects.equals(this.enabled, cloudWorkloadSecurityAgentPolicyAttributes.enabled) && Objects.equals(this.hostTags, cloudWorkloadSecurityAgentPolicyAttributes.hostTags) && Objects.equals(this.hostTagsLists, cloudWorkloadSecurityAgentPolicyAttributes.hostTagsLists) && Objects.equals(this.monitoringRulesCount, cloudWorkloadSecurityAgentPolicyAttributes.monitoringRulesCount) && Objects.equals(this.name, cloudWorkloadSecurityAgentPolicyAttributes.name) && Objects.equals(this.pinned, cloudWorkloadSecurityAgentPolicyAttributes.pinned) && Objects.equals(this.policyType, cloudWorkloadSecurityAgentPolicyAttributes.policyType) && Objects.equals(this.policyVersion, cloudWorkloadSecurityAgentPolicyAttributes.policyVersion) && Objects.equals(this.priority, cloudWorkloadSecurityAgentPolicyAttributes.priority) && Objects.equals(this.ruleCount, cloudWorkloadSecurityAgentPolicyAttributes.ruleCount) && Objects.equals(this.updateDate, cloudWorkloadSecurityAgentPolicyAttributes.updateDate) && Objects.equals(this.updatedAt, cloudWorkloadSecurityAgentPolicyAttributes.updatedAt) && Objects.equals(this.updater, cloudWorkloadSecurityAgentPolicyAttributes.updater) && Objects.equals(this.versions, cloudWorkloadSecurityAgentPolicyAttributes.versions) && Objects.equals(this.additionalProperties, cloudWorkloadSecurityAgentPolicyAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(blockingRulesCount,datadogManaged,description,disabledRulesCount,enabled,hostTags,hostTagsLists,monitoringRulesCount,name,pinned,policyType,policyVersion,priority,ruleCount,updateDate,updatedAt,updater,versions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentPolicyAttributes {\n");
    sb.append("    blockingRulesCount: ").append(toIndentedString(blockingRulesCount)).append("\n");
    sb.append("    datadogManaged: ").append(toIndentedString(datadogManaged)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabledRulesCount: ").append(toIndentedString(disabledRulesCount)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
    sb.append("    hostTagsLists: ").append(toIndentedString(hostTagsLists)).append("\n");
    sb.append("    monitoringRulesCount: ").append(toIndentedString(monitoringRulesCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    ruleCount: ").append(toIndentedString(ruleCount)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
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

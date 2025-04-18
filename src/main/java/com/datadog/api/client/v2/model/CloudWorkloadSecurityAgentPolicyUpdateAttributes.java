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

/** Update an existing Cloud Workload Security Agent policy */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentPolicyUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentPolicyUpdateAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentPolicyUpdateAttributes.JSON_PROPERTY_HOST_TAGS,
  CloudWorkloadSecurityAgentPolicyUpdateAttributes.JSON_PROPERTY_HOST_TAGS_LISTS,
  CloudWorkloadSecurityAgentPolicyUpdateAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentPolicyUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_HOST_TAGS = "hostTags";
  private List<String> hostTags = null;

  public static final String JSON_PROPERTY_HOST_TAGS_LISTS = "hostTagsLists";
  private List<List<String>> hostTagsLists = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the policy
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the policy is enabled
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes hostTags(List<String> hostTags) {
    this.hostTags = hostTags;
    return this;
  }

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes addHostTagsItem(String hostTagsItem) {
    if (this.hostTags == null) {
      this.hostTags = new ArrayList<>();
    }
    this.hostTags.add(hostTagsItem);
    return this;
  }

  /**
   * The host tags defining where this policy is deployed
   *
   * @return hostTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHostTags() {
    return hostTags;
  }

  public void setHostTags(List<String> hostTags) {
    this.hostTags = hostTags;
  }

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes hostTagsLists(
      List<List<String>> hostTagsLists) {
    this.hostTagsLists = hostTagsLists;
    return this;
  }

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes addHostTagsListsItem(
      List<String> hostTagsListsItem) {
    if (this.hostTagsLists == null) {
      this.hostTagsLists = new ArrayList<>();
    }
    this.hostTagsLists.add(hostTagsListsItem);
    return this;
  }

  /**
   * The host tags defining where this policy is deployed, the inner values are linked with AND, the
   * outer values are linked with OR
   *
   * @return hostTagsLists
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_TAGS_LISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<String>> getHostTagsLists() {
    return hostTagsLists;
  }

  public void setHostTagsLists(List<List<String>> hostTagsLists) {
    this.hostTagsLists = hostTagsLists;
  }

  public CloudWorkloadSecurityAgentPolicyUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the policy
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return CloudWorkloadSecurityAgentPolicyUpdateAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentPolicyUpdateAttributes putAdditionalProperty(
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

  /** Return true if this CloudWorkloadSecurityAgentPolicyUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentPolicyUpdateAttributes
        cloudWorkloadSecurityAgentPolicyUpdateAttributes =
            (CloudWorkloadSecurityAgentPolicyUpdateAttributes) o;
    return Objects.equals(
            this.description, cloudWorkloadSecurityAgentPolicyUpdateAttributes.description)
        && Objects.equals(this.enabled, cloudWorkloadSecurityAgentPolicyUpdateAttributes.enabled)
        && Objects.equals(this.hostTags, cloudWorkloadSecurityAgentPolicyUpdateAttributes.hostTags)
        && Objects.equals(
            this.hostTagsLists, cloudWorkloadSecurityAgentPolicyUpdateAttributes.hostTagsLists)
        && Objects.equals(this.name, cloudWorkloadSecurityAgentPolicyUpdateAttributes.name)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentPolicyUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, hostTags, hostTagsLists, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentPolicyUpdateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
    sb.append("    hostTagsLists: ").append(toIndentedString(hostTagsLists)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

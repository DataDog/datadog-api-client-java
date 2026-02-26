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

/** The action the rule can perform if triggered */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleAction.JSON_PROPERTY_FILTER,
  CloudWorkloadSecurityAgentRuleAction.JSON_PROPERTY_HASH,
  CloudWorkloadSecurityAgentRuleAction.JSON_PROPERTY_KILL,
  CloudWorkloadSecurityAgentRuleAction.JSON_PROPERTY_METADATA,
  CloudWorkloadSecurityAgentRuleAction.JSON_PROPERTY_SET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_HASH = "hash";
  private CloudWorkloadSecurityAgentRuleActionHash hash;

  public static final String JSON_PROPERTY_KILL = "kill";
  private CloudWorkloadSecurityAgentRuleKill kill;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private CloudWorkloadSecurityAgentRuleActionMetadata metadata;

  public static final String JSON_PROPERTY_SET = "set";
  private CloudWorkloadSecurityAgentRuleActionSet set;

  public CloudWorkloadSecurityAgentRuleAction filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * SECL expression used to target the container to apply the action on
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public CloudWorkloadSecurityAgentRuleAction hash(CloudWorkloadSecurityAgentRuleActionHash hash) {
    this.hash = hash;
    this.unparsed |= hash.unparsed;
    return this;
  }

  /**
   * Hash file specified by the field attribute
   *
   * @return hash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleActionHash getHash() {
    return hash;
  }

  public void setHash(CloudWorkloadSecurityAgentRuleActionHash hash) {
    this.hash = hash;
  }

  public CloudWorkloadSecurityAgentRuleAction kill(CloudWorkloadSecurityAgentRuleKill kill) {
    this.kill = kill;
    this.unparsed |= kill.unparsed;
    return this;
  }

  /**
   * Kill system call applied on the container matching the rule
   *
   * @return kill
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleKill getKill() {
    return kill;
  }

  public void setKill(CloudWorkloadSecurityAgentRuleKill kill) {
    this.kill = kill;
  }

  public CloudWorkloadSecurityAgentRuleAction metadata(
      CloudWorkloadSecurityAgentRuleActionMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * The metadata action applied on the scope matching the rule
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleActionMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CloudWorkloadSecurityAgentRuleActionMetadata metadata) {
    this.metadata = metadata;
  }

  public CloudWorkloadSecurityAgentRuleAction set(CloudWorkloadSecurityAgentRuleActionSet set) {
    this.set = set;
    this.unparsed |= set.unparsed;
    return this;
  }

  /**
   * The set action applied on the scope matching the rule
   *
   * @return set
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleActionSet getSet() {
    return set;
  }

  public void setSet(CloudWorkloadSecurityAgentRuleActionSet set) {
    this.set = set;
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
   * @return CloudWorkloadSecurityAgentRuleAction
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudWorkloadSecurityAgentRuleAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleAction cloudWorkloadSecurityAgentRuleAction =
        (CloudWorkloadSecurityAgentRuleAction) o;
    return Objects.equals(this.filter, cloudWorkloadSecurityAgentRuleAction.filter)
        && Objects.equals(this.hash, cloudWorkloadSecurityAgentRuleAction.hash)
        && Objects.equals(this.kill, cloudWorkloadSecurityAgentRuleAction.kill)
        && Objects.equals(this.metadata, cloudWorkloadSecurityAgentRuleAction.metadata)
        && Objects.equals(this.set, cloudWorkloadSecurityAgentRuleAction.set)
        && Objects.equals(
            this.additionalProperties, cloudWorkloadSecurityAgentRuleAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, hash, kill, metadata, set, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleAction {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    kill: ").append(toIndentedString(kill)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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

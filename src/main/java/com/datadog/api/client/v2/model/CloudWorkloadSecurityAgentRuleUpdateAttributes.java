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
   * <p>Update an existing Cloud Workload Security Agent rule</p>
 */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_ACTIONS,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_AGENT_VERSION,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_BLOCKING,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_DISABLED,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_MONITORING,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_POLICY_ID,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_PRODUCT_TAGS,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_SILENT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>undefined();

  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private String agentVersion;

  public static final String JSON_PROPERTY_BLOCKING = "blocking";
  private List<String> blocking = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private List<String> disabled = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_MONITORING = "monitoring";
  private List<String> monitoring = null;

  public static final String JSON_PROPERTY_POLICY_ID = "policy_id";
  private String policyId;

  public static final String JSON_PROPERTY_PRODUCT_TAGS = "product_tags";
  private List<String> productTags = null;

  public static final String JSON_PROPERTY_SILENT = "silent";
  private Boolean silent;

  public CloudWorkloadSecurityAgentRuleUpdateAttributes actions(List<CloudWorkloadSecurityAgentRuleAction> actions) {
    this.actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>of(actions);
    return this;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes addActionsItem(CloudWorkloadSecurityAgentRuleAction actionsItem) {
    if (this.actions == null || !this.actions.isPresent()) {
      this.actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>of(new ArrayList<>());
    }
    try {
      this.actions.get().add(actionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The array of actions the rule can perform if triggered</p>
   * @return actions
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<CloudWorkloadSecurityAgentRuleAction> getActions() {
        return actions.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> getActions_JsonNullable() {
    return actions;
  }
  @JsonProperty(JSON_PROPERTY_ACTIONS)public void setActions_JsonNullable(JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> actions) {
    this.actions = actions;
  }
  public void setActions(List<CloudWorkloadSecurityAgentRuleAction> actions) {
    this.actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>of(actions);
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * <p>Constrain the rule to specific versions of the Datadog Agent</p>
   * @return agentVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAgentVersion() {
        return agentVersion;
      }
  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes blocking(List<String> blocking) {
    this.blocking = blocking;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes addBlockingItem(String blockingItem) {
    if (this.blocking == null) {
      this.blocking = new ArrayList<>();
    }
    this.blocking.add(blockingItem);
    return this;
  }

  /**
   * <p>The blocking policies that the rule belongs to</p>
   * @return blocking
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BLOCKING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getBlocking() {
        return blocking;
      }
  public void setBlocking(List<String> blocking) {
    this.blocking = blocking;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The description of the Agent rule</p>
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
  public CloudWorkloadSecurityAgentRuleUpdateAttributes disabled(List<String> disabled) {
    this.disabled = disabled;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes addDisabledItem(String disabledItem) {
    if (this.disabled == null) {
      this.disabled = new ArrayList<>();
    }
    this.disabled.add(disabledItem);
    return this;
  }

  /**
   * <p>The disabled policies that the rule belongs to</p>
   * @return disabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDisabled() {
        return disabled;
      }
  public void setDisabled(List<String> disabled) {
    this.disabled = disabled;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the Agent rule is enabled</p>
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
  public CloudWorkloadSecurityAgentRuleUpdateAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * <p>The SECL expression of the Agent rule</p>
   * @return expression
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXPRESSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getExpression() {
        return expression;
      }
  public void setExpression(String expression) {
    this.expression = expression;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes monitoring(List<String> monitoring) {
    this.monitoring = monitoring;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes addMonitoringItem(String monitoringItem) {
    if (this.monitoring == null) {
      this.monitoring = new ArrayList<>();
    }
    this.monitoring.add(monitoringItem);
    return this;
  }

  /**
   * <p>The monitoring policies that the rule belongs to</p>
   * @return monitoring
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITORING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getMonitoring() {
        return monitoring;
      }
  public void setMonitoring(List<String> monitoring) {
    this.monitoring = monitoring;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * <p>The ID of the policy where the Agent rule is saved</p>
   * @return policyId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_POLICY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPolicyId() {
        return policyId;
      }
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * <p>The list of product tags associated with the rule</p>
   * @return productTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getProductTags() {
        return productTags;
      }
  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }
  public CloudWorkloadSecurityAgentRuleUpdateAttributes silent(Boolean silent) {
    this.silent = silent;
    return this;
  }

  /**
   * <p>Whether the rule is silent.</p>
   * @return silent
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SILENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSilent() {
        return silent;
      }
  public void setSilent(Boolean silent) {
    this.silent = silent;
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
   * @return CloudWorkloadSecurityAgentRuleUpdateAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudWorkloadSecurityAgentRuleUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleUpdateAttributes cloudWorkloadSecurityAgentRuleUpdateAttributes = (CloudWorkloadSecurityAgentRuleUpdateAttributes) o;
    return Objects.equals(this.actions, cloudWorkloadSecurityAgentRuleUpdateAttributes.actions) && Objects.equals(this.agentVersion, cloudWorkloadSecurityAgentRuleUpdateAttributes.agentVersion) && Objects.equals(this.blocking, cloudWorkloadSecurityAgentRuleUpdateAttributes.blocking) && Objects.equals(this.description, cloudWorkloadSecurityAgentRuleUpdateAttributes.description) && Objects.equals(this.disabled, cloudWorkloadSecurityAgentRuleUpdateAttributes.disabled) && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleUpdateAttributes.enabled) && Objects.equals(this.expression, cloudWorkloadSecurityAgentRuleUpdateAttributes.expression) && Objects.equals(this.monitoring, cloudWorkloadSecurityAgentRuleUpdateAttributes.monitoring) && Objects.equals(this.policyId, cloudWorkloadSecurityAgentRuleUpdateAttributes.policyId) && Objects.equals(this.productTags, cloudWorkloadSecurityAgentRuleUpdateAttributes.productTags) && Objects.equals(this.silent, cloudWorkloadSecurityAgentRuleUpdateAttributes.silent) && Objects.equals(this.additionalProperties, cloudWorkloadSecurityAgentRuleUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(actions,agentVersion,blocking,description,disabled,enabled,expression,monitoring,policyId,productTags,silent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleUpdateAttributes {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
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

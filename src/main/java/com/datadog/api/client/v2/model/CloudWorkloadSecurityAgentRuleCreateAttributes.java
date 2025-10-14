/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Create a new Cloud Workload Security Agent rule. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_ACTIONS,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_AGENT_VERSION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_BLOCKING,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_DISABLED,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_FILTERS,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_MONITORING,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_NAME,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_POLICY_ID,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_PRODUCT_TAGS,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_SILENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> actions =
      JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>undefined();

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

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<String> filters = null;

  public static final String JSON_PROPERTY_MONITORING = "monitoring";
  private List<String> monitoring = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POLICY_ID = "policy_id";
  private String policyId;

  public static final String JSON_PROPERTY_PRODUCT_TAGS = "product_tags";
  private List<String> productTags = null;

  public static final String JSON_PROPERTY_SILENT = "silent";
  private Boolean silent;

  public CloudWorkloadSecurityAgentRuleCreateAttributes() {}

  @JsonCreator
  public CloudWorkloadSecurityAgentRuleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.expression = expression;
    this.name = name;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes actions(
      List<CloudWorkloadSecurityAgentRuleAction> actions) {
    this.actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>of(actions);
    return this;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes addActionsItem(
      CloudWorkloadSecurityAgentRuleAction actionsItem) {
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
   * The array of actions the rule can perform if triggered
   *
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<CloudWorkloadSecurityAgentRuleAction> getActions() {
    return actions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> getActions_JsonNullable() {
    return actions;
  }

  @JsonProperty(JSON_PROPERTY_ACTIONS)
  public void setActions_JsonNullable(
      JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> actions) {
    this.actions = actions;
  }

  public void setActions(List<CloudWorkloadSecurityAgentRuleAction> actions) {
    this.actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>of(actions);
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * Constrain the rule to specific versions of the Datadog Agent.
   *
   * @return agentVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentVersion() {
    return agentVersion;
  }

  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes blocking(List<String> blocking) {
    this.blocking = blocking;
    return this;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes addBlockingItem(String blockingItem) {
    if (this.blocking == null) {
      this.blocking = new ArrayList<>();
    }
    this.blocking.add(blockingItem);
    return this;
  }

  /**
   * The blocking policies that the rule belongs to.
   *
   * @return blocking
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getBlocking() {
    return blocking;
  }

  public void setBlocking(List<String> blocking) {
    this.blocking = blocking;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Agent rule.
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

  public CloudWorkloadSecurityAgentRuleCreateAttributes disabled(List<String> disabled) {
    this.disabled = disabled;
    return this;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes addDisabledItem(String disabledItem) {
    if (this.disabled == null) {
      this.disabled = new ArrayList<>();
    }
    this.disabled.add(disabledItem);
    return this;
  }

  /**
   * The disabled policies that the rule belongs to.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDisabled() {
    return disabled;
  }

  public void setDisabled(List<String> disabled) {
    this.disabled = disabled;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the Agent rule is enabled.
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

  public CloudWorkloadSecurityAgentRuleCreateAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The SECL expression of the Agent rule.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * The platforms the Agent rule is supported on.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes monitoring(List<String> monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes addMonitoringItem(String monitoringItem) {
    if (this.monitoring == null) {
      this.monitoring = new ArrayList<>();
    }
    this.monitoring.add(monitoringItem);
    return this;
  }

  /**
   * The monitoring policies that the rule belongs to.
   *
   * @return monitoring
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMonitoring() {
    return monitoring;
  }

  public void setMonitoring(List<String> monitoring) {
    this.monitoring = monitoring;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Agent rule.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The ID of the policy where the Agent rule is saved.
   *
   * @return policyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * The list of product tags associated with the rule.
   *
   * @return productTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes silent(Boolean silent) {
    this.silent = silent;
    return this;
  }

  /**
   * Whether the rule is silent.
   *
   * @return silent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSilent() {
    return silent;
  }

  public void setSilent(Boolean silent) {
    this.silent = silent;
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
   * @return CloudWorkloadSecurityAgentRuleCreateAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleCreateAttributes putAdditionalProperty(
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

  /** Return true if this CloudWorkloadSecurityAgentRuleCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleCreateAttributes cloudWorkloadSecurityAgentRuleCreateAttributes =
        (CloudWorkloadSecurityAgentRuleCreateAttributes) o;
    return Objects.equals(this.actions, cloudWorkloadSecurityAgentRuleCreateAttributes.actions)
        && Objects.equals(
            this.agentVersion, cloudWorkloadSecurityAgentRuleCreateAttributes.agentVersion)
        && Objects.equals(this.blocking, cloudWorkloadSecurityAgentRuleCreateAttributes.blocking)
        && Objects.equals(
            this.description, cloudWorkloadSecurityAgentRuleCreateAttributes.description)
        && Objects.equals(this.disabled, cloudWorkloadSecurityAgentRuleCreateAttributes.disabled)
        && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleCreateAttributes.enabled)
        && Objects.equals(
            this.expression, cloudWorkloadSecurityAgentRuleCreateAttributes.expression)
        && Objects.equals(this.filters, cloudWorkloadSecurityAgentRuleCreateAttributes.filters)
        && Objects.equals(
            this.monitoring, cloudWorkloadSecurityAgentRuleCreateAttributes.monitoring)
        && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleCreateAttributes.name)
        && Objects.equals(this.policyId, cloudWorkloadSecurityAgentRuleCreateAttributes.policyId)
        && Objects.equals(
            this.productTags, cloudWorkloadSecurityAgentRuleCreateAttributes.productTags)
        && Objects.equals(this.silent, cloudWorkloadSecurityAgentRuleCreateAttributes.silent)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentRuleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actions,
        agentVersion,
        blocking,
        description,
        disabled,
        enabled,
        expression,
        filters,
        monitoring,
        name,
        policyId,
        productTags,
        silent,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleCreateAttributes {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

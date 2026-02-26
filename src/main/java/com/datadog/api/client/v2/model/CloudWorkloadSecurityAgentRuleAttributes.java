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
   * <p>A Cloud Workload Security Agent rule returned by the API</p>
 */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_ACTIONS,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_AGENT_CONSTRAINT,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_BLOCKING,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CATEGORY,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CREATION_AUTHOR_UU_ID,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CREATION_DATE,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CREATOR,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_DEFAULT_RULE,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_DISABLED,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_FILTERS,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_MONITORING,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_NAME,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_PRODUCT_TAGS,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_SILENT,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_UPDATE_AUTHOR_UU_ID,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_UPDATE_DATE,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_UPDATED_AT,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_UPDATER,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private JsonNullable<List<CloudWorkloadSecurityAgentRuleAction>> actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>undefined();

  public static final String JSON_PROPERTY_AGENT_CONSTRAINT = "agentConstraint";
  private String agentConstraint;

  public static final String JSON_PROPERTY_BLOCKING = "blocking";
  private List<String> blocking = null;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATION_AUTHOR_UU_ID = "creationAuthorUuId";
  private String creationAuthorUuId;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private Long creationDate;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private CloudWorkloadSecurityAgentRuleCreatorAttributes creator;

  public static final String JSON_PROPERTY_DEFAULT_RULE = "defaultRule";
  private Boolean defaultRule;

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

  public static final String JSON_PROPERTY_PRODUCT_TAGS = "product_tags";
  private List<String> productTags = null;

  public static final String JSON_PROPERTY_SILENT = "silent";
  private Boolean silent;

  public static final String JSON_PROPERTY_UPDATE_AUTHOR_UU_ID = "updateAuthorUuId";
  private String updateAuthorUuId;

  public static final String JSON_PROPERTY_UPDATE_DATE = "updateDate";
  private Long updateDate;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private CloudWorkloadSecurityAgentRuleUpdaterAttributes updater;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public CloudWorkloadSecurityAgentRuleAttributes actions(List<CloudWorkloadSecurityAgentRuleAction> actions) {
    this.actions = JsonNullable.<List<CloudWorkloadSecurityAgentRuleAction>>of(actions);
    return this;
  }
  public CloudWorkloadSecurityAgentRuleAttributes addActionsItem(CloudWorkloadSecurityAgentRuleAction actionsItem) {
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
  public CloudWorkloadSecurityAgentRuleAttributes agentConstraint(String agentConstraint) {
    this.agentConstraint = agentConstraint;
    return this;
  }

  /**
   * <p>The version of the Agent</p>
   * @return agentConstraint
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGENT_CONSTRAINT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAgentConstraint() {
        return agentConstraint;
      }
  public void setAgentConstraint(String agentConstraint) {
    this.agentConstraint = agentConstraint;
  }
  public CloudWorkloadSecurityAgentRuleAttributes blocking(List<String> blocking) {
    this.blocking = blocking;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleAttributes addBlockingItem(String blockingItem) {
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
  public CloudWorkloadSecurityAgentRuleAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>The category of the Agent rule</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCategory() {
        return category;
      }
  public void setCategory(String category) {
    this.category = category;
  }
  public CloudWorkloadSecurityAgentRuleAttributes creationAuthorUuId(String creationAuthorUuId) {
    this.creationAuthorUuId = creationAuthorUuId;
    return this;
  }

  /**
   * <p>The ID of the user who created the rule</p>
   * @return creationAuthorUuId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATION_AUTHOR_UU_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreationAuthorUuId() {
        return creationAuthorUuId;
      }
  public void setCreationAuthorUuId(String creationAuthorUuId) {
    this.creationAuthorUuId = creationAuthorUuId;
  }
  public CloudWorkloadSecurityAgentRuleAttributes creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * <p>When the Agent rule was created, timestamp in milliseconds</p>
   * @return creationDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATION_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCreationDate() {
        return creationDate;
      }
  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }
  public CloudWorkloadSecurityAgentRuleAttributes creator(CloudWorkloadSecurityAgentRuleCreatorAttributes creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * <p>The attributes of the user who created the Agent rule</p>
   * @return creator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CloudWorkloadSecurityAgentRuleCreatorAttributes getCreator() {
        return creator;
      }
  public void setCreator(CloudWorkloadSecurityAgentRuleCreatorAttributes creator) {
    this.creator = creator;
  }
  public CloudWorkloadSecurityAgentRuleAttributes defaultRule(Boolean defaultRule) {
    this.defaultRule = defaultRule;
    return this;
  }

  /**
   * <p>Whether the rule is included by default</p>
   * @return defaultRule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_RULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getDefaultRule() {
        return defaultRule;
      }
  public void setDefaultRule(Boolean defaultRule) {
    this.defaultRule = defaultRule;
  }
  public CloudWorkloadSecurityAgentRuleAttributes description(String description) {
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
  public CloudWorkloadSecurityAgentRuleAttributes disabled(List<String> disabled) {
    this.disabled = disabled;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleAttributes addDisabledItem(String disabledItem) {
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
  public CloudWorkloadSecurityAgentRuleAttributes enabled(Boolean enabled) {
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
  public CloudWorkloadSecurityAgentRuleAttributes expression(String expression) {
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
  public CloudWorkloadSecurityAgentRuleAttributes filters(List<String> filters) {
    this.filters = filters;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleAttributes addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * <p>The platforms the Agent rule is supported on</p>
   * @return filters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getFilters() {
        return filters;
      }
  public void setFilters(List<String> filters) {
    this.filters = filters;
  }
  public CloudWorkloadSecurityAgentRuleAttributes monitoring(List<String> monitoring) {
    this.monitoring = monitoring;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleAttributes addMonitoringItem(String monitoringItem) {
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
  public CloudWorkloadSecurityAgentRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the Agent rule</p>
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
  public CloudWorkloadSecurityAgentRuleAttributes productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }
  public CloudWorkloadSecurityAgentRuleAttributes addProductTagsItem(String productTagsItem) {
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
  public CloudWorkloadSecurityAgentRuleAttributes silent(Boolean silent) {
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
  public CloudWorkloadSecurityAgentRuleAttributes updateAuthorUuId(String updateAuthorUuId) {
    this.updateAuthorUuId = updateAuthorUuId;
    return this;
  }

  /**
   * <p>The ID of the user who updated the rule</p>
   * @return updateAuthorUuId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATE_AUTHOR_UU_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdateAuthorUuId() {
        return updateAuthorUuId;
      }
  public void setUpdateAuthorUuId(String updateAuthorUuId) {
    this.updateAuthorUuId = updateAuthorUuId;
  }
  public CloudWorkloadSecurityAgentRuleAttributes updateDate(Long updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * <p>Timestamp in milliseconds when the Agent rule was last updated</p>
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
  public CloudWorkloadSecurityAgentRuleAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>When the Agent rule was last updated, timestamp in milliseconds</p>
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
  public CloudWorkloadSecurityAgentRuleAttributes updater(CloudWorkloadSecurityAgentRuleUpdaterAttributes updater) {
    this.updater = updater;
    this.unparsed |= updater.unparsed;
    return this;
  }

  /**
   * <p>The attributes of the user who last updated the Agent rule</p>
   * @return updater
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CloudWorkloadSecurityAgentRuleUpdaterAttributes getUpdater() {
        return updater;
      }
  public void setUpdater(CloudWorkloadSecurityAgentRuleUpdaterAttributes updater) {
    this.updater = updater;
  }
  public CloudWorkloadSecurityAgentRuleAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the Agent rule</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
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
   * @return CloudWorkloadSecurityAgentRuleAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudWorkloadSecurityAgentRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleAttributes cloudWorkloadSecurityAgentRuleAttributes = (CloudWorkloadSecurityAgentRuleAttributes) o;
    return Objects.equals(this.actions, cloudWorkloadSecurityAgentRuleAttributes.actions) && Objects.equals(this.agentConstraint, cloudWorkloadSecurityAgentRuleAttributes.agentConstraint) && Objects.equals(this.blocking, cloudWorkloadSecurityAgentRuleAttributes.blocking) && Objects.equals(this.category, cloudWorkloadSecurityAgentRuleAttributes.category) && Objects.equals(this.creationAuthorUuId, cloudWorkloadSecurityAgentRuleAttributes.creationAuthorUuId) && Objects.equals(this.creationDate, cloudWorkloadSecurityAgentRuleAttributes.creationDate) && Objects.equals(this.creator, cloudWorkloadSecurityAgentRuleAttributes.creator) && Objects.equals(this.defaultRule, cloudWorkloadSecurityAgentRuleAttributes.defaultRule) && Objects.equals(this.description, cloudWorkloadSecurityAgentRuleAttributes.description) && Objects.equals(this.disabled, cloudWorkloadSecurityAgentRuleAttributes.disabled) && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleAttributes.enabled) && Objects.equals(this.expression, cloudWorkloadSecurityAgentRuleAttributes.expression) && Objects.equals(this.filters, cloudWorkloadSecurityAgentRuleAttributes.filters) && Objects.equals(this.monitoring, cloudWorkloadSecurityAgentRuleAttributes.monitoring) && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleAttributes.name) && Objects.equals(this.productTags, cloudWorkloadSecurityAgentRuleAttributes.productTags) && Objects.equals(this.silent, cloudWorkloadSecurityAgentRuleAttributes.silent) && Objects.equals(this.updateAuthorUuId, cloudWorkloadSecurityAgentRuleAttributes.updateAuthorUuId) && Objects.equals(this.updateDate, cloudWorkloadSecurityAgentRuleAttributes.updateDate) && Objects.equals(this.updatedAt, cloudWorkloadSecurityAgentRuleAttributes.updatedAt) && Objects.equals(this.updater, cloudWorkloadSecurityAgentRuleAttributes.updater) && Objects.equals(this.version, cloudWorkloadSecurityAgentRuleAttributes.version) && Objects.equals(this.additionalProperties, cloudWorkloadSecurityAgentRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(actions,agentConstraint,blocking,category,creationAuthorUuId,creationDate,creator,defaultRule,description,disabled,enabled,expression,filters,monitoring,name,productTags,silent,updateAuthorUuId,updateDate,updatedAt,updater,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleAttributes {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    agentConstraint: ").append(toIndentedString(agentConstraint)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    creationAuthorUuId: ").append(toIndentedString(creationAuthorUuId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    defaultRule: ").append(toIndentedString(defaultRule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    monitoring: ").append(toIndentedString(monitoring)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
    sb.append("    updateAuthorUuId: ").append(toIndentedString(updateAuthorUuId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

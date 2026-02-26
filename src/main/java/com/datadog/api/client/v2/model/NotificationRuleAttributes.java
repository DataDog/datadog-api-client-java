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
   * <p>Attributes of the notification rule.</p>
 */
@JsonPropertyOrder({
  NotificationRuleAttributes.JSON_PROPERTY_CREATED_AT,
  NotificationRuleAttributes.JSON_PROPERTY_CREATED_BY,
  NotificationRuleAttributes.JSON_PROPERTY_ENABLED,
  NotificationRuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  NotificationRuleAttributes.JSON_PROPERTY_MODIFIED_BY,
  NotificationRuleAttributes.JSON_PROPERTY_NAME,
  NotificationRuleAttributes.JSON_PROPERTY_SELECTORS,
  NotificationRuleAttributes.JSON_PROPERTY_TARGETS,
  NotificationRuleAttributes.JSON_PROPERTY_TIME_AGGREGATION,
  NotificationRuleAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotificationRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RuleUser createdBy;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private RuleUser modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SELECTORS = "selectors";
  private Selectors selectors;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<String> targets = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME_AGGREGATION = "time_aggregation";
  private Long timeAggregation;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public NotificationRuleAttributes() {}

  @JsonCreator
  public NotificationRuleAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)Long createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)RuleUser createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_AT)Long modifiedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_BY)RuleUser modifiedBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_SELECTORS)Selectors selectors,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGETS)List<String> targets,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)Long version) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.unparsed |= createdBy.unparsed;
        this.enabled = enabled;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.unparsed |= modifiedBy.unparsed;
        this.name = name;
        this.selectors = selectors;
        this.unparsed |= selectors.unparsed;
        this.targets = targets;
        this.version = version;
  }
  public NotificationRuleAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Date as Unix timestamp in milliseconds.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  public NotificationRuleAttributes createdBy(RuleUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * <p>User creating or modifying a rule.</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RuleUser getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(RuleUser createdBy) {
    this.createdBy = createdBy;
  }
  public NotificationRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Field used to enable or disable the rule.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public NotificationRuleAttributes modifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Date as Unix timestamp in milliseconds.</p>
   * @return modifiedAt
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public NotificationRuleAttributes modifiedBy(RuleUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * <p>User creating or modifying a rule.</p>
   * @return modifiedBy
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RuleUser getModifiedBy() {
        return modifiedBy;
      }
  public void setModifiedBy(RuleUser modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  public NotificationRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the notification rule.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public NotificationRuleAttributes selectors(Selectors selectors) {
    this.selectors = selectors;
    this.unparsed |= selectors.unparsed;
    return this;
  }

  /**
   * <p>Selectors are used to filter security issues for which notifications should be generated.
   * Users can specify rule severities, rule types, a query to filter security issues on tags and attributes, and the trigger source.
   * Only the trigger_source field is required.</p>
   * @return selectors
  **/
      @JsonProperty(JSON_PROPERTY_SELECTORS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Selectors getSelectors() {
        return selectors;
      }
  public void setSelectors(Selectors selectors) {
    this.selectors = selectors;
  }
  public NotificationRuleAttributes targets(List<String> targets) {
    this.targets = targets;
    return this;
  }
  public NotificationRuleAttributes addTargetsItem(String targetsItem) {
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * <p>List of recipients to notify when a notification rule is triggered. Many different target types are supported,
   * such as email addresses, Slack channels, and PagerDuty services.
   * The appropriate integrations need to be properly configured to send notifications to the specified targets.</p>
   * @return targets
  **/
      @JsonProperty(JSON_PROPERTY_TARGETS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getTargets() {
        return targets;
      }
  public void setTargets(List<String> targets) {
    this.targets = targets;
  }
  public NotificationRuleAttributes timeAggregation(Long timeAggregation) {
    this.timeAggregation = timeAggregation;
    return this;
  }

  /**
   * <p>Time aggregation period (in seconds) is used to aggregate the results of the notification rule evaluation.
   * Results are aggregated over a selected time frame using a rolling window, which updates with each new evaluation.
   * Notifications are only sent for new issues discovered during the window.
   * Time aggregation is only available for vulnerability-based notification rules. When omitted or set to 0, no aggregation
   * is done.</p>
   * @return timeAggregation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_AGGREGATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeAggregation() {
        return timeAggregation;
      }
  public void setTimeAggregation(Long timeAggregation) {
    this.timeAggregation = timeAggregation;
  }
  public NotificationRuleAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Version of the notification rule. It is updated when the rule is modified.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return NotificationRuleAttributes
   */
  @JsonAnySetter
  public NotificationRuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this NotificationRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRuleAttributes notificationRuleAttributes = (NotificationRuleAttributes) o;
    return Objects.equals(this.createdAt, notificationRuleAttributes.createdAt) && Objects.equals(this.createdBy, notificationRuleAttributes.createdBy) && Objects.equals(this.enabled, notificationRuleAttributes.enabled) && Objects.equals(this.modifiedAt, notificationRuleAttributes.modifiedAt) && Objects.equals(this.modifiedBy, notificationRuleAttributes.modifiedBy) && Objects.equals(this.name, notificationRuleAttributes.name) && Objects.equals(this.selectors, notificationRuleAttributes.selectors) && Objects.equals(this.targets, notificationRuleAttributes.targets) && Objects.equals(this.timeAggregation, notificationRuleAttributes.timeAggregation) && Objects.equals(this.version, notificationRuleAttributes.version) && Objects.equals(this.additionalProperties, notificationRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,enabled,modifiedAt,modifiedBy,name,selectors,targets,timeAggregation,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRuleAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    timeAggregation: ").append(toIndentedString(timeAggregation)).append("\n");
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

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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Budget configuration including spend and capacity for the active accounting window. */
@JsonPropertyOrder({
  AiGatewayBudgetListAttributes.JSON_PROPERTY_CAPACITY_MICROCENTS,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_CREATED_AT,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_CREATED_BY,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_CURRENT_PERIOD_CAPACITY_MICROCENTS,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_CURRENT_SPEND_MICROCENTS,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_ENABLED,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_ENFORCEMENT,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_MONITOR_ID,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_NAME,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_SCOPE_RESTRICTED,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_SELECTOR,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_TAGS,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_TEAM_ID,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_UPDATED_AT,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_USER_ID,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_WARNING_THRESHOLD,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_WINDOW_END,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_WINDOW_POLICY,
  AiGatewayBudgetListAttributes.JSON_PROPERTY_WINDOW_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetListAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAPACITY_MICROCENTS = "capacity_microcents";
  private Long capacityMicrocents;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CURRENT_PERIOD_CAPACITY_MICROCENTS =
      "current_period_capacity_microcents";
  private Long currentPeriodCapacityMicrocents;

  public static final String JSON_PROPERTY_CURRENT_SPEND_MICROCENTS = "current_spend_microcents";
  private Long currentSpendMicrocents;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENFORCEMENT = "enforcement";
  private AiGatewayBudgetEnforcement enforcement;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE_RESTRICTED = "scope_restricted";
  private Boolean scopeRestricted;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private JsonNullable<List<AiGatewayBudgetSelectorEntry>> selector =
      JsonNullable.<List<AiGatewayBudgetSelectorEntry>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<String, String>();

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private UUID teamId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_WARNING_THRESHOLD = "warning_threshold";
  private Double warningThreshold;

  public static final String JSON_PROPERTY_WINDOW_END = "window_end";
  private OffsetDateTime windowEnd;

  public static final String JSON_PROPERTY_WINDOW_POLICY = "window_policy";
  private AiGatewayBudgetWindowPolicy windowPolicy;

  public static final String JSON_PROPERTY_WINDOW_START = "window_start";
  private OffsetDateTime windowStart;

  public AiGatewayBudgetListAttributes() {}

  @JsonCreator
  public AiGatewayBudgetListAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CAPACITY_MICROCENTS)
          Long capacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_PERIOD_CAPACITY_MICROCENTS)
          Long currentPeriodCapacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_SPEND_MICROCENTS)
          Long currentSpendMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENFORCEMENT)
          AiGatewayBudgetEnforcement enforcement,
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_ID) Long monitorId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE_RESTRICTED)
          Boolean scopeRestricted,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) Map<String, String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_WARNING_THRESHOLD)
          Double warningThreshold,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_END) OffsetDateTime windowEnd,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_POLICY)
          AiGatewayBudgetWindowPolicy windowPolicy,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_START)
          OffsetDateTime windowStart) {
    this.capacityMicrocents = capacityMicrocents;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.currentPeriodCapacityMicrocents = currentPeriodCapacityMicrocents;
    this.currentSpendMicrocents = currentSpendMicrocents;
    this.enabled = enabled;
    this.enforcement = enforcement;
    this.unparsed |= !enforcement.isValid();
    this.monitorId = monitorId;
    if (monitorId != null) {}
    this.name = name;
    this.scopeRestricted = scopeRestricted;
    this.tags = tags;
    this.updatedAt = updatedAt;
    this.warningThreshold = warningThreshold;
    this.windowEnd = windowEnd;
    this.windowPolicy = windowPolicy;
    this.unparsed |= !windowPolicy.isValid();
    this.windowStart = windowStart;
  }

  public AiGatewayBudgetListAttributes capacityMicrocents(Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
    return this;
  }

  /**
   * Budget capacity in microcents.
   *
   * @return capacityMicrocents
   */
  @JsonProperty(JSON_PROPERTY_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCapacityMicrocents() {
    return capacityMicrocents;
  }

  public void setCapacityMicrocents(Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
  }

  public AiGatewayBudgetListAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the resource was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AiGatewayBudgetListAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Identifier of the principal that created the resource.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AiGatewayBudgetListAttributes currentPeriodCapacityMicrocents(
      Long currentPeriodCapacityMicrocents) {
    this.currentPeriodCapacityMicrocents = currentPeriodCapacityMicrocents;
    return this;
  }

  /**
   * Capacity enforced for the active window, in microcents.
   *
   * @return currentPeriodCapacityMicrocents
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_PERIOD_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCurrentPeriodCapacityMicrocents() {
    return currentPeriodCapacityMicrocents;
  }

  public void setCurrentPeriodCapacityMicrocents(Long currentPeriodCapacityMicrocents) {
    this.currentPeriodCapacityMicrocents = currentPeriodCapacityMicrocents;
  }

  public AiGatewayBudgetListAttributes currentSpendMicrocents(Long currentSpendMicrocents) {
    this.currentSpendMicrocents = currentSpendMicrocents;
    return this;
  }

  /**
   * Spend currently counted against the active window, in microcents.
   *
   * @return currentSpendMicrocents
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_SPEND_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCurrentSpendMicrocents() {
    return currentSpendMicrocents;
  }

  public void setCurrentSpendMicrocents(Long currentSpendMicrocents) {
    this.currentSpendMicrocents = currentSpendMicrocents;
  }

  public AiGatewayBudgetListAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the resource is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AiGatewayBudgetListAttributes enforcement(AiGatewayBudgetEnforcement enforcement) {
    this.enforcement = enforcement;
    this.unparsed |= !enforcement.isValid();
    return this;
  }

  /**
   * Action taken when spend exceeds the budget.
   *
   * @return enforcement
   */
  @JsonProperty(JSON_PROPERTY_ENFORCEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayBudgetEnforcement getEnforcement() {
    return enforcement;
  }

  public void setEnforcement(AiGatewayBudgetEnforcement enforcement) {
    if (!enforcement.isValid()) {
      this.unparsed = true;
    }
    this.enforcement = enforcement;
  }

  public AiGatewayBudgetListAttributes monitorId(Long monitorId) {
    this.monitorId = monitorId;
    if (monitorId != null) {}
    return this;
  }

  /**
   * Datadog monitor ID provisioned for this budget. Null when monitor provisioning was skipped or
   * failed.
   *
   * @return monitorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }

  public AiGatewayBudgetListAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable resource name.
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

  public AiGatewayBudgetListAttributes scopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
    return this;
  }

  /**
   * Whether provider or model scope metadata was withheld. Omit unchanged scope fields on an
   * unrelated update to preserve their saved values.
   *
   * @return scopeRestricted
   */
  @JsonProperty(JSON_PROPERTY_SCOPE_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getScopeRestricted() {
    return scopeRestricted;
  }

  public void setScopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
  }

  public AiGatewayBudgetListAttributes selector(List<AiGatewayBudgetSelectorEntry> selector) {
    this.selector = JsonNullable.<List<AiGatewayBudgetSelectorEntry>>of(selector);
    return this;
  }

  public AiGatewayBudgetListAttributes addSelectorItem(AiGatewayBudgetSelectorEntry selectorItem) {
    if (this.selector == null || !this.selector.isPresent()) {
      this.selector = JsonNullable.<List<AiGatewayBudgetSelectorEntry>>of(new ArrayList<>());
    }
    try {
      this.selector.get().add(selectorItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Dimension rules for a template budget. A nonempty selector creates independent counters for
   * matched instances. Omit or pass an empty selector for a legacy fixed-scope budget.
   *
   * @return selector
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<AiGatewayBudgetSelectorEntry> getSelector() {
    return selector.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AiGatewayBudgetSelectorEntry>> getSelector_JsonNullable() {
    return selector;
  }

  @JsonProperty(JSON_PROPERTY_SELECTOR)
  public void setSelector_JsonNullable(JsonNullable<List<AiGatewayBudgetSelectorEntry>> selector) {
    this.selector = selector;
  }

  public void setSelector(List<AiGatewayBudgetSelectorEntry> selector) {
    this.selector = JsonNullable.<List<AiGatewayBudgetSelectorEntry>>of(selector);
  }

  public AiGatewayBudgetListAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AiGatewayBudgetListAttributes putTagsItem(String key, String tagsItem) {
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Request tags that must match for the budget to apply.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AiGatewayBudgetListAttributes teamId(UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Optional Datadog Team scope.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getTeamId() {
    return teamId;
  }

  public void setTeamId(UUID teamId) {
    this.teamId = teamId;
  }

  public AiGatewayBudgetListAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the resource was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AiGatewayBudgetListAttributes userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User scope. Omitted when the budget is not user-scoped.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public AiGatewayBudgetListAttributes warningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

  /**
   * Fraction of capacity at which to issue a warning.
   *
   * @return warningThreshold
   */
  @JsonProperty(JSON_PROPERTY_WARNING_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  public AiGatewayBudgetListAttributes windowEnd(OffsetDateTime windowEnd) {
    this.windowEnd = windowEnd;
    return this;
  }

  /**
   * End of the active accounting window.
   *
   * @return windowEnd
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getWindowEnd() {
    return windowEnd;
  }

  public void setWindowEnd(OffsetDateTime windowEnd) {
    this.windowEnd = windowEnd;
  }

  public AiGatewayBudgetListAttributes windowPolicy(AiGatewayBudgetWindowPolicy windowPolicy) {
    this.windowPolicy = windowPolicy;
    this.unparsed |= !windowPolicy.isValid();
    return this;
  }

  /**
   * UTC accounting period for a budget.
   *
   * @return windowPolicy
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayBudgetWindowPolicy getWindowPolicy() {
    return windowPolicy;
  }

  public void setWindowPolicy(AiGatewayBudgetWindowPolicy windowPolicy) {
    if (!windowPolicy.isValid()) {
      this.unparsed = true;
    }
    this.windowPolicy = windowPolicy;
  }

  public AiGatewayBudgetListAttributes windowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
    return this;
  }

  /**
   * Start of the active accounting window.
   *
   * @return windowStart
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getWindowStart() {
    return windowStart;
  }

  public void setWindowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
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
   * @return AiGatewayBudgetListAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetListAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetListAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetListAttributes aiGatewayBudgetListAttributes = (AiGatewayBudgetListAttributes) o;
    return Objects.equals(this.capacityMicrocents, aiGatewayBudgetListAttributes.capacityMicrocents)
        && Objects.equals(this.createdAt, aiGatewayBudgetListAttributes.createdAt)
        && Objects.equals(this.createdBy, aiGatewayBudgetListAttributes.createdBy)
        && Objects.equals(
            this.currentPeriodCapacityMicrocents,
            aiGatewayBudgetListAttributes.currentPeriodCapacityMicrocents)
        && Objects.equals(
            this.currentSpendMicrocents, aiGatewayBudgetListAttributes.currentSpendMicrocents)
        && Objects.equals(this.enabled, aiGatewayBudgetListAttributes.enabled)
        && Objects.equals(this.enforcement, aiGatewayBudgetListAttributes.enforcement)
        && Objects.equals(this.monitorId, aiGatewayBudgetListAttributes.monitorId)
        && Objects.equals(this.name, aiGatewayBudgetListAttributes.name)
        && Objects.equals(this.scopeRestricted, aiGatewayBudgetListAttributes.scopeRestricted)
        && Objects.equals(this.selector, aiGatewayBudgetListAttributes.selector)
        && Objects.equals(this.tags, aiGatewayBudgetListAttributes.tags)
        && Objects.equals(this.teamId, aiGatewayBudgetListAttributes.teamId)
        && Objects.equals(this.updatedAt, aiGatewayBudgetListAttributes.updatedAt)
        && Objects.equals(this.userId, aiGatewayBudgetListAttributes.userId)
        && Objects.equals(this.warningThreshold, aiGatewayBudgetListAttributes.warningThreshold)
        && Objects.equals(this.windowEnd, aiGatewayBudgetListAttributes.windowEnd)
        && Objects.equals(this.windowPolicy, aiGatewayBudgetListAttributes.windowPolicy)
        && Objects.equals(this.windowStart, aiGatewayBudgetListAttributes.windowStart)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetListAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacityMicrocents,
        createdAt,
        createdBy,
        currentPeriodCapacityMicrocents,
        currentSpendMicrocents,
        enabled,
        enforcement,
        monitorId,
        name,
        scopeRestricted,
        selector,
        tags,
        teamId,
        updatedAt,
        userId,
        warningThreshold,
        windowEnd,
        windowPolicy,
        windowStart,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetListAttributes {\n");
    sb.append("    capacityMicrocents: ").append(toIndentedString(capacityMicrocents)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    currentPeriodCapacityMicrocents: ")
        .append(toIndentedString(currentPeriodCapacityMicrocents))
        .append("\n");
    sb.append("    currentSpendMicrocents: ")
        .append(toIndentedString(currentSpendMicrocents))
        .append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopeRestricted: ").append(toIndentedString(scopeRestricted)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
    sb.append("    windowPolicy: ").append(toIndentedString(windowPolicy)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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

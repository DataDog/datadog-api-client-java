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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes used to create an AI Gateway budget. */
@JsonPropertyOrder({
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_CAPACITY_MICROCENTS,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_ENFORCEMENT,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_NAME,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_SELECTOR,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_TAGS,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_TEAM_ID,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_TRACK_EXISTING,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_USER_ID,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_WARNING_THRESHOLD,
  AiGatewayBudgetCreateAttributes.JSON_PROPERTY_WINDOW_POLICY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAPACITY_MICROCENTS = "capacity_microcents";
  private Long capacityMicrocents;

  public static final String JSON_PROPERTY_ENFORCEMENT = "enforcement";
  private AiGatewayBudgetEnforcement enforcement;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private JsonNullable<List<AiGatewayBudgetSelectorEntry>> selector =
      JsonNullable.<List<AiGatewayBudgetSelectorEntry>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private UUID teamId;

  public static final String JSON_PROPERTY_TRACK_EXISTING = "track_existing";
  private Boolean trackExisting = false;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_WARNING_THRESHOLD = "warning_threshold";
  private Double warningThreshold = 0.9;

  public static final String JSON_PROPERTY_WINDOW_POLICY = "window_policy";
  private AiGatewayBudgetWindowPolicy windowPolicy;

  public AiGatewayBudgetCreateAttributes() {}

  @JsonCreator
  public AiGatewayBudgetCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CAPACITY_MICROCENTS)
          Long capacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENFORCEMENT)
          AiGatewayBudgetEnforcement enforcement,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_POLICY)
          AiGatewayBudgetWindowPolicy windowPolicy) {
    this.capacityMicrocents = capacityMicrocents;
    this.enforcement = enforcement;
    this.unparsed |= !enforcement.isValid();
    this.name = name;
    this.windowPolicy = windowPolicy;
    this.unparsed |= !windowPolicy.isValid();
  }

  public AiGatewayBudgetCreateAttributes capacityMicrocents(Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
    return this;
  }

  /**
   * Budget capacity in microcents. minimum: 1
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

  public AiGatewayBudgetCreateAttributes enforcement(AiGatewayBudgetEnforcement enforcement) {
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

  public AiGatewayBudgetCreateAttributes name(String name) {
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

  public AiGatewayBudgetCreateAttributes selector(List<AiGatewayBudgetSelectorEntry> selector) {
    this.selector = JsonNullable.<List<AiGatewayBudgetSelectorEntry>>of(selector);
    return this;
  }

  public AiGatewayBudgetCreateAttributes addSelectorItem(
      AiGatewayBudgetSelectorEntry selectorItem) {
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

  public AiGatewayBudgetCreateAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AiGatewayBudgetCreateAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Request tags that must match for the budget to apply.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AiGatewayBudgetCreateAttributes teamId(UUID teamId) {
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

  public AiGatewayBudgetCreateAttributes trackExisting(Boolean trackExisting) {
    this.trackExisting = trackExisting;
    return this;
  }

  /**
   * Initialize current-period spend from historical priced LLM Observability spans. Defaults to
   * false. Unsupported for template budgets; failures can be retried with an update.
   *
   * @return trackExisting
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_EXISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTrackExisting() {
    return trackExisting;
  }

  public void setTrackExisting(Boolean trackExisting) {
    this.trackExisting = trackExisting;
  }

  public AiGatewayBudgetCreateAttributes userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Optional user scope.
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

  public AiGatewayBudgetCreateAttributes warningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

  /**
   * Fraction of capacity at which to issue a warning. minimum: 0 maximum: 1
   *
   * @return warningThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  public AiGatewayBudgetCreateAttributes windowPolicy(AiGatewayBudgetWindowPolicy windowPolicy) {
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
   * @return AiGatewayBudgetCreateAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetCreateAttributes aiGatewayBudgetCreateAttributes =
        (AiGatewayBudgetCreateAttributes) o;
    return Objects.equals(
            this.capacityMicrocents, aiGatewayBudgetCreateAttributes.capacityMicrocents)
        && Objects.equals(this.enforcement, aiGatewayBudgetCreateAttributes.enforcement)
        && Objects.equals(this.name, aiGatewayBudgetCreateAttributes.name)
        && Objects.equals(this.selector, aiGatewayBudgetCreateAttributes.selector)
        && Objects.equals(this.tags, aiGatewayBudgetCreateAttributes.tags)
        && Objects.equals(this.teamId, aiGatewayBudgetCreateAttributes.teamId)
        && Objects.equals(this.trackExisting, aiGatewayBudgetCreateAttributes.trackExisting)
        && Objects.equals(this.userId, aiGatewayBudgetCreateAttributes.userId)
        && Objects.equals(this.warningThreshold, aiGatewayBudgetCreateAttributes.warningThreshold)
        && Objects.equals(this.windowPolicy, aiGatewayBudgetCreateAttributes.windowPolicy)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacityMicrocents,
        enforcement,
        name,
        selector,
        tags,
        teamId,
        trackExisting,
        userId,
        warningThreshold,
        windowPolicy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetCreateAttributes {\n");
    sb.append("    capacityMicrocents: ").append(toIndentedString(capacityMicrocents)).append("\n");
    sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    trackExisting: ").append(toIndentedString(trackExisting)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    windowPolicy: ").append(toIndentedString(windowPolicy)).append("\n");
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

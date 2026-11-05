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

/** Mutable attributes of an AI Gateway budget. */
@JsonPropertyOrder({
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_APPLY_TO_CURRENT_PERIOD,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_CAPACITY_MICROCENTS,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_ENABLED,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_ENFORCEMENT,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_NAME,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_REASON,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_TRACK_EXISTING,
  AiGatewayBudgetUpdateAttributes.JSON_PROPERTY_WARNING_THRESHOLD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLY_TO_CURRENT_PERIOD = "apply_to_current_period";
  private Boolean applyToCurrentPeriod = false;

  public static final String JSON_PROPERTY_CAPACITY_MICROCENTS = "capacity_microcents";
  private Long capacityMicrocents;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENFORCEMENT = "enforcement";
  private AiGatewayBudgetEnforcement enforcement;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_TRACK_EXISTING = "track_existing";
  private Boolean trackExisting = false;

  public static final String JSON_PROPERTY_WARNING_THRESHOLD = "warning_threshold";
  private Double warningThreshold;

  public AiGatewayBudgetUpdateAttributes applyToCurrentPeriod(Boolean applyToCurrentPeriod) {
    this.applyToCurrentPeriod = applyToCurrentPeriod;
    return this;
  }

  /**
   * Whether a capacity change also applies to the active accounting period. Requires
   * capacity_microcents. Unsupported for template budgets.
   *
   * @return applyToCurrentPeriod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLY_TO_CURRENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getApplyToCurrentPeriod() {
    return applyToCurrentPeriod;
  }

  public void setApplyToCurrentPeriod(Boolean applyToCurrentPeriod) {
    this.applyToCurrentPeriod = applyToCurrentPeriod;
  }

  public AiGatewayBudgetUpdateAttributes capacityMicrocents(Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
    return this;
  }

  /**
   * Default capacity for future accounting periods, in microcents. minimum: 1
   *
   * @return capacityMicrocents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCapacityMicrocents() {
    return capacityMicrocents;
  }

  public void setCapacityMicrocents(Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
  }

  public AiGatewayBudgetUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the budget is enabled.
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

  public AiGatewayBudgetUpdateAttributes enforcement(AiGatewayBudgetEnforcement enforcement) {
    this.enforcement = enforcement;
    this.unparsed |= !enforcement.isValid();
    return this;
  }

  /**
   * Action taken when spend exceeds the budget.
   *
   * @return enforcement
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayBudgetEnforcement getEnforcement() {
    return enforcement;
  }

  public void setEnforcement(AiGatewayBudgetEnforcement enforcement) {
    if (!enforcement.isValid()) {
      this.unparsed = true;
    }
    this.enforcement = enforcement;
  }

  public AiGatewayBudgetUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable resource name.
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

  public AiGatewayBudgetUpdateAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Optional reason recorded with an active-period capacity adjustment.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AiGatewayBudgetUpdateAttributes trackExisting(Boolean trackExisting) {
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

  public AiGatewayBudgetUpdateAttributes warningThreshold(Double warningThreshold) {
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
   * @return AiGatewayBudgetUpdateAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetUpdateAttributes aiGatewayBudgetUpdateAttributes =
        (AiGatewayBudgetUpdateAttributes) o;
    return Objects.equals(
            this.applyToCurrentPeriod, aiGatewayBudgetUpdateAttributes.applyToCurrentPeriod)
        && Objects.equals(
            this.capacityMicrocents, aiGatewayBudgetUpdateAttributes.capacityMicrocents)
        && Objects.equals(this.enabled, aiGatewayBudgetUpdateAttributes.enabled)
        && Objects.equals(this.enforcement, aiGatewayBudgetUpdateAttributes.enforcement)
        && Objects.equals(this.name, aiGatewayBudgetUpdateAttributes.name)
        && Objects.equals(this.reason, aiGatewayBudgetUpdateAttributes.reason)
        && Objects.equals(this.trackExisting, aiGatewayBudgetUpdateAttributes.trackExisting)
        && Objects.equals(this.warningThreshold, aiGatewayBudgetUpdateAttributes.warningThreshold)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyToCurrentPeriod,
        capacityMicrocents,
        enabled,
        enforcement,
        name,
        reason,
        trackExisting,
        warningThreshold,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetUpdateAttributes {\n");
    sb.append("    applyToCurrentPeriod: ")
        .append(toIndentedString(applyToCurrentPeriod))
        .append("\n");
    sb.append("    capacityMicrocents: ").append(toIndentedString(capacityMicrocents)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    trackExisting: ").append(toIndentedString(trackExisting)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
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

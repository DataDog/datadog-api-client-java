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

/**
 * Alert thresholds of a Product Analytics monitor. Keep <code>critical</code> in sync with the
 * comparison in the monitor query; the query is not derived from these values.
 */
@JsonPropertyOrder({
  ProductAnalyticsMonitorThresholds.JSON_PROPERTY_CRITICAL,
  ProductAnalyticsMonitorThresholds.JSON_PROPERTY_CRITICAL_RECOVERY,
  ProductAnalyticsMonitorThresholds.JSON_PROPERTY_WARNING,
  ProductAnalyticsMonitorThresholds.JSON_PROPERTY_WARNING_RECOVERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsMonitorThresholds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRITICAL = "critical";
  private Double critical;

  public static final String JSON_PROPERTY_CRITICAL_RECOVERY = "critical_recovery";
  private Double criticalRecovery;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Double warning;

  public static final String JSON_PROPERTY_WARNING_RECOVERY = "warning_recovery";
  private Double warningRecovery;

  public ProductAnalyticsMonitorThresholds critical(Double critical) {
    this.critical = critical;
    return this;
  }

  /**
   * Value that triggers a critical alert.
   *
   * @return critical
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCritical() {
    return critical;
  }

  public void setCritical(Double critical) {
    this.critical = critical;
  }

  public ProductAnalyticsMonitorThresholds criticalRecovery(Double criticalRecovery) {
    this.criticalRecovery = criticalRecovery;
    return this;
  }

  /**
   * Value at which a critical alert recovers.
   *
   * @return criticalRecovery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITICAL_RECOVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCriticalRecovery() {
    return criticalRecovery;
  }

  public void setCriticalRecovery(Double criticalRecovery) {
    this.criticalRecovery = criticalRecovery;
  }

  public ProductAnalyticsMonitorThresholds warning(Double warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Value that triggers a warning.
   *
   * @return warning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarning() {
    return warning;
  }

  public void setWarning(Double warning) {
    this.warning = warning;
  }

  public ProductAnalyticsMonitorThresholds warningRecovery(Double warningRecovery) {
    this.warningRecovery = warningRecovery;
    return this;
  }

  /**
   * Value at which a warning recovers.
   *
   * @return warningRecovery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING_RECOVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarningRecovery() {
    return warningRecovery;
  }

  public void setWarningRecovery(Double warningRecovery) {
    this.warningRecovery = warningRecovery;
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
   * @return ProductAnalyticsMonitorThresholds
   */
  @JsonAnySetter
  public ProductAnalyticsMonitorThresholds putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsMonitorThresholds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsMonitorThresholds productAnalyticsMonitorThresholds =
        (ProductAnalyticsMonitorThresholds) o;
    return Objects.equals(this.critical, productAnalyticsMonitorThresholds.critical)
        && Objects.equals(this.criticalRecovery, productAnalyticsMonitorThresholds.criticalRecovery)
        && Objects.equals(this.warning, productAnalyticsMonitorThresholds.warning)
        && Objects.equals(this.warningRecovery, productAnalyticsMonitorThresholds.warningRecovery)
        && Objects.equals(
            this.additionalProperties, productAnalyticsMonitorThresholds.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, criticalRecovery, warning, warningRecovery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsMonitorThresholds {\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    criticalRecovery: ").append(toIndentedString(criticalRecovery)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningRecovery: ").append(toIndentedString(warningRecovery)).append("\n");
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

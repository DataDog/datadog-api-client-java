/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>List of the different monitor threshold available.</p>
 */
@JsonPropertyOrder({
  MonitorThresholds.JSON_PROPERTY_CRITICAL,
  MonitorThresholds.JSON_PROPERTY_CRITICAL_RECOVERY,
  MonitorThresholds.JSON_PROPERTY_OK,
  MonitorThresholds.JSON_PROPERTY_UNKNOWN,
  MonitorThresholds.JSON_PROPERTY_WARNING,
  MonitorThresholds.JSON_PROPERTY_WARNING_RECOVERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorThresholds {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRITICAL = "critical";
  private Double critical;

  public static final String JSON_PROPERTY_CRITICAL_RECOVERY = "critical_recovery";
  private JsonNullable<Double> criticalRecovery = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_OK = "ok";
  private JsonNullable<Double> ok = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_UNKNOWN = "unknown";
  private JsonNullable<Double> unknown = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WARNING = "warning";
  private JsonNullable<Double> warning = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WARNING_RECOVERY = "warning_recovery";
  private JsonNullable<Double> warningRecovery = JsonNullable.<Double>undefined();

  public MonitorThresholds critical(Double critical) {
    this.critical = critical;
    return this;
  }

  /**
   * <p>The monitor <code>CRITICAL</code> threshold.</p>
   * @return critical
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CRITICAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getCritical() {
        return critical;
      }
  public void setCritical(Double critical) {
    this.critical = critical;
  }
  public MonitorThresholds criticalRecovery(Double criticalRecovery) {
    this.criticalRecovery = JsonNullable.<Double>of(criticalRecovery);
    return this;
  }

  /**
   * <p>The monitor <code>CRITICAL</code> recovery threshold.</p>
   * @return criticalRecovery
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getCriticalRecovery() {
        return criticalRecovery.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CRITICAL_RECOVERY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCriticalRecovery_JsonNullable() {
    return criticalRecovery;
  }
  @JsonProperty(JSON_PROPERTY_CRITICAL_RECOVERY)public void setCriticalRecovery_JsonNullable(JsonNullable<Double> criticalRecovery) {
    this.criticalRecovery = criticalRecovery;
  }
  public void setCriticalRecovery(Double criticalRecovery) {
    this.criticalRecovery = JsonNullable.<Double>of(criticalRecovery);
  }
  public MonitorThresholds ok(Double ok) {
    this.ok = JsonNullable.<Double>of(ok);
    return this;
  }

  /**
   * <p>The monitor <code>OK</code> threshold.</p>
   * @return ok
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getOk() {
        return ok.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getOk_JsonNullable() {
    return ok;
  }
  @JsonProperty(JSON_PROPERTY_OK)public void setOk_JsonNullable(JsonNullable<Double> ok) {
    this.ok = ok;
  }
  public void setOk(Double ok) {
    this.ok = JsonNullable.<Double>of(ok);
  }
  public MonitorThresholds unknown(Double unknown) {
    this.unknown = JsonNullable.<Double>of(unknown);
    return this;
  }

  /**
   * <p>The monitor UNKNOWN threshold.</p>
   * @return unknown
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getUnknown() {
        return unknown.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getUnknown_JsonNullable() {
    return unknown;
  }
  @JsonProperty(JSON_PROPERTY_UNKNOWN)public void setUnknown_JsonNullable(JsonNullable<Double> unknown) {
    this.unknown = unknown;
  }
  public void setUnknown(Double unknown) {
    this.unknown = JsonNullable.<Double>of(unknown);
  }
  public MonitorThresholds warning(Double warning) {
    this.warning = JsonNullable.<Double>of(warning);
    return this;
  }

  /**
   * <p>The monitor <code>WARNING</code> threshold.</p>
   * @return warning
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getWarning() {
        return warning.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getWarning_JsonNullable() {
    return warning;
  }
  @JsonProperty(JSON_PROPERTY_WARNING)public void setWarning_JsonNullable(JsonNullable<Double> warning) {
    this.warning = warning;
  }
  public void setWarning(Double warning) {
    this.warning = JsonNullable.<Double>of(warning);
  }
  public MonitorThresholds warningRecovery(Double warningRecovery) {
    this.warningRecovery = JsonNullable.<Double>of(warningRecovery);
    return this;
  }

  /**
   * <p>The monitor <code>WARNING</code> recovery threshold.</p>
   * @return warningRecovery
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getWarningRecovery() {
        return warningRecovery.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_WARNING_RECOVERY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getWarningRecovery_JsonNullable() {
    return warningRecovery;
  }
  @JsonProperty(JSON_PROPERTY_WARNING_RECOVERY)public void setWarningRecovery_JsonNullable(JsonNullable<Double> warningRecovery) {
    this.warningRecovery = warningRecovery;
  }
  public void setWarningRecovery(Double warningRecovery) {
    this.warningRecovery = JsonNullable.<Double>of(warningRecovery);
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
   * @return MonitorThresholds
   */
  @JsonAnySetter
  public MonitorThresholds putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorThresholds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorThresholds monitorThresholds = (MonitorThresholds) o;
    return Objects.equals(this.critical, monitorThresholds.critical) && Objects.equals(this.criticalRecovery, monitorThresholds.criticalRecovery) && Objects.equals(this.ok, monitorThresholds.ok) && Objects.equals(this.unknown, monitorThresholds.unknown) && Objects.equals(this.warning, monitorThresholds.warning) && Objects.equals(this.warningRecovery, monitorThresholds.warningRecovery) && Objects.equals(this.additionalProperties, monitorThresholds.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(critical,criticalRecovery,ok,unknown,warning,warningRecovery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorThresholds {\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    criticalRecovery: ").append(toIndentedString(criticalRecovery)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningRecovery: ").append(toIndentedString(warningRecovery)).append("\n");
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

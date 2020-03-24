/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  MonitorThresholds.JSON_PROPERTY_CRITICAL,
  MonitorThresholds.JSON_PROPERTY_CRITICAL_RECOVERY,
  MonitorThresholds.JSON_PROPERTY_OK,
  MonitorThresholds.JSON_PROPERTY_UNKNOWN,
  MonitorThresholds.JSON_PROPERTY_WARNING,
  MonitorThresholds.JSON_PROPERTY_WARNING_RECOVERY
})

public class MonitorThresholds {
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
   * TODO.
   * @return critical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * TODO.
   * @return criticalRecovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonIgnore

  public Double getCriticalRecovery() {
        return criticalRecovery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CRITICAL_RECOVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCriticalRecovery_JsonNullable() {
    return criticalRecovery;
  }
  
  @JsonProperty(JSON_PROPERTY_CRITICAL_RECOVERY)
  public void setCriticalRecovery_JsonNullable(JsonNullable<Double> criticalRecovery) {
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
   * TODO.
   * @return ok
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonIgnore

  public Double getOk() {
        return ok.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getOk_JsonNullable() {
    return ok;
  }
  
  @JsonProperty(JSON_PROPERTY_OK)
  public void setOk_JsonNullable(JsonNullable<Double> ok) {
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
   * TODO.
   * @return unknown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonIgnore

  public Double getUnknown() {
        return unknown.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getUnknown_JsonNullable() {
    return unknown;
  }
  
  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  public void setUnknown_JsonNullable(JsonNullable<Double> unknown) {
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
   * TODO.
   * @return warning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonIgnore

  public Double getWarning() {
        return warning.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getWarning_JsonNullable() {
    return warning;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNING)
  public void setWarning_JsonNullable(JsonNullable<Double> warning) {
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
   * TODO.
   * @return warningRecovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonIgnore

  public Double getWarningRecovery() {
        return warningRecovery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARNING_RECOVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getWarningRecovery_JsonNullable() {
    return warningRecovery;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNING_RECOVERY)
  public void setWarningRecovery_JsonNullable(JsonNullable<Double> warningRecovery) {
    this.warningRecovery = warningRecovery;
  }

  public void setWarningRecovery(Double warningRecovery) {
    this.warningRecovery = JsonNullable.<Double>of(warningRecovery);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorThresholds monitorThresholds = (MonitorThresholds) o;
    return Objects.equals(this.critical, monitorThresholds.critical) &&
        Objects.equals(this.criticalRecovery, monitorThresholds.criticalRecovery) &&
        Objects.equals(this.ok, monitorThresholds.ok) &&
        Objects.equals(this.unknown, monitorThresholds.unknown) &&
        Objects.equals(this.warning, monitorThresholds.warning) &&
        Objects.equals(this.warningRecovery, monitorThresholds.warningRecovery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, criticalRecovery, ok, unknown, warning, warningRecovery);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MonitorThresholds
 */
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
  private Float critical;

  public static final String JSON_PROPERTY_CRITICAL_RECOVERY = "critical_recovery";
  private Float criticalRecovery;

  public static final String JSON_PROPERTY_OK = "ok";
  private Float ok;

  public static final String JSON_PROPERTY_UNKNOWN = "unknown";
  private Float unknown;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Float warning;

  public static final String JSON_PROPERTY_WARNING_RECOVERY = "warning_recovery";
  private Float warningRecovery;


  public MonitorThresholds critical(Float critical) {
    
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getCritical() {
    return critical;
  }



  public void setCritical(Float critical) {
    this.critical = critical;
  }


  public MonitorThresholds criticalRecovery(Float criticalRecovery) {
    
    this.criticalRecovery = criticalRecovery;
    return this;
  }

   /**
   * Get criticalRecovery
   * @return criticalRecovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITICAL_RECOVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getCriticalRecovery() {
    return criticalRecovery;
  }



  public void setCriticalRecovery(Float criticalRecovery) {
    this.criticalRecovery = criticalRecovery;
  }


  public MonitorThresholds ok(Float ok) {
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getOk() {
    return ok;
  }



  public void setOk(Float ok) {
    this.ok = ok;
  }


  public MonitorThresholds unknown(Float unknown) {
    
    this.unknown = unknown;
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getUnknown() {
    return unknown;
  }



  public void setUnknown(Float unknown) {
    this.unknown = unknown;
  }


  public MonitorThresholds warning(Float warning) {
    
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getWarning() {
    return warning;
  }



  public void setWarning(Float warning) {
    this.warning = warning;
  }


  public MonitorThresholds warningRecovery(Float warningRecovery) {
    
    this.warningRecovery = warningRecovery;
    return this;
  }

   /**
   * Get warningRecovery
   * @return warningRecovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WARNING_RECOVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getWarningRecovery() {
    return warningRecovery;
  }



  public void setWarningRecovery(Float warningRecovery) {
    this.warningRecovery = warningRecovery;
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


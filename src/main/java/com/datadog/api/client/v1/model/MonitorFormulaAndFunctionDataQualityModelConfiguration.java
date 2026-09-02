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
   * <p>Tuning options for the anomaly detection model used by the monitor.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataQualityModelConfiguration.JSON_PROPERTY_AUTO_RESOLVE_DAYS,
  MonitorFormulaAndFunctionDataQualityModelConfiguration.JSON_PROPERTY_ENABLE_FLATLINE_DETECTION,
  MonitorFormulaAndFunctionDataQualityModelConfiguration.JSON_PROPERTY_FUNCTION,
  MonitorFormulaAndFunctionDataQualityModelConfiguration.JSON_PROPERTY_MIN_LOWER_BOUND_SIZE,
  MonitorFormulaAndFunctionDataQualityModelConfiguration.JSON_PROPERTY_MIN_UPPER_BOUND_SIZE,
  MonitorFormulaAndFunctionDataQualityModelConfiguration.JSON_PROPERTY_MODEL_BOUNDS_OVERRIDE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualityModelConfiguration {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_RESOLVE_DAYS = "auto_resolve_days";
  private Integer autoResolveDays;

  public static final String JSON_PROPERTY_ENABLE_FLATLINE_DETECTION = "enable_flatline_detection";
  private Boolean enableFlatlineDetection;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private MonitorFormulaAndFunctionDataQualityDiffFunction function;

  public static final String JSON_PROPERTY_MIN_LOWER_BOUND_SIZE = "min_lower_bound_size";
  private Double minLowerBoundSize;

  public static final String JSON_PROPERTY_MIN_UPPER_BOUND_SIZE = "min_upper_bound_size";
  private Double minUpperBoundSize;

  public static final String JSON_PROPERTY_MODEL_BOUNDS_OVERRIDE = "model_bounds_override";
  private MonitorFormulaAndFunctionDataQualityModelBoundsOverride modelBoundsOverride;

  public MonitorFormulaAndFunctionDataQualityModelConfiguration autoResolveDays(Integer autoResolveDays) {
    this.autoResolveDays = autoResolveDays;
    return this;
  }

  /**
   * <p>Number of days after which an open alert is automatically resolved.
   * When unset, alerts stay open until the measure returns within bounds.</p>
   * minimum: 1
   * maximum: 365
   * @return autoResolveDays
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTO_RESOLVE_DAYS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getAutoResolveDays() {
        return autoResolveDays;
      }
  public void setAutoResolveDays(Integer autoResolveDays) {
    this.autoResolveDays = autoResolveDays;
  }
  public MonitorFormulaAndFunctionDataQualityModelConfiguration enableFlatlineDetection(Boolean enableFlatlineDetection) {
    this.enableFlatlineDetection = enableFlatlineDetection;
    return this;
  }

  /**
   * <p>Whether to alert when the measure stops changing entirely.
   * Defaults to <code>true</code>.</p>
   * @return enableFlatlineDetection
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLE_FLATLINE_DETECTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnableFlatlineDetection() {
        return enableFlatlineDetection;
      }
  public void setEnableFlatlineDetection(Boolean enableFlatlineDetection) {
    this.enableFlatlineDetection = enableFlatlineDetection;
  }
  public MonitorFormulaAndFunctionDataQualityModelConfiguration function(MonitorFormulaAndFunctionDataQualityDiffFunction function) {
    this.function = function;
    this.unparsed |= !function.isValid();
    return this;
  }

  /**
   * <p>Function applied to the measure before it is compared against the predicted bounds.</p>
   * @return function
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FUNCTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionDataQualityDiffFunction getFunction() {
        return function;
      }
  public void setFunction(MonitorFormulaAndFunctionDataQualityDiffFunction function) {
    if (!function.isValid()) {
        this.unparsed = true;
    }
    this.function = function;
  }
  public MonitorFormulaAndFunctionDataQualityModelConfiguration minLowerBoundSize(Double minLowerBoundSize) {
    this.minLowerBoundSize = minLowerBoundSize;
    return this;
  }

  /**
   * <p>Minimum distance between the predicted value and the lower bound. Widening the
   * lower bound to at least this size suppresses alerts on small downward deviations.
   * When unset, no minimum is enforced.</p>
   * @return minLowerBoundSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MIN_LOWER_BOUND_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getMinLowerBoundSize() {
        return minLowerBoundSize;
      }
  public void setMinLowerBoundSize(Double minLowerBoundSize) {
    this.minLowerBoundSize = minLowerBoundSize;
  }
  public MonitorFormulaAndFunctionDataQualityModelConfiguration minUpperBoundSize(Double minUpperBoundSize) {
    this.minUpperBoundSize = minUpperBoundSize;
    return this;
  }

  /**
   * <p>Minimum distance between the predicted value and the upper bound. Widening the
   * upper bound to at least this size suppresses alerts on small upward deviations.
   * When unset, no minimum is enforced.</p>
   * @return minUpperBoundSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MIN_UPPER_BOUND_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getMinUpperBoundSize() {
        return minUpperBoundSize;
      }
  public void setMinUpperBoundSize(Double minUpperBoundSize) {
    this.minUpperBoundSize = minUpperBoundSize;
  }
  public MonitorFormulaAndFunctionDataQualityModelConfiguration modelBoundsOverride(MonitorFormulaAndFunctionDataQualityModelBoundsOverride modelBoundsOverride) {
    this.modelBoundsOverride = modelBoundsOverride;
    this.unparsed |= !modelBoundsOverride.isValid();
    return this;
  }

  /**
   * <p>Restricts which predicted bound the monitor alerts on. <code>UPPER_ONLY</code> alerts only when
   * the measure rises above the upper bound, <code>LOWER_ONLY</code> only when it falls below the
   * lower bound. When unset, the monitor alerts on both.</p>
   * @return modelBoundsOverride
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODEL_BOUNDS_OVERRIDE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionDataQualityModelBoundsOverride getModelBoundsOverride() {
        return modelBoundsOverride;
      }
  public void setModelBoundsOverride(MonitorFormulaAndFunctionDataQualityModelBoundsOverride modelBoundsOverride) {
    if (!modelBoundsOverride.isValid()) {
        this.unparsed = true;
    }
    this.modelBoundsOverride = modelBoundsOverride;
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
   * @return MonitorFormulaAndFunctionDataQualityModelConfiguration
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualityModelConfiguration putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorFormulaAndFunctionDataQualityModelConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataQualityModelConfiguration monitorFormulaAndFunctionDataQualityModelConfiguration = (MonitorFormulaAndFunctionDataQualityModelConfiguration) o;
    return Objects.equals(this.autoResolveDays, monitorFormulaAndFunctionDataQualityModelConfiguration.autoResolveDays) && Objects.equals(this.enableFlatlineDetection, monitorFormulaAndFunctionDataQualityModelConfiguration.enableFlatlineDetection) && Objects.equals(this.function, monitorFormulaAndFunctionDataQualityModelConfiguration.function) && Objects.equals(this.minLowerBoundSize, monitorFormulaAndFunctionDataQualityModelConfiguration.minLowerBoundSize) && Objects.equals(this.minUpperBoundSize, monitorFormulaAndFunctionDataQualityModelConfiguration.minUpperBoundSize) && Objects.equals(this.modelBoundsOverride, monitorFormulaAndFunctionDataQualityModelConfiguration.modelBoundsOverride) && Objects.equals(this.additionalProperties, monitorFormulaAndFunctionDataQualityModelConfiguration.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(autoResolveDays,enableFlatlineDetection,function,minLowerBoundSize,minUpperBoundSize,modelBoundsOverride, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualityModelConfiguration {\n");
    sb.append("    autoResolveDays: ").append(toIndentedString(autoResolveDays)).append("\n");
    sb.append("    enableFlatlineDetection: ").append(toIndentedString(enableFlatlineDetection)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    minLowerBoundSize: ").append(toIndentedString(minLowerBoundSize)).append("\n");
    sb.append("    minUpperBoundSize: ").append(toIndentedString(minUpperBoundSize)).append("\n");
    sb.append("    modelBoundsOverride: ").append(toIndentedString(modelBoundsOverride)).append("\n");
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

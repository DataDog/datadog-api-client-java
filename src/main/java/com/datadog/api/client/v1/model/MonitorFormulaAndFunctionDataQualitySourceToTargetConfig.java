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
   * <p>Configuration for a source to target monitor, which compares the same measure
   * across two data entities and alerts on the difference between them.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataQualitySourceToTargetConfig.JSON_PROPERTY_DIFF_TYPE,
  MonitorFormulaAndFunctionDataQualitySourceToTargetConfig.JSON_PROPERTY_ENTITY_TYPE,
  MonitorFormulaAndFunctionDataQualitySourceToTargetConfig.JSON_PROPERTY_SOURCE,
  MonitorFormulaAndFunctionDataQualitySourceToTargetConfig.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualitySourceToTargetConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIFF_TYPE = "diff_type";
  private MonitorFormulaAndFunctionDataQualityDiffType diffType;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity_type";
  private String entityType;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private MonitorFormulaAndFunctionDataQualityEntityMetricConfig source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private MonitorFormulaAndFunctionDataQualityEntityMetricConfig target;

  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig() {}

  @JsonCreator
  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_DIFF_TYPE)MonitorFormulaAndFunctionDataQualityDiffType diffType,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENTITY_TYPE)String entityType,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)MonitorFormulaAndFunctionDataQualityEntityMetricConfig source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)MonitorFormulaAndFunctionDataQualityEntityMetricConfig target) {
        this.diffType = diffType;
        this.unparsed |= !diffType.isValid();
        this.entityType = entityType;
        this.source = source;
        this.unparsed |= source.unparsed;
        this.target = target;
        this.unparsed |= target.unparsed;
  }
  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig diffType(MonitorFormulaAndFunctionDataQualityDiffType diffType) {
    this.diffType = diffType;
    this.unparsed |= !diffType.isValid();
    return this;
  }

  /**
   * <p>How the difference between the source and target measures is computed.
   * <code>absolute</code> subtracts the two values, <code>diff_percent</code> expresses the difference
   * as a percentage of the source value.</p>
   * @return diffType
  **/
      @JsonProperty(JSON_PROPERTY_DIFF_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionDataQualityDiffType getDiffType() {
        return diffType;
      }
  public void setDiffType(MonitorFormulaAndFunctionDataQualityDiffType diffType) {
    if (!diffType.isValid()) {
        this.unparsed = true;
    }
    this.diffType = diffType;
  }
  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * <p>Type of the data entities being compared.</p>
   * @return entityType
  **/
      @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEntityType() {
        return entityType;
      }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }
  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig source(MonitorFormulaAndFunctionDataQualityEntityMetricConfig source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * <p>Measure configuration for one side of a source to target comparison.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionDataQualityEntityMetricConfig getSource() {
        return source;
      }
  public void setSource(MonitorFormulaAndFunctionDataQualityEntityMetricConfig source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
    }
  }
  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig target(MonitorFormulaAndFunctionDataQualityEntityMetricConfig target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * <p>Measure configuration for one side of a source to target comparison.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionDataQualityEntityMetricConfig getTarget() {
        return target;
      }
  public void setTarget(MonitorFormulaAndFunctionDataQualityEntityMetricConfig target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
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
   * @return MonitorFormulaAndFunctionDataQualitySourceToTargetConfig
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorFormulaAndFunctionDataQualitySourceToTargetConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataQualitySourceToTargetConfig monitorFormulaAndFunctionDataQualitySourceToTargetConfig = (MonitorFormulaAndFunctionDataQualitySourceToTargetConfig) o;
    return Objects.equals(this.diffType, monitorFormulaAndFunctionDataQualitySourceToTargetConfig.diffType) && Objects.equals(this.entityType, monitorFormulaAndFunctionDataQualitySourceToTargetConfig.entityType) && Objects.equals(this.source, monitorFormulaAndFunctionDataQualitySourceToTargetConfig.source) && Objects.equals(this.target, monitorFormulaAndFunctionDataQualitySourceToTargetConfig.target) && Objects.equals(this.additionalProperties, monitorFormulaAndFunctionDataQualitySourceToTargetConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(diffType,entityType,source,target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualitySourceToTargetConfig {\n");
    sb.append("    diffType: ").append(toIndentedString(diffType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

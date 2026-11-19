/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Snowflake-specific settings for a data quality monitor. */
@JsonPropertyOrder({MonitorFormulaAndFunctionDataQualitySnowflakeSettings.JSON_PROPERTY_WAREHOUSE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualitySnowflakeSettings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_WAREHOUSE = "warehouse";
  private String warehouse;

  public MonitorFormulaAndFunctionDataQualitySnowflakeSettings warehouse(String warehouse) {
    this.warehouse = warehouse;
    return this;
  }

  /**
   * Snowflake warehouse to run this monitor's queries on instead of the integration user's default
   * warehouse. The name is case-sensitive, and the Datadog role must have <code>USAGE</code> on the
   * warehouse directly. Ignored for monitors that read catalog metadata instead of running queries
   * (such as default row count and freshness on base tables).
   *
   * @return warehouse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(String warehouse) {
    this.warehouse = warehouse;
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
   * @return MonitorFormulaAndFunctionDataQualitySnowflakeSettings
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualitySnowflakeSettings putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this MonitorFormulaAndFunctionDataQualitySnowflakeSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataQualitySnowflakeSettings
        monitorFormulaAndFunctionDataQualitySnowflakeSettings =
            (MonitorFormulaAndFunctionDataQualitySnowflakeSettings) o;
    return Objects.equals(
            this.warehouse, monitorFormulaAndFunctionDataQualitySnowflakeSettings.warehouse)
        && Objects.equals(
            this.additionalProperties,
            monitorFormulaAndFunctionDataQualitySnowflakeSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouse, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualitySnowflakeSettings {\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
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

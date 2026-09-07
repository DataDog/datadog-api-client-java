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
   * <p>The hourly usage of timeseries.</p>
 */
@JsonPropertyOrder({
  UsageTimeseriesHour.JSON_PROPERTY_HOUR,
  UsageTimeseriesHour.JSON_PROPERTY_NUM_CUSTOM_INPUT_TIMESERIES,
  UsageTimeseriesHour.JSON_PROPERTY_NUM_CUSTOM_OUTPUT_TIMESERIES,
  UsageTimeseriesHour.JSON_PROPERTY_NUM_CUSTOM_TIMESERIES,
  UsageTimeseriesHour.JSON_PROPERTY_ORG_NAME,
  UsageTimeseriesHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageTimeseriesHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_NUM_CUSTOM_INPUT_TIMESERIES = "num_custom_input_timeseries";
  private Long numCustomInputTimeseries;

  public static final String JSON_PROPERTY_NUM_CUSTOM_OUTPUT_TIMESERIES = "num_custom_output_timeseries";
  private Long numCustomOutputTimeseries;

  public static final String JSON_PROPERTY_NUM_CUSTOM_TIMESERIES = "num_custom_timeseries";
  private Long numCustomTimeseries;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageTimeseriesHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * <p>The hour for the usage.</p>
   * @return hour
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOUR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getHour() {
        return hour;
      }
  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }
  public UsageTimeseriesHour numCustomInputTimeseries(Long numCustomInputTimeseries) {
    this.numCustomInputTimeseries = numCustomInputTimeseries;
    return this;
  }

  /**
   * <p>Contains the number of custom metrics that are inputs for aggregations (metric configured is custom).</p>
   * @return numCustomInputTimeseries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUM_CUSTOM_INPUT_TIMESERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNumCustomInputTimeseries() {
        return numCustomInputTimeseries;
      }
  public void setNumCustomInputTimeseries(Long numCustomInputTimeseries) {
    this.numCustomInputTimeseries = numCustomInputTimeseries;
  }
  public UsageTimeseriesHour numCustomOutputTimeseries(Long numCustomOutputTimeseries) {
    this.numCustomOutputTimeseries = numCustomOutputTimeseries;
    return this;
  }

  /**
   * <p>Contains the number of custom metrics that are outputs for aggregations (metric configured is custom).</p>
   * @return numCustomOutputTimeseries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUM_CUSTOM_OUTPUT_TIMESERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNumCustomOutputTimeseries() {
        return numCustomOutputTimeseries;
      }
  public void setNumCustomOutputTimeseries(Long numCustomOutputTimeseries) {
    this.numCustomOutputTimeseries = numCustomOutputTimeseries;
  }
  public UsageTimeseriesHour numCustomTimeseries(Long numCustomTimeseries) {
    this.numCustomTimeseries = numCustomTimeseries;
    return this;
  }

  /**
   * <p>Contains sum of non-aggregation custom metrics and custom metrics that are outputs for aggregations.</p>
   * @return numCustomTimeseries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUM_CUSTOM_TIMESERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNumCustomTimeseries() {
        return numCustomTimeseries;
      }
  public void setNumCustomTimeseries(Long numCustomTimeseries) {
    this.numCustomTimeseries = numCustomTimeseries;
  }
  public UsageTimeseriesHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * <p>The organization name.</p>
   * @return orgName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrgName() {
        return orgName;
      }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }
  public UsageTimeseriesHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The organization public ID.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
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
   * @return UsageTimeseriesHour
   */
  @JsonAnySetter
  public UsageTimeseriesHour putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageTimeseriesHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTimeseriesHour usageTimeseriesHour = (UsageTimeseriesHour) o;
    return Objects.equals(this.hour, usageTimeseriesHour.hour) && Objects.equals(this.numCustomInputTimeseries, usageTimeseriesHour.numCustomInputTimeseries) && Objects.equals(this.numCustomOutputTimeseries, usageTimeseriesHour.numCustomOutputTimeseries) && Objects.equals(this.numCustomTimeseries, usageTimeseriesHour.numCustomTimeseries) && Objects.equals(this.orgName, usageTimeseriesHour.orgName) && Objects.equals(this.publicId, usageTimeseriesHour.publicId) && Objects.equals(this.additionalProperties, usageTimeseriesHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hour,numCustomInputTimeseries,numCustomOutputTimeseries,numCustomTimeseries,orgName,publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTimeseriesHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    numCustomInputTimeseries: ").append(toIndentedString(numCustomInputTimeseries)).append("\n");
    sb.append("    numCustomOutputTimeseries: ").append(toIndentedString(numCustomOutputTimeseries)).append("\n");
    sb.append("    numCustomTimeseries: ").append(toIndentedString(numCustomTimeseries)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Object describing the extra options for a Synthetic test.</p>
 */
@JsonPropertyOrder({
  SyntheticsTestOptions.JSON_PROPERTY_MIN_FAILURE_DURATION,
  SyntheticsTestOptions.JSON_PROPERTY_MIN_LOCATION_FAILED,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_NAME,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_OPTIONS,
  SyntheticsTestOptions.JSON_PROPERTY_MONITOR_PRIORITY,
  SyntheticsTestOptions.JSON_PROPERTY_RESTRICTED_ROLES,
  SyntheticsTestOptions.JSON_PROPERTY_RETRY,
  SyntheticsTestOptions.JSON_PROPERTY_SCHEDULING,
  SyntheticsTestOptions.JSON_PROPERTY_TICK_EVERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MIN_FAILURE_DURATION = "min_failure_duration";
  private Long minFailureDuration;

  public static final String JSON_PROPERTY_MIN_LOCATION_FAILED = "min_location_failed";
  private Long minLocationFailed;

  public static final String JSON_PROPERTY_MONITOR_NAME = "monitor_name";
  private String monitorName;

  public static final String JSON_PROPERTY_MONITOR_OPTIONS = "monitor_options";
  private SyntheticsTestOptionsMonitorOptions monitorOptions;

  public static final String JSON_PROPERTY_MONITOR_PRIORITY = "monitor_priority";
  private Integer monitorPriority;

  public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
  private List<String> restrictedRoles = null;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private SyntheticsTestOptionsScheduling scheduling;

  public static final String JSON_PROPERTY_TICK_EVERY = "tick_every";
  private Long tickEvery;

  public SyntheticsTestOptions minFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
    return this;
  }

  /**
   * <p>Minimum amount of time in failure required to trigger an alert.</p>
   * @return minFailureDuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MIN_FAILURE_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMinFailureDuration() {
        return minFailureDuration;
      }
  public void setMinFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
  }
  public SyntheticsTestOptions minLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
    return this;
  }

  /**
   * <p>Minimum number of locations in failure required to trigger
   * an alert.</p>
   * @return minLocationFailed
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMinLocationFailed() {
        return minLocationFailed;
      }
  public void setMinLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
  }
  public SyntheticsTestOptions monitorName(String monitorName) {
    this.monitorName = monitorName;
    return this;
  }

  /**
   * <p>The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs.</p>
   * @return monitorName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMonitorName() {
        return monitorName;
      }
  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }
  public SyntheticsTestOptions monitorOptions(SyntheticsTestOptionsMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
    this.unparsed |= monitorOptions.unparsed;
    return this;
  }

  /**
   * <p>Object containing the options for a Synthetic test as a monitor
   * (for example, renotification).</p>
   * @return monitorOptions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestOptionsMonitorOptions getMonitorOptions() {
        return monitorOptions;
      }
  public void setMonitorOptions(SyntheticsTestOptionsMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
  }
  public SyntheticsTestOptions monitorPriority(Integer monitorPriority) {
    this.monitorPriority = monitorPriority;
    return this;
  }

  /**
   * <p>Integer from 1 (high) to 5 (low) indicating alert severity.</p>
   * minimum: 1
   * maximum: 5
   * @return monitorPriority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getMonitorPriority() {
        return monitorPriority;
      }
  public void setMonitorPriority(Integer monitorPriority) {
    this.monitorPriority = monitorPriority;
  }
  public SyntheticsTestOptions restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
    return this;
  }
  public SyntheticsTestOptions addRestrictedRolesItem(String restrictedRolesItem) {
    if (this.restrictedRoles == null) {
      this.restrictedRoles = new ArrayList<>();
    }
    this.restrictedRoles.add(restrictedRolesItem);
    return this;
  }

  /**
   * <p>A list of role identifiers that can be pulled from the Roles API, for restricting read and write access. This field is deprecated. Use the restriction policies API to manage permissions.</p>
   * @return restrictedRoles
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getRestrictedRoles() {
        return restrictedRoles;
      }
  @Deprecated
  public void setRestrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
  }
  public SyntheticsTestOptions retry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
    this.unparsed |= retry.unparsed;
    return this;
  }

  /**
   * <p>Object describing the retry strategy to apply to a Synthetic test.</p>
   * @return retry
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETRY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestOptionsRetry getRetry() {
        return retry;
      }
  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }
  public SyntheticsTestOptions scheduling(SyntheticsTestOptionsScheduling scheduling) {
    this.scheduling = scheduling;
    this.unparsed |= scheduling.unparsed;
    return this;
  }

  /**
   * <p>Object containing timeframes and timezone used for advanced scheduling.</p>
   * @return scheduling
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCHEDULING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestOptionsScheduling getScheduling() {
        return scheduling;
      }
  public void setScheduling(SyntheticsTestOptionsScheduling scheduling) {
    this.scheduling = scheduling;
  }
  public SyntheticsTestOptions tickEvery(Long tickEvery) {
    this.tickEvery = tickEvery;
    return this;
  }

  /**
   * <p>The frequency at which to run the Synthetic test (in seconds).</p>
   * minimum: 30
   * maximum: 604800
   * @return tickEvery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TICK_EVERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTickEvery() {
        return tickEvery;
      }
  public void setTickEvery(Long tickEvery) {
    this.tickEvery = tickEvery;
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
   * @return SyntheticsTestOptions
   */
  @JsonAnySetter
  public SyntheticsTestOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsTestOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptions syntheticsTestOptions = (SyntheticsTestOptions) o;
    return Objects.equals(this.minFailureDuration, syntheticsTestOptions.minFailureDuration) && Objects.equals(this.minLocationFailed, syntheticsTestOptions.minLocationFailed) && Objects.equals(this.monitorName, syntheticsTestOptions.monitorName) && Objects.equals(this.monitorOptions, syntheticsTestOptions.monitorOptions) && Objects.equals(this.monitorPriority, syntheticsTestOptions.monitorPriority) && Objects.equals(this.restrictedRoles, syntheticsTestOptions.restrictedRoles) && Objects.equals(this.retry, syntheticsTestOptions.retry) && Objects.equals(this.scheduling, syntheticsTestOptions.scheduling) && Objects.equals(this.tickEvery, syntheticsTestOptions.tickEvery) && Objects.equals(this.additionalProperties, syntheticsTestOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(minFailureDuration,minLocationFailed,monitorName,monitorOptions,monitorPriority,restrictedRoles,retry,scheduling,tickEvery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptions {\n");
    sb.append("    minFailureDuration: ").append(toIndentedString(minFailureDuration)).append("\n");
    sb.append("    minLocationFailed: ").append(toIndentedString(minLocationFailed)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    monitorOptions: ").append(toIndentedString(monitorOptions)).append("\n");
    sb.append("    monitorPriority: ").append(toIndentedString(monitorPriority)).append("\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    tickEvery: ").append(toIndentedString(tickEvery)).append("\n");
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

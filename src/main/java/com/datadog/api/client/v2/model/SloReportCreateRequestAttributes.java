/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The attributes portion of the SLO report request. */
@JsonPropertyOrder({
  SloReportCreateRequestAttributes.JSON_PROPERTY_FROM_TS,
  SloReportCreateRequestAttributes.JSON_PROPERTY_INTERVAL,
  SloReportCreateRequestAttributes.JSON_PROPERTY_QUERY,
  SloReportCreateRequestAttributes.JSON_PROPERTY_TIMEZONE,
  SloReportCreateRequestAttributes.JSON_PROPERTY_TO_TS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SloReportCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private Long fromTs;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private SLOReportInterval interval;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private Long toTs;

  public SloReportCreateRequestAttributes() {}

  @JsonCreator
  public SloReportCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM_TS) Long fromTs,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO_TS) Long toTs) {
    this.fromTs = fromTs;
    this.query = query;
    this.toTs = toTs;
  }

  public SloReportCreateRequestAttributes fromTs(Long fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * The <code>from</code> timestamp for the report in epoch seconds.
   *
   * @return fromTs
   */
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFromTs() {
    return fromTs;
  }

  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }

  public SloReportCreateRequestAttributes interval(SLOReportInterval interval) {
    this.interval = interval;
    this.unparsed |= !interval.isValid();
    return this;
  }

  /**
   * The frequency at which report data is to be generated.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOReportInterval getInterval() {
    return interval;
  }

  public void setInterval(SLOReportInterval interval) {
    if (!interval.isValid()) {
      this.unparsed = true;
    }
    this.interval = interval;
  }

  public SloReportCreateRequestAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query string used to filter SLO results. Some examples of queries include <code>
   * service:&lt;service-name&gt;</code> and <code>slo-name</code>.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SloReportCreateRequestAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone used to determine the start and end of each interval. For example, weekly
   * intervals start at 12am on Sunday in the specified timezone.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public SloReportCreateRequestAttributes toTs(Long toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * The <code>to</code> timestamp for the report in epoch seconds.
   *
   * @return toTs
   */
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getToTs() {
    return toTs;
  }

  public void setToTs(Long toTs) {
    this.toTs = toTs;
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
   * @return SloReportCreateRequestAttributes
   */
  @JsonAnySetter
  public SloReportCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SloReportCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SloReportCreateRequestAttributes sloReportCreateRequestAttributes =
        (SloReportCreateRequestAttributes) o;
    return Objects.equals(this.fromTs, sloReportCreateRequestAttributes.fromTs)
        && Objects.equals(this.interval, sloReportCreateRequestAttributes.interval)
        && Objects.equals(this.query, sloReportCreateRequestAttributes.query)
        && Objects.equals(this.timezone, sloReportCreateRequestAttributes.timezone)
        && Objects.equals(this.toTs, sloReportCreateRequestAttributes.toTs)
        && Objects.equals(
            this.additionalProperties, sloReportCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTs, interval, query, timezone, toTs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SloReportCreateRequestAttributes {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
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

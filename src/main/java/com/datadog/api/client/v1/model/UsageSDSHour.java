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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Sensitive Data Scanner usage for a given organization for a given hour. */
@JsonPropertyOrder({
  UsageSDSHour.JSON_PROPERTY_APM_SCANNED_BYTES,
  UsageSDSHour.JSON_PROPERTY_EVENTS_SCANNED_BYTES,
  UsageSDSHour.JSON_PROPERTY_HOUR,
  UsageSDSHour.JSON_PROPERTY_LOGS_SCANNED_BYTES,
  UsageSDSHour.JSON_PROPERTY_ORG_NAME,
  UsageSDSHour.JSON_PROPERTY_PUBLIC_ID,
  UsageSDSHour.JSON_PROPERTY_RUM_SCANNED_BYTES,
  UsageSDSHour.JSON_PROPERTY_TOTAL_SCANNED_BYTES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSDSHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_SCANNED_BYTES = "apm_scanned_bytes";
  private JsonNullable<Long> apmScannedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_EVENTS_SCANNED_BYTES = "events_scanned_bytes";
  private JsonNullable<Long> eventsScannedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_LOGS_SCANNED_BYTES = "logs_scanned_bytes";
  private JsonNullable<Long> logsScannedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RUM_SCANNED_BYTES = "rum_scanned_bytes";
  private JsonNullable<Long> rumScannedBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TOTAL_SCANNED_BYTES = "total_scanned_bytes";
  private JsonNullable<Long> totalScannedBytes = JsonNullable.<Long>undefined();

  public UsageSDSHour apmScannedBytes(Long apmScannedBytes) {
    this.apmScannedBytes = JsonNullable.<Long>of(apmScannedBytes);
    return this;
  }

  /**
   * The total number of bytes scanned of APM usage across all usage types by the Sensitive Data
   * Scanner from the start of the given hour’s month until the given hour.
   *
   * @return apmScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmScannedBytes() {
    return apmScannedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmScannedBytes_JsonNullable() {
    return apmScannedBytes;
  }

  @JsonProperty(JSON_PROPERTY_APM_SCANNED_BYTES)
  public void setApmScannedBytes_JsonNullable(JsonNullable<Long> apmScannedBytes) {
    this.apmScannedBytes = apmScannedBytes;
  }

  public void setApmScannedBytes(Long apmScannedBytes) {
    this.apmScannedBytes = JsonNullable.<Long>of(apmScannedBytes);
  }

  public UsageSDSHour eventsScannedBytes(Long eventsScannedBytes) {
    this.eventsScannedBytes = JsonNullable.<Long>of(eventsScannedBytes);
    return this;
  }

  /**
   * The total number of bytes scanned of Events usage across all usage types by the Sensitive Data
   * Scanner from the start of the given hour’s month until the given hour.
   *
   * @return eventsScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getEventsScannedBytes() {
    return eventsScannedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENTS_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEventsScannedBytes_JsonNullable() {
    return eventsScannedBytes;
  }

  @JsonProperty(JSON_PROPERTY_EVENTS_SCANNED_BYTES)
  public void setEventsScannedBytes_JsonNullable(JsonNullable<Long> eventsScannedBytes) {
    this.eventsScannedBytes = eventsScannedBytes;
  }

  public void setEventsScannedBytes(Long eventsScannedBytes) {
    this.eventsScannedBytes = JsonNullable.<Long>of(eventsScannedBytes);
  }

  public UsageSDSHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageSDSHour logsScannedBytes(Long logsScannedBytes) {
    this.logsScannedBytes = JsonNullable.<Long>of(logsScannedBytes);
    return this;
  }

  /**
   * The total number of bytes scanned of logs usage by the Sensitive Data Scanner from the start of
   * the given hour’s month until the given hour.
   *
   * @return logsScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLogsScannedBytes() {
    return logsScannedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGS_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLogsScannedBytes_JsonNullable() {
    return logsScannedBytes;
  }

  @JsonProperty(JSON_PROPERTY_LOGS_SCANNED_BYTES)
  public void setLogsScannedBytes_JsonNullable(JsonNullable<Long> logsScannedBytes) {
    this.logsScannedBytes = logsScannedBytes;
  }

  public void setLogsScannedBytes(Long logsScannedBytes) {
    this.logsScannedBytes = JsonNullable.<Long>of(logsScannedBytes);
  }

  public UsageSDSHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageSDSHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageSDSHour rumScannedBytes(Long rumScannedBytes) {
    this.rumScannedBytes = JsonNullable.<Long>of(rumScannedBytes);
    return this;
  }

  /**
   * The total number of bytes scanned of RUM usage across all usage types by the Sensitive Data
   * Scanner from the start of the given hour’s month until the given hour.
   *
   * @return rumScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRumScannedBytes() {
    return rumScannedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumScannedBytes_JsonNullable() {
    return rumScannedBytes;
  }

  @JsonProperty(JSON_PROPERTY_RUM_SCANNED_BYTES)
  public void setRumScannedBytes_JsonNullable(JsonNullable<Long> rumScannedBytes) {
    this.rumScannedBytes = rumScannedBytes;
  }

  public void setRumScannedBytes(Long rumScannedBytes) {
    this.rumScannedBytes = JsonNullable.<Long>of(rumScannedBytes);
  }

  public UsageSDSHour totalScannedBytes(Long totalScannedBytes) {
    this.totalScannedBytes = JsonNullable.<Long>of(totalScannedBytes);
    return this;
  }

  /**
   * The total number of bytes scanned across all usage types by the Sensitive Data Scanner from the
   * start of the given hour’s month until the given hour.
   *
   * @return totalScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTotalScannedBytes() {
    return totalScannedBytes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTotalScannedBytes_JsonNullable() {
    return totalScannedBytes;
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_SCANNED_BYTES)
  public void setTotalScannedBytes_JsonNullable(JsonNullable<Long> totalScannedBytes) {
    this.totalScannedBytes = totalScannedBytes;
  }

  public void setTotalScannedBytes(Long totalScannedBytes) {
    this.totalScannedBytes = JsonNullable.<Long>of(totalScannedBytes);
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
   * @return UsageSDSHour
   */
  @JsonAnySetter
  public UsageSDSHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageSDSHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSDSHour usageSdsHour = (UsageSDSHour) o;
    return Objects.equals(this.apmScannedBytes, usageSdsHour.apmScannedBytes)
        && Objects.equals(this.eventsScannedBytes, usageSdsHour.eventsScannedBytes)
        && Objects.equals(this.hour, usageSdsHour.hour)
        && Objects.equals(this.logsScannedBytes, usageSdsHour.logsScannedBytes)
        && Objects.equals(this.orgName, usageSdsHour.orgName)
        && Objects.equals(this.publicId, usageSdsHour.publicId)
        && Objects.equals(this.rumScannedBytes, usageSdsHour.rumScannedBytes)
        && Objects.equals(this.totalScannedBytes, usageSdsHour.totalScannedBytes)
        && Objects.equals(this.additionalProperties, usageSdsHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmScannedBytes,
        eventsScannedBytes,
        hour,
        logsScannedBytes,
        orgName,
        publicId,
        rumScannedBytes,
        totalScannedBytes,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSDSHour {\n");
    sb.append("    apmScannedBytes: ").append(toIndentedString(apmScannedBytes)).append("\n");
    sb.append("    eventsScannedBytes: ").append(toIndentedString(eventsScannedBytes)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    logsScannedBytes: ").append(toIndentedString(logsScannedBytes)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    rumScannedBytes: ").append(toIndentedString(rumScannedBytes)).append("\n");
    sb.append("    totalScannedBytes: ").append(toIndentedString(totalScannedBytes)).append("\n");
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

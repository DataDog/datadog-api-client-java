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
   * <p>Information about the mute status of this finding.</p>
 */
@JsonPropertyOrder({
  FindingMute.JSON_PROPERTY_DESCRIPTION,
  FindingMute.JSON_PROPERTY_EXPIRATION_DATE,
  FindingMute.JSON_PROPERTY_MUTED,
  FindingMute.JSON_PROPERTY_REASON,
  FindingMute.JSON_PROPERTY_START_DATE,
  FindingMute.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingMute {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private Long expirationDate;

  public static final String JSON_PROPERTY_MUTED = "muted";
  private Boolean muted;

  public static final String JSON_PROPERTY_REASON = "reason";
  private FindingMuteReason reason;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private Long startDate;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public FindingMute description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Additional information about the reason why this finding is muted or unmuted.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public FindingMute expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * <p>The expiration date of the mute or unmute action (Unix ms).</p>
   * @return expirationDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getExpirationDate() {
        return expirationDate;
      }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }
  public FindingMute muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * <p>Whether this finding is muted or unmuted.</p>
   * @return muted
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MUTED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getMuted() {
        return muted;
      }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }
  public FindingMute reason(FindingMuteReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * <p>The reason why this finding is muted or unmuted.</p>
   * @return reason
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REASON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FindingMuteReason getReason() {
        return reason;
      }
  public void setReason(FindingMuteReason reason) {
    if (!reason.isValid()) {
        this.unparsed = true;
    }
    this.reason = reason;
  }
  public FindingMute startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <p>The start of the mute period.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStartDate() {
        return startDate;
      }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }
  public FindingMute uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * <p>The ID of the user who muted or unmuted this finding.</p>
   * @return uuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUuid() {
        return uuid;
      }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Return true if this FindingMute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingMute findingMute = (FindingMute) o;
    return Objects.equals(this.description, findingMute.description) && Objects.equals(this.expirationDate, findingMute.expirationDate) && Objects.equals(this.muted, findingMute.muted) && Objects.equals(this.reason, findingMute.reason) && Objects.equals(this.startDate, findingMute.startDate) && Objects.equals(this.uuid, findingMute.uuid);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,expirationDate,muted,reason,startDate,uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingMute {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

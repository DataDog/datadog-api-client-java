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
   * <p>Online Archive usage in a given hour.</p>
 */
@JsonPropertyOrder({
  UsageOnlineArchiveHour.JSON_PROPERTY_HOUR,
  UsageOnlineArchiveHour.JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT,
  UsageOnlineArchiveHour.JSON_PROPERTY_ORG_NAME,
  UsageOnlineArchiveHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageOnlineArchiveHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT = "online_archive_events_count";
  private Long onlineArchiveEventsCount;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageOnlineArchiveHour hour(OffsetDateTime hour) {
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
  public UsageOnlineArchiveHour onlineArchiveEventsCount(Long onlineArchiveEventsCount) {
    this.onlineArchiveEventsCount = onlineArchiveEventsCount;
    return this;
  }

  /**
   * <p>Total count of online archived events within the hour.</p>
   * @return onlineArchiveEventsCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ONLINE_ARCHIVE_EVENTS_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOnlineArchiveEventsCount() {
        return onlineArchiveEventsCount;
      }
  public void setOnlineArchiveEventsCount(Long onlineArchiveEventsCount) {
    this.onlineArchiveEventsCount = onlineArchiveEventsCount;
  }
  public UsageOnlineArchiveHour orgName(String orgName) {
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
  public UsageOnlineArchiveHour publicId(String publicId) {
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
   * Return true if this UsageOnlineArchiveHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageOnlineArchiveHour usageOnlineArchiveHour = (UsageOnlineArchiveHour) o;
    return Objects.equals(this.hour, usageOnlineArchiveHour.hour) && Objects.equals(this.onlineArchiveEventsCount, usageOnlineArchiveHour.onlineArchiveEventsCount) && Objects.equals(this.orgName, usageOnlineArchiveHour.orgName) && Objects.equals(this.publicId, usageOnlineArchiveHour.publicId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hour,onlineArchiveEventsCount,orgName,publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageOnlineArchiveHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    onlineArchiveEventsCount: ").append(toIndentedString(onlineArchiveEventsCount)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("}");
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

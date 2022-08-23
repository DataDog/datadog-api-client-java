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
   * <p>Cloud Workload Security usage for a given organization for a given hour.</p>
 */
@JsonPropertyOrder({
  UsageCWSHour.JSON_PROPERTY_CWS_CONTAINER_COUNT,
  UsageCWSHour.JSON_PROPERTY_CWS_HOST_COUNT,
  UsageCWSHour.JSON_PROPERTY_HOUR,
  UsageCWSHour.JSON_PROPERTY_ORG_NAME,
  UsageCWSHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCWSHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CWS_CONTAINER_COUNT = "cws_container_count";
  private Long cwsContainerCount;

  public static final String JSON_PROPERTY_CWS_HOST_COUNT = "cws_host_count";
  private Long cwsHostCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageCWSHour cwsContainerCount(Long cwsContainerCount) {
    this.cwsContainerCount = cwsContainerCount;
    return this;
  }

  /**
   * <p>The total number of Cloud Workload Security container hours from the start of the given hour’s month until the given hour.</p>
   * @return cwsContainerCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCwsContainerCount() {
        return cwsContainerCount;
      }
  public void setCwsContainerCount(Long cwsContainerCount) {
    this.cwsContainerCount = cwsContainerCount;
  }
  public UsageCWSHour cwsHostCount(Long cwsHostCount) {
    this.cwsHostCount = cwsHostCount;
    return this;
  }

  /**
   * <p>The total number of Cloud Workload Security host hours from the start of the given hour’s month until the given hour.</p>
   * @return cwsHostCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWS_HOST_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCwsHostCount() {
        return cwsHostCount;
      }
  public void setCwsHostCount(Long cwsHostCount) {
    this.cwsHostCount = cwsHostCount;
  }
  public UsageCWSHour hour(OffsetDateTime hour) {
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
  public UsageCWSHour orgName(String orgName) {
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
  public UsageCWSHour publicId(String publicId) {
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
   * Return true if this UsageCWSHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCWSHour usageCwsHour = (UsageCWSHour) o;
    return Objects.equals(this.cwsContainerCount, usageCwsHour.cwsContainerCount) && Objects.equals(this.cwsHostCount, usageCwsHour.cwsHostCount) && Objects.equals(this.hour, usageCwsHour.hour) && Objects.equals(this.orgName, usageCwsHour.orgName) && Objects.equals(this.publicId, usageCwsHour.publicId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cwsContainerCount,cwsHostCount,hour,orgName,publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCWSHour {\n");
    sb.append("    cwsContainerCount: ").append(toIndentedString(cwsContainerCount)).append("\n");
    sb.append("    cwsHostCount: ").append(toIndentedString(cwsHostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

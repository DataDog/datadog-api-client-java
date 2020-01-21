/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UsageLogsHour
 */
@JsonPropertyOrder({
  UsageLogsHour.JSON_PROPERTY_HOUR,
  UsageLogsHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT,
  UsageLogsHour.JSON_PROPERTY_INGESTED_EVENTS_BYTES
})

public class UsageLogsHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private Long indexedEventsCount;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES = "ingested_events_bytes";
  private Long ingestedEventsBytes;


  public UsageLogsHour hour(OffsetDateTime hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHour() {
    return hour;
  }


  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }


  public UsageLogsHour indexedEventsCount(Long indexedEventsCount) {
    
    this.indexedEventsCount = indexedEventsCount;
    return this;
  }

   /**
   * Contains the number of log events indexed.
   * @return indexedEventsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of log events indexed.")
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIndexedEventsCount() {
    return indexedEventsCount;
  }


  public void setIndexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
  }


  public UsageLogsHour ingestedEventsBytes(Long ingestedEventsBytes) {
    
    this.ingestedEventsBytes = ingestedEventsBytes;
    return this;
  }

   /**
   * Contains the number of log bytes ingested.
   * @return ingestedEventsBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of log bytes ingested.")
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIngestedEventsBytes() {
    return ingestedEventsBytes;
  }


  public void setIngestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLogsHour usageLogsHour = (UsageLogsHour) o;
    return Objects.equals(this.hour, usageLogsHour.hour) &&
        Objects.equals(this.indexedEventsCount, usageLogsHour.indexedEventsCount) &&
        Objects.equals(this.ingestedEventsBytes, usageLogsHour.ingestedEventsBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, indexedEventsCount, ingestedEventsBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLogsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexedEventsCount: ").append(toIndentedString(indexedEventsCount)).append("\n");
    sb.append("    ingestedEventsBytes: ").append(toIndentedString(ingestedEventsBytes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


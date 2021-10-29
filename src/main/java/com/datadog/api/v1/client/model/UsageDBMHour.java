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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * Database Monitoring usage for a given organization for a given hour.
 */
@ApiModel(description = "Database Monitoring usage for a given organization for a given hour.")
@JsonPropertyOrder({
  UsageDBMHour.JSON_PROPERTY_DBM_HOST_COUNT,
  UsageDBMHour.JSON_PROPERTY_DBM_QUERIES_COUNT,
  UsageDBMHour.JSON_PROPERTY_HOUR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UsageDBMHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DBM_HOST_COUNT = "dbm_host_count";
  private Long dbmHostCount;

  public static final String JSON_PROPERTY_DBM_QUERIES_COUNT = "dbm_queries_count";
  private Long dbmQueriesCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;


  public UsageDBMHour dbmHostCount(Long dbmHostCount) {
    this.dbmHostCount = dbmHostCount;
    return this;
  }

   /**
   * The total number of Database Monitoring host hours from the start of the given hour’s month until the given hour.
   * @return dbmHostCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of Database Monitoring host hours from the start of the given hour’s month until the given hour.")
  @JsonProperty(JSON_PROPERTY_DBM_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDbmHostCount() {
    return dbmHostCount;
  }


  public void setDbmHostCount(Long dbmHostCount) {
    this.dbmHostCount = dbmHostCount;
  }


  public UsageDBMHour dbmQueriesCount(Long dbmQueriesCount) {
    this.dbmQueriesCount = dbmQueriesCount;
    return this;
  }

   /**
   * The total number of normalized Database Monitoring queries from the start of the given hour’s month until the given hour.
   * @return dbmQueriesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of normalized Database Monitoring queries from the start of the given hour’s month until the given hour.")
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDbmQueriesCount() {
    return dbmQueriesCount;
  }


  public void setDbmQueriesCount(Long dbmQueriesCount) {
    this.dbmQueriesCount = dbmQueriesCount;
  }


  public UsageDBMHour hour(OffsetDateTime hour) {
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


  /**
   * Return true if this UsageDBMHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageDBMHour usageDBMHour = (UsageDBMHour) o;
    return Objects.equals(this.dbmHostCount, usageDBMHour.dbmHostCount) &&
        Objects.equals(this.dbmQueriesCount, usageDBMHour.dbmQueriesCount) &&
        Objects.equals(this.hour, usageDBMHour.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbmHostCount, dbmQueriesCount, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDBMHour {\n");
    sb.append("    dbmHostCount: ").append(toIndentedString(dbmHostCount)).append("\n");
    sb.append("    dbmQueriesCount: ").append(toIndentedString(dbmQueriesCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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


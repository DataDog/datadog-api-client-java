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
   * <p>Database Monitoring usage for a given organization for a given hour.</p>
 */
@JsonPropertyOrder({
  UsageDBMHour.JSON_PROPERTY_DBM_HOST_COUNT,
  UsageDBMHour.JSON_PROPERTY_DBM_QUERIES_COUNT,
  UsageDBMHour.JSON_PROPERTY_HOUR,
  UsageDBMHour.JSON_PROPERTY_ORG_NAME,
  UsageDBMHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageDBMHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DBM_HOST_COUNT = "dbm_host_count";
  private JsonNullable<Long> dbmHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_DBM_QUERIES_COUNT = "dbm_queries_count";
  private JsonNullable<Long> dbmQueriesCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageDBMHour dbmHostCount(Long dbmHostCount) {
    this.dbmHostCount = JsonNullable.<Long>of(dbmHostCount);
    return this;
  }

  /**
   * <p>The total number of Database Monitoring host hours from the start of the given hour’s month until the given hour.</p>
   * @return dbmHostCount
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getDbmHostCount() {
        return dbmHostCount.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DBM_HOST_COUNT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDbmHostCount_JsonNullable() {
    return dbmHostCount;
  }
  @JsonProperty(JSON_PROPERTY_DBM_HOST_COUNT)public void setDbmHostCount_JsonNullable(JsonNullable<Long> dbmHostCount) {
    this.dbmHostCount = dbmHostCount;
  }
  public void setDbmHostCount(Long dbmHostCount) {
    this.dbmHostCount = JsonNullable.<Long>of(dbmHostCount);
  }
  public UsageDBMHour dbmQueriesCount(Long dbmQueriesCount) {
    this.dbmQueriesCount = JsonNullable.<Long>of(dbmQueriesCount);
    return this;
  }

  /**
   * <p>The total number of normalized Database Monitoring queries from the start of the given hour’s month until the given hour.</p>
   * @return dbmQueriesCount
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getDbmQueriesCount() {
        return dbmQueriesCount.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_COUNT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDbmQueriesCount_JsonNullable() {
    return dbmQueriesCount;
  }
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_COUNT)public void setDbmQueriesCount_JsonNullable(JsonNullable<Long> dbmQueriesCount) {
    this.dbmQueriesCount = dbmQueriesCount;
  }
  public void setDbmQueriesCount(Long dbmQueriesCount) {
    this.dbmQueriesCount = JsonNullable.<Long>of(dbmQueriesCount);
  }
  public UsageDBMHour hour(OffsetDateTime hour) {
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
  public UsageDBMHour orgName(String orgName) {
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
  public UsageDBMHour publicId(String publicId) {
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
   * @return UsageDBMHour
   */
  @JsonAnySetter
  public UsageDBMHour putAdditionalProperty(String key, Object value) {
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
    UsageDBMHour usageDbmHour = (UsageDBMHour) o;
    return Objects.equals(this.dbmHostCount, usageDbmHour.dbmHostCount) && Objects.equals(this.dbmQueriesCount, usageDbmHour.dbmQueriesCount) && Objects.equals(this.hour, usageDbmHour.hour) && Objects.equals(this.orgName, usageDbmHour.orgName) && Objects.equals(this.publicId, usageDbmHour.publicId) && Objects.equals(this.additionalProperties, usageDbmHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dbmHostCount,dbmQueriesCount,hour,orgName,publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDBMHour {\n");
    sb.append("    dbmHostCount: ").append(toIndentedString(dbmHostCount)).append("\n");
    sb.append("    dbmQueriesCount: ").append(toIndentedString(dbmQueriesCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

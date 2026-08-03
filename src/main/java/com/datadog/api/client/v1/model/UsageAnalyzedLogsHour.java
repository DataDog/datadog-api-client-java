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
   * <p>The number of analyzed logs for each hour for a given organization.</p>
 */
@JsonPropertyOrder({
  UsageAnalyzedLogsHour.JSON_PROPERTY_ANALYZED_LOGS,
  UsageAnalyzedLogsHour.JSON_PROPERTY_HOUR,
  UsageAnalyzedLogsHour.JSON_PROPERTY_ORG_NAME,
  UsageAnalyzedLogsHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAnalyzedLogsHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYZED_LOGS = "analyzed_logs";
  private JsonNullable<Long> analyzedLogs = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageAnalyzedLogsHour analyzedLogs(Long analyzedLogs) {
    this.analyzedLogs = JsonNullable.<Long>of(analyzedLogs);
    return this;
  }

  /**
   * <p>Contains the number of analyzed logs.</p>
   * @return analyzedLogs
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getAnalyzedLogs() {
        return analyzedLogs.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ANALYZED_LOGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAnalyzedLogs_JsonNullable() {
    return analyzedLogs;
  }
  @JsonProperty(JSON_PROPERTY_ANALYZED_LOGS)public void setAnalyzedLogs_JsonNullable(JsonNullable<Long> analyzedLogs) {
    this.analyzedLogs = analyzedLogs;
  }
  public void setAnalyzedLogs(Long analyzedLogs) {
    this.analyzedLogs = JsonNullable.<Long>of(analyzedLogs);
  }
  public UsageAnalyzedLogsHour hour(OffsetDateTime hour) {
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
  public UsageAnalyzedLogsHour orgName(String orgName) {
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
  public UsageAnalyzedLogsHour publicId(String publicId) {
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
   * @return UsageAnalyzedLogsHour
   */
  @JsonAnySetter
  public UsageAnalyzedLogsHour putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageAnalyzedLogsHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalyzedLogsHour usageAnalyzedLogsHour = (UsageAnalyzedLogsHour) o;
    return Objects.equals(this.analyzedLogs, usageAnalyzedLogsHour.analyzedLogs) && Objects.equals(this.hour, usageAnalyzedLogsHour.hour) && Objects.equals(this.orgName, usageAnalyzedLogsHour.orgName) && Objects.equals(this.publicId, usageAnalyzedLogsHour.publicId) && Objects.equals(this.additionalProperties, usageAnalyzedLogsHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(analyzedLogs,hour,orgName,publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalyzedLogsHour {\n");
    sb.append("    analyzedLogs: ").append(toIndentedString(analyzedLogs)).append("\n");
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

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
   * <p>Ingested spans usage for a given organization for a given hour.</p>
 */
@JsonPropertyOrder({
  UsageIngestedSpansHour.JSON_PROPERTY_HOUR,
  UsageIngestedSpansHour.JSON_PROPERTY_INGESTED_EVENTS_BYTES,
  UsageIngestedSpansHour.JSON_PROPERTY_ORG_NAME,
  UsageIngestedSpansHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageIngestedSpansHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES = "ingested_events_bytes";
  private JsonNullable<Long> ingestedEventsBytes = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageIngestedSpansHour hour(OffsetDateTime hour) {
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
  public UsageIngestedSpansHour ingestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = JsonNullable.<Long>of(ingestedEventsBytes);
    return this;
  }

  /**
   * <p>Contains the total number of bytes ingested for APM spans during a given hour.</p>
   * @return ingestedEventsBytes
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getIngestedEventsBytes() {
        return ingestedEventsBytes.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getIngestedEventsBytes_JsonNullable() {
    return ingestedEventsBytes;
  }
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES)public void setIngestedEventsBytes_JsonNullable(JsonNullable<Long> ingestedEventsBytes) {
    this.ingestedEventsBytes = ingestedEventsBytes;
  }
  public void setIngestedEventsBytes(Long ingestedEventsBytes) {
    this.ingestedEventsBytes = JsonNullable.<Long>of(ingestedEventsBytes);
  }
  public UsageIngestedSpansHour orgName(String orgName) {
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
  public UsageIngestedSpansHour publicId(String publicId) {
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
   * @return UsageIngestedSpansHour
   */
  @JsonAnySetter
  public UsageIngestedSpansHour putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageIngestedSpansHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageIngestedSpansHour usageIngestedSpansHour = (UsageIngestedSpansHour) o;
    return Objects.equals(this.hour, usageIngestedSpansHour.hour) && Objects.equals(this.ingestedEventsBytes, usageIngestedSpansHour.ingestedEventsBytes) && Objects.equals(this.orgName, usageIngestedSpansHour.orgName) && Objects.equals(this.publicId, usageIngestedSpansHour.publicId) && Objects.equals(this.additionalProperties, usageIngestedSpansHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hour,ingestedEventsBytes,orgName,publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageIngestedSpansHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    ingestedEventsBytes: ").append(toIndentedString(ingestedEventsBytes)).append("\n");
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

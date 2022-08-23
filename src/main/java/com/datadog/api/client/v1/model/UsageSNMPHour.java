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
   * <p>The number of SNMP devices for each hour for a given organization.</p>
 */
@JsonPropertyOrder({
  UsageSNMPHour.JSON_PROPERTY_HOUR,
  UsageSNMPHour.JSON_PROPERTY_ORG_NAME,
  UsageSNMPHour.JSON_PROPERTY_PUBLIC_ID,
  UsageSNMPHour.JSON_PROPERTY_SNMP_DEVICES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSNMPHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_SNMP_DEVICES = "snmp_devices";
  private Long snmpDevices;

  public UsageSNMPHour hour(OffsetDateTime hour) {
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
  public UsageSNMPHour orgName(String orgName) {
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
  public UsageSNMPHour publicId(String publicId) {
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
  public UsageSNMPHour snmpDevices(Long snmpDevices) {
    this.snmpDevices = snmpDevices;
    return this;
  }

  /**
   * <p>Contains the number of SNMP devices.</p>
   * @return snmpDevices
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SNMP_DEVICES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSnmpDevices() {
        return snmpDevices;
      }
  public void setSnmpDevices(Long snmpDevices) {
    this.snmpDevices = snmpDevices;
  }

  /**
   * Return true if this UsageSNMPHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSNMPHour usageSnmpHour = (UsageSNMPHour) o;
    return Objects.equals(this.hour, usageSnmpHour.hour) && Objects.equals(this.orgName, usageSnmpHour.orgName) && Objects.equals(this.publicId, usageSnmpHour.publicId) && Objects.equals(this.snmpDevices, usageSnmpHour.snmpDevices);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hour,orgName,publicId,snmpDevices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSNMPHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    snmpDevices: ").append(toIndentedString(snmpDevices)).append("\n");
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

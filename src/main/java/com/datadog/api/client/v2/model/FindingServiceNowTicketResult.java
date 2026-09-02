/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Result of the ServiceNow ticket creation or attachment. */
@JsonPropertyOrder({
  FindingServiceNowTicketResult.JSON_PROPERTY_INSTANCE_NAME,
  FindingServiceNowTicketResult.JSON_PROPERTY_SYS_ID,
  FindingServiceNowTicketResult.JSON_PROPERTY_SYS_TARGET_LINK,
  FindingServiceNowTicketResult.JSON_PROPERTY_SYS_TARGET_SYS_ID,
  FindingServiceNowTicketResult.JSON_PROPERTY_TABLE_NAME,
  FindingServiceNowTicketResult.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingServiceNowTicketResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_NAME = "instance_name";
  private String instanceName;

  public static final String JSON_PROPERTY_SYS_ID = "sys_id";
  private String sysId;

  public static final String JSON_PROPERTY_SYS_TARGET_LINK = "sys_target_link";
  private String sysTargetLink;

  public static final String JSON_PROPERTY_SYS_TARGET_SYS_ID = "sys_target_sys_id";
  private String sysTargetSysId;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public FindingServiceNowTicketResult instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * ServiceNow instance name extracted from the ticket URL.
   *
   * @return instanceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public FindingServiceNowTicketResult sysId(String sysId) {
    this.sysId = sysId;
    return this;
  }

  /**
   * Unique identifier of the ServiceNow incident record.
   *
   * @return sysId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSysId() {
    return sysId;
  }

  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public FindingServiceNowTicketResult sysTargetLink(String sysTargetLink) {
    this.sysTargetLink = sysTargetLink;
    return this;
  }

  /**
   * Direct link to the ServiceNow incident record.
   *
   * @return sysTargetLink
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYS_TARGET_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSysTargetLink() {
    return sysTargetLink;
  }

  public void setSysTargetLink(String sysTargetLink) {
    this.sysTargetLink = sysTargetLink;
  }

  public FindingServiceNowTicketResult sysTargetSysId(String sysTargetSysId) {
    this.sysTargetSysId = sysTargetSysId;
    return this;
  }

  /**
   * Unique identifier of the target ServiceNow record.
   *
   * @return sysTargetSysId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYS_TARGET_SYS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSysTargetSysId() {
    return sysTargetSysId;
  }

  public void setSysTargetSysId(String sysTargetSysId) {
    this.sysTargetSysId = sysTargetSysId;
  }

  public FindingServiceNowTicketResult tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * ServiceNow table containing the incident record.
   *
   * @return tableName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public FindingServiceNowTicketResult url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the ServiceNow incident record.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return FindingServiceNowTicketResult
   */
  @JsonAnySetter
  public FindingServiceNowTicketResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FindingServiceNowTicketResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingServiceNowTicketResult findingServiceNowTicketResult = (FindingServiceNowTicketResult) o;
    return Objects.equals(this.instanceName, findingServiceNowTicketResult.instanceName)
        && Objects.equals(this.sysId, findingServiceNowTicketResult.sysId)
        && Objects.equals(this.sysTargetLink, findingServiceNowTicketResult.sysTargetLink)
        && Objects.equals(this.sysTargetSysId, findingServiceNowTicketResult.sysTargetSysId)
        && Objects.equals(this.tableName, findingServiceNowTicketResult.tableName)
        && Objects.equals(this.url, findingServiceNowTicketResult.url)
        && Objects.equals(
            this.additionalProperties, findingServiceNowTicketResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        instanceName, sysId, sysTargetLink, sysTargetSysId, tableName, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingServiceNowTicketResult {\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    sysId: ").append(toIndentedString(sysId)).append("\n");
    sb.append("    sysTargetLink: ").append(toIndentedString(sysTargetLink)).append("\n");
    sb.append("    sysTargetSysId: ").append(toIndentedString(sysTargetSysId)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

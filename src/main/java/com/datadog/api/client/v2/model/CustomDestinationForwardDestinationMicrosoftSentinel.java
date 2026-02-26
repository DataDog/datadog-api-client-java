/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The Microsoft Sentinel destination. */
@JsonPropertyOrder({
  CustomDestinationForwardDestinationMicrosoftSentinel.JSON_PROPERTY_CLIENT_ID,
  CustomDestinationForwardDestinationMicrosoftSentinel.JSON_PROPERTY_DATA_COLLECTION_ENDPOINT,
  CustomDestinationForwardDestinationMicrosoftSentinel.JSON_PROPERTY_DATA_COLLECTION_RULE_ID,
  CustomDestinationForwardDestinationMicrosoftSentinel.JSON_PROPERTY_STREAM_NAME,
  CustomDestinationForwardDestinationMicrosoftSentinel.JSON_PROPERTY_TENANT_ID,
  CustomDestinationForwardDestinationMicrosoftSentinel.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationForwardDestinationMicrosoftSentinel {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_DATA_COLLECTION_ENDPOINT = "data_collection_endpoint";
  private String dataCollectionEndpoint;

  public static final String JSON_PROPERTY_DATA_COLLECTION_RULE_ID = "data_collection_rule_id";
  private String dataCollectionRuleId;

  public static final String JSON_PROPERTY_STREAM_NAME = "stream_name";
  private String streamName;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationForwardDestinationMicrosoftSentinelType type =
      CustomDestinationForwardDestinationMicrosoftSentinelType.MICROSOFT_SENTINEL;

  public CustomDestinationForwardDestinationMicrosoftSentinel() {}

  @JsonCreator
  public CustomDestinationForwardDestinationMicrosoftSentinel(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_COLLECTION_ENDPOINT)
          String dataCollectionEndpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_COLLECTION_RULE_ID)
          String dataCollectionRuleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STREAM_NAME) String streamName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationForwardDestinationMicrosoftSentinelType type) {
    this.clientId = clientId;
    this.dataCollectionEndpoint = dataCollectionEndpoint;
    this.dataCollectionRuleId = dataCollectionRuleId;
    this.streamName = streamName;
    this.tenantId = tenantId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationForwardDestinationMicrosoftSentinel clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID from the Datadog Azure integration.
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CustomDestinationForwardDestinationMicrosoftSentinel dataCollectionEndpoint(
      String dataCollectionEndpoint) {
    this.dataCollectionEndpoint = dataCollectionEndpoint;
    return this;
  }

  /**
   * Azure data collection endpoint.
   *
   * @return dataCollectionEndpoint
   */
  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataCollectionEndpoint() {
    return dataCollectionEndpoint;
  }

  public void setDataCollectionEndpoint(String dataCollectionEndpoint) {
    this.dataCollectionEndpoint = dataCollectionEndpoint;
  }

  public CustomDestinationForwardDestinationMicrosoftSentinel dataCollectionRuleId(
      String dataCollectionRuleId) {
    this.dataCollectionRuleId = dataCollectionRuleId;
    return this;
  }

  /**
   * Azure data collection rule ID.
   *
   * @return dataCollectionRuleId
   */
  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataCollectionRuleId() {
    return dataCollectionRuleId;
  }

  public void setDataCollectionRuleId(String dataCollectionRuleId) {
    this.dataCollectionRuleId = dataCollectionRuleId;
  }

  public CustomDestinationForwardDestinationMicrosoftSentinel streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

  /**
   * Azure stream name.
   *
   * @return streamName
   */
  @JsonProperty(JSON_PROPERTY_STREAM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  public CustomDestinationForwardDestinationMicrosoftSentinel tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant ID from the Datadog Azure integration.
   *
   * @return tenantId
   */
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CustomDestinationForwardDestinationMicrosoftSentinel type(
      CustomDestinationForwardDestinationMicrosoftSentinelType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Microsoft Sentinel destination.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationForwardDestinationMicrosoftSentinelType getType() {
    return type;
  }

  public void setType(CustomDestinationForwardDestinationMicrosoftSentinelType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return CustomDestinationForwardDestinationMicrosoftSentinel
   */
  @JsonAnySetter
  public CustomDestinationForwardDestinationMicrosoftSentinel putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this CustomDestinationForwardDestinationMicrosoftSentinel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationForwardDestinationMicrosoftSentinel
        customDestinationForwardDestinationMicrosoftSentinel =
            (CustomDestinationForwardDestinationMicrosoftSentinel) o;
    return Objects.equals(
            this.clientId, customDestinationForwardDestinationMicrosoftSentinel.clientId)
        && Objects.equals(
            this.dataCollectionEndpoint,
            customDestinationForwardDestinationMicrosoftSentinel.dataCollectionEndpoint)
        && Objects.equals(
            this.dataCollectionRuleId,
            customDestinationForwardDestinationMicrosoftSentinel.dataCollectionRuleId)
        && Objects.equals(
            this.streamName, customDestinationForwardDestinationMicrosoftSentinel.streamName)
        && Objects.equals(
            this.tenantId, customDestinationForwardDestinationMicrosoftSentinel.tenantId)
        && Objects.equals(this.type, customDestinationForwardDestinationMicrosoftSentinel.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationForwardDestinationMicrosoftSentinel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientId,
        dataCollectionEndpoint,
        dataCollectionRuleId,
        streamName,
        tenantId,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationForwardDestinationMicrosoftSentinel {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    dataCollectionEndpoint: ")
        .append(toIndentedString(dataCollectionEndpoint))
        .append("\n");
    sb.append("    dataCollectionRuleId: ")
        .append(toIndentedString(dataCollectionRuleId))
        .append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

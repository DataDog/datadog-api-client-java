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

/** The EventBridge source to be deleted. */
@JsonPropertyOrder({
  AWSEventBridgeDeleteRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AWSEventBridgeDeleteRequestAttributes.JSON_PROPERTY_EVENT_GENERATOR_NAME,
  AWSEventBridgeDeleteRequestAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSEventBridgeDeleteRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_EVENT_GENERATOR_NAME = "event_generator_name";
  private String eventGeneratorName;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public AWSEventBridgeDeleteRequestAttributes() {}

  @JsonCreator
  public AWSEventBridgeDeleteRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_GENERATOR_NAME)
          String eventGeneratorName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region) {
    this.accountId = accountId;
    this.eventGeneratorName = eventGeneratorName;
    this.region = region;
  }

  public AWSEventBridgeDeleteRequestAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * AWS Account ID.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSEventBridgeDeleteRequestAttributes eventGeneratorName(String eventGeneratorName) {
    this.eventGeneratorName = eventGeneratorName;
    return this;
  }

  /**
   * The event source name.
   *
   * @return eventGeneratorName
   */
  @JsonProperty(JSON_PROPERTY_EVENT_GENERATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEventGeneratorName() {
    return eventGeneratorName;
  }

  public void setEventGeneratorName(String eventGeneratorName) {
    this.eventGeneratorName = eventGeneratorName;
  }

  public AWSEventBridgeDeleteRequestAttributes region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The event source's <a
   * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints">AWS
   * region</a>.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
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
   * @return AWSEventBridgeDeleteRequestAttributes
   */
  @JsonAnySetter
  public AWSEventBridgeDeleteRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSEventBridgeDeleteRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSEventBridgeDeleteRequestAttributes awsEventBridgeDeleteRequestAttributes =
        (AWSEventBridgeDeleteRequestAttributes) o;
    return Objects.equals(this.accountId, awsEventBridgeDeleteRequestAttributes.accountId)
        && Objects.equals(
            this.eventGeneratorName, awsEventBridgeDeleteRequestAttributes.eventGeneratorName)
        && Objects.equals(this.region, awsEventBridgeDeleteRequestAttributes.region)
        && Objects.equals(
            this.additionalProperties, awsEventBridgeDeleteRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, eventGeneratorName, region, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSEventBridgeDeleteRequestAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    eventGeneratorName: ").append(toIndentedString(eventGeneratorName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

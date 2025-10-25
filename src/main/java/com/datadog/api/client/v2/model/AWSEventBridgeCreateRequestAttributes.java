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

/** The EventBridge source to be created. */
@JsonPropertyOrder({
  AWSEventBridgeCreateRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AWSEventBridgeCreateRequestAttributes.JSON_PROPERTY_CREATE_EVENT_BUS,
  AWSEventBridgeCreateRequestAttributes.JSON_PROPERTY_EVENT_GENERATOR_NAME,
  AWSEventBridgeCreateRequestAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSEventBridgeCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CREATE_EVENT_BUS = "create_event_bus";
  private Boolean createEventBus;

  public static final String JSON_PROPERTY_EVENT_GENERATOR_NAME = "event_generator_name";
  private String eventGeneratorName;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public AWSEventBridgeCreateRequestAttributes() {}

  @JsonCreator
  public AWSEventBridgeCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_GENERATOR_NAME)
          String eventGeneratorName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region) {
    this.accountId = accountId;
    this.eventGeneratorName = eventGeneratorName;
    this.region = region;
  }

  public AWSEventBridgeCreateRequestAttributes accountId(String accountId) {
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

  public AWSEventBridgeCreateRequestAttributes createEventBus(Boolean createEventBus) {
    this.createEventBus = createEventBus;
    return this;
  }

  /**
   * Set to true if Datadog should create the event bus in addition to the event source. Requires
   * the <code>events:CreateEventBus</code> permission.
   *
   * @return createEventBus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_EVENT_BUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCreateEventBus() {
    return createEventBus;
  }

  public void setCreateEventBus(Boolean createEventBus) {
    this.createEventBus = createEventBus;
  }

  public AWSEventBridgeCreateRequestAttributes eventGeneratorName(String eventGeneratorName) {
    this.eventGeneratorName = eventGeneratorName;
    return this;
  }

  /**
   * The given part of the event source name, which is then combined with an assigned suffix to form
   * the full name.
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

  public AWSEventBridgeCreateRequestAttributes region(String region) {
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
   * @return AWSEventBridgeCreateRequestAttributes
   */
  @JsonAnySetter
  public AWSEventBridgeCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSEventBridgeCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSEventBridgeCreateRequestAttributes awsEventBridgeCreateRequestAttributes =
        (AWSEventBridgeCreateRequestAttributes) o;
    return Objects.equals(this.accountId, awsEventBridgeCreateRequestAttributes.accountId)
        && Objects.equals(this.createEventBus, awsEventBridgeCreateRequestAttributes.createEventBus)
        && Objects.equals(
            this.eventGeneratorName, awsEventBridgeCreateRequestAttributes.eventGeneratorName)
        && Objects.equals(this.region, awsEventBridgeCreateRequestAttributes.region)
        && Objects.equals(
            this.additionalProperties, awsEventBridgeCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, createEventBus, eventGeneratorName, region, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSEventBridgeCreateRequestAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createEventBus: ").append(toIndentedString(createEventBus)).append("\n");
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

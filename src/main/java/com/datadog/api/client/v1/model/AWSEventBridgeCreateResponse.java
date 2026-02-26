/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A created EventBridge source. */
@JsonPropertyOrder({
  AWSEventBridgeCreateResponse.JSON_PROPERTY_EVENT_SOURCE_NAME,
  AWSEventBridgeCreateResponse.JSON_PROPERTY_HAS_BUS,
  AWSEventBridgeCreateResponse.JSON_PROPERTY_REGION,
  AWSEventBridgeCreateResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSEventBridgeCreateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_SOURCE_NAME = "event_source_name";
  private String eventSourceName;

  public static final String JSON_PROPERTY_HAS_BUS = "has_bus";
  private Boolean hasBus;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AWSEventBridgeCreateStatus status;

  public AWSEventBridgeCreateResponse eventSourceName(String eventSourceName) {
    this.eventSourceName = eventSourceName;
    return this;
  }

  /**
   * The event source name.
   *
   * @return eventSourceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventSourceName() {
    return eventSourceName;
  }

  public void setEventSourceName(String eventSourceName) {
    this.eventSourceName = eventSourceName;
  }

  public AWSEventBridgeCreateResponse hasBus(Boolean hasBus) {
    this.hasBus = hasBus;
    return this;
  }

  /**
   * True if the event bus was created in addition to the source.
   *
   * @return hasBus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_BUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasBus() {
    return hasBus;
  }

  public void setHasBus(Boolean hasBus) {
    this.hasBus = hasBus;
  }

  public AWSEventBridgeCreateResponse region(String region) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public AWSEventBridgeCreateResponse status(AWSEventBridgeCreateStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The event source status "created".
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSEventBridgeCreateStatus getStatus() {
    return status;
  }

  public void setStatus(AWSEventBridgeCreateStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return AWSEventBridgeCreateResponse
   */
  @JsonAnySetter
  public AWSEventBridgeCreateResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSEventBridgeCreateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSEventBridgeCreateResponse awsEventBridgeCreateResponse = (AWSEventBridgeCreateResponse) o;
    return Objects.equals(this.eventSourceName, awsEventBridgeCreateResponse.eventSourceName)
        && Objects.equals(this.hasBus, awsEventBridgeCreateResponse.hasBus)
        && Objects.equals(this.region, awsEventBridgeCreateResponse.region)
        && Objects.equals(this.status, awsEventBridgeCreateResponse.status)
        && Objects.equals(
            this.additionalProperties, awsEventBridgeCreateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSourceName, hasBus, region, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSEventBridgeCreateResponse {\n");
    sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
    sb.append("    hasBus: ").append(toIndentedString(hasBus)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

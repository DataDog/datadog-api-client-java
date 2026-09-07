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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The attributes describing a sample log generation subscription. */
@JsonPropertyOrder({
  SampleLogGenerationSubscriptionAttributes.JSON_PROPERTY_CONTENT_PACK_ID,
  SampleLogGenerationSubscriptionAttributes.JSON_PROPERTY_CREATED_AT,
  SampleLogGenerationSubscriptionAttributes.JSON_PROPERTY_EXPIRES_AT,
  SampleLogGenerationSubscriptionAttributes.JSON_PROPERTY_IS_ACTIVE,
  SampleLogGenerationSubscriptionAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SampleLogGenerationSubscriptionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT_PACK_ID = "content_pack_id";
  private String contentPackId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private OffsetDateTime expiresAt;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SampleLogGenerationSubscriptionStatus status;

  public SampleLogGenerationSubscriptionAttributes() {}

  @JsonCreator
  public SampleLogGenerationSubscriptionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_PACK_ID) String contentPackId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPIRES_AT) OffsetDateTime expiresAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ACTIVE) Boolean isActive,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SampleLogGenerationSubscriptionStatus status) {
    this.contentPackId = contentPackId;
    this.createdAt = createdAt;
    this.expiresAt = expiresAt;
    this.isActive = isActive;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public SampleLogGenerationSubscriptionAttributes contentPackId(String contentPackId) {
    this.contentPackId = contentPackId;
    return this;
  }

  /**
   * The identifier of the Cloud SIEM content pack the subscription targets.
   *
   * @return contentPackId
   */
  @JsonProperty(JSON_PROPERTY_CONTENT_PACK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContentPackId() {
    return contentPackId;
  }

  public void setContentPackId(String contentPackId) {
    this.contentPackId = contentPackId;
  }

  public SampleLogGenerationSubscriptionAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the subscription was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SampleLogGenerationSubscriptionAttributes expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The time at which the subscription expires and stops generating logs.
   *
   * @return expiresAt
   */
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public SampleLogGenerationSubscriptionAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the subscription is currently active and generating logs.
   *
   * @return isActive
   */
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SampleLogGenerationSubscriptionAttributes status(
      SampleLogGenerationSubscriptionStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the subscription.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SampleLogGenerationSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(SampleLogGenerationSubscriptionStatus status) {
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
   * @return SampleLogGenerationSubscriptionAttributes
   */
  @JsonAnySetter
  public SampleLogGenerationSubscriptionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SampleLogGenerationSubscriptionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampleLogGenerationSubscriptionAttributes sampleLogGenerationSubscriptionAttributes =
        (SampleLogGenerationSubscriptionAttributes) o;
    return Objects.equals(
            this.contentPackId, sampleLogGenerationSubscriptionAttributes.contentPackId)
        && Objects.equals(this.createdAt, sampleLogGenerationSubscriptionAttributes.createdAt)
        && Objects.equals(this.expiresAt, sampleLogGenerationSubscriptionAttributes.expiresAt)
        && Objects.equals(this.isActive, sampleLogGenerationSubscriptionAttributes.isActive)
        && Objects.equals(this.status, sampleLogGenerationSubscriptionAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            sampleLogGenerationSubscriptionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        contentPackId, createdAt, expiresAt, isActive, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleLogGenerationSubscriptionAttributes {\n");
    sb.append("    contentPackId: ").append(toIndentedString(contentPackId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

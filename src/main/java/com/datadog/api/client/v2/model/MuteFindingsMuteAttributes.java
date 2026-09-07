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

/** Mute properties to apply to the findings. */
@JsonPropertyOrder({
  MuteFindingsMuteAttributes.JSON_PROPERTY_DESCRIPTION,
  MuteFindingsMuteAttributes.JSON_PROPERTY_EXPIRE_AT,
  MuteFindingsMuteAttributes.JSON_PROPERTY_IS_MUTED,
  MuteFindingsMuteAttributes.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MuteFindingsMuteAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPIRE_AT = "expire_at";
  private Long expireAt;

  public static final String JSON_PROPERTY_IS_MUTED = "is_muted";
  private Boolean isMuted;

  public static final String JSON_PROPERTY_REASON = "reason";
  private MuteFindingsReason reason;

  public MuteFindingsMuteAttributes() {}

  @JsonCreator
  public MuteFindingsMuteAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_MUTED) Boolean isMuted,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON) MuteFindingsReason reason) {
    this.isMuted = isMuted;
    this.reason = reason;
    this.unparsed |= !reason.isValid();
  }

  public MuteFindingsMuteAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Additional information about the reason why the findings are muted or unmuted. This field has a
   * limit of 280 characters.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MuteFindingsMuteAttributes expireAt(Long expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  /**
   * The expiration date of the mute action (Unix ms). It must be set to a value greater than the
   * current timestamp. If this field is not provided, the findings remain muted indefinitely.
   *
   * @return expireAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(Long expireAt) {
    this.expireAt = expireAt;
  }

  public MuteFindingsMuteAttributes isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

  /**
   * Whether the findings should be muted or unmuted.
   *
   * @return isMuted
   */
  @JsonProperty(JSON_PROPERTY_IS_MUTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMuted() {
    return isMuted;
  }

  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

  public MuteFindingsMuteAttributes reason(MuteFindingsReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * The reason why the findings are muted or unmuted.
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MuteFindingsReason getReason() {
    return reason;
  }

  public void setReason(MuteFindingsReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
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
   * @return MuteFindingsMuteAttributes
   */
  @JsonAnySetter
  public MuteFindingsMuteAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MuteFindingsMuteAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuteFindingsMuteAttributes muteFindingsMuteAttributes = (MuteFindingsMuteAttributes) o;
    return Objects.equals(this.description, muteFindingsMuteAttributes.description)
        && Objects.equals(this.expireAt, muteFindingsMuteAttributes.expireAt)
        && Objects.equals(this.isMuted, muteFindingsMuteAttributes.isMuted)
        && Objects.equals(this.reason, muteFindingsMuteAttributes.reason)
        && Objects.equals(
            this.additionalProperties, muteFindingsMuteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expireAt, isMuted, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuteFindingsMuteAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

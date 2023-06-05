/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Information about the mute status of this finding. */
@JsonPropertyOrder({
  MuteFindingResponseProperties.JSON_PROPERTY_DESCRIPTION,
  MuteFindingResponseProperties.JSON_PROPERTY_EXPIRATION_DATE,
  MuteFindingResponseProperties.JSON_PROPERTY_MUTED,
  MuteFindingResponseProperties.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MuteFindingResponseProperties {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private Long expirationDate;

  public static final String JSON_PROPERTY_MUTED = "muted";
  private Boolean muted;

  public static final String JSON_PROPERTY_REASON = "reason";
  private FindingMuteReason reason;

  public MuteFindingResponseProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Additional information about the reason why this finding is muted or unmuted. This attribute
   * will not be included in the response if the description is not provided in the request body.
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

  public MuteFindingResponseProperties expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The expiration date of the mute or unmute action. If the expiration date is not provided in the
   * request body, this attribute will not be included in the response and the finding will be muted
   * or unmuted indefinitely.
   *
   * @return expirationDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public MuteFindingResponseProperties muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Whether this finding is muted or unmuted.
   *
   * @return muted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public MuteFindingResponseProperties reason(FindingMuteReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * The reason why this finding is muted or unmuted.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FindingMuteReason getReason() {
    return reason;
  }

  public void setReason(FindingMuteReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
  }

  /** Return true if this MuteFindingResponseProperties object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuteFindingResponseProperties muteFindingResponseProperties = (MuteFindingResponseProperties) o;
    return Objects.equals(this.description, muteFindingResponseProperties.description)
        && Objects.equals(this.expirationDate, muteFindingResponseProperties.expirationDate)
        && Objects.equals(this.muted, muteFindingResponseProperties.muted)
        && Objects.equals(this.reason, muteFindingResponseProperties.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expirationDate, muted, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuteFindingResponseProperties {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
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

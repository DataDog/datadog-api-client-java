/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object containing the new mute properties of the findings. */
@JsonPropertyOrder({
  BulkMuteFindingsRequestProperties.JSON_PROPERTY_DESCRIPTION,
  BulkMuteFindingsRequestProperties.JSON_PROPERTY_EXPIRATION_DATE,
  BulkMuteFindingsRequestProperties.JSON_PROPERTY_MUTED,
  BulkMuteFindingsRequestProperties.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BulkMuteFindingsRequestProperties {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private Long expirationDate;

  public static final String JSON_PROPERTY_MUTED = "muted";
  private Boolean muted;

  public static final String JSON_PROPERTY_REASON = "reason";
  private FindingMuteReason reason;

  public BulkMuteFindingsRequestProperties() {}

  @JsonCreator
  public BulkMuteFindingsRequestProperties(
      @JsonProperty(required = true, value = JSON_PROPERTY_MUTED) Boolean muted,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON) FindingMuteReason reason) {
    this.muted = muted;
    this.reason = reason;
    this.unparsed |= !reason.isValid();
  }

  public BulkMuteFindingsRequestProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Additional information about the reason why those findings are muted or unmuted. This field has
   * a maximum limit of 280 characters.
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

  public BulkMuteFindingsRequestProperties expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The expiration date of the mute or unmute action (Unix ms). It must be set to a value greater
   * than the current timestamp. If this field is not provided, the finding will be muted or unmuted
   * indefinitely, which is equivalent to setting the expiration date to 9999999999999.
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

  public BulkMuteFindingsRequestProperties muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Whether those findings should be muted or unmuted.
   *
   * @return muted
   */
  @JsonProperty(JSON_PROPERTY_MUTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public BulkMuteFindingsRequestProperties reason(FindingMuteReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * The reason why this finding is muted or unmuted.
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FindingMuteReason getReason() {
    return reason;
  }

  public void setReason(FindingMuteReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
  }

  /** Return true if this BulkMuteFindingsRequestProperties object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkMuteFindingsRequestProperties bulkMuteFindingsRequestProperties =
        (BulkMuteFindingsRequestProperties) o;
    return Objects.equals(this.description, bulkMuteFindingsRequestProperties.description)
        && Objects.equals(this.expirationDate, bulkMuteFindingsRequestProperties.expirationDate)
        && Objects.equals(this.muted, bulkMuteFindingsRequestProperties.muted)
        && Objects.equals(this.reason, bulkMuteFindingsRequestProperties.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expirationDate, muted, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkMuteFindingsRequestProperties {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

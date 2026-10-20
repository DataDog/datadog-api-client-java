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
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Immutable terms and justification for a temporary grant request. */
@JsonPropertyOrder({
  TemporaryGrantRequestCreateAttributes.JSON_PROPERTY_EXPIRES_AT,
  TemporaryGrantRequestCreateAttributes.JSON_PROPERTY_JUSTIFICATION,
  TemporaryGrantRequestCreateAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TemporaryGrantRequestCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_JUSTIFICATION = "justification";
  private String justification;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public TemporaryGrantRequestCreateAttributes() {}

  @JsonCreator
  public TemporaryGrantRequestCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_JUSTIFICATION) String justification,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.justification = justification;
    this.total = total;
  }

  public TemporaryGrantRequestCreateAttributes expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = JsonNullable.<OffsetDateTime>of(expiresAt);
    return this;
  }

  /**
   * Exclusive expiry. Must be a future timestamp with a timezone; date-only values are rejected.
   * Omitted or null defaults to the next UTC month boundary. Approval accepts this deadline
   * unchanged.
   *
   * @return expiresAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getExpiresAt() {
    return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getExpiresAt_JsonNullable() {
    return expiresAt;
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  public void setExpiresAt_JsonNullable(JsonNullable<OffsetDateTime> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = JsonNullable.<OffsetDateTime>of(expiresAt);
  }

  public TemporaryGrantRequestCreateAttributes justification(String justification) {
    this.justification = justification;
    return this;
  }

  /**
   * Reason for requesting temporary credits. Trimmed and limited to 4096 UTF-8 bytes.
   *
   * @return justification
   */
  @JsonProperty(JSON_PROPERTY_JUSTIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }

  public TemporaryGrantRequestCreateAttributes total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Target monthly AI-credit limit in positive whole credits, not additional credits. Fractional
   * credits are not accepted. minimum: 1 maximum: 9223372036854
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  /** Return true if this TemporaryGrantRequestCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporaryGrantRequestCreateAttributes temporaryGrantRequestCreateAttributes =
        (TemporaryGrantRequestCreateAttributes) o;
    return Objects.equals(this.expiresAt, temporaryGrantRequestCreateAttributes.expiresAt)
        && Objects.equals(this.justification, temporaryGrantRequestCreateAttributes.justification)
        && Objects.equals(this.total, temporaryGrantRequestCreateAttributes.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, justification, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporaryGrantRequestCreateAttributes {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

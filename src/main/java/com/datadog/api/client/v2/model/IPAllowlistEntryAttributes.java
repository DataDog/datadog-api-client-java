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
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of the IP allowlist entry. */
@JsonPropertyOrder({
  IPAllowlistEntryAttributes.JSON_PROPERTY_CIDR_BLOCK,
  IPAllowlistEntryAttributes.JSON_PROPERTY_CREATED_AT,
  IPAllowlistEntryAttributes.JSON_PROPERTY_MODIFIED_AT,
  IPAllowlistEntryAttributes.JSON_PROPERTY_NOTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IPAllowlistEntryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CIDR_BLOCK = "cidr_block";
  private String cidrBlock;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NOTE = "note";
  private String note;

  public IPAllowlistEntryAttributes cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

  /**
   * The CIDR block describing the IP range of the entry.
   *
   * @return cidrBlock
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CIDR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  /**
   * Creation time of the entry.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Time of last entry modification.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public IPAllowlistEntryAttributes note(String note) {
    this.note = note;
    return this;
  }

  /**
   * A note describing the IP allowlist entry.
   *
   * @return note
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /** Return true if this IPAllowlistEntryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAllowlistEntryAttributes ipAllowlistEntryAttributes = (IPAllowlistEntryAttributes) o;
    return Objects.equals(this.cidrBlock, ipAllowlistEntryAttributes.cidrBlock)
        && Objects.equals(this.createdAt, ipAllowlistEntryAttributes.createdAt)
        && Objects.equals(this.modifiedAt, ipAllowlistEntryAttributes.modifiedAt)
        && Objects.equals(this.note, ipAllowlistEntryAttributes.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, createdAt, modifiedAt, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAllowlistEntryAttributes {\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

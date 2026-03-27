/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes of the IP allowlist entry.</p>
 */
@JsonPropertyOrder({
  IPAllowlistEntryAttributes.JSON_PROPERTY_CIDR_BLOCK,
  IPAllowlistEntryAttributes.JSON_PROPERTY_CREATED_AT,
  IPAllowlistEntryAttributes.JSON_PROPERTY_MODIFIED_AT,
  IPAllowlistEntryAttributes.JSON_PROPERTY_NOTE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IPAllowlistEntryAttributes {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>The CIDR block describing the IP range of the entry.</p>
   * @return cidrBlock
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CIDR_BLOCK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCidrBlock() {
        return cidrBlock;
      }
  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  /**
   * <p>Creation time of the entry.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>Time of last entry modification.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public IPAllowlistEntryAttributes note(String note) {
    this.note = note;
    return this;
  }

  /**
   * <p>A note describing the IP allowlist entry.</p>
   * @return note
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNote() {
        return note;
      }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IPAllowlistEntryAttributes
   */
  @JsonAnySetter
  public IPAllowlistEntryAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IPAllowlistEntryAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAllowlistEntryAttributes ipAllowlistEntryAttributes = (IPAllowlistEntryAttributes) o;
    return Objects.equals(this.cidrBlock, ipAllowlistEntryAttributes.cidrBlock) && Objects.equals(this.createdAt, ipAllowlistEntryAttributes.createdAt) && Objects.equals(this.modifiedAt, ipAllowlistEntryAttributes.modifiedAt) && Objects.equals(this.note, ipAllowlistEntryAttributes.note) && Objects.equals(this.additionalProperties, ipAllowlistEntryAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock,createdAt,modifiedAt,note, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAllowlistEntryAttributes {\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

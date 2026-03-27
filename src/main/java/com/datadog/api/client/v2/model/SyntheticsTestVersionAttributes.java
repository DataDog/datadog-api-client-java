/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a specific Synthetic test version. */
@JsonPropertyOrder({
  SyntheticsTestVersionAttributes.JSON_PROPERTY_AUTHOR,
  SyntheticsTestVersionAttributes.JSON_PROPERTY_CHANGE_METADATA,
  SyntheticsTestVersionAttributes.JSON_PROPERTY_PAYLOAD,
  SyntheticsTestVersionAttributes.JSON_PROPERTY_VERSION_PAYLOAD_CREATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestVersionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private SyntheticsTestVersionAuthor author;

  public static final String JSON_PROPERTY_CHANGE_METADATA = "change_metadata";
  private List<SyntheticsTestVersionChangeMetadataItem> changeMetadata = null;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Map<String, Object> payload = null;

  public static final String JSON_PROPERTY_VERSION_PAYLOAD_CREATED_AT =
      "version_payload_created_at";
  private OffsetDateTime versionPayloadCreatedAt;

  public SyntheticsTestVersionAttributes author(SyntheticsTestVersionAuthor author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * Object describing the author of a test version.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestVersionAuthor getAuthor() {
    return author;
  }

  public void setAuthor(SyntheticsTestVersionAuthor author) {
    this.author = author;
  }

  public SyntheticsTestVersionAttributes changeMetadata(
      List<SyntheticsTestVersionChangeMetadataItem> changeMetadata) {
    this.changeMetadata = changeMetadata;
    for (SyntheticsTestVersionChangeMetadataItem item : changeMetadata) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestVersionAttributes addChangeMetadataItem(
      SyntheticsTestVersionChangeMetadataItem changeMetadataItem) {
    if (this.changeMetadata == null) {
      this.changeMetadata = new ArrayList<>();
    }
    this.changeMetadata.add(changeMetadataItem);
    this.unparsed |= changeMetadataItem.unparsed;
    return this;
  }

  /**
   * List of metadata describing individual changes in this version. Only returned when the <code>
   * include_change_metadata</code> query parameter is <code>true</code>.
   *
   * @return changeMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestVersionChangeMetadataItem> getChangeMetadata() {
    return changeMetadata;
  }

  public void setChangeMetadata(List<SyntheticsTestVersionChangeMetadataItem> changeMetadata) {
    this.changeMetadata = changeMetadata;
  }

  public SyntheticsTestVersionAttributes payload(Map<String, Object> payload) {
    this.payload = payload;
    return this;
  }

  public SyntheticsTestVersionAttributes putPayloadItem(String key, Object payloadItem) {
    if (this.payload == null) {
      this.payload = new HashMap<>();
    }
    this.payload.put(key, payloadItem);
    return this;
  }

  /**
   * The full test configuration at this version.
   *
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getPayload() {
    return payload;
  }

  public void setPayload(Map<String, Object> payload) {
    this.payload = payload;
  }

  public SyntheticsTestVersionAttributes versionPayloadCreatedAt(
      OffsetDateTime versionPayloadCreatedAt) {
    this.versionPayloadCreatedAt = versionPayloadCreatedAt;
    return this;
  }

  /**
   * Timestamp of when this version was created.
   *
   * @return versionPayloadCreatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_PAYLOAD_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getVersionPayloadCreatedAt() {
    return versionPayloadCreatedAt;
  }

  public void setVersionPayloadCreatedAt(OffsetDateTime versionPayloadCreatedAt) {
    this.versionPayloadCreatedAt = versionPayloadCreatedAt;
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
   * @return SyntheticsTestVersionAttributes
   */
  @JsonAnySetter
  public SyntheticsTestVersionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestVersionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestVersionAttributes syntheticsTestVersionAttributes =
        (SyntheticsTestVersionAttributes) o;
    return Objects.equals(this.author, syntheticsTestVersionAttributes.author)
        && Objects.equals(this.changeMetadata, syntheticsTestVersionAttributes.changeMetadata)
        && Objects.equals(this.payload, syntheticsTestVersionAttributes.payload)
        && Objects.equals(
            this.versionPayloadCreatedAt, syntheticsTestVersionAttributes.versionPayloadCreatedAt)
        && Objects.equals(
            this.additionalProperties, syntheticsTestVersionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author, changeMetadata, payload, versionPayloadCreatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestVersionAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    changeMetadata: ").append(toIndentedString(changeMetadata)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    versionPayloadCreatedAt: ")
        .append(toIndentedString(versionPayloadCreatedAt))
        .append("\n");
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

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
   * <p>The attachment's attributes.</p>
 */
@JsonPropertyOrder({
  AttachmentDataAttributes.JSON_PROPERTY_ATTACHMENT,
  AttachmentDataAttributes.JSON_PROPERTY_ATTACHMENT_TYPE,
  AttachmentDataAttributes.JSON_PROPERTY_MODIFIED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AttachmentDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTACHMENT = "attachment";
  private AttachmentDataAttributesAttachment attachment;

  public static final String JSON_PROPERTY_ATTACHMENT_TYPE = "attachment_type";
  private AttachmentDataAttributesAttachmentType attachmentType;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public AttachmentDataAttributes attachment(AttachmentDataAttributesAttachment attachment) {
    this.attachment = attachment;
    this.unparsed |= attachment.unparsed;
    return this;
  }

  /**
   * <p>The attachment object.</p>
   * @return attachment
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTACHMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AttachmentDataAttributesAttachment getAttachment() {
        return attachment;
      }
  public void setAttachment(AttachmentDataAttributesAttachment attachment) {
    this.attachment = attachment;
  }
  public AttachmentDataAttributes attachmentType(AttachmentDataAttributesAttachmentType attachmentType) {
    this.attachmentType = attachmentType;
    this.unparsed |= !attachmentType.isValid();
    return this;
  }

  /**
   * <p>The type of the attachment.</p>
   * @return attachmentType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTACHMENT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AttachmentDataAttributesAttachmentType getAttachmentType() {
        return attachmentType;
      }
  public void setAttachmentType(AttachmentDataAttributesAttachmentType attachmentType) {
    if (!attachmentType.isValid()) {
        this.unparsed = true;
    }
    this.attachmentType = attachmentType;
  }
  public AttachmentDataAttributes modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>Timestamp when the attachment was last modified.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModified() {
        return modified;
      }
  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
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
   * @return AttachmentDataAttributes
   */
  @JsonAnySetter
  public AttachmentDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AttachmentDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentDataAttributes attachmentDataAttributes = (AttachmentDataAttributes) o;
    return Objects.equals(this.attachment, attachmentDataAttributes.attachment) && Objects.equals(this.attachmentType, attachmentDataAttributes.attachmentType) && Objects.equals(this.modified, attachmentDataAttributes.modified) && Objects.equals(this.additionalProperties, attachmentDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attachment,attachmentType,modified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentDataAttributes {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

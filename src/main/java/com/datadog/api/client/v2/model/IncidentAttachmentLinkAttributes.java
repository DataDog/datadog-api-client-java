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

/** The attributes object for a link attachment. */
@JsonPropertyOrder({
  IncidentAttachmentLinkAttributes.JSON_PROPERTY_ATTACHMENT,
  IncidentAttachmentLinkAttributes.JSON_PROPERTY_ATTACHMENT_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAttachmentLinkAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTACHMENT = "attachment";
  private IncidentAttachmentLinkAttributesAttachmentObject attachment;

  public static final String JSON_PROPERTY_ATTACHMENT_TYPE = "attachment_type";
  private IncidentAttachmentLinkAttachmentType attachmentType =
      IncidentAttachmentLinkAttachmentType.LINK;

  public IncidentAttachmentLinkAttributes() {}

  @JsonCreator
  public IncidentAttachmentLinkAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTACHMENT)
          IncidentAttachmentLinkAttributesAttachmentObject attachment,
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTACHMENT_TYPE)
          IncidentAttachmentLinkAttachmentType attachmentType) {
    this.attachment = attachment;
    this.unparsed |= attachment.unparsed;
    this.attachmentType = attachmentType;
    this.unparsed |= !attachmentType.isValid();
  }

  public IncidentAttachmentLinkAttributes attachment(
      IncidentAttachmentLinkAttributesAttachmentObject attachment) {
    this.attachment = attachment;
    this.unparsed |= attachment.unparsed;
    return this;
  }

  /**
   * The link attachment.
   *
   * @return attachment
   */
  @JsonProperty(JSON_PROPERTY_ATTACHMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentAttachmentLinkAttributesAttachmentObject getAttachment() {
    return attachment;
  }

  public void setAttachment(IncidentAttachmentLinkAttributesAttachmentObject attachment) {
    this.attachment = attachment;
  }

  public IncidentAttachmentLinkAttributes attachmentType(
      IncidentAttachmentLinkAttachmentType attachmentType) {
    this.attachmentType = attachmentType;
    this.unparsed |= !attachmentType.isValid();
    return this;
  }

  /**
   * The type of link attachment attributes.
   *
   * @return attachmentType
   */
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentAttachmentLinkAttachmentType getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(IncidentAttachmentLinkAttachmentType attachmentType) {
    if (!attachmentType.isValid()) {
      this.unparsed = true;
    }
    this.attachmentType = attachmentType;
  }

  /** Return true if this IncidentAttachmentLinkAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAttachmentLinkAttributes incidentAttachmentLinkAttributes =
        (IncidentAttachmentLinkAttributes) o;
    return Objects.equals(this.attachment, incidentAttachmentLinkAttributes.attachment)
        && Objects.equals(this.attachmentType, incidentAttachmentLinkAttributes.attachmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, attachmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAttachmentLinkAttributes {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

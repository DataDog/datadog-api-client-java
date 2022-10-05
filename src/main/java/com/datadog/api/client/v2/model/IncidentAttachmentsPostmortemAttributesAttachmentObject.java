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

/** The postmortem attachment. */
@JsonPropertyOrder({
  IncidentAttachmentsPostmortemAttributesAttachmentObject.JSON_PROPERTY_DOCUMENT_URL,
  IncidentAttachmentsPostmortemAttributesAttachmentObject.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAttachmentsPostmortemAttributesAttachmentObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOCUMENT_URL = "documentUrl";
  private String documentUrl;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentAttachmentsPostmortemAttributesAttachmentObject() {}

  @JsonCreator
  public IncidentAttachmentsPostmortemAttributesAttachmentObject(
      @JsonProperty(required = true, value = JSON_PROPERTY_DOCUMENT_URL) String documentUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.documentUrl = documentUrl;
    this.title = title;
  }

  public IncidentAttachmentsPostmortemAttributesAttachmentObject documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  /**
   * The URL of this notebook attachment.
   *
   * @return documentUrl
   */
  @JsonProperty(JSON_PROPERTY_DOCUMENT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public IncidentAttachmentsPostmortemAttributesAttachmentObject title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of this postmortem attachment.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Return true if this IncidentAttachmentsPostmortemAttributesAttachmentObject object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAttachmentsPostmortemAttributesAttachmentObject
        incidentAttachmentsPostmortemAttributesAttachmentObject =
            (IncidentAttachmentsPostmortemAttributesAttachmentObject) o;
    return Objects.equals(
            this.documentUrl, incidentAttachmentsPostmortemAttributesAttachmentObject.documentUrl)
        && Objects.equals(
            this.title, incidentAttachmentsPostmortemAttributesAttachmentObject.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentUrl, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAttachmentsPostmortemAttributesAttachmentObject {\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

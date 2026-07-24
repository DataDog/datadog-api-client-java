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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The postmortem's attributes. */
@JsonPropertyOrder({
  IncidentPostmortemAttributes.JSON_PROPERTY_CREATED,
  IncidentPostmortemAttributes.JSON_PROPERTY_DOCUMENT_ID,
  IncidentPostmortemAttributes.JSON_PROPERTY_DOCUMENT_TYPE,
  IncidentPostmortemAttributes.JSON_PROPERTY_DOCUMENT_URL,
  IncidentPostmortemAttributes.JSON_PROPERTY_MODIFIED,
  IncidentPostmortemAttributes.JSON_PROPERTY_STATUS,
  IncidentPostmortemAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentPostmortemAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private String documentId;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "document_type";
  private String documentType;

  public static final String JSON_PROPERTY_DOCUMENT_URL = "document_url";
  private String documentUrl;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_STATUS = "status";
  private PostmortemStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentPostmortemAttributes() {}

  @JsonCreator
  public IncidentPostmortemAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOCUMENT_ID) String documentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOCUMENT_TYPE) String documentType,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOCUMENT_URL) String documentUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) PostmortemStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.created = created;
    this.documentId = documentId;
    this.documentType = documentType;
    this.documentUrl = documentUrl;
    this.modified = modified;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.title = title;
  }

  public IncidentPostmortemAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the postmortem was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentPostmortemAttributes documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * The identifier of the postmortem document within its host platform.
   *
   * @return documentId
   */
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public IncidentPostmortemAttributes documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * The type of document backing the postmortem (for example, <code>datadog_notebooks</code>,
   * <code>confluence</code>, or <code>google_docs</code>). Can be empty if the document type is
   * unknown.
   *
   * @return documentType
   */
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public IncidentPostmortemAttributes documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  /**
   * The URL of the postmortem document.
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

  public IncidentPostmortemAttributes modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the postmortem was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentPostmortemAttributes status(PostmortemStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the postmortem.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PostmortemStatus getStatus() {
    return status;
  }

  public void setStatus(PostmortemStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public IncidentPostmortemAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the postmortem.
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
   * @return IncidentPostmortemAttributes
   */
  @JsonAnySetter
  public IncidentPostmortemAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentPostmortemAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentPostmortemAttributes incidentPostmortemAttributes = (IncidentPostmortemAttributes) o;
    return Objects.equals(this.created, incidentPostmortemAttributes.created)
        && Objects.equals(this.documentId, incidentPostmortemAttributes.documentId)
        && Objects.equals(this.documentType, incidentPostmortemAttributes.documentType)
        && Objects.equals(this.documentUrl, incidentPostmortemAttributes.documentUrl)
        && Objects.equals(this.modified, incidentPostmortemAttributes.modified)
        && Objects.equals(this.status, incidentPostmortemAttributes.status)
        && Objects.equals(this.title, incidentPostmortemAttributes.title)
        && Objects.equals(
            this.additionalProperties, incidentPostmortemAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created,
        documentId,
        documentType,
        documentUrl,
        modified,
        status,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentPostmortemAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

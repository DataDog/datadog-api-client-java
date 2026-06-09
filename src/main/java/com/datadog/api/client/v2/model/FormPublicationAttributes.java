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
import java.util.UUID;

/** The attributes of a form publication. */
@JsonPropertyOrder({
  FormPublicationAttributes.JSON_PROPERTY_CREATED_AT,
  FormPublicationAttributes.JSON_PROPERTY_FORM_ID,
  FormPublicationAttributes.JSON_PROPERTY_FORM_VERSION,
  FormPublicationAttributes.JSON_PROPERTY_ID,
  FormPublicationAttributes.JSON_PROPERTY_MODIFIED_AT,
  FormPublicationAttributes.JSON_PROPERTY_ORG_ID,
  FormPublicationAttributes.JSON_PROPERTY_PUBLISH_SEQ,
  FormPublicationAttributes.JSON_PROPERTY_USER_ID,
  FormPublicationAttributes.JSON_PROPERTY_USER_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormPublicationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FORM_ID = "form_id";
  private UUID formId;

  public static final String JSON_PROPERTY_FORM_VERSION = "form_version";
  private Long formVersion;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PUBLISH_SEQ = "publish_seq";
  private Long publishSeq;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Long userId;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public FormPublicationAttributes() {}

  @JsonCreator
  public FormPublicationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORM_ID) UUID formId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORM_VERSION) Long formVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PUBLISH_SEQ) Long publishSeq,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_ID) Long userId,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_UUID) UUID userUuid) {
    this.createdAt = createdAt;
    this.formId = formId;
    this.formVersion = formVersion;
    this.modifiedAt = modifiedAt;
    this.orgId = orgId;
    this.publishSeq = publishSeq;
    this.userId = userId;
    this.userUuid = userUuid;
  }

  public FormPublicationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the publication was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FormPublicationAttributes formId(UUID formId) {
    this.formId = formId;
    return this;
  }

  /**
   * The ID of the form.
   *
   * @return formId
   */
  @JsonProperty(JSON_PROPERTY_FORM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getFormId() {
    return formId;
  }

  public void setFormId(UUID formId) {
    this.formId = formId;
  }

  public FormPublicationAttributes formVersion(Long formVersion) {
    this.formVersion = formVersion;
    return this;
  }

  /**
   * The version number that was published.
   *
   * @return formVersion
   */
  @JsonProperty(JSON_PROPERTY_FORM_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFormVersion() {
    return formVersion;
  }

  public void setFormVersion(Long formVersion) {
    this.formVersion = formVersion;
  }

  public FormPublicationAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the form publication.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormPublicationAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which the publication was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public FormPublicationAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization that owns this publication.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public FormPublicationAttributes publishSeq(Long publishSeq) {
    this.publishSeq = publishSeq;
    return this;
  }

  /**
   * The sequential publication number for this form.
   *
   * @return publishSeq
   */
  @JsonProperty(JSON_PROPERTY_PUBLISH_SEQ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPublishSeq() {
    return publishSeq;
  }

  public void setPublishSeq(Long publishSeq) {
    this.publishSeq = publishSeq;
  }

  public FormPublicationAttributes userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who created this publication.
   *
   * @return userId
   */
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public FormPublicationAttributes userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * The UUID of the user who created this publication.
   *
   * @return userUuid
   */
  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
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
   * @return FormPublicationAttributes
   */
  @JsonAnySetter
  public FormPublicationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormPublicationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPublicationAttributes formPublicationAttributes = (FormPublicationAttributes) o;
    return Objects.equals(this.createdAt, formPublicationAttributes.createdAt)
        && Objects.equals(this.formId, formPublicationAttributes.formId)
        && Objects.equals(this.formVersion, formPublicationAttributes.formVersion)
        && Objects.equals(this.id, formPublicationAttributes.id)
        && Objects.equals(this.modifiedAt, formPublicationAttributes.modifiedAt)
        && Objects.equals(this.orgId, formPublicationAttributes.orgId)
        && Objects.equals(this.publishSeq, formPublicationAttributes.publishSeq)
        && Objects.equals(this.userId, formPublicationAttributes.userId)
        && Objects.equals(this.userUuid, formPublicationAttributes.userUuid)
        && Objects.equals(
            this.additionalProperties, formPublicationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        formId,
        formVersion,
        id,
        modifiedAt,
        orgId,
        publishSeq,
        userId,
        userUuid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPublicationAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    formVersion: ").append(toIndentedString(formVersion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    publishSeq: ").append(toIndentedString(publishSeq)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
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

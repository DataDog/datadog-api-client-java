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

/** The attributes of a form version. */
@JsonPropertyOrder({
  FormVersionAttributes.JSON_PROPERTY_CREATED_AT,
  FormVersionAttributes.JSON_PROPERTY_DATA_DEFINITION,
  FormVersionAttributes.JSON_PROPERTY_DEFINITION_SIGNATURE,
  FormVersionAttributes.JSON_PROPERTY_ETAG,
  FormVersionAttributes.JSON_PROPERTY_ID,
  FormVersionAttributes.JSON_PROPERTY_MODIFIED_AT,
  FormVersionAttributes.JSON_PROPERTY_STATE,
  FormVersionAttributes.JSON_PROPERTY_UI_DEFINITION,
  FormVersionAttributes.JSON_PROPERTY_USER_ID,
  FormVersionAttributes.JSON_PROPERTY_USER_UUID,
  FormVersionAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormVersionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATA_DEFINITION = "data_definition";
  private FormDataDefinition dataDefinition;

  public static final String JSON_PROPERTY_DEFINITION_SIGNATURE = "definition_signature";
  private String definitionSignature;

  public static final String JSON_PROPERTY_ETAG = "etag";
  private String etag;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STATE = "state";
  private FormVersionState state;

  public static final String JSON_PROPERTY_UI_DEFINITION = "ui_definition";
  private FormUiDefinition uiDefinition;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Long userId;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public FormVersionAttributes() {}

  @JsonCreator
  public FormVersionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_DEFINITION)
          FormDataDefinition dataDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION_SIGNATURE)
          String definitionSignature,
      @JsonProperty(required = true, value = JSON_PROPERTY_ETAG) String etag,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE) FormVersionState state,
      @JsonProperty(required = true, value = JSON_PROPERTY_UI_DEFINITION)
          FormUiDefinition uiDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_ID) Long userId,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_UUID) UUID userUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.createdAt = createdAt;
    this.dataDefinition = dataDefinition;
    this.unparsed |= dataDefinition.unparsed;
    this.definitionSignature = definitionSignature;
    this.etag = etag;
    if (etag != null) {}
    this.modifiedAt = modifiedAt;
    this.state = state;
    this.unparsed |= !state.isValid();
    this.uiDefinition = uiDefinition;
    this.unparsed |= uiDefinition.unparsed;
    this.userId = userId;
    this.userUuid = userUuid;
    this.version = version;
  }

  public FormVersionAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the version was created.
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

  public FormVersionAttributes dataDefinition(FormDataDefinition dataDefinition) {
    this.dataDefinition = dataDefinition;
    this.unparsed |= dataDefinition.unparsed;
    return this;
  }

  /**
   * A JSON Schema definition that describes the form's data fields.
   *
   * @return dataDefinition
   */
  @JsonProperty(JSON_PROPERTY_DATA_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormDataDefinition getDataDefinition() {
    return dataDefinition;
  }

  public void setDataDefinition(FormDataDefinition dataDefinition) {
    this.dataDefinition = dataDefinition;
    if (dataDefinition != null) {
      this.unparsed |= dataDefinition.unparsed;
    }
  }

  public FormVersionAttributes definitionSignature(String definitionSignature) {
    this.definitionSignature = definitionSignature;
    return this;
  }

  /**
   * The signature of the version definition.
   *
   * @return definitionSignature
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDefinitionSignature() {
    return definitionSignature;
  }

  public void setDefinitionSignature(String definitionSignature) {
    this.definitionSignature = definitionSignature;
  }

  public FormVersionAttributes etag(String etag) {
    this.etag = etag;
    if (etag != null) {}
    return this;
  }

  /**
   * The ETag for optimistic concurrency control.
   *
   * @return etag
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public FormVersionAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the form version.
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

  public FormVersionAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which the version was last modified.
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

  public FormVersionAttributes state(FormVersionState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The state of a form version.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormVersionState getState() {
    return state;
  }

  public void setState(FormVersionState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public FormVersionAttributes uiDefinition(FormUiDefinition uiDefinition) {
    this.uiDefinition = uiDefinition;
    this.unparsed |= uiDefinition.unparsed;
    return this;
  }

  /**
   * UI configuration for rendering form fields, including widget overrides, field ordering, and
   * themes.
   *
   * @return uiDefinition
   */
  @JsonProperty(JSON_PROPERTY_UI_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormUiDefinition getUiDefinition() {
    return uiDefinition;
  }

  public void setUiDefinition(FormUiDefinition uiDefinition) {
    this.uiDefinition = uiDefinition;
    if (uiDefinition != null) {
      this.unparsed |= uiDefinition.unparsed;
    }
  }

  public FormVersionAttributes userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who created this version.
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

  public FormVersionAttributes userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * The UUID of the user who created this version.
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

  public FormVersionAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The sequential version number.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return FormVersionAttributes
   */
  @JsonAnySetter
  public FormVersionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormVersionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormVersionAttributes formVersionAttributes = (FormVersionAttributes) o;
    return Objects.equals(this.createdAt, formVersionAttributes.createdAt)
        && Objects.equals(this.dataDefinition, formVersionAttributes.dataDefinition)
        && Objects.equals(this.definitionSignature, formVersionAttributes.definitionSignature)
        && Objects.equals(this.etag, formVersionAttributes.etag)
        && Objects.equals(this.id, formVersionAttributes.id)
        && Objects.equals(this.modifiedAt, formVersionAttributes.modifiedAt)
        && Objects.equals(this.state, formVersionAttributes.state)
        && Objects.equals(this.uiDefinition, formVersionAttributes.uiDefinition)
        && Objects.equals(this.userId, formVersionAttributes.userId)
        && Objects.equals(this.userUuid, formVersionAttributes.userUuid)
        && Objects.equals(this.version, formVersionAttributes.version)
        && Objects.equals(this.additionalProperties, formVersionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        dataDefinition,
        definitionSignature,
        etag,
        id,
        modifiedAt,
        state,
        uiDefinition,
        userId,
        userUuid,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormVersionAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dataDefinition: ").append(toIndentedString(dataDefinition)).append("\n");
    sb.append("    definitionSignature: ")
        .append(toIndentedString(definitionSignature))
        .append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    uiDefinition: ").append(toIndentedString(uiDefinition)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

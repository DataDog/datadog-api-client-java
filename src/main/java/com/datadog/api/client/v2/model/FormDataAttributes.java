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
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of a form. */
@JsonPropertyOrder({
  FormDataAttributes.JSON_PROPERTY_ACTIVE,
  FormDataAttributes.JSON_PROPERTY_ANONYMOUS,
  FormDataAttributes.JSON_PROPERTY_CREATED_AT,
  FormDataAttributes.JSON_PROPERTY_DATASTORE_CONFIG,
  FormDataAttributes.JSON_PROPERTY_DESCRIPTION,
  FormDataAttributes.JSON_PROPERTY_END_DATE,
  FormDataAttributes.JSON_PROPERTY_HAS_SUBMITTED,
  FormDataAttributes.JSON_PROPERTY_IDP_SURVEY,
  FormDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  FormDataAttributes.JSON_PROPERTY_NAME,
  FormDataAttributes.JSON_PROPERTY_ORG_ID,
  FormDataAttributes.JSON_PROPERTY_PUBLICATION,
  FormDataAttributes.JSON_PROPERTY_SELF_SERVICE,
  FormDataAttributes.JSON_PROPERTY_SINGLE_RESPONSE,
  FormDataAttributes.JSON_PROPERTY_USER_ID,
  FormDataAttributes.JSON_PROPERTY_USER_UUID,
  FormDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ANONYMOUS = "anonymous";
  private Boolean anonymous;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATASTORE_CONFIG = "datastore_config";
  private FormDatastoreConfigAttributes datastoreConfig;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_HAS_SUBMITTED = "has_submitted";
  private JsonNullable<Boolean> hasSubmitted = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IDP_SURVEY = "idp_survey";
  private Boolean idpSurvey;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PUBLICATION = "publication";
  private FormPublicationAttributes publication;

  public static final String JSON_PROPERTY_SELF_SERVICE = "self_service";
  private Boolean selfService;

  public static final String JSON_PROPERTY_SINGLE_RESPONSE = "single_response";
  private Boolean singleResponse;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Long userId;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public static final String JSON_PROPERTY_VERSION = "version";
  private FormVersionAttributes version;

  public FormDataAttributes() {}

  @JsonCreator
  public FormDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTIVE) Boolean active,
      @JsonProperty(required = true, value = JSON_PROPERTY_ANONYMOUS) Boolean anonymous,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASTORE_CONFIG)
          FormDatastoreConfigAttributes datastoreConfig,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDP_SURVEY) Boolean idpSurvey,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELF_SERVICE) Boolean selfService,
      @JsonProperty(required = true, value = JSON_PROPERTY_SINGLE_RESPONSE) Boolean singleResponse,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_ID) Long userId,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_UUID) UUID userUuid) {
    this.active = active;
    this.anonymous = anonymous;
    this.createdAt = createdAt;
    this.datastoreConfig = datastoreConfig;
    this.unparsed |= datastoreConfig.unparsed;
    this.description = description;
    this.idpSurvey = idpSurvey;
    this.modifiedAt = modifiedAt;
    this.name = name;
    this.orgId = orgId;
    this.selfService = selfService;
    this.singleResponse = singleResponse;
    this.userId = userId;
    this.userUuid = userUuid;
  }

  public FormDataAttributes active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Whether the form is currently active.
   *
   * @return active
   */
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public FormDataAttributes anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

  /**
   * Whether the form accepts anonymous submissions.
   *
   * @return anonymous
   */
  @JsonProperty(JSON_PROPERTY_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public FormDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the form was created.
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

  public FormDataAttributes datastoreConfig(FormDatastoreConfigAttributes datastoreConfig) {
    this.datastoreConfig = datastoreConfig;
    this.unparsed |= datastoreConfig.unparsed;
    return this;
  }

  /**
   * The datastore configuration for a form.
   *
   * @return datastoreConfig
   */
  @JsonProperty(JSON_PROPERTY_DATASTORE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormDatastoreConfigAttributes getDatastoreConfig() {
    return datastoreConfig;
  }

  public void setDatastoreConfig(FormDatastoreConfigAttributes datastoreConfig) {
    this.datastoreConfig = datastoreConfig;
  }

  public FormDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the form.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FormDataAttributes endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    return this;
  }

  /**
   * The date and time at which the form stops accepting responses.
   *
   * @return endDate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEndDate() {
    return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEndDate_JsonNullable() {
    return endDate;
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
  }

  public FormDataAttributes hasSubmitted(Boolean hasSubmitted) {
    this.hasSubmitted = JsonNullable.<Boolean>of(hasSubmitted);
    return this;
  }

  /**
   * Whether the current user has already submitted this form. Only present for forms with <code>
   * single_response</code> set to <code>true</code>.
   *
   * @return hasSubmitted
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getHasSubmitted() {
    return hasSubmitted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getHasSubmitted_JsonNullable() {
    return hasSubmitted;
  }

  @JsonProperty(JSON_PROPERTY_HAS_SUBMITTED)
  public void setHasSubmitted_JsonNullable(JsonNullable<Boolean> hasSubmitted) {
    this.hasSubmitted = hasSubmitted;
  }

  public void setHasSubmitted(Boolean hasSubmitted) {
    this.hasSubmitted = JsonNullable.<Boolean>of(hasSubmitted);
  }

  public FormDataAttributes idpSurvey(Boolean idpSurvey) {
    this.idpSurvey = idpSurvey;
    return this;
  }

  /**
   * Whether the form is an IDP survey.
   *
   * @return idpSurvey
   */
  @JsonProperty(JSON_PROPERTY_IDP_SURVEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIdpSurvey() {
    return idpSurvey;
  }

  public void setIdpSurvey(Boolean idpSurvey) {
    this.idpSurvey = idpSurvey;
  }

  public FormDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which the form was last modified.
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

  public FormDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the form.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormDataAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization that owns this form.
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

  public FormDataAttributes publication(FormPublicationAttributes publication) {
    this.publication = publication;
    this.unparsed |= publication.unparsed;
    return this;
  }

  /**
   * The attributes of a form publication.
   *
   * @return publication
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormPublicationAttributes getPublication() {
    return publication;
  }

  public void setPublication(FormPublicationAttributes publication) {
    this.publication = publication;
  }

  public FormDataAttributes selfService(Boolean selfService) {
    this.selfService = selfService;
    return this;
  }

  /**
   * Whether the form is available in the self-service catalog.
   *
   * @return selfService
   */
  @JsonProperty(JSON_PROPERTY_SELF_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSelfService() {
    return selfService;
  }

  public void setSelfService(Boolean selfService) {
    this.selfService = selfService;
  }

  public FormDataAttributes singleResponse(Boolean singleResponse) {
    this.singleResponse = singleResponse;
    return this;
  }

  /**
   * Whether each user can only submit one response.
   *
   * @return singleResponse
   */
  @JsonProperty(JSON_PROPERTY_SINGLE_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSingleResponse() {
    return singleResponse;
  }

  public void setSingleResponse(Boolean singleResponse) {
    this.singleResponse = singleResponse;
  }

  public FormDataAttributes userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who created this form.
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

  public FormDataAttributes userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * The UUID of the user who created this form.
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

  public FormDataAttributes version(FormVersionAttributes version) {
    this.version = version;
    this.unparsed |= version.unparsed;
    return this;
  }

  /**
   * The attributes of a form version.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormVersionAttributes getVersion() {
    return version;
  }

  public void setVersion(FormVersionAttributes version) {
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
   * @return FormDataAttributes
   */
  @JsonAnySetter
  public FormDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDataAttributes formDataAttributes = (FormDataAttributes) o;
    return Objects.equals(this.active, formDataAttributes.active)
        && Objects.equals(this.anonymous, formDataAttributes.anonymous)
        && Objects.equals(this.createdAt, formDataAttributes.createdAt)
        && Objects.equals(this.datastoreConfig, formDataAttributes.datastoreConfig)
        && Objects.equals(this.description, formDataAttributes.description)
        && Objects.equals(this.endDate, formDataAttributes.endDate)
        && Objects.equals(this.hasSubmitted, formDataAttributes.hasSubmitted)
        && Objects.equals(this.idpSurvey, formDataAttributes.idpSurvey)
        && Objects.equals(this.modifiedAt, formDataAttributes.modifiedAt)
        && Objects.equals(this.name, formDataAttributes.name)
        && Objects.equals(this.orgId, formDataAttributes.orgId)
        && Objects.equals(this.publication, formDataAttributes.publication)
        && Objects.equals(this.selfService, formDataAttributes.selfService)
        && Objects.equals(this.singleResponse, formDataAttributes.singleResponse)
        && Objects.equals(this.userId, formDataAttributes.userId)
        && Objects.equals(this.userUuid, formDataAttributes.userUuid)
        && Objects.equals(this.version, formDataAttributes.version)
        && Objects.equals(this.additionalProperties, formDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active,
        anonymous,
        createdAt,
        datastoreConfig,
        description,
        endDate,
        hasSubmitted,
        idpSurvey,
        modifiedAt,
        name,
        orgId,
        publication,
        selfService,
        singleResponse,
        userId,
        userUuid,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataAttributes {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datastoreConfig: ").append(toIndentedString(datastoreConfig)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    hasSubmitted: ").append(toIndentedString(hasSubmitted)).append("\n");
    sb.append("    idpSurvey: ").append(toIndentedString(idpSurvey)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
    sb.append("    selfService: ").append(toIndentedString(selfService)).append("\n");
    sb.append("    singleResponse: ").append(toIndentedString(singleResponse)).append("\n");
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

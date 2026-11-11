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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Access control details for the tenancy configuration, used to determine whether the requesting
 * user can edit it.
 */
@JsonPropertyOrder({
  TenancyConfigDataAttributesGraceResource.JSON_PROPERTY_RESOURCE_ID,
  TenancyConfigDataAttributesGraceResource.JSON_PROPERTY_USER_CAN_EDIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TenancyConfigDataAttributesGraceResource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_USER_CAN_EDIT = "user_can_edit";
  private Boolean userCanEdit;

  public TenancyConfigDataAttributesGraceResource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the access control resource for the tenancy configuration.
   *
   * @return resourceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public TenancyConfigDataAttributesGraceResource userCanEdit(Boolean userCanEdit) {
    this.userCanEdit = userCanEdit;
    return this;
  }

  /**
   * Whether the requesting user has permission to edit the tenancy configuration.
   *
   * @return userCanEdit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUserCanEdit() {
    return userCanEdit;
  }

  public void setUserCanEdit(Boolean userCanEdit) {
    this.userCanEdit = userCanEdit;
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
   * @return TenancyConfigDataAttributesGraceResource
   */
  @JsonAnySetter
  public TenancyConfigDataAttributesGraceResource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TenancyConfigDataAttributesGraceResource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenancyConfigDataAttributesGraceResource tenancyConfigDataAttributesGraceResource =
        (TenancyConfigDataAttributesGraceResource) o;
    return Objects.equals(this.resourceId, tenancyConfigDataAttributesGraceResource.resourceId)
        && Objects.equals(this.userCanEdit, tenancyConfigDataAttributesGraceResource.userCanEdit)
        && Objects.equals(
            this.additionalProperties,
            tenancyConfigDataAttributesGraceResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, userCanEdit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenancyConfigDataAttributesGraceResource {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    userCanEdit: ").append(toIndentedString(userCanEdit)).append("\n");
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

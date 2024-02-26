/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A JSON array of settings. */
@JsonPropertyOrder({
  OrganizationSettings.JSON_PROPERTY_PRIVATE_WIDGET_SHARE,
  OrganizationSettings.JSON_PROPERTY_SAML,
  OrganizationSettings.JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE,
  OrganizationSettings.JSON_PROPERTY_SAML_AUTOCREATE_USERS_DOMAINS,
  OrganizationSettings.JSON_PROPERTY_SAML_CAN_BE_ENABLED,
  OrganizationSettings.JSON_PROPERTY_SAML_IDP_ENDPOINT,
  OrganizationSettings.JSON_PROPERTY_SAML_IDP_INITIATED_LOGIN,
  OrganizationSettings.JSON_PROPERTY_SAML_IDP_METADATA_UPLOADED,
  OrganizationSettings.JSON_PROPERTY_SAML_LOGIN_URL,
  OrganizationSettings.JSON_PROPERTY_SAML_STRICT_MODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationSettings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRIVATE_WIDGET_SHARE = "private_widget_share";
  private Boolean privateWidgetShare;

  public static final String JSON_PROPERTY_SAML = "saml";
  private OrganizationSettingsSaml saml;

  public static final String JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE =
      "saml_autocreate_access_role";
  private JsonNullable<AccessRole> samlAutocreateAccessRole = JsonNullable.<AccessRole>undefined();

  public static final String JSON_PROPERTY_SAML_AUTOCREATE_USERS_DOMAINS =
      "saml_autocreate_users_domains";
  private OrganizationSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains;

  public static final String JSON_PROPERTY_SAML_CAN_BE_ENABLED = "saml_can_be_enabled";
  private Boolean samlCanBeEnabled;

  public static final String JSON_PROPERTY_SAML_IDP_ENDPOINT = "saml_idp_endpoint";
  private String samlIdpEndpoint;

  public static final String JSON_PROPERTY_SAML_IDP_INITIATED_LOGIN = "saml_idp_initiated_login";
  private OrganizationSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin;

  public static final String JSON_PROPERTY_SAML_IDP_METADATA_UPLOADED =
      "saml_idp_metadata_uploaded";
  private Boolean samlIdpMetadataUploaded;

  public static final String JSON_PROPERTY_SAML_LOGIN_URL = "saml_login_url";
  private String samlLoginUrl;

  public static final String JSON_PROPERTY_SAML_STRICT_MODE = "saml_strict_mode";
  private OrganizationSettingsSamlStrictMode samlStrictMode;

  public OrganizationSettings privateWidgetShare(Boolean privateWidgetShare) {
    this.privateWidgetShare = privateWidgetShare;
    return this;
  }

  /**
   * Whether or not the organization users can share widgets outside of Datadog.
   *
   * @return privateWidgetShare
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_WIDGET_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPrivateWidgetShare() {
    return privateWidgetShare;
  }

  public void setPrivateWidgetShare(Boolean privateWidgetShare) {
    this.privateWidgetShare = privateWidgetShare;
  }

  public OrganizationSettings saml(OrganizationSettingsSaml saml) {
    this.saml = saml;
    this.unparsed |= saml.unparsed;
    return this;
  }

  /**
   * Set the boolean property enabled to enable or disable single sign on with SAML. See the SAML
   * documentation for more information about all SAML settings.
   *
   * @return saml
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationSettingsSaml getSaml() {
    return saml;
  }

  public void setSaml(OrganizationSettingsSaml saml) {
    this.saml = saml;
  }

  public OrganizationSettings samlAutocreateAccessRole(AccessRole samlAutocreateAccessRole) {
    this.samlAutocreateAccessRole = JsonNullable.<AccessRole>of(samlAutocreateAccessRole);
    return this;
  }

  /**
   * The access role of the user. Options are <strong>st</strong> (standard user),
   * <strong>adm</strong> (admin user), or <strong>ro</strong> (read-only user).
   *
   * @return samlAutocreateAccessRole
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AccessRole getSamlAutocreateAccessRole() {
    return samlAutocreateAccessRole.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AccessRole> getSamlAutocreateAccessRole_JsonNullable() {
    return samlAutocreateAccessRole;
  }

  @JsonProperty(JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE)
  public void setSamlAutocreateAccessRole_JsonNullable(
      JsonNullable<AccessRole> samlAutocreateAccessRole) {
    this.samlAutocreateAccessRole = samlAutocreateAccessRole;
  }

  public void setSamlAutocreateAccessRole(AccessRole samlAutocreateAccessRole) {
    if (!samlAutocreateAccessRole.isValid()) {
      this.unparsed = true;
    }
    this.samlAutocreateAccessRole = JsonNullable.<AccessRole>of(samlAutocreateAccessRole);
  }

  public OrganizationSettings samlAutocreateUsersDomains(
      OrganizationSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains) {
    this.samlAutocreateUsersDomains = samlAutocreateUsersDomains;
    this.unparsed |= samlAutocreateUsersDomains.unparsed;
    return this;
  }

  /**
   * Has two properties, <code>enabled</code> (boolean) and <code>domains</code>, which is a list of
   * domains without the @ symbol.
   *
   * @return samlAutocreateUsersDomains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_AUTOCREATE_USERS_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationSettingsSamlAutocreateUsersDomains getSamlAutocreateUsersDomains() {
    return samlAutocreateUsersDomains;
  }

  public void setSamlAutocreateUsersDomains(
      OrganizationSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains) {
    this.samlAutocreateUsersDomains = samlAutocreateUsersDomains;
  }

  public OrganizationSettings samlCanBeEnabled(Boolean samlCanBeEnabled) {
    this.samlCanBeEnabled = samlCanBeEnabled;
    return this;
  }

  /**
   * Whether or not SAML can be enabled for this organization.
   *
   * @return samlCanBeEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_CAN_BE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSamlCanBeEnabled() {
    return samlCanBeEnabled;
  }

  public void setSamlCanBeEnabled(Boolean samlCanBeEnabled) {
    this.samlCanBeEnabled = samlCanBeEnabled;
  }

  public OrganizationSettings samlIdpEndpoint(String samlIdpEndpoint) {
    this.samlIdpEndpoint = samlIdpEndpoint;
    return this;
  }

  /**
   * Identity provider endpoint for SAML authentication.
   *
   * @return samlIdpEndpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_IDP_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSamlIdpEndpoint() {
    return samlIdpEndpoint;
  }

  public void setSamlIdpEndpoint(String samlIdpEndpoint) {
    this.samlIdpEndpoint = samlIdpEndpoint;
  }

  public OrganizationSettings samlIdpInitiatedLogin(
      OrganizationSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin) {
    this.samlIdpInitiatedLogin = samlIdpInitiatedLogin;
    this.unparsed |= samlIdpInitiatedLogin.unparsed;
    return this;
  }

  /**
   * Has one property enabled (boolean).
   *
   * @return samlIdpInitiatedLogin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_IDP_INITIATED_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationSettingsSamlIdpInitiatedLogin getSamlIdpInitiatedLogin() {
    return samlIdpInitiatedLogin;
  }

  public void setSamlIdpInitiatedLogin(
      OrganizationSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin) {
    this.samlIdpInitiatedLogin = samlIdpInitiatedLogin;
  }

  public OrganizationSettings samlIdpMetadataUploaded(Boolean samlIdpMetadataUploaded) {
    this.samlIdpMetadataUploaded = samlIdpMetadataUploaded;
    return this;
  }

  /**
   * Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
   *
   * @return samlIdpMetadataUploaded
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_IDP_METADATA_UPLOADED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSamlIdpMetadataUploaded() {
    return samlIdpMetadataUploaded;
  }

  public void setSamlIdpMetadataUploaded(Boolean samlIdpMetadataUploaded) {
    this.samlIdpMetadataUploaded = samlIdpMetadataUploaded;
  }

  public OrganizationSettings samlLoginUrl(String samlLoginUrl) {
    this.samlLoginUrl = samlLoginUrl;
    return this;
  }

  /**
   * URL for SAML logging.
   *
   * @return samlLoginUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_LOGIN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSamlLoginUrl() {
    return samlLoginUrl;
  }

  public void setSamlLoginUrl(String samlLoginUrl) {
    this.samlLoginUrl = samlLoginUrl;
  }

  public OrganizationSettings samlStrictMode(OrganizationSettingsSamlStrictMode samlStrictMode) {
    this.samlStrictMode = samlStrictMode;
    this.unparsed |= samlStrictMode.unparsed;
    return this;
  }

  /**
   * Has one property enabled (boolean).
   *
   * @return samlStrictMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_STRICT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrganizationSettingsSamlStrictMode getSamlStrictMode() {
    return samlStrictMode;
  }

  public void setSamlStrictMode(OrganizationSettingsSamlStrictMode samlStrictMode) {
    this.samlStrictMode = samlStrictMode;
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
   * @return OrganizationSettings
   */
  @JsonAnySetter
  public OrganizationSettings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrganizationSettings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSettings organizationSettings = (OrganizationSettings) o;
    return Objects.equals(this.privateWidgetShare, organizationSettings.privateWidgetShare)
        && Objects.equals(this.saml, organizationSettings.saml)
        && Objects.equals(
            this.samlAutocreateAccessRole, organizationSettings.samlAutocreateAccessRole)
        && Objects.equals(
            this.samlAutocreateUsersDomains, organizationSettings.samlAutocreateUsersDomains)
        && Objects.equals(this.samlCanBeEnabled, organizationSettings.samlCanBeEnabled)
        && Objects.equals(this.samlIdpEndpoint, organizationSettings.samlIdpEndpoint)
        && Objects.equals(this.samlIdpInitiatedLogin, organizationSettings.samlIdpInitiatedLogin)
        && Objects.equals(
            this.samlIdpMetadataUploaded, organizationSettings.samlIdpMetadataUploaded)
        && Objects.equals(this.samlLoginUrl, organizationSettings.samlLoginUrl)
        && Objects.equals(this.samlStrictMode, organizationSettings.samlStrictMode)
        && Objects.equals(this.additionalProperties, organizationSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        privateWidgetShare,
        saml,
        samlAutocreateAccessRole,
        samlAutocreateUsersDomains,
        samlCanBeEnabled,
        samlIdpEndpoint,
        samlIdpInitiatedLogin,
        samlIdpMetadataUploaded,
        samlLoginUrl,
        samlStrictMode,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSettings {\n");
    sb.append("    privateWidgetShare: ").append(toIndentedString(privateWidgetShare)).append("\n");
    sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
    sb.append("    samlAutocreateAccessRole: ")
        .append(toIndentedString(samlAutocreateAccessRole))
        .append("\n");
    sb.append("    samlAutocreateUsersDomains: ")
        .append(toIndentedString(samlAutocreateUsersDomains))
        .append("\n");
    sb.append("    samlCanBeEnabled: ").append(toIndentedString(samlCanBeEnabled)).append("\n");
    sb.append("    samlIdpEndpoint: ").append(toIndentedString(samlIdpEndpoint)).append("\n");
    sb.append("    samlIdpInitiatedLogin: ")
        .append(toIndentedString(samlIdpInitiatedLogin))
        .append("\n");
    sb.append("    samlIdpMetadataUploaded: ")
        .append(toIndentedString(samlIdpMetadataUploaded))
        .append("\n");
    sb.append("    samlLoginUrl: ").append(toIndentedString(samlLoginUrl)).append("\n");
    sb.append("    samlStrictMode: ").append(toIndentedString(samlStrictMode)).append("\n");
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

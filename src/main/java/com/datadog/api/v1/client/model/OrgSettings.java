/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.AccessRole;
import com.datadog.api.v1.client.model.OrgSettingsSaml;
import com.datadog.api.v1.client.model.OrgSettingsSamlAutocreateUsersDomains;
import com.datadog.api.v1.client.model.OrgSettingsSamlIdpInitiatedLogin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A JSON array of settings.
 */
@ApiModel(description = "A JSON array of settings.")
@JsonPropertyOrder({
  OrgSettings.JSON_PROPERTY_PRIVATE_WIDGET_SHARE,
  OrgSettings.JSON_PROPERTY_SAML,
  OrgSettings.JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE,
  OrgSettings.JSON_PROPERTY_SAML_AUTOCREATE_USERS_DOMAINS,
  OrgSettings.JSON_PROPERTY_SAML_CAN_BE_ENABLED,
  OrgSettings.JSON_PROPERTY_SAML_IDP_ENDPOINT,
  OrgSettings.JSON_PROPERTY_SAML_IDP_INITIATED_LOGIN,
  OrgSettings.JSON_PROPERTY_SAML_IDP_METADATA_UPLOADED,
  OrgSettings.JSON_PROPERTY_SAML_LOGIN_URL,
  OrgSettings.JSON_PROPERTY_SAML_STRICT_MODE
})

public class OrgSettings {
  public static final String JSON_PROPERTY_PRIVATE_WIDGET_SHARE = "private_widget_share";
  private Boolean privateWidgetShare;

  public static final String JSON_PROPERTY_SAML = "saml";
  private OrgSettingsSaml saml;

  public static final String JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE = "saml_autocreate_access_role";
  private AccessRole samlAutocreateAccessRole = AccessRole.STANDARD;

  public static final String JSON_PROPERTY_SAML_AUTOCREATE_USERS_DOMAINS = "saml_autocreate_users_domains";
  private OrgSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains;

  public static final String JSON_PROPERTY_SAML_CAN_BE_ENABLED = "saml_can_be_enabled";
  private Boolean samlCanBeEnabled;

  public static final String JSON_PROPERTY_SAML_IDP_ENDPOINT = "saml_idp_endpoint";
  private String samlIdpEndpoint;

  public static final String JSON_PROPERTY_SAML_IDP_INITIATED_LOGIN = "saml_idp_initiated_login";
  private OrgSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin;

  public static final String JSON_PROPERTY_SAML_IDP_METADATA_UPLOADED = "saml_idp_metadata_uploaded";
  private Boolean samlIdpMetadataUploaded;

  public static final String JSON_PROPERTY_SAML_LOGIN_URL = "saml_login_url";
  private String samlLoginUrl;

  public static final String JSON_PROPERTY_SAML_STRICT_MODE = "saml_strict_mode";
  private OrgSettingsSamlIdpInitiatedLogin samlStrictMode;


  public OrgSettings privateWidgetShare(Boolean privateWidgetShare) {
    
    this.privateWidgetShare = privateWidgetShare;
    return this;
  }

   /**
   * Whether or not the organization users can share widgets outside of Datadog.
   * @return privateWidgetShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not the organization users can share widgets outside of Datadog.")
  @JsonProperty(JSON_PROPERTY_PRIVATE_WIDGET_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrivateWidgetShare() {
    return privateWidgetShare;
  }


  public void setPrivateWidgetShare(Boolean privateWidgetShare) {
    this.privateWidgetShare = privateWidgetShare;
  }


  public OrgSettings saml(OrgSettingsSaml saml) {
    
    this.saml = saml;
    return this;
  }

   /**
   * Get saml
   * @return saml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrgSettingsSaml getSaml() {
    return saml;
  }


  public void setSaml(OrgSettingsSaml saml) {
    this.saml = saml;
  }


  public OrgSettings samlAutocreateAccessRole(AccessRole samlAutocreateAccessRole) {
    
    this.samlAutocreateAccessRole = samlAutocreateAccessRole;
    return this;
  }

   /**
   * Get samlAutocreateAccessRole
   * @return samlAutocreateAccessRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAML_AUTOCREATE_ACCESS_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessRole getSamlAutocreateAccessRole() {
    return samlAutocreateAccessRole;
  }


  public void setSamlAutocreateAccessRole(AccessRole samlAutocreateAccessRole) {
    this.samlAutocreateAccessRole = samlAutocreateAccessRole;
  }


  public OrgSettings samlAutocreateUsersDomains(OrgSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains) {
    
    this.samlAutocreateUsersDomains = samlAutocreateUsersDomains;
    return this;
  }

   /**
   * Get samlAutocreateUsersDomains
   * @return samlAutocreateUsersDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAML_AUTOCREATE_USERS_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrgSettingsSamlAutocreateUsersDomains getSamlAutocreateUsersDomains() {
    return samlAutocreateUsersDomains;
  }


  public void setSamlAutocreateUsersDomains(OrgSettingsSamlAutocreateUsersDomains samlAutocreateUsersDomains) {
    this.samlAutocreateUsersDomains = samlAutocreateUsersDomains;
  }


  public OrgSettings samlCanBeEnabled(Boolean samlCanBeEnabled) {
    
    this.samlCanBeEnabled = samlCanBeEnabled;
    return this;
  }

   /**
   * Whether or not SAML can be enabled for this organization.
   * @return samlCanBeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not SAML can be enabled for this organization.")
  @JsonProperty(JSON_PROPERTY_SAML_CAN_BE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSamlCanBeEnabled() {
    return samlCanBeEnabled;
  }


  public void setSamlCanBeEnabled(Boolean samlCanBeEnabled) {
    this.samlCanBeEnabled = samlCanBeEnabled;
  }


  public OrgSettings samlIdpEndpoint(String samlIdpEndpoint) {
    
    this.samlIdpEndpoint = samlIdpEndpoint;
    return this;
  }

   /**
   * Identity provider endpoint for SAML authentication.
   * @return samlIdpEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://my.saml.endpoint", value = "Identity provider endpoint for SAML authentication.")
  @JsonProperty(JSON_PROPERTY_SAML_IDP_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSamlIdpEndpoint() {
    return samlIdpEndpoint;
  }


  public void setSamlIdpEndpoint(String samlIdpEndpoint) {
    this.samlIdpEndpoint = samlIdpEndpoint;
  }


  public OrgSettings samlIdpInitiatedLogin(OrgSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin) {
    
    this.samlIdpInitiatedLogin = samlIdpInitiatedLogin;
    return this;
  }

   /**
   * Get samlIdpInitiatedLogin
   * @return samlIdpInitiatedLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAML_IDP_INITIATED_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrgSettingsSamlIdpInitiatedLogin getSamlIdpInitiatedLogin() {
    return samlIdpInitiatedLogin;
  }


  public void setSamlIdpInitiatedLogin(OrgSettingsSamlIdpInitiatedLogin samlIdpInitiatedLogin) {
    this.samlIdpInitiatedLogin = samlIdpInitiatedLogin;
  }


  public OrgSettings samlIdpMetadataUploaded(Boolean samlIdpMetadataUploaded) {
    
    this.samlIdpMetadataUploaded = samlIdpMetadataUploaded;
    return this;
  }

   /**
   * Whether or not a SAML identity provider metadata file was provided to the Datadog organization.
   * @return samlIdpMetadataUploaded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not a SAML identity provider metadata file was provided to the Datadog organization.")
  @JsonProperty(JSON_PROPERTY_SAML_IDP_METADATA_UPLOADED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSamlIdpMetadataUploaded() {
    return samlIdpMetadataUploaded;
  }


  public void setSamlIdpMetadataUploaded(Boolean samlIdpMetadataUploaded) {
    this.samlIdpMetadataUploaded = samlIdpMetadataUploaded;
  }


  public OrgSettings samlLoginUrl(String samlLoginUrl) {
    
    this.samlLoginUrl = samlLoginUrl;
    return this;
  }

   /**
   * URL for SAML loging.
   * @return samlLoginUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://my.saml.login.url", value = "URL for SAML loging.")
  @JsonProperty(JSON_PROPERTY_SAML_LOGIN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSamlLoginUrl() {
    return samlLoginUrl;
  }


  public void setSamlLoginUrl(String samlLoginUrl) {
    this.samlLoginUrl = samlLoginUrl;
  }


  public OrgSettings samlStrictMode(OrgSettingsSamlIdpInitiatedLogin samlStrictMode) {
    
    this.samlStrictMode = samlStrictMode;
    return this;
  }

   /**
   * Get samlStrictMode
   * @return samlStrictMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAML_STRICT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrgSettingsSamlIdpInitiatedLogin getSamlStrictMode() {
    return samlStrictMode;
  }


  public void setSamlStrictMode(OrgSettingsSamlIdpInitiatedLogin samlStrictMode) {
    this.samlStrictMode = samlStrictMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgSettings orgSettings = (OrgSettings) o;
    return Objects.equals(this.privateWidgetShare, orgSettings.privateWidgetShare) &&
        Objects.equals(this.saml, orgSettings.saml) &&
        Objects.equals(this.samlAutocreateAccessRole, orgSettings.samlAutocreateAccessRole) &&
        Objects.equals(this.samlAutocreateUsersDomains, orgSettings.samlAutocreateUsersDomains) &&
        Objects.equals(this.samlCanBeEnabled, orgSettings.samlCanBeEnabled) &&
        Objects.equals(this.samlIdpEndpoint, orgSettings.samlIdpEndpoint) &&
        Objects.equals(this.samlIdpInitiatedLogin, orgSettings.samlIdpInitiatedLogin) &&
        Objects.equals(this.samlIdpMetadataUploaded, orgSettings.samlIdpMetadataUploaded) &&
        Objects.equals(this.samlLoginUrl, orgSettings.samlLoginUrl) &&
        Objects.equals(this.samlStrictMode, orgSettings.samlStrictMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateWidgetShare, saml, samlAutocreateAccessRole, samlAutocreateUsersDomains, samlCanBeEnabled, samlIdpEndpoint, samlIdpInitiatedLogin, samlIdpMetadataUploaded, samlLoginUrl, samlStrictMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgSettings {\n");
    sb.append("    privateWidgetShare: ").append(toIndentedString(privateWidgetShare)).append("\n");
    sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
    sb.append("    samlAutocreateAccessRole: ").append(toIndentedString(samlAutocreateAccessRole)).append("\n");
    sb.append("    samlAutocreateUsersDomains: ").append(toIndentedString(samlAutocreateUsersDomains)).append("\n");
    sb.append("    samlCanBeEnabled: ").append(toIndentedString(samlCanBeEnabled)).append("\n");
    sb.append("    samlIdpEndpoint: ").append(toIndentedString(samlIdpEndpoint)).append("\n");
    sb.append("    samlIdpInitiatedLogin: ").append(toIndentedString(samlIdpInitiatedLogin)).append("\n");
    sb.append("    samlIdpMetadataUploaded: ").append(toIndentedString(samlIdpMetadataUploaded)).append("\n");
    sb.append("    samlLoginUrl: ").append(toIndentedString(samlLoginUrl)).append("\n");
    sb.append("    samlStrictMode: ").append(toIndentedString(samlStrictMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


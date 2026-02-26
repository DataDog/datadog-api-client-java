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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Your Google Cloud Platform Account. */
@JsonPropertyOrder({
  GCPAccount.JSON_PROPERTY_AUTH_PROVIDER_X509_CERT_URL,
  GCPAccount.JSON_PROPERTY_AUTH_URI,
  GCPAccount.JSON_PROPERTY_AUTOMUTE,
  GCPAccount.JSON_PROPERTY_CLIENT_EMAIL,
  GCPAccount.JSON_PROPERTY_CLIENT_ID,
  GCPAccount.JSON_PROPERTY_CLIENT_X509_CERT_URL,
  GCPAccount.JSON_PROPERTY_CLOUD_RUN_REVISION_FILTERS,
  GCPAccount.JSON_PROPERTY_ERRORS,
  GCPAccount.JSON_PROPERTY_HOST_FILTERS,
  GCPAccount.JSON_PROPERTY_IS_CSPM_ENABLED,
  GCPAccount.JSON_PROPERTY_IS_RESOURCE_CHANGE_COLLECTION_ENABLED,
  GCPAccount.JSON_PROPERTY_IS_SECURITY_COMMAND_CENTER_ENABLED,
  GCPAccount.JSON_PROPERTY_MONITORED_RESOURCE_CONFIGS,
  GCPAccount.JSON_PROPERTY_PRIVATE_KEY,
  GCPAccount.JSON_PROPERTY_PRIVATE_KEY_ID,
  GCPAccount.JSON_PROPERTY_PROJECT_ID,
  GCPAccount.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  GCPAccount.JSON_PROPERTY_TOKEN_URI,
  GCPAccount.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPAccount {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_PROVIDER_X509_CERT_URL =
      "auth_provider_x509_cert_url";
  private String authProviderX509CertUrl;

  public static final String JSON_PROPERTY_AUTH_URI = "auth_uri";
  private String authUri;

  public static final String JSON_PROPERTY_AUTOMUTE = "automute";
  private Boolean automute;

  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_X509_CERT_URL = "client_x509_cert_url";
  private String clientX509CertUrl;

  public static final String JSON_PROPERTY_CLOUD_RUN_REVISION_FILTERS =
      "cloud_run_revision_filters";
  private List<String> cloudRunRevisionFilters = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private String hostFilters;

  public static final String JSON_PROPERTY_IS_CSPM_ENABLED = "is_cspm_enabled";
  private Boolean isCspmEnabled;

  public static final String JSON_PROPERTY_IS_RESOURCE_CHANGE_COLLECTION_ENABLED =
      "is_resource_change_collection_enabled";
  private Boolean isResourceChangeCollectionEnabled = false;

  public static final String JSON_PROPERTY_IS_SECURITY_COMMAND_CENTER_ENABLED =
      "is_security_command_center_enabled";
  private Boolean isSecurityCommandCenterEnabled = false;

  public static final String JSON_PROPERTY_MONITORED_RESOURCE_CONFIGS =
      "monitored_resource_configs";
  private List<GCPMonitoredResourceConfig> monitoredResourceConfigs = null;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PRIVATE_KEY_ID = "private_key_id";
  private String privateKeyId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_TOKEN_URI = "token_uri";
  private String tokenUri;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public GCPAccount authProviderX509CertUrl(String authProviderX509CertUrl) {
    this.authProviderX509CertUrl = authProviderX509CertUrl;
    return this;
  }

  /**
   * Should be <code>https://www.googleapis.com/oauth2/v1/certs</code>.
   *
   * @return authProviderX509CertUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_PROVIDER_X509_CERT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthProviderX509CertUrl() {
    return authProviderX509CertUrl;
  }

  public void setAuthProviderX509CertUrl(String authProviderX509CertUrl) {
    this.authProviderX509CertUrl = authProviderX509CertUrl;
  }

  public GCPAccount authUri(String authUri) {
    this.authUri = authUri;
    return this;
  }

  /**
   * Should be <code>https://accounts.google.com/o/oauth2/auth</code>.
   *
   * @return authUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthUri() {
    return authUri;
  }

  public void setAuthUri(String authUri) {
    this.authUri = authUri;
  }

  public GCPAccount automute(Boolean automute) {
    this.automute = automute;
    return this;
  }

  /**
   * Silence monitors for expected GCE instance shutdowns.
   *
   * @return automute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutomute() {
    return automute;
  }

  public void setAutomute(Boolean automute) {
    this.automute = automute;
  }

  public GCPAccount clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * Your email found in your JSON service account key.
   *
   * @return clientEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }

  public GCPAccount clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Your ID found in your JSON service account key.
   *
   * @return clientId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public GCPAccount clientX509CertUrl(String clientX509CertUrl) {
    this.clientX509CertUrl = clientX509CertUrl;
    return this;
  }

  /**
   * Should be <code>https://www.googleapis.com/robot/v1/metadata/x509/$CLIENT_EMAIL</code> where
   * <code>$CLIENT_EMAIL</code> is the email found in your JSON service account key.
   *
   * @return clientX509CertUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_X509_CERT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientX509CertUrl() {
    return clientX509CertUrl;
  }

  public void setClientX509CertUrl(String clientX509CertUrl) {
    this.clientX509CertUrl = clientX509CertUrl;
  }

  public GCPAccount cloudRunRevisionFilters(List<String> cloudRunRevisionFilters) {
    this.cloudRunRevisionFilters = cloudRunRevisionFilters;
    return this;
  }

  public GCPAccount addCloudRunRevisionFiltersItem(String cloudRunRevisionFiltersItem) {
    if (this.cloudRunRevisionFilters == null) {
      this.cloudRunRevisionFilters = new ArrayList<>();
    }
    this.cloudRunRevisionFilters.add(cloudRunRevisionFiltersItem);
    return this;
  }

  /**
   * List of filters to limit the Cloud Run revisions that are pulled into Datadog by using tags.
   * Only Cloud Run revision resources that apply to specified filters are imported into Datadog.
   * <strong>Note:</strong> This field is deprecated. Instead, use <code>monitored_resource_configs
   * </code> with <code>type=cloud_run_revision</code>
   *
   * @return cloudRunRevisionFilters
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_RUN_REVISION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCloudRunRevisionFilters() {
    return cloudRunRevisionFilters;
  }

  @Deprecated
  public void setCloudRunRevisionFilters(List<String> cloudRunRevisionFilters) {
    this.cloudRunRevisionFilters = cloudRunRevisionFilters;
  }

  public GCPAccount errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public GCPAccount addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * An array of errors.
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public GCPAccount hostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
    return this;
  }

  /**
   * A comma-separated list of filters to limit the VM instances that are pulled into Datadog by
   * using tags. Only VM instance resources that apply to specified filters are imported into
   * Datadog. <strong>Note:</strong> This field is deprecated. Instead, use <code>
   * monitored_resource_configs</code> with <code>type=gce_instance</code>
   *
   * @return hostFilters
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostFilters() {
    return hostFilters;
  }

  @Deprecated
  public void setHostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
  }

  public GCPAccount isCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
    return this;
  }

  /**
   * When enabled, Datadog will activate the Cloud Security Monitoring product for this service
   * account. Note: This requires resource_collection_enabled to be set to true.
   *
   * @return isCspmEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CSPM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCspmEnabled() {
    return isCspmEnabled;
  }

  public void setIsCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
  }

  public GCPAccount isResourceChangeCollectionEnabled(Boolean isResourceChangeCollectionEnabled) {
    this.isResourceChangeCollectionEnabled = isResourceChangeCollectionEnabled;
    return this;
  }

  /**
   * When enabled, Datadog scans for all resource change data in your Google Cloud environment.
   *
   * @return isResourceChangeCollectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_RESOURCE_CHANGE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsResourceChangeCollectionEnabled() {
    return isResourceChangeCollectionEnabled;
  }

  public void setIsResourceChangeCollectionEnabled(Boolean isResourceChangeCollectionEnabled) {
    this.isResourceChangeCollectionEnabled = isResourceChangeCollectionEnabled;
  }

  public GCPAccount isSecurityCommandCenterEnabled(Boolean isSecurityCommandCenterEnabled) {
    this.isSecurityCommandCenterEnabled = isSecurityCommandCenterEnabled;
    return this;
  }

  /**
   * When enabled, Datadog will attempt to collect Security Command Center Findings. Note: This
   * requires additional permissions on the service account.
   *
   * @return isSecurityCommandCenterEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SECURITY_COMMAND_CENTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsSecurityCommandCenterEnabled() {
    return isSecurityCommandCenterEnabled;
  }

  public void setIsSecurityCommandCenterEnabled(Boolean isSecurityCommandCenterEnabled) {
    this.isSecurityCommandCenterEnabled = isSecurityCommandCenterEnabled;
  }

  public GCPAccount monitoredResourceConfigs(
      List<GCPMonitoredResourceConfig> monitoredResourceConfigs) {
    this.monitoredResourceConfigs = monitoredResourceConfigs;
    for (GCPMonitoredResourceConfig item : monitoredResourceConfigs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GCPAccount addMonitoredResourceConfigsItem(
      GCPMonitoredResourceConfig monitoredResourceConfigsItem) {
    if (this.monitoredResourceConfigs == null) {
      this.monitoredResourceConfigs = new ArrayList<>();
    }
    this.monitoredResourceConfigs.add(monitoredResourceConfigsItem);
    this.unparsed |= monitoredResourceConfigsItem.unparsed;
    return this;
  }

  /**
   * Configurations for GCP monitored resources.
   *
   * @return monitoredResourceConfigs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORED_RESOURCE_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GCPMonitoredResourceConfig> getMonitoredResourceConfigs() {
    return monitoredResourceConfigs;
  }

  public void setMonitoredResourceConfigs(
      List<GCPMonitoredResourceConfig> monitoredResourceConfigs) {
    this.monitoredResourceConfigs = monitoredResourceConfigs;
  }

  public GCPAccount privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Your private key name found in your JSON service account key.
   *
   * @return privateKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public GCPAccount privateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

  /**
   * Your private key ID found in your JSON service account key.
   *
   * @return privateKeyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKeyId() {
    return privateKeyId;
  }

  public void setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
  }

  public GCPAccount projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Your Google Cloud project ID found in your JSON service account key.
   *
   * @return projectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GCPAccount resourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * When enabled, Datadog scans for all resources in your GCP environment.
   *
   * @return resourceCollectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResourceCollectionEnabled() {
    return resourceCollectionEnabled;
  }

  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }

  public GCPAccount tokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
    return this;
  }

  /**
   * Should be <code>https://accounts.google.com/o/oauth2/token</code>.
   *
   * @return tokenUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenUri() {
    return tokenUri;
  }

  public void setTokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
  }

  public GCPAccount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The value for service_account found in your JSON service account key.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return GCPAccount
   */
  @JsonAnySetter
  public GCPAccount putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPAccount object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPAccount gcpAccount = (GCPAccount) o;
    return Objects.equals(this.authProviderX509CertUrl, gcpAccount.authProviderX509CertUrl)
        && Objects.equals(this.authUri, gcpAccount.authUri)
        && Objects.equals(this.automute, gcpAccount.automute)
        && Objects.equals(this.clientEmail, gcpAccount.clientEmail)
        && Objects.equals(this.clientId, gcpAccount.clientId)
        && Objects.equals(this.clientX509CertUrl, gcpAccount.clientX509CertUrl)
        && Objects.equals(this.cloudRunRevisionFilters, gcpAccount.cloudRunRevisionFilters)
        && Objects.equals(this.errors, gcpAccount.errors)
        && Objects.equals(this.hostFilters, gcpAccount.hostFilters)
        && Objects.equals(this.isCspmEnabled, gcpAccount.isCspmEnabled)
        && Objects.equals(
            this.isResourceChangeCollectionEnabled, gcpAccount.isResourceChangeCollectionEnabled)
        && Objects.equals(
            this.isSecurityCommandCenterEnabled, gcpAccount.isSecurityCommandCenterEnabled)
        && Objects.equals(this.monitoredResourceConfigs, gcpAccount.monitoredResourceConfigs)
        && Objects.equals(this.privateKey, gcpAccount.privateKey)
        && Objects.equals(this.privateKeyId, gcpAccount.privateKeyId)
        && Objects.equals(this.projectId, gcpAccount.projectId)
        && Objects.equals(this.resourceCollectionEnabled, gcpAccount.resourceCollectionEnabled)
        && Objects.equals(this.tokenUri, gcpAccount.tokenUri)
        && Objects.equals(this.type, gcpAccount.type)
        && Objects.equals(this.additionalProperties, gcpAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authProviderX509CertUrl,
        authUri,
        automute,
        clientEmail,
        clientId,
        clientX509CertUrl,
        cloudRunRevisionFilters,
        errors,
        hostFilters,
        isCspmEnabled,
        isResourceChangeCollectionEnabled,
        isSecurityCommandCenterEnabled,
        monitoredResourceConfigs,
        privateKey,
        privateKeyId,
        projectId,
        resourceCollectionEnabled,
        tokenUri,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPAccount {\n");
    sb.append("    authProviderX509CertUrl: ")
        .append(toIndentedString(authProviderX509CertUrl))
        .append("\n");
    sb.append("    authUri: ").append(toIndentedString(authUri)).append("\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientX509CertUrl: ").append(toIndentedString(clientX509CertUrl)).append("\n");
    sb.append("    cloudRunRevisionFilters: ")
        .append(toIndentedString(cloudRunRevisionFilters))
        .append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    isCspmEnabled: ").append(toIndentedString(isCspmEnabled)).append("\n");
    sb.append("    isResourceChangeCollectionEnabled: ")
        .append(toIndentedString(isResourceChangeCollectionEnabled))
        .append("\n");
    sb.append("    isSecurityCommandCenterEnabled: ")
        .append(toIndentedString(isSecurityCommandCenterEnabled))
        .append("\n");
    sb.append("    monitoredResourceConfigs: ")
        .append(toIndentedString(monitoredResourceConfigs))
        .append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyId: ").append(toIndentedString(privateKeyId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

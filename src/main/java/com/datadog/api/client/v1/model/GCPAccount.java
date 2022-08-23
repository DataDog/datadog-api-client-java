/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Your Google Cloud Platform Account.</p>
 */
@JsonPropertyOrder({
  GCPAccount.JSON_PROPERTY_AUTH_PROVIDER_X509_CERT_URL,
  GCPAccount.JSON_PROPERTY_AUTH_URI,
  GCPAccount.JSON_PROPERTY_AUTOMUTE,
  GCPAccount.JSON_PROPERTY_CLIENT_EMAIL,
  GCPAccount.JSON_PROPERTY_CLIENT_ID,
  GCPAccount.JSON_PROPERTY_CLIENT_X509_CERT_URL,
  GCPAccount.JSON_PROPERTY_ERRORS,
  GCPAccount.JSON_PROPERTY_HOST_FILTERS,
  GCPAccount.JSON_PROPERTY_PRIVATE_KEY,
  GCPAccount.JSON_PROPERTY_PRIVATE_KEY_ID,
  GCPAccount.JSON_PROPERTY_PROJECT_ID,
  GCPAccount.JSON_PROPERTY_TOKEN_URI,
  GCPAccount.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPAccount {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_PROVIDER_X509_CERT_URL = "auth_provider_x509_cert_url";
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

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private String hostFilters;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PRIVATE_KEY_ID = "private_key_id";
  private String privateKeyId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_TOKEN_URI = "token_uri";
  private String tokenUri;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public GCPAccount authProviderX509CertUrl(String authProviderX509CertUrl) {
    this.authProviderX509CertUrl = authProviderX509CertUrl;
    return this;
  }

  /**
   * <p>Should be <code>https://www.googleapis.com/oauth2/v1/certs</code>.</p>
   * @return authProviderX509CertUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH_PROVIDER_X509_CERT_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Should be <code>https://accounts.google.com/o/oauth2/auth</code>.</p>
   * @return authUri
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH_URI)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Silence monitors for expected GCE instance shutdowns.</p>
   * @return automute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTOMUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Your email found in your JSON service account key.</p>
   * @return clientEmail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Your ID found in your JSON service account key.</p>
   * @return clientId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Should be <code>https://www.googleapis.com/robot/v1/metadata/x509/$CLIENT_EMAIL</code>
   * where <code>$CLIENT_EMAIL</code> is the email found in your JSON service account key.</p>
   * @return clientX509CertUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_X509_CERT_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClientX509CertUrl() {
        return clientX509CertUrl;
      }
  public void setClientX509CertUrl(String clientX509CertUrl) {
    this.clientX509CertUrl = clientX509CertUrl;
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
   * <p>An array of errors.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Limit the GCE instances that are pulled into Datadog by using tags.
   * Only hosts that match one of the defined tags are imported into Datadog.</p>
   * @return hostFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHostFilters() {
        return hostFilters;
      }
  public void setHostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
  }
  public GCPAccount privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * <p>Your private key name found in your JSON service account key.</p>
   * @return privateKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Your private key ID found in your JSON service account key.</p>
   * @return privateKeyId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Your Google Cloud project ID found in your JSON service account key.</p>
   * @return projectId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProjectId() {
        return projectId;
      }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }
  public GCPAccount tokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
    return this;
  }

  /**
   * <p>Should be <code>https://accounts.google.com/o/oauth2/token</code>.</p>
   * @return tokenUri
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOKEN_URI)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The value for service_account found in your JSON service account key.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this GCPAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPAccount gcpAccount = (GCPAccount) o;
    return Objects.equals(this.authProviderX509CertUrl, gcpAccount.authProviderX509CertUrl) && Objects.equals(this.authUri, gcpAccount.authUri) && Objects.equals(this.automute, gcpAccount.automute) && Objects.equals(this.clientEmail, gcpAccount.clientEmail) && Objects.equals(this.clientId, gcpAccount.clientId) && Objects.equals(this.clientX509CertUrl, gcpAccount.clientX509CertUrl) && Objects.equals(this.errors, gcpAccount.errors) && Objects.equals(this.hostFilters, gcpAccount.hostFilters) && Objects.equals(this.privateKey, gcpAccount.privateKey) && Objects.equals(this.privateKeyId, gcpAccount.privateKeyId) && Objects.equals(this.projectId, gcpAccount.projectId) && Objects.equals(this.tokenUri, gcpAccount.tokenUri) && Objects.equals(this.type, gcpAccount.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authProviderX509CertUrl,authUri,automute,clientEmail,clientId,clientX509CertUrl,errors,hostFilters,privateKey,privateKeyId,projectId,tokenUri,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPAccount {\n");
    sb.append("    authProviderX509CertUrl: ").append(toIndentedString(authProviderX509CertUrl)).append("\n");
    sb.append("    authUri: ").append(toIndentedString(authUri)).append("\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientX509CertUrl: ").append(toIndentedString(clientX509CertUrl)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyId: ").append(toIndentedString(privateKeyId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

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
import java.util.UUID;
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
   * <p>Object to handle <code>SIGV4</code> authentication when performing the test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBasicAuthSigv4.JSON_PROPERTY_ACCESS_KEY,
  SyntheticsBasicAuthSigv4.JSON_PROPERTY_REGION,
  SyntheticsBasicAuthSigv4.JSON_PROPERTY_SECRET_KEY,
  SyntheticsBasicAuthSigv4.JSON_PROPERTY_SERVICE_NAME,
  SyntheticsBasicAuthSigv4.JSON_PROPERTY_SESSION_TOKEN,
  SyntheticsBasicAuthSigv4.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBasicAuthSigv4 {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY = "accessKey";
  private String accessKey;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SECRET_KEY = "secretKey";
  private String secretKey;

  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  private String serviceName;

  public static final String JSON_PROPERTY_SESSION_TOKEN = "sessionToken";
  private String sessionToken;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBasicAuthSigv4Type type = SyntheticsBasicAuthSigv4Type.SIGV4;

  public SyntheticsBasicAuthSigv4() {}

  @JsonCreator
  public SyntheticsBasicAuthSigv4(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCESS_KEY)String accessKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_SECRET_KEY)String secretKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SyntheticsBasicAuthSigv4Type type) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SyntheticsBasicAuthSigv4 accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * <p>Access key for the <code>SIGV4</code> authentication.</p>
   * @return accessKey
  **/
      @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccessKey() {
        return accessKey;
      }
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }
  public SyntheticsBasicAuthSigv4 region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>Region for the <code>SIGV4</code> authentication.</p>
   * @return region
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRegion() {
        return region;
      }
  public void setRegion(String region) {
    this.region = region;
  }
  public SyntheticsBasicAuthSigv4 secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  /**
   * <p>Secret key for the <code>SIGV4</code> authentication.</p>
   * @return secretKey
  **/
      @JsonProperty(JSON_PROPERTY_SECRET_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSecretKey() {
        return secretKey;
      }
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }
  public SyntheticsBasicAuthSigv4 serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * <p>Service name for the <code>SIGV4</code> authentication.</p>
   * @return serviceName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getServiceName() {
        return serviceName;
      }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }
  public SyntheticsBasicAuthSigv4 sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  /**
   * <p>Session token for the <code>SIGV4</code> authentication.</p>
   * @return sessionToken
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSessionToken() {
        return sessionToken;
      }
  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }
  public SyntheticsBasicAuthSigv4 type(SyntheticsBasicAuthSigv4Type type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of authentication to use when performing the test.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsBasicAuthSigv4Type getType() {
        return type;
      }
  public void setType(SyntheticsBasicAuthSigv4Type type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsBasicAuthSigv4
   */
  @JsonAnySetter
  public SyntheticsBasicAuthSigv4 putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SyntheticsBasicAuthSigv4 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBasicAuthSigv4 syntheticsBasicAuthSigv4 = (SyntheticsBasicAuthSigv4) o;
    return Objects.equals(this.accessKey, syntheticsBasicAuthSigv4.accessKey) && Objects.equals(this.region, syntheticsBasicAuthSigv4.region) && Objects.equals(this.secretKey, syntheticsBasicAuthSigv4.secretKey) && Objects.equals(this.serviceName, syntheticsBasicAuthSigv4.serviceName) && Objects.equals(this.sessionToken, syntheticsBasicAuthSigv4.sessionToken) && Objects.equals(this.type, syntheticsBasicAuthSigv4.type) && Objects.equals(this.additionalProperties, syntheticsBasicAuthSigv4.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessKey,region,secretKey,serviceName,sessionToken,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBasicAuthSigv4 {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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

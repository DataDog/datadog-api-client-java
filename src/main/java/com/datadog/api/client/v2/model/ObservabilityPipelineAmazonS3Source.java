/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>The <code>amazon_s3</code> source ingests logs from an Amazon S3 bucket.
   * It supports AWS authentication and TLS encryption.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonS3Source.JSON_PROPERTY_AUTH,
  ObservabilityPipelineAmazonS3Source.JSON_PROPERTY_ID,
  ObservabilityPipelineAmazonS3Source.JSON_PROPERTY_REGION,
  ObservabilityPipelineAmazonS3Source.JSON_PROPERTY_TLS,
  ObservabilityPipelineAmazonS3Source.JSON_PROPERTY_TYPE,
  ObservabilityPipelineAmazonS3Source.JSON_PROPERTY_URL_KEY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonS3Source {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineAwsAuth auth;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAmazonS3SourceType type = ObservabilityPipelineAmazonS3SourceType.AMAZON_S3;

  public static final String JSON_PROPERTY_URL_KEY = "url_key";
  private String urlKey;

  public ObservabilityPipelineAmazonS3Source() {}

  @JsonCreator
  public ObservabilityPipelineAmazonS3Source(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_REGION)String region,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineAmazonS3SourceType type) {
        this.id = id;
        this.region = region;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineAmazonS3Source auth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * <p>AWS authentication credentials used for accessing AWS services such as S3.
   * If omitted, the system’s default credentials are used (for example, the IAM role and environment variables).</p>
   * @return auth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineAwsAuth getAuth() {
        return auth;
      }
  public void setAuth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
  }
  public ObservabilityPipelineAmazonS3Source id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this component. Used in other parts of the pipeline to reference this component (for example, as the <code>input</code> to downstream components).</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineAmazonS3Source region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>AWS region where the S3 bucket resides.</p>
   * @return region
  **/
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRegion() {
        return region;
      }
  public void setRegion(String region) {
    this.region = region;
  }
  public ObservabilityPipelineAmazonS3Source tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * <p>Configuration for enabling TLS encryption between the pipeline component and external services.</p>
   * @return tls
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineTls getTls() {
        return tls;
      }
  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }
  public ObservabilityPipelineAmazonS3Source type(ObservabilityPipelineAmazonS3SourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The source type. Always <code>amazon_s3</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonS3SourceType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineAmazonS3SourceType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public ObservabilityPipelineAmazonS3Source urlKey(String urlKey) {
    this.urlKey = urlKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the S3 bucket URL.</p>
   * @return urlKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_URL_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUrlKey() {
        return urlKey;
      }
  public void setUrlKey(String urlKey) {
    this.urlKey = urlKey;
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
   * @return ObservabilityPipelineAmazonS3Source
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonS3Source putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineAmazonS3Source object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonS3Source observabilityPipelineAmazonS3Source = (ObservabilityPipelineAmazonS3Source) o;
    return Objects.equals(this.auth, observabilityPipelineAmazonS3Source.auth) && Objects.equals(this.id, observabilityPipelineAmazonS3Source.id) && Objects.equals(this.region, observabilityPipelineAmazonS3Source.region) && Objects.equals(this.tls, observabilityPipelineAmazonS3Source.tls) && Objects.equals(this.type, observabilityPipelineAmazonS3Source.type) && Objects.equals(this.urlKey, observabilityPipelineAmazonS3Source.urlKey) && Objects.equals(this.additionalProperties, observabilityPipelineAmazonS3Source.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(auth,id,region,tls,type,urlKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonS3Source {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlKey: ").append(toIndentedString(urlKey)).append("\n");
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

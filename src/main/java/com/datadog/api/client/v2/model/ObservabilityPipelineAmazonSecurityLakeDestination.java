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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>amazon_security_lake</code> destination sends your logs to Amazon Security Lake.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_BUCKET,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_CUSTOM_SOURCE_NAME,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_REGION,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineAmazonSecurityLakeDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonSecurityLakeDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineAwsAuth auth;

  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_CUSTOM_SOURCE_NAME = "custom_source_name";
  private String customSourceName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAmazonSecurityLakeDestinationType type =
      ObservabilityPipelineAmazonSecurityLakeDestinationType.AMAZON_SECURITY_LAKE;

  public ObservabilityPipelineAmazonSecurityLakeDestination() {}

  @JsonCreator
  public ObservabilityPipelineAmazonSecurityLakeDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET) String bucket,
      @JsonProperty(required = true, value = JSON_PROPERTY_CUSTOM_SOURCE_NAME)
          String customSourceName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAmazonSecurityLakeDestinationType type) {
    this.bucket = bucket;
    this.customSourceName = customSourceName;
    this.id = id;
    this.inputs = inputs;
    this.region = region;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination auth(
      ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * AWS authentication credentials used for accessing AWS services such as S3. If omitted, the
   * system’s default credentials are used (for example, the IAM role and environment variables).
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineAwsAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Name of the Amazon S3 bucket in Security Lake (3-63 characters).
   *
   * @return bucket
   */
  @JsonProperty(JSON_PROPERTY_BUCKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination customSourceName(
      String customSourceName) {
    this.customSourceName = customSourceName;
    return this;
  }

  /**
   * Custom source name for the logs in Security Lake.
   *
   * @return customSourceName
   */
  @JsonProperty(JSON_PROPERTY_CUSTOM_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCustomSourceName() {
    return customSourceName;
  }

  public void setCustomSourceName(String customSourceName) {
    this.customSourceName = customSourceName;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the destination component.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination region(String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region of the S3 bucket.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external services.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }

  public ObservabilityPipelineAmazonSecurityLakeDestination type(
      ObservabilityPipelineAmazonSecurityLakeDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. Always <code>amazon_security_lake</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonSecurityLakeDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAmazonSecurityLakeDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
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
   * @return ObservabilityPipelineAmazonSecurityLakeDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonSecurityLakeDestination putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ObservabilityPipelineAmazonSecurityLakeDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonSecurityLakeDestination
        observabilityPipelineAmazonSecurityLakeDestination =
            (ObservabilityPipelineAmazonSecurityLakeDestination) o;
    return Objects.equals(this.auth, observabilityPipelineAmazonSecurityLakeDestination.auth)
        && Objects.equals(this.bucket, observabilityPipelineAmazonSecurityLakeDestination.bucket)
        && Objects.equals(
            this.customSourceName,
            observabilityPipelineAmazonSecurityLakeDestination.customSourceName)
        && Objects.equals(this.id, observabilityPipelineAmazonSecurityLakeDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineAmazonSecurityLakeDestination.inputs)
        && Objects.equals(this.region, observabilityPipelineAmazonSecurityLakeDestination.region)
        && Objects.equals(this.tls, observabilityPipelineAmazonSecurityLakeDestination.tls)
        && Objects.equals(this.type, observabilityPipelineAmazonSecurityLakeDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAmazonSecurityLakeDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth, bucket, customSourceName, id, inputs, region, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonSecurityLakeDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    customSourceName: ").append(toIndentedString(customSourceName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

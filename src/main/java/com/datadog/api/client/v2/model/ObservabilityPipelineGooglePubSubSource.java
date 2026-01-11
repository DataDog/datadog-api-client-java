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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>google_pubsub</code> source ingests logs from a Google Cloud Pub/Sub subscription.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_AUTH,
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_DECODING,
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_ID,
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_PROJECT,
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_SUBSCRIPTION,
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineGooglePubSubSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGooglePubSubSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineGcpAuth auth;

  public static final String JSON_PROPERTY_DECODING = "decoding";
  private ObservabilityPipelineDecoding decoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private String project;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private String subscription;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineGooglePubSubSourceType type =
      ObservabilityPipelineGooglePubSubSourceType.GOOGLE_PUBSUB;

  public ObservabilityPipelineGooglePubSubSource() {}

  @JsonCreator
  public ObservabilityPipelineGooglePubSubSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_DECODING)
          ObservabilityPipelineDecoding decoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT) String project,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBSCRIPTION) String subscription,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineGooglePubSubSourceType type) {
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    this.id = id;
    this.project = project;
    this.subscription = subscription;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineGooglePubSubSource auth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * GCP credentials used to authenticate with Google Cloud Storage.
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineGcpAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineGooglePubSubSource decoding(ObservabilityPipelineDecoding decoding) {
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    return this;
  }

  /**
   * The decoding format used to interpret incoming logs.
   *
   * @return decoding
   */
  @JsonProperty(JSON_PROPERTY_DECODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDecoding getDecoding() {
    return decoding;
  }

  public void setDecoding(ObservabilityPipelineDecoding decoding) {
    if (!decoding.isValid()) {
      this.unparsed = true;
    }
    this.decoding = decoding;
  }

  public ObservabilityPipelineGooglePubSubSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineGooglePubSubSource project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The GCP project ID that owns the Pub/Sub subscription.
   *
   * @return project
   */
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ObservabilityPipelineGooglePubSubSource subscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * The Pub/Sub subscription name from which messages are consumed.
   *
   * @return subscription
   */
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubscription() {
    return subscription;
  }

  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }

  public ObservabilityPipelineGooglePubSubSource tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineGooglePubSubSource type(
      ObservabilityPipelineGooglePubSubSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>google_pubsub</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGooglePubSubSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineGooglePubSubSourceType type) {
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
   * @return ObservabilityPipelineGooglePubSubSource
   */
  @JsonAnySetter
  public ObservabilityPipelineGooglePubSubSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineGooglePubSubSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGooglePubSubSource observabilityPipelineGooglePubSubSource =
        (ObservabilityPipelineGooglePubSubSource) o;
    return Objects.equals(this.auth, observabilityPipelineGooglePubSubSource.auth)
        && Objects.equals(this.decoding, observabilityPipelineGooglePubSubSource.decoding)
        && Objects.equals(this.id, observabilityPipelineGooglePubSubSource.id)
        && Objects.equals(this.project, observabilityPipelineGooglePubSubSource.project)
        && Objects.equals(this.subscription, observabilityPipelineGooglePubSubSource.subscription)
        && Objects.equals(this.tls, observabilityPipelineGooglePubSubSource.tls)
        && Objects.equals(this.type, observabilityPipelineGooglePubSubSource.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineGooglePubSubSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, decoding, id, project, subscription, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGooglePubSubSource {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    decoding: ").append(toIndentedString(decoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

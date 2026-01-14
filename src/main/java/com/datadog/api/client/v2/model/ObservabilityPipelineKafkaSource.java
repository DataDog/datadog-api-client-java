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
 * The <code>kafka</code> source ingests data from Apache Kafka topics.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_GROUP_ID,
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_ID,
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_LIBRDKAFKA_OPTIONS,
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_SASL,
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_TOPICS,
  ObservabilityPipelineKafkaSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineKafkaSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private String groupId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIBRDKAFKA_OPTIONS = "librdkafka_options";
  private List<ObservabilityPipelineKafkaSourceLibrdkafkaOption> librdkafkaOptions = null;

  public static final String JSON_PROPERTY_SASL = "sasl";
  private ObservabilityPipelineKafkaSourceSasl sasl;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TOPICS = "topics";
  private List<String> topics = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineKafkaSourceType type = ObservabilityPipelineKafkaSourceType.KAFKA;

  public ObservabilityPipelineKafkaSource() {}

  @JsonCreator
  public ObservabilityPipelineKafkaSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_ID) String groupId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOPICS) List<String> topics,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineKafkaSourceType type) {
    this.groupId = groupId;
    this.id = id;
    this.topics = topics;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineKafkaSource groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Consumer group ID used by the Kafka client.
   *
   * @return groupId
   */
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ObservabilityPipelineKafkaSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this component in other parts of
   * the pipeline (e.g., as input to downstream components).
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

  public ObservabilityPipelineKafkaSource librdkafkaOptions(
      List<ObservabilityPipelineKafkaSourceLibrdkafkaOption> librdkafkaOptions) {
    this.librdkafkaOptions = librdkafkaOptions;
    for (ObservabilityPipelineKafkaSourceLibrdkafkaOption item : librdkafkaOptions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineKafkaSource addLibrdkafkaOptionsItem(
      ObservabilityPipelineKafkaSourceLibrdkafkaOption librdkafkaOptionsItem) {
    if (this.librdkafkaOptions == null) {
      this.librdkafkaOptions = new ArrayList<>();
    }
    this.librdkafkaOptions.add(librdkafkaOptionsItem);
    this.unparsed |= librdkafkaOptionsItem.unparsed;
    return this;
  }

  /**
   * Optional list of advanced Kafka client configuration options, defined as key-value pairs.
   *
   * @return librdkafkaOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIBRDKAFKA_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineKafkaSourceLibrdkafkaOption> getLibrdkafkaOptions() {
    return librdkafkaOptions;
  }

  public void setLibrdkafkaOptions(
      List<ObservabilityPipelineKafkaSourceLibrdkafkaOption> librdkafkaOptions) {
    this.librdkafkaOptions = librdkafkaOptions;
  }

  public ObservabilityPipelineKafkaSource sasl(ObservabilityPipelineKafkaSourceSasl sasl) {
    this.sasl = sasl;
    this.unparsed |= sasl.unparsed;
    return this;
  }

  /**
   * Specifies the SASL mechanism for authenticating with a Kafka cluster.
   *
   * @return sasl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SASL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineKafkaSourceSasl getSasl() {
    return sasl;
  }

  public void setSasl(ObservabilityPipelineKafkaSourceSasl sasl) {
    this.sasl = sasl;
  }

  public ObservabilityPipelineKafkaSource tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineKafkaSource topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public ObservabilityPipelineKafkaSource addTopicsItem(String topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * A list of Kafka topic names to subscribe to. The source ingests messages from each topic
   * specified.
   *
   * @return topics
   */
  @JsonProperty(JSON_PROPERTY_TOPICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  public ObservabilityPipelineKafkaSource type(ObservabilityPipelineKafkaSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>kafka</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineKafkaSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineKafkaSourceType type) {
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
   * @return ObservabilityPipelineKafkaSource
   */
  @JsonAnySetter
  public ObservabilityPipelineKafkaSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineKafkaSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineKafkaSource observabilityPipelineKafkaSource =
        (ObservabilityPipelineKafkaSource) o;
    return Objects.equals(this.groupId, observabilityPipelineKafkaSource.groupId)
        && Objects.equals(this.id, observabilityPipelineKafkaSource.id)
        && Objects.equals(
            this.librdkafkaOptions, observabilityPipelineKafkaSource.librdkafkaOptions)
        && Objects.equals(this.sasl, observabilityPipelineKafkaSource.sasl)
        && Objects.equals(this.tls, observabilityPipelineKafkaSource.tls)
        && Objects.equals(this.topics, observabilityPipelineKafkaSource.topics)
        && Objects.equals(this.type, observabilityPipelineKafkaSource.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineKafkaSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        groupId, id, librdkafkaOptions, sasl, tls, topics, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineKafkaSource {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    librdkafkaOptions: ").append(toIndentedString(librdkafkaOptions)).append("\n");
    sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

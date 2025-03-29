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

/** The <code>kafka</code> source ingests data from Apache Kafka topics. */
@JsonPropertyOrder({
  KafkaSource.JSON_PROPERTY_GROUP_ID,
  KafkaSource.JSON_PROPERTY_ID,
  KafkaSource.JSON_PROPERTY_LIBRDKAFKA_OPTIONS,
  KafkaSource.JSON_PROPERTY_SASL,
  KafkaSource.JSON_PROPERTY_TLS,
  KafkaSource.JSON_PROPERTY_TOPICS,
  KafkaSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class KafkaSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private String groupId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIBRDKAFKA_OPTIONS = "librdkafka_options";
  private List<KafkaSourceLibrdkafkaOptionsItems> librdkafkaOptions = null;

  public static final String JSON_PROPERTY_SASL = "sasl";
  private KafkaSourceSasl sasl;

  public static final String JSON_PROPERTY_TLS = "tls";
  private Tls tls;

  public static final String JSON_PROPERTY_TOPICS = "topics";
  private List<String> topics = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private KafkaSourceType type;

  public KafkaSource() {}

  @JsonCreator
  public KafkaSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_ID) String groupId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOPICS) List<String> topics,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) KafkaSourceType type) {
    this.groupId = groupId;
    this.id = id;
    this.topics = topics;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public KafkaSource groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The <code>KafkaSource</code> <code>group_id</code>.
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

  public KafkaSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The <code>KafkaSource</code> <code>id</code>.
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

  public KafkaSource librdkafkaOptions(List<KafkaSourceLibrdkafkaOptionsItems> librdkafkaOptions) {
    this.librdkafkaOptions = librdkafkaOptions;
    for (KafkaSourceLibrdkafkaOptionsItems item : librdkafkaOptions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public KafkaSource addLibrdkafkaOptionsItem(
      KafkaSourceLibrdkafkaOptionsItems librdkafkaOptionsItem) {
    if (this.librdkafkaOptions == null) {
      this.librdkafkaOptions = new ArrayList<>();
    }
    this.librdkafkaOptions.add(librdkafkaOptionsItem);
    this.unparsed |= librdkafkaOptionsItem.unparsed;
    return this;
  }

  /**
   * The <code>KafkaSource</code> <code>librdkafka_options</code>.
   *
   * @return librdkafkaOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIBRDKAFKA_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<KafkaSourceLibrdkafkaOptionsItems> getLibrdkafkaOptions() {
    return librdkafkaOptions;
  }

  public void setLibrdkafkaOptions(List<KafkaSourceLibrdkafkaOptionsItems> librdkafkaOptions) {
    this.librdkafkaOptions = librdkafkaOptions;
  }

  public KafkaSource sasl(KafkaSourceSasl sasl) {
    this.sasl = sasl;
    this.unparsed |= sasl.unparsed;
    return this;
  }

  /**
   * The definition of <code>KafkaSourceSasl</code> object.
   *
   * @return sasl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SASL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public KafkaSourceSasl getSasl() {
    return sasl;
  }

  public void setSasl(KafkaSourceSasl sasl) {
    this.sasl = sasl;
  }

  public KafkaSource tls(Tls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * The definition of <code>Tls</code> object.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Tls getTls() {
    return tls;
  }

  public void setTls(Tls tls) {
    this.tls = tls;
  }

  public KafkaSource topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public KafkaSource addTopicsItem(String topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * The <code>KafkaSource</code> <code>topics</code>.
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

  public KafkaSource type(KafkaSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of <code>KafkaSourceType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public KafkaSourceType getType() {
    return type;
  }

  public void setType(KafkaSourceType type) {
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
   * @return KafkaSource
   */
  @JsonAnySetter
  public KafkaSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this KafkaSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaSource kafkaSource = (KafkaSource) o;
    return Objects.equals(this.groupId, kafkaSource.groupId)
        && Objects.equals(this.id, kafkaSource.id)
        && Objects.equals(this.librdkafkaOptions, kafkaSource.librdkafkaOptions)
        && Objects.equals(this.sasl, kafkaSource.sasl)
        && Objects.equals(this.tls, kafkaSource.tls)
        && Objects.equals(this.topics, kafkaSource.topics)
        && Objects.equals(this.type, kafkaSource.type)
        && Objects.equals(this.additionalProperties, kafkaSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        groupId, id, librdkafkaOptions, sasl, tls, topics, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaSource {\n");
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

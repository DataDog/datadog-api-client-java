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
   * <p>Recommended resource values for a Spark driver or executor, derived from recent real usage metrics. Used by SPA to propose more efficient pod sizing.</p>
 */
@JsonPropertyOrder({
  Estimation.JSON_PROPERTY_CPU,
  Estimation.JSON_PROPERTY_EPHEMERAL_STORAGE,
  Estimation.JSON_PROPERTY_HEAP,
  Estimation.JSON_PROPERTY_MEMORY,
  Estimation.JSON_PROPERTY_OVERHEAD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Estimation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CPU = "cpu";
  private Cpu cpu;

  public static final String JSON_PROPERTY_EPHEMERAL_STORAGE = "ephemeral_storage";
  private Long ephemeralStorage;

  public static final String JSON_PROPERTY_HEAP = "heap";
  private Long heap;

  public static final String JSON_PROPERTY_MEMORY = "memory";
  private Long memory;

  public static final String JSON_PROPERTY_OVERHEAD = "overhead";
  private Long overhead;

  public Estimation cpu(Cpu cpu) {
    this.cpu = cpu;
    this.unparsed |= cpu.unparsed;
    return this;
  }

  /**
   * <p>CPU usage statistics derived from historical Spark job metrics. Provides multiple estimates so users can choose between conservative and cost-saving risk profiles.</p>
   * @return cpu
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CPU)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Cpu getCpu() {
        return cpu;
      }
  public void setCpu(Cpu cpu) {
    this.cpu = cpu;
  }
  public Estimation ephemeralStorage(Long ephemeralStorage) {
    this.ephemeralStorage = ephemeralStorage;
    return this;
  }

  /**
   * <p>Recommended ephemeral storage allocation (in MiB). Derived from job temporary storage patterns.</p>
   * @return ephemeralStorage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EPHEMERAL_STORAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEphemeralStorage() {
        return ephemeralStorage;
      }
  public void setEphemeralStorage(Long ephemeralStorage) {
    this.ephemeralStorage = ephemeralStorage;
  }
  public Estimation heap(Long heap) {
    this.heap = heap;
    return this;
  }

  /**
   * <p>Recommended JVM heap size (in MiB).</p>
   * @return heap
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HEAP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getHeap() {
        return heap;
      }
  public void setHeap(Long heap) {
    this.heap = heap;
  }
  public Estimation memory(Long memory) {
    this.memory = memory;
    return this;
  }

  /**
   * <p>Recommended total memory allocation (in MiB). Includes both heap and overhead.</p>
   * @return memory
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MEMORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMemory() {
        return memory;
      }
  public void setMemory(Long memory) {
    this.memory = memory;
  }
  public Estimation overhead(Long overhead) {
    this.overhead = overhead;
    return this;
  }

  /**
   * <p>Recommended JVM overhead (in MiB). Computed as total memory - heap.</p>
   * @return overhead
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OVERHEAD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOverhead() {
        return overhead;
      }
  public void setOverhead(Long overhead) {
    this.overhead = overhead;
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
   * @return Estimation
   */
  @JsonAnySetter
  public Estimation putAdditionalProperty(String key, Object value) {
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
   * Return true if this Estimation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Estimation estimation = (Estimation) o;
    return Objects.equals(this.cpu, estimation.cpu) && Objects.equals(this.ephemeralStorage, estimation.ephemeralStorage) && Objects.equals(this.heap, estimation.heap) && Objects.equals(this.memory, estimation.memory) && Objects.equals(this.overhead, estimation.overhead) && Objects.equals(this.additionalProperties, estimation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cpu,ephemeralStorage,heap,memory,overhead, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Estimation {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    ephemeralStorage: ").append(toIndentedString(ephemeralStorage)).append("\n");
    sb.append("    heap: ").append(toIndentedString(heap)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
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

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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The subtype of the Synthetic API test, <code>http</code>, <code>ssl</code>, <code>tcp</code>,
   * <code>dns</code>, <code>icmp</code>, <code>udp</code>, <code>websocket</code>, <code>grpc</code> or <code>multi</code>.</p>
 */
@JsonSerialize(using = SyntheticsTestDetailsSubType.SyntheticsTestDetailsSubTypeSerializer.class)
public class SyntheticsTestDetailsSubType {

  public static final SyntheticsTestDetailsSubType HTTP = new SyntheticsTestDetailsSubType("http");
  public static final SyntheticsTestDetailsSubType SSL = new SyntheticsTestDetailsSubType("ssl");
  public static final SyntheticsTestDetailsSubType TCP = new SyntheticsTestDetailsSubType("tcp");
  public static final SyntheticsTestDetailsSubType DNS = new SyntheticsTestDetailsSubType("dns");
  public static final SyntheticsTestDetailsSubType MULTI = new SyntheticsTestDetailsSubType("multi");
  public static final SyntheticsTestDetailsSubType ICMP = new SyntheticsTestDetailsSubType("icmp");
  public static final SyntheticsTestDetailsSubType UDP = new SyntheticsTestDetailsSubType("udp");
  public static final SyntheticsTestDetailsSubType WEBSOCKET = new SyntheticsTestDetailsSubType("websocket");
  public static final SyntheticsTestDetailsSubType GRPC = new SyntheticsTestDetailsSubType("grpc");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("http", "ssl", "tcp", "dns", "multi", "icmp", "udp", "websocket", "grpc"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsTestDetailsSubType(String value) {
    this.value = value;
  }

  public static class SyntheticsTestDetailsSubTypeSerializer extends StdSerializer<SyntheticsTestDetailsSubType> {
      public SyntheticsTestDetailsSubTypeSerializer(Class<SyntheticsTestDetailsSubType> t) {
          super(t);
      }

      public SyntheticsTestDetailsSubTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsTestDetailsSubType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Return true if this SyntheticsTestDetailsSubType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsTestDetailsSubType) o).value);
  }

  @Override
  public int hashCode() {
      return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsTestDetailsSubType fromValue(String value) {
    return new SyntheticsTestDetailsSubType(value);
  }
}

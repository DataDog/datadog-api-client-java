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
   * <p>A numeric representation of the type of the service level objective (<code>0</code> for
   * monitor, <code>1</code> for metric). Always included in service level objective responses.
   * Ignored in create/update requests.</p>
 */
@JsonSerialize(using = SLOTypeNumeric.SLOTypeNumericSerializer.class)
public class SLOTypeNumeric {

  public static final SLOTypeNumeric MONITOR = new SLOTypeNumeric(0);
  public static final SLOTypeNumeric METRIC = new SLOTypeNumeric(1);

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1));

  private Integer value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SLOTypeNumeric(Integer value) {
    this.value = value;
  }

  public static class SLOTypeNumericSerializer extends StdSerializer<SLOTypeNumeric> {
      public SLOTypeNumericSerializer(Class<SLOTypeNumeric> t) {
          super(t);
      }

      public SLOTypeNumericSerializer() {
          this(null);
      }

      @Override
      public void serialize(SLOTypeNumeric value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonValue
  public Integer getValue() {
    return this.value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * Return true if this SLOTypeNumeric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SLOTypeNumeric) o).value);
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
  public static SLOTypeNumeric fromValue(Integer value) {
    return new SLOTypeNumeric(value);
  }
}

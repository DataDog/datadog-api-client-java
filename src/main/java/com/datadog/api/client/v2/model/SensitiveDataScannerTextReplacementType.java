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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Type of the replacement text. None means no replacement.
   * hash means the data will be stubbed. replacement_string means that
   * one can chose a text to replace the data. partial_replacement_from_beginning
   * allows a user to partially replace the data from the beginning, and
   * partial_replacement_from_end on the other hand, allows to replace data from
   * the end.</p>
 */
@JsonSerialize(using = SensitiveDataScannerTextReplacementType.SensitiveDataScannerTextReplacementTypeSerializer.class)
public class SensitiveDataScannerTextReplacementType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("none", "hash", "replacement_string", "partial_replacement_from_beginning", "partial_replacement_from_end"));

  public static final SensitiveDataScannerTextReplacementType NONE = new SensitiveDataScannerTextReplacementType("none");
  public static final SensitiveDataScannerTextReplacementType HASH = new SensitiveDataScannerTextReplacementType("hash");
  public static final SensitiveDataScannerTextReplacementType REPLACEMENT_STRING = new SensitiveDataScannerTextReplacementType("replacement_string");
  public static final SensitiveDataScannerTextReplacementType PARTIAL_REPLACEMENT_FROM_BEGINNING = new SensitiveDataScannerTextReplacementType("partial_replacement_from_beginning");
  public static final SensitiveDataScannerTextReplacementType PARTIAL_REPLACEMENT_FROM_END = new SensitiveDataScannerTextReplacementType("partial_replacement_from_end");


  SensitiveDataScannerTextReplacementType(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerTextReplacementTypeSerializer extends StdSerializer<SensitiveDataScannerTextReplacementType> {
      public SensitiveDataScannerTextReplacementTypeSerializer(Class<SensitiveDataScannerTextReplacementType> t) {
          super(t);
      }

      public SensitiveDataScannerTextReplacementTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SensitiveDataScannerTextReplacementType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SensitiveDataScannerTextReplacementType fromValue(String value) {
    return new SensitiveDataScannerTextReplacementType(value);
  }
}

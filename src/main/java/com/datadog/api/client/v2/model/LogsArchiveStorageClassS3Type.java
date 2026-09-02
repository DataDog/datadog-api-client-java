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
   * <p>The storage class where the archive will be stored.</p>
 */
@JsonSerialize(using = LogsArchiveStorageClassS3Type.LogsArchiveStorageClassS3TypeSerializer.class)
public class LogsArchiveStorageClassS3Type extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("STANDARD", "STANDARD_IA", "ONEZONE_IA", "INTELLIGENT_TIERING", "GLACIER_IR"));

  public static final LogsArchiveStorageClassS3Type STANDARD = new LogsArchiveStorageClassS3Type("STANDARD");
  public static final LogsArchiveStorageClassS3Type STANDARD_IA = new LogsArchiveStorageClassS3Type("STANDARD_IA");
  public static final LogsArchiveStorageClassS3Type ONEZONE_IA = new LogsArchiveStorageClassS3Type("ONEZONE_IA");
  public static final LogsArchiveStorageClassS3Type INTELLIGENT_TIERING = new LogsArchiveStorageClassS3Type("INTELLIGENT_TIERING");
  public static final LogsArchiveStorageClassS3Type GLACIER_IR = new LogsArchiveStorageClassS3Type("GLACIER_IR");


  LogsArchiveStorageClassS3Type(String value) {
    super(value, allowedValues);
  }

  public static class LogsArchiveStorageClassS3TypeSerializer extends StdSerializer<LogsArchiveStorageClassS3Type> {
      public LogsArchiveStorageClassS3TypeSerializer(Class<LogsArchiveStorageClassS3Type> t) {
          super(t);
      }

      public LogsArchiveStorageClassS3TypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(LogsArchiveStorageClassS3Type value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static LogsArchiveStorageClassS3Type fromValue(String value) {
    return new LogsArchiveStorageClassS3Type(value);
  }
}

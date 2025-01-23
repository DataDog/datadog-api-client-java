/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Type of S3 encryption for a destination. */
@JsonSerialize(using = LogsArchiveEncryptionS3Type.LogsArchiveEncryptionS3TypeSerializer.class)
public class LogsArchiveEncryptionS3Type extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("NO_OVERRIDE", "SSE_S3", "SSE_KMS"));

  public static final LogsArchiveEncryptionS3Type NO_OVERRIDE =
      new LogsArchiveEncryptionS3Type("NO_OVERRIDE");
  public static final LogsArchiveEncryptionS3Type SSE_S3 =
      new LogsArchiveEncryptionS3Type("SSE_S3");
  public static final LogsArchiveEncryptionS3Type SSE_KMS =
      new LogsArchiveEncryptionS3Type("SSE_KMS");

  LogsArchiveEncryptionS3Type(String value) {
    super(value, allowedValues);
  }

  public static class LogsArchiveEncryptionS3TypeSerializer
      extends StdSerializer<LogsArchiveEncryptionS3Type> {
    public LogsArchiveEncryptionS3TypeSerializer(Class<LogsArchiveEncryptionS3Type> t) {
      super(t);
    }

    public LogsArchiveEncryptionS3TypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArchiveEncryptionS3Type value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsArchiveEncryptionS3Type fromValue(String value) {
    return new LogsArchiveEncryptionS3Type(value);
  }
}

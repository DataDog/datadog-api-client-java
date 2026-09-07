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

/** Type of the S3 archive destination. */
@JsonSerialize(using = LogsArchiveDestinationS3Type.LogsArchiveDestinationS3TypeSerializer.class)
public class LogsArchiveDestinationS3Type extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("s3"));

  public static final LogsArchiveDestinationS3Type S3 = new LogsArchiveDestinationS3Type("s3");

  LogsArchiveDestinationS3Type(String value) {
    super(value, allowedValues);
  }

  public static class LogsArchiveDestinationS3TypeSerializer
      extends StdSerializer<LogsArchiveDestinationS3Type> {
    public LogsArchiveDestinationS3TypeSerializer(Class<LogsArchiveDestinationS3Type> t) {
      super(t);
    }

    public LogsArchiveDestinationS3TypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArchiveDestinationS3Type value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsArchiveDestinationS3Type fromValue(String value) {
    return new LogsArchiveDestinationS3Type(value);
  }
}

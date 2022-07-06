/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Type of the S3 archive destination. */
@JsonSerialize(using = LogsArchiveDestinationS3Type.LogsArchiveDestinationS3TypeSerializer.class)
public class LogsArchiveDestinationS3Type {

  public static final LogsArchiveDestinationS3Type S3 = new LogsArchiveDestinationS3Type("s3");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("s3"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  LogsArchiveDestinationS3Type(String value) {
    this.value = value;
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

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this LogsArchiveDestinationS3Type object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((LogsArchiveDestinationS3Type) o).value);
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
  public static LogsArchiveDestinationS3Type fromValue(String value) {
    return new LogsArchiveDestinationS3Type(value);
  }
}

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        SecurityRuntimePatternStreamQueryDataSource
            .SecurityRuntimePatternStreamQueryDataSourceSerializer.class)
public class SecurityRuntimePatternStreamQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_runtime_pattern_stream"));

  public static final SecurityRuntimePatternStreamQueryDataSource SECURITY_RUNTIME_PATTERN_STREAM =
      new SecurityRuntimePatternStreamQueryDataSource("security_runtime_pattern_stream");

  SecurityRuntimePatternStreamQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class SecurityRuntimePatternStreamQueryDataSourceSerializer
      extends StdSerializer<SecurityRuntimePatternStreamQueryDataSource> {
    public SecurityRuntimePatternStreamQueryDataSourceSerializer(
        Class<SecurityRuntimePatternStreamQueryDataSource> t) {
      super(t);
    }

    public SecurityRuntimePatternStreamQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityRuntimePatternStreamQueryDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityRuntimePatternStreamQueryDataSource fromValue(String value) {
    return new SecurityRuntimePatternStreamQueryDataSource(value);
  }
}

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

/** Product that reported the error. <code>NONE</code> when the error has no known origin. */
@JsonSerialize(using = IssueSampleDataSource.IssueSampleDataSourceSerializer.class)
public class IssueSampleDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("APM", "LOGS", "RUM", "LLMOBS", "SYNTHETICS", "NONE"));

  public static final IssueSampleDataSource APM = new IssueSampleDataSource("APM");
  public static final IssueSampleDataSource LOGS = new IssueSampleDataSource("LOGS");
  public static final IssueSampleDataSource RUM = new IssueSampleDataSource("RUM");
  public static final IssueSampleDataSource LLMOBS = new IssueSampleDataSource("LLMOBS");
  public static final IssueSampleDataSource SYNTHETICS = new IssueSampleDataSource("SYNTHETICS");
  public static final IssueSampleDataSource NONE = new IssueSampleDataSource("NONE");

  IssueSampleDataSource(String value) {
    super(value, allowedValues);
  }

  public static class IssueSampleDataSourceSerializer extends StdSerializer<IssueSampleDataSource> {
    public IssueSampleDataSourceSerializer(Class<IssueSampleDataSource> t) {
      super(t);
    }

    public IssueSampleDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssueSampleDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueSampleDataSource fromValue(String value) {
    return new IssueSampleDataSource(value);
  }
}

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

/** The type of retention filter. */
@JsonSerialize(using = RetentionFilterAllType.RetentionFilterAllTypeSerializer.class)
public class RetentionFilterAllType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "spans-sampling-processor",
              "spans-errors-sampling-processor",
              "spans-appsec-sampling-processor"));

  public static final RetentionFilterAllType SPANS_SAMPLING_PROCESSOR =
      new RetentionFilterAllType("spans-sampling-processor");
  public static final RetentionFilterAllType SPANS_ERRORS_SAMPLING_PROCESSOR =
      new RetentionFilterAllType("spans-errors-sampling-processor");
  public static final RetentionFilterAllType SPANS_APPSEC_SAMPLING_PROCESSOR =
      new RetentionFilterAllType("spans-appsec-sampling-processor");

  RetentionFilterAllType(String value) {
    super(value, allowedValues);
  }

  public static class RetentionFilterAllTypeSerializer
      extends StdSerializer<RetentionFilterAllType> {
    public RetentionFilterAllTypeSerializer(Class<RetentionFilterAllType> t) {
      super(t);
    }

    public RetentionFilterAllTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionFilterAllType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionFilterAllType fromValue(String value) {
    return new RetentionFilterAllType(value);
  }
}

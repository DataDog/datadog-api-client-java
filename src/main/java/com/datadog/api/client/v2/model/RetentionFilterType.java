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

/** The type of retention filter. The value should always be spans-sampling-processor. */
@JsonSerialize(using = RetentionFilterType.RetentionFilterTypeSerializer.class)
public class RetentionFilterType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("spans-sampling-processor"));

  public static final RetentionFilterType SPANS_SAMPLING_PROCESSOR =
      new RetentionFilterType("spans-sampling-processor");

  RetentionFilterType(String value) {
    super(value, allowedValues);
  }

  public static class RetentionFilterTypeSerializer extends StdSerializer<RetentionFilterType> {
    public RetentionFilterTypeSerializer(Class<RetentionFilterType> t) {
      super(t);
    }

    public RetentionFilterTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionFilterType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionFilterType fromValue(String value) {
    return new RetentionFilterType(value);
  }
}

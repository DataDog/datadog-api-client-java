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

/** The type of the resource. The value should always be retention_filters. */
@JsonSerialize(using = RumRetentionFilterType.RumRetentionFilterTypeSerializer.class)
public class RumRetentionFilterType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("retention_filters"));

  public static final RumRetentionFilterType RETENTION_FILTERS =
      new RumRetentionFilterType("retention_filters");

  RumRetentionFilterType(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionFilterTypeSerializer
      extends StdSerializer<RumRetentionFilterType> {
    public RumRetentionFilterTypeSerializer(Class<RumRetentionFilterType> t) {
      super(t);
    }

    public RumRetentionFilterTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionFilterType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionFilterType fromValue(String value) {
    return new RumRetentionFilterType(value);
  }
}

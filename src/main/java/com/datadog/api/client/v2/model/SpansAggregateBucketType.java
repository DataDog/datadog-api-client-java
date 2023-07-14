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

/** The spans aggregate bucket type. */
@JsonSerialize(using = SpansAggregateBucketType.SpansAggregateBucketTypeSerializer.class)
public class SpansAggregateBucketType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("bucket"));

  public static final SpansAggregateBucketType BUCKET = new SpansAggregateBucketType("bucket");

  SpansAggregateBucketType(String value) {
    super(value, allowedValues);
  }

  public static class SpansAggregateBucketTypeSerializer
      extends StdSerializer<SpansAggregateBucketType> {
    public SpansAggregateBucketTypeSerializer(Class<SpansAggregateBucketType> t) {
      super(t);
    }

    public SpansAggregateBucketTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SpansAggregateBucketType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpansAggregateBucketType fromValue(String value) {
    return new SpansAggregateBucketType(value);
  }
}

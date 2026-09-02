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

/**
 * The source type for creating reference table data. Only these source types can be created through
 * this API.
 */
@JsonSerialize(
    using = ReferenceTableCreateSourceType.ReferenceTableCreateSourceTypeSerializer.class)
public class ReferenceTableCreateSourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("LOCAL_FILE", "S3", "GCS", "AZURE"));

  public static final ReferenceTableCreateSourceType LOCAL_FILE =
      new ReferenceTableCreateSourceType("LOCAL_FILE");
  public static final ReferenceTableCreateSourceType S3 = new ReferenceTableCreateSourceType("S3");
  public static final ReferenceTableCreateSourceType GCS =
      new ReferenceTableCreateSourceType("GCS");
  public static final ReferenceTableCreateSourceType AZURE =
      new ReferenceTableCreateSourceType("AZURE");

  ReferenceTableCreateSourceType(String value) {
    super(value, allowedValues);
  }

  public static class ReferenceTableCreateSourceTypeSerializer
      extends StdSerializer<ReferenceTableCreateSourceType> {
    public ReferenceTableCreateSourceTypeSerializer(Class<ReferenceTableCreateSourceType> t) {
      super(t);
    }

    public ReferenceTableCreateSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReferenceTableCreateSourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReferenceTableCreateSourceType fromValue(String value) {
    return new ReferenceTableCreateSourceType(value);
  }
}

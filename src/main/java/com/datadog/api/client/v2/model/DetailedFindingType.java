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

/** The JSON:API type for findings that have the message and resource configuration. */
@JsonSerialize(using = DetailedFindingType.DetailedFindingTypeSerializer.class)
public class DetailedFindingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("detailed_finding"));

  public static final DetailedFindingType DETAILED_FINDING =
      new DetailedFindingType("detailed_finding");

  DetailedFindingType(String value) {
    super(value, allowedValues);
  }

  public static class DetailedFindingTypeSerializer extends StdSerializer<DetailedFindingType> {
    public DetailedFindingTypeSerializer(Class<DetailedFindingType> t) {
      super(t);
    }

    public DetailedFindingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DetailedFindingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DetailedFindingType fromValue(String value) {
    return new DetailedFindingType(value);
  }
}

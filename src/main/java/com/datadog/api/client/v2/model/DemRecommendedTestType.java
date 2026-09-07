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

/** The type identifier for a recommended synthetic test. */
@JsonSerialize(using = DemRecommendedTestType.DemRecommendedTestTypeSerializer.class)
public class DemRecommendedTestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("recommended_tests"));

  public static final DemRecommendedTestType RECOMMENDED_TESTS =
      new DemRecommendedTestType("recommended_tests");

  DemRecommendedTestType(String value) {
    super(value, allowedValues);
  }

  public static class DemRecommendedTestTypeSerializer
      extends StdSerializer<DemRecommendedTestType> {
    public DemRecommendedTestTypeSerializer(Class<DemRecommendedTestType> t) {
      super(t);
    }

    public DemRecommendedTestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DemRecommendedTestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DemRecommendedTestType fromValue(String value) {
    return new DemRecommendedTestType(value);
  }
}

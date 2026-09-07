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

/** The impact level of the flaky test, derived from its impact score. */
@JsonSerialize(using = FlakyTestImpactLevel.FlakyTestImpactLevelSerializer.class)
public class FlakyTestImpactLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "medium", "high"));

  public static final FlakyTestImpactLevel LOW = new FlakyTestImpactLevel("low");
  public static final FlakyTestImpactLevel MEDIUM = new FlakyTestImpactLevel("medium");
  public static final FlakyTestImpactLevel HIGH = new FlakyTestImpactLevel("high");

  FlakyTestImpactLevel(String value) {
    super(value, allowedValues);
  }

  public static class FlakyTestImpactLevelSerializer extends StdSerializer<FlakyTestImpactLevel> {
    public FlakyTestImpactLevelSerializer(Class<FlakyTestImpactLevel> t) {
      super(t);
    }

    public FlakyTestImpactLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlakyTestImpactLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlakyTestImpactLevel fromValue(String value) {
    return new FlakyTestImpactLevel(value);
  }
}

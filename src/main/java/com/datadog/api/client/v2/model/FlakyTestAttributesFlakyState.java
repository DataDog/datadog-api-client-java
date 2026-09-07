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

/** The current state of the flaky test. */
@JsonSerialize(using = FlakyTestAttributesFlakyState.FlakyTestAttributesFlakyStateSerializer.class)
public class FlakyTestAttributesFlakyState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "fixed", "quarantined", "disabled"));

  public static final FlakyTestAttributesFlakyState ACTIVE =
      new FlakyTestAttributesFlakyState("active");
  public static final FlakyTestAttributesFlakyState FIXED =
      new FlakyTestAttributesFlakyState("fixed");
  public static final FlakyTestAttributesFlakyState QUARANTINED =
      new FlakyTestAttributesFlakyState("quarantined");
  public static final FlakyTestAttributesFlakyState DISABLED =
      new FlakyTestAttributesFlakyState("disabled");

  FlakyTestAttributesFlakyState(String value) {
    super(value, allowedValues);
  }

  public static class FlakyTestAttributesFlakyStateSerializer
      extends StdSerializer<FlakyTestAttributesFlakyState> {
    public FlakyTestAttributesFlakyStateSerializer(Class<FlakyTestAttributesFlakyState> t) {
      super(t);
    }

    public FlakyTestAttributesFlakyStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlakyTestAttributesFlakyState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlakyTestAttributesFlakyState fromValue(String value) {
    return new FlakyTestAttributesFlakyState(value);
  }
}

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
 * Current state of the grant associated with an approved request. Replaced means a newer grant
 * superseded this grant. The newer grant might no longer be active. This field is absent for
 * requests that weren't approved.
 */
@JsonSerialize(
    using = TemporaryGrantRequestGrantState.TemporaryGrantRequestGrantStateSerializer.class)
public class TemporaryGrantRequestGrantState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "expired", "revoked", "replaced"));

  public static final TemporaryGrantRequestGrantState ACTIVE =
      new TemporaryGrantRequestGrantState("active");
  public static final TemporaryGrantRequestGrantState EXPIRED =
      new TemporaryGrantRequestGrantState("expired");
  public static final TemporaryGrantRequestGrantState REVOKED =
      new TemporaryGrantRequestGrantState("revoked");
  public static final TemporaryGrantRequestGrantState REPLACED =
      new TemporaryGrantRequestGrantState("replaced");

  TemporaryGrantRequestGrantState(String value) {
    super(value, allowedValues);
  }

  public static class TemporaryGrantRequestGrantStateSerializer
      extends StdSerializer<TemporaryGrantRequestGrantState> {
    public TemporaryGrantRequestGrantStateSerializer(Class<TemporaryGrantRequestGrantState> t) {
      super(t);
    }

    public TemporaryGrantRequestGrantStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TemporaryGrantRequestGrantState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TemporaryGrantRequestGrantState fromValue(String value) {
    return new TemporaryGrantRequestGrantState(value);
  }
}

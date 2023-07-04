/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The new triage state of the signal. */
@JsonSerialize(using = SignalTriageState.SignalTriageStateSerializer.class)
public class SignalTriageState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("open", "archived", "under_review"));

  public static final SignalTriageState OPEN = new SignalTriageState("open");
  public static final SignalTriageState ARCHIVED = new SignalTriageState("archived");
  public static final SignalTriageState UNDER_REVIEW = new SignalTriageState("under_review");

  SignalTriageState(String value) {
    super(value, allowedValues);
  }

  public static class SignalTriageStateSerializer extends StdSerializer<SignalTriageState> {
    public SignalTriageStateSerializer(Class<SignalTriageState> t) {
      super(t);
    }

    public SignalTriageStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(SignalTriageState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SignalTriageState fromValue(String value) {
    return new SignalTriageState(value);
  }
}

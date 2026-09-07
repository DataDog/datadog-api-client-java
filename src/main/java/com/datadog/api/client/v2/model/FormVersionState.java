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

/** The state of a form version. */
@JsonSerialize(using = FormVersionState.FormVersionStateSerializer.class)
public class FormVersionState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("draft", "frozen"));

  public static final FormVersionState DRAFT = new FormVersionState("draft");
  public static final FormVersionState FROZEN = new FormVersionState("frozen");

  FormVersionState(String value) {
    super(value, allowedValues);
  }

  public static class FormVersionStateSerializer extends StdSerializer<FormVersionState> {
    public FormVersionStateSerializer(Class<FormVersionState> t) {
      super(t);
    }

    public FormVersionStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(FormVersionState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormVersionState fromValue(String value) {
    return new FormVersionState(value);
  }
}

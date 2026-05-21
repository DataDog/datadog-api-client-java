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

/** The kind of communication. */
@JsonSerialize(using = IncidentCommunicationKind.IncidentCommunicationKindSerializer.class)
public class IncidentCommunicationKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("manual", "automated"));

  public static final IncidentCommunicationKind MANUAL = new IncidentCommunicationKind("manual");
  public static final IncidentCommunicationKind AUTOMATED =
      new IncidentCommunicationKind("automated");

  IncidentCommunicationKind(String value) {
    super(value, allowedValues);
  }

  public static class IncidentCommunicationKindSerializer
      extends StdSerializer<IncidentCommunicationKind> {
    public IncidentCommunicationKindSerializer(Class<IncidentCommunicationKind> t) {
      super(t);
    }

    public IncidentCommunicationKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentCommunicationKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentCommunicationKind fromValue(String value) {
    return new IncidentCommunicationKind(value);
  }
}

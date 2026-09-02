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
 * The lifecycle stage at which the app prompts users to fill out this field. Cannot be set on
 * required fields.
 */
@JsonSerialize(
    using = IncidentUserDefinedFieldCollected.IncidentUserDefinedFieldCollectedSerializer.class)
public class IncidentUserDefinedFieldCollected extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "stable", "resolved", "completed"));

  public static final IncidentUserDefinedFieldCollected ACTIVE =
      new IncidentUserDefinedFieldCollected("active");
  public static final IncidentUserDefinedFieldCollected STABLE =
      new IncidentUserDefinedFieldCollected("stable");
  public static final IncidentUserDefinedFieldCollected RESOLVED =
      new IncidentUserDefinedFieldCollected("resolved");
  public static final IncidentUserDefinedFieldCollected COMPLETED =
      new IncidentUserDefinedFieldCollected("completed");

  IncidentUserDefinedFieldCollected(String value) {
    super(value, allowedValues);
  }

  public static class IncidentUserDefinedFieldCollectedSerializer
      extends StdSerializer<IncidentUserDefinedFieldCollected> {
    public IncidentUserDefinedFieldCollectedSerializer(Class<IncidentUserDefinedFieldCollected> t) {
      super(t);
    }

    public IncidentUserDefinedFieldCollectedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentUserDefinedFieldCollected value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentUserDefinedFieldCollected fromValue(String value) {
    return new IncidentUserDefinedFieldCollected(value);
  }
}

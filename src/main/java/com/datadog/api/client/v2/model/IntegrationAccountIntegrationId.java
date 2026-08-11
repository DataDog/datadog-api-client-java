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

/** Supported integration ids (the <code>integration_id</code> path scope). */
@JsonSerialize(
    using = IntegrationAccountIntegrationId.IntegrationAccountIntegrationIdSerializer.class)
public class IntegrationAccountIntegrationId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elastic-cloud", "twilio"));

  public static final IntegrationAccountIntegrationId ELASTIC_CLOUD =
      new IntegrationAccountIntegrationId("elastic-cloud");
  public static final IntegrationAccountIntegrationId TWILIO =
      new IntegrationAccountIntegrationId("twilio");

  IntegrationAccountIntegrationId(String value) {
    super(value, allowedValues);
  }

  public static class IntegrationAccountIntegrationIdSerializer
      extends StdSerializer<IntegrationAccountIntegrationId> {
    public IntegrationAccountIntegrationIdSerializer(Class<IntegrationAccountIntegrationId> t) {
      super(t);
    }

    public IntegrationAccountIntegrationIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IntegrationAccountIntegrationId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IntegrationAccountIntegrationId fromValue(String value) {
    return new IntegrationAccountIntegrationId(value);
  }
}

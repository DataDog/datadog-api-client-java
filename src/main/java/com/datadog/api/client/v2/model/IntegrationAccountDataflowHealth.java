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

/** Collection health of a single dataflow. */
@JsonSerialize(
    using = IntegrationAccountDataflowHealth.IntegrationAccountDataflowHealthSerializer.class)
public class IntegrationAccountDataflowHealth extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("DATAFLOW_HEALTH_OK", "DATAFLOW_HEALTH_BROKEN", "DATAFLOW_HEALTH_UNKNOWN"));

  public static final IntegrationAccountDataflowHealth OK =
      new IntegrationAccountDataflowHealth("DATAFLOW_HEALTH_OK");
  public static final IntegrationAccountDataflowHealth BROKEN =
      new IntegrationAccountDataflowHealth("DATAFLOW_HEALTH_BROKEN");
  public static final IntegrationAccountDataflowHealth UNKNOWN =
      new IntegrationAccountDataflowHealth("DATAFLOW_HEALTH_UNKNOWN");

  IntegrationAccountDataflowHealth(String value) {
    super(value, allowedValues);
  }

  public static class IntegrationAccountDataflowHealthSerializer
      extends StdSerializer<IntegrationAccountDataflowHealth> {
    public IntegrationAccountDataflowHealthSerializer(Class<IntegrationAccountDataflowHealth> t) {
      super(t);
    }

    public IntegrationAccountDataflowHealthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IntegrationAccountDataflowHealth value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IntegrationAccountDataflowHealth fromValue(String value) {
    return new IntegrationAccountDataflowHealth(value);
  }
}

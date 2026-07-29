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

/** Supported interface (source-type) ids (the <code>interface_id</code> path scope). */
@JsonSerialize(using = IntegrationAccountInterfaceId.IntegrationAccountInterfaceIdSerializer.class)
public class IntegrationAccountInterfaceId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elastic-cloud", "elastic-cloud-ccm", "twilio"));

  public static final IntegrationAccountInterfaceId ELASTIC_CLOUD =
      new IntegrationAccountInterfaceId("elastic-cloud");
  public static final IntegrationAccountInterfaceId ELASTIC_CLOUD_CCM =
      new IntegrationAccountInterfaceId("elastic-cloud-ccm");
  public static final IntegrationAccountInterfaceId TWILIO =
      new IntegrationAccountInterfaceId("twilio");

  IntegrationAccountInterfaceId(String value) {
    super(value, allowedValues);
  }

  public static class IntegrationAccountInterfaceIdSerializer
      extends StdSerializer<IntegrationAccountInterfaceId> {
    public IntegrationAccountInterfaceIdSerializer(Class<IntegrationAccountInterfaceId> t) {
      super(t);
    }

    public IntegrationAccountInterfaceIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IntegrationAccountInterfaceId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IntegrationAccountInterfaceId fromValue(String value) {
    return new IntegrationAccountInterfaceId(value);
  }
}

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

/** The definition of the <code>GCPIntegrationType</code> object. */
@JsonSerialize(using = GCPIntegrationType.GCPIntegrationTypeSerializer.class)
public class GCPIntegrationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("GCP"));

  public static final GCPIntegrationType GCP = new GCPIntegrationType("GCP");

  GCPIntegrationType(String value) {
    super(value, allowedValues);
  }

  public static class GCPIntegrationTypeSerializer extends StdSerializer<GCPIntegrationType> {
    public GCPIntegrationTypeSerializer(Class<GCPIntegrationType> t) {
      super(t);
    }

    public GCPIntegrationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(GCPIntegrationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GCPIntegrationType fromValue(String value) {
    return new GCPIntegrationType(value);
  }
}

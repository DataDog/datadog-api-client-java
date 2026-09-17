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

/** The authentication method type. */
@JsonSerialize(
    using =
        ElasticCloudIntegrationAccountBasicAuthType
            .ElasticCloudIntegrationAccountBasicAuthTypeSerializer.class)
public class ElasticCloudIntegrationAccountBasicAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("basic"));

  public static final ElasticCloudIntegrationAccountBasicAuthType BASIC =
      new ElasticCloudIntegrationAccountBasicAuthType("basic");

  ElasticCloudIntegrationAccountBasicAuthType(String value) {
    super(value, allowedValues);
  }

  public static class ElasticCloudIntegrationAccountBasicAuthTypeSerializer
      extends StdSerializer<ElasticCloudIntegrationAccountBasicAuthType> {
    public ElasticCloudIntegrationAccountBasicAuthTypeSerializer(
        Class<ElasticCloudIntegrationAccountBasicAuthType> t) {
      super(t);
    }

    public ElasticCloudIntegrationAccountBasicAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudIntegrationAccountBasicAuthType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ElasticCloudIntegrationAccountBasicAuthType fromValue(String value) {
    return new ElasticCloudIntegrationAccountBasicAuthType(value);
  }
}

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
        DatabricksIntegrationAccountOAuthAuthType
            .DatabricksIntegrationAccountOAuthAuthTypeSerializer.class)
public class DatabricksIntegrationAccountOAuthAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("databricks-oauth"));

  public static final DatabricksIntegrationAccountOAuthAuthType DATABRICKS_OAUTH =
      new DatabricksIntegrationAccountOAuthAuthType("databricks-oauth");

  DatabricksIntegrationAccountOAuthAuthType(String value) {
    super(value, allowedValues);
  }

  public static class DatabricksIntegrationAccountOAuthAuthTypeSerializer
      extends StdSerializer<DatabricksIntegrationAccountOAuthAuthType> {
    public DatabricksIntegrationAccountOAuthAuthTypeSerializer(
        Class<DatabricksIntegrationAccountOAuthAuthType> t) {
      super(t);
    }

    public DatabricksIntegrationAccountOAuthAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatabricksIntegrationAccountOAuthAuthType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatabricksIntegrationAccountOAuthAuthType fromValue(String value) {
    return new DatabricksIntegrationAccountOAuthAuthType(value);
  }
}

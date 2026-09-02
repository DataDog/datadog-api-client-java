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

/** Tenant-based handle resource type. */
@JsonSerialize(
    using =
        MicrosoftTeamsTenantBasedHandleInfoType.MicrosoftTeamsTenantBasedHandleInfoTypeSerializer
            .class)
public class MicrosoftTeamsTenantBasedHandleInfoType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ms-teams-tenant-based-handle-info"));

  public static final MicrosoftTeamsTenantBasedHandleInfoType MS_TEAMS_TENANT_BASED_HANDLE_INFO =
      new MicrosoftTeamsTenantBasedHandleInfoType("ms-teams-tenant-based-handle-info");

  MicrosoftTeamsTenantBasedHandleInfoType(String value) {
    super(value, allowedValues);
  }

  public static class MicrosoftTeamsTenantBasedHandleInfoTypeSerializer
      extends StdSerializer<MicrosoftTeamsTenantBasedHandleInfoType> {
    public MicrosoftTeamsTenantBasedHandleInfoTypeSerializer(
        Class<MicrosoftTeamsTenantBasedHandleInfoType> t) {
      super(t);
    }

    public MicrosoftTeamsTenantBasedHandleInfoTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MicrosoftTeamsTenantBasedHandleInfoType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MicrosoftTeamsTenantBasedHandleInfoType fromValue(String value) {
    return new MicrosoftTeamsTenantBasedHandleInfoType(value);
  }
}

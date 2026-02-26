/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type for shared dashboard invitation request body. */
@JsonSerialize(using = DashboardInviteType.DashboardInviteTypeSerializer.class)
public class DashboardInviteType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("public_dashboard_invitation"));

  public static final DashboardInviteType PUBLIC_DASHBOARD_INVITATION =
      new DashboardInviteType("public_dashboard_invitation");

  DashboardInviteType(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInviteTypeSerializer extends StdSerializer<DashboardInviteType> {
    public DashboardInviteTypeSerializer(Class<DashboardInviteType> t) {
      super(t);
    }

    public DashboardInviteTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInviteType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInviteType fromValue(String value) {
    return new DashboardInviteType(value);
  }
}

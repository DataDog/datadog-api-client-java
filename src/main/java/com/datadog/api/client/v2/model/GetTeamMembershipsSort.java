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

/** Specifies the order of returned team memberships */
@JsonSerialize(using = GetTeamMembershipsSort.GetTeamMembershipsSortSerializer.class)
public class GetTeamMembershipsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "manager_name",
              "-manager_name",
              "name",
              "-name",
              "handle",
              "-handle",
              "email",
              "-email"));

  public static final GetTeamMembershipsSort MANAGER_NAME =
      new GetTeamMembershipsSort("manager_name");
  public static final GetTeamMembershipsSort _MANAGER_NAME =
      new GetTeamMembershipsSort("-manager_name");
  public static final GetTeamMembershipsSort NAME = new GetTeamMembershipsSort("name");
  public static final GetTeamMembershipsSort _NAME = new GetTeamMembershipsSort("-name");
  public static final GetTeamMembershipsSort HANDLE = new GetTeamMembershipsSort("handle");
  public static final GetTeamMembershipsSort _HANDLE = new GetTeamMembershipsSort("-handle");
  public static final GetTeamMembershipsSort EMAIL = new GetTeamMembershipsSort("email");
  public static final GetTeamMembershipsSort _EMAIL = new GetTeamMembershipsSort("-email");

  GetTeamMembershipsSort(String value) {
    super(value, allowedValues);
  }

  public static class GetTeamMembershipsSortSerializer
      extends StdSerializer<GetTeamMembershipsSort> {
    public GetTeamMembershipsSortSerializer(Class<GetTeamMembershipsSort> t) {
      super(t);
    }

    public GetTeamMembershipsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GetTeamMembershipsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GetTeamMembershipsSort fromValue(String value) {
    return new GetTeamMembershipsSort(value);
  }
}

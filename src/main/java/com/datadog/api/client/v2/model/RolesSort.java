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

/** Sorting options for roles. */
@JsonSerialize(using = RolesSort.RolesSortSerializer.class)
public class RolesSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "name", "-name", "modified_at", "-modified_at", "user_count", "-user_count"));

  public static final RolesSort NAME_ASCENDING = new RolesSort("name");
  public static final RolesSort NAME_DESCENDING = new RolesSort("-name");
  public static final RolesSort MODIFIED_AT_ASCENDING = new RolesSort("modified_at");
  public static final RolesSort MODIFIED_AT_DESCENDING = new RolesSort("-modified_at");
  public static final RolesSort USER_COUNT_ASCENDING = new RolesSort("user_count");
  public static final RolesSort USER_COUNT_DESCENDING = new RolesSort("-user_count");

  RolesSort(String value) {
    super(value, allowedValues);
  }

  public static class RolesSortSerializer extends StdSerializer<RolesSort> {
    public RolesSortSerializer(Class<RolesSort> t) {
      super(t);
    }

    public RolesSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(RolesSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RolesSort fromValue(String value) {
    return new RolesSort(value);
  }
}

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

/** Change request branch resource type. */
@JsonSerialize(
    using = ChangeRequestBranchResourceType.ChangeRequestBranchResourceTypeSerializer.class)
public class ChangeRequestBranchResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change_request_branch"));

  public static final ChangeRequestBranchResourceType CHANGE_REQUEST_BRANCH =
      new ChangeRequestBranchResourceType("change_request_branch");

  ChangeRequestBranchResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeRequestBranchResourceTypeSerializer
      extends StdSerializer<ChangeRequestBranchResourceType> {
    public ChangeRequestBranchResourceTypeSerializer(Class<ChangeRequestBranchResourceType> t) {
      super(t);
    }

    public ChangeRequestBranchResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeRequestBranchResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeRequestBranchResourceType fromValue(String value) {
    return new ChangeRequestBranchResourceType(value);
  }
}

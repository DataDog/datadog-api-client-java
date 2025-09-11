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

/** The organization access level for the datastore. For example, 'contributor'. */
@JsonSerialize(
    using =
        CreateAppsDatastoreRequestDataAttributesOrgAccess
            .CreateAppsDatastoreRequestDataAttributesOrgAccessSerializer.class)
public class CreateAppsDatastoreRequestDataAttributesOrgAccess extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("contributor", "viewer", "manager"));

  public static final CreateAppsDatastoreRequestDataAttributesOrgAccess CONTRIBUTOR =
      new CreateAppsDatastoreRequestDataAttributesOrgAccess("contributor");
  public static final CreateAppsDatastoreRequestDataAttributesOrgAccess VIEWER =
      new CreateAppsDatastoreRequestDataAttributesOrgAccess("viewer");
  public static final CreateAppsDatastoreRequestDataAttributesOrgAccess MANAGER =
      new CreateAppsDatastoreRequestDataAttributesOrgAccess("manager");

  CreateAppsDatastoreRequestDataAttributesOrgAccess(String value) {
    super(value, allowedValues);
  }

  public static class CreateAppsDatastoreRequestDataAttributesOrgAccessSerializer
      extends StdSerializer<CreateAppsDatastoreRequestDataAttributesOrgAccess> {
    public CreateAppsDatastoreRequestDataAttributesOrgAccessSerializer(
        Class<CreateAppsDatastoreRequestDataAttributesOrgAccess> t) {
      super(t);
    }

    public CreateAppsDatastoreRequestDataAttributesOrgAccessSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateAppsDatastoreRequestDataAttributesOrgAccess value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateAppsDatastoreRequestDataAttributesOrgAccess fromValue(String value) {
    return new CreateAppsDatastoreRequestDataAttributesOrgAccess(value);
  }
}

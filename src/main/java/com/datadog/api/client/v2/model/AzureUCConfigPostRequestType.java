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

/** Type of Azure config Post Request. */
@JsonSerialize(using = AzureUCConfigPostRequestType.AzureUCConfigPostRequestTypeSerializer.class)
public class AzureUCConfigPostRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("azure_uc_config_post_request"));

  public static final AzureUCConfigPostRequestType AZURE_UC_CONFIG_POST_REQUEST =
      new AzureUCConfigPostRequestType("azure_uc_config_post_request");

  AzureUCConfigPostRequestType(String value) {
    super(value, allowedValues);
  }

  public static class AzureUCConfigPostRequestTypeSerializer
      extends StdSerializer<AzureUCConfigPostRequestType> {
    public AzureUCConfigPostRequestTypeSerializer(Class<AzureUCConfigPostRequestType> t) {
      super(t);
    }

    public AzureUCConfigPostRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AzureUCConfigPostRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AzureUCConfigPostRequestType fromValue(String value) {
    return new AzureUCConfigPostRequestType(value);
  }
}

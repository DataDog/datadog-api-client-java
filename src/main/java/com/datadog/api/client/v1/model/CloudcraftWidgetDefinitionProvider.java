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

/** Cloud provider for the Cloudcraft widget. */
@JsonSerialize(
    using = CloudcraftWidgetDefinitionProvider.CloudcraftWidgetDefinitionProviderSerializer.class)
public class CloudcraftWidgetDefinitionProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws", "azure", "gcp", "ndm", "oci"));

  public static final CloudcraftWidgetDefinitionProvider AWS =
      new CloudcraftWidgetDefinitionProvider("aws");
  public static final CloudcraftWidgetDefinitionProvider AZURE =
      new CloudcraftWidgetDefinitionProvider("azure");
  public static final CloudcraftWidgetDefinitionProvider GCP =
      new CloudcraftWidgetDefinitionProvider("gcp");
  public static final CloudcraftWidgetDefinitionProvider NDM =
      new CloudcraftWidgetDefinitionProvider("ndm");
  public static final CloudcraftWidgetDefinitionProvider OCI =
      new CloudcraftWidgetDefinitionProvider("oci");

  CloudcraftWidgetDefinitionProvider(String value) {
    super(value, allowedValues);
  }

  public static class CloudcraftWidgetDefinitionProviderSerializer
      extends StdSerializer<CloudcraftWidgetDefinitionProvider> {
    public CloudcraftWidgetDefinitionProviderSerializer(
        Class<CloudcraftWidgetDefinitionProvider> t) {
      super(t);
    }

    public CloudcraftWidgetDefinitionProviderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudcraftWidgetDefinitionProvider value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudcraftWidgetDefinitionProvider fromValue(String value) {
    return new CloudcraftWidgetDefinitionProvider(value);
  }
}

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

/**
 * HCP Terraform workload identity token issuer. Use <code>https://app.terraform.io</code> for HCP
 * Terraform in the US or <code>https://app.eu.terraform.io</code> for HCP Terraform in Europe.
 */
@JsonSerialize(using = TerraformCloudAuthIssuerURL.TerraformCloudAuthIssuerURLSerializer.class)
public class TerraformCloudAuthIssuerURL extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("https://app.terraform.io", "https://app.eu.terraform.io"));

  public static final TerraformCloudAuthIssuerURL US =
      new TerraformCloudAuthIssuerURL("https://app.terraform.io");
  public static final TerraformCloudAuthIssuerURL EU =
      new TerraformCloudAuthIssuerURL("https://app.eu.terraform.io");

  TerraformCloudAuthIssuerURL(String value) {
    super(value, allowedValues);
  }

  public static class TerraformCloudAuthIssuerURLSerializer
      extends StdSerializer<TerraformCloudAuthIssuerURL> {
    public TerraformCloudAuthIssuerURLSerializer(Class<TerraformCloudAuthIssuerURL> t) {
      super(t);
    }

    public TerraformCloudAuthIssuerURLSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TerraformCloudAuthIssuerURL value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TerraformCloudAuthIssuerURL fromValue(String value) {
    return new TerraformCloudAuthIssuerURL(value);
  }
}

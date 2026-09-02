/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        DORADeploymentPatchByVersionRemediation.DORADeploymentPatchByVersionRemediationDeserializer
            .class)
@JsonSerialize(
    using =
        DORADeploymentPatchByVersionRemediation.DORADeploymentPatchByVersionRemediationSerializer
            .class)
public class DORADeploymentPatchByVersionRemediation extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DORADeploymentPatchByVersionRemediation.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DORADeploymentPatchByVersionRemediationSerializer
      extends StdSerializer<DORADeploymentPatchByVersionRemediation> {
    public DORADeploymentPatchByVersionRemediationSerializer(
        Class<DORADeploymentPatchByVersionRemediation> t) {
      super(t);
    }

    public DORADeploymentPatchByVersionRemediationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DORADeploymentPatchByVersionRemediation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DORADeploymentPatchByVersionRemediationDeserializer
      extends StdDeserializer<DORADeploymentPatchByVersionRemediation> {
    public DORADeploymentPatchByVersionRemediationDeserializer() {
      this(DORADeploymentPatchByVersionRemediation.class);
    }

    public DORADeploymentPatchByVersionRemediationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DORADeploymentPatchByVersionRemediation deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DORADeploymentPatchByVersionRemediationByID
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DORADeploymentPatchByVersionRemediationByID.class.equals(Integer.class)
            || DORADeploymentPatchByVersionRemediationByID.class.equals(Long.class)
            || DORADeploymentPatchByVersionRemediationByID.class.equals(Float.class)
            || DORADeploymentPatchByVersionRemediationByID.class.equals(Double.class)
            || DORADeploymentPatchByVersionRemediationByID.class.equals(Boolean.class)
            || DORADeploymentPatchByVersionRemediationByID.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DORADeploymentPatchByVersionRemediationByID.class.equals(Integer.class)
                        || DORADeploymentPatchByVersionRemediationByID.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DORADeploymentPatchByVersionRemediationByID.class.equals(Float.class)
                        || DORADeploymentPatchByVersionRemediationByID.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DORADeploymentPatchByVersionRemediationByID.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DORADeploymentPatchByVersionRemediationByID.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DORADeploymentPatchByVersionRemediationByID.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DORADeploymentPatchByVersionRemediationByID) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DORADeploymentPatchByVersionRemediationByID'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DORADeploymentPatchByVersionRemediationByID'",
            e);
      }

      // deserialize DORADeploymentPatchByVersionRemediationByVersion
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DORADeploymentPatchByVersionRemediationByVersion.class.equals(Integer.class)
            || DORADeploymentPatchByVersionRemediationByVersion.class.equals(Long.class)
            || DORADeploymentPatchByVersionRemediationByVersion.class.equals(Float.class)
            || DORADeploymentPatchByVersionRemediationByVersion.class.equals(Double.class)
            || DORADeploymentPatchByVersionRemediationByVersion.class.equals(Boolean.class)
            || DORADeploymentPatchByVersionRemediationByVersion.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DORADeploymentPatchByVersionRemediationByVersion.class.equals(Integer.class)
                        || DORADeploymentPatchByVersionRemediationByVersion.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DORADeploymentPatchByVersionRemediationByVersion.class.equals(Float.class)
                        || DORADeploymentPatchByVersionRemediationByVersion.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DORADeploymentPatchByVersionRemediationByVersion.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DORADeploymentPatchByVersionRemediationByVersion.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DORADeploymentPatchByVersionRemediationByVersion.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DORADeploymentPatchByVersionRemediationByVersion) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DORADeploymentPatchByVersionRemediationByVersion'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DORADeploymentPatchByVersionRemediationByVersion'",
            e);
      }

      DORADeploymentPatchByVersionRemediation ret = new DORADeploymentPatchByVersionRemediation();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public DORADeploymentPatchByVersionRemediation getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DORADeploymentPatchByVersionRemediation cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DORADeploymentPatchByVersionRemediation() {
    super("oneOf", Boolean.FALSE);
  }

  public DORADeploymentPatchByVersionRemediation(DORADeploymentPatchByVersionRemediationByID o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DORADeploymentPatchByVersionRemediation(
      DORADeploymentPatchByVersionRemediationByVersion o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DORADeploymentPatchByVersionRemediationByID",
        new GenericType<DORADeploymentPatchByVersionRemediationByID>() {});
    schemas.put(
        "DORADeploymentPatchByVersionRemediationByVersion",
        new GenericType<DORADeploymentPatchByVersionRemediationByVersion>() {});
    JSON.registerDescendants(
        DORADeploymentPatchByVersionRemediation.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DORADeploymentPatchByVersionRemediation.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DORADeploymentPatchByVersionRemediationByID,
   * DORADeploymentPatchByVersionRemediationByVersion
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DORADeploymentPatchByVersionRemediationByID.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DORADeploymentPatchByVersionRemediationByVersion.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DORADeploymentPatchByVersionRemediationByID,"
            + " DORADeploymentPatchByVersionRemediationByVersion");
  }

  /**
   * Get the actual instance, which can be the following:
   * DORADeploymentPatchByVersionRemediationByID, DORADeploymentPatchByVersionRemediationByVersion
   *
   * @return The actual instance (DORADeploymentPatchByVersionRemediationByID,
   *     DORADeploymentPatchByVersionRemediationByVersion)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DORADeploymentPatchByVersionRemediationByID`. If the actual
   * instance is not `DORADeploymentPatchByVersionRemediationByID`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `DORADeploymentPatchByVersionRemediationByID`
   * @throws ClassCastException if the instance is not `DORADeploymentPatchByVersionRemediationByID`
   */
  public DORADeploymentPatchByVersionRemediationByID
      getDORADeploymentPatchByVersionRemediationByID() throws ClassCastException {
    return (DORADeploymentPatchByVersionRemediationByID) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DORADeploymentPatchByVersionRemediationByVersion`. If the actual
   * instance is not `DORADeploymentPatchByVersionRemediationByVersion`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `DORADeploymentPatchByVersionRemediationByVersion`
   * @throws ClassCastException if the instance is not
   *     `DORADeploymentPatchByVersionRemediationByVersion`
   */
  public DORADeploymentPatchByVersionRemediationByVersion
      getDORADeploymentPatchByVersionRemediationByVersion() throws ClassCastException {
    return (DORADeploymentPatchByVersionRemediationByVersion) super.getActualInstance();
  }
}

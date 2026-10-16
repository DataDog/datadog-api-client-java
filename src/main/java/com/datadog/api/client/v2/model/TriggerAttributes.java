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
@JsonDeserialize(using = TriggerAttributes.TriggerAttributesDeserializer.class)
@JsonSerialize(using = TriggerAttributes.TriggerAttributesSerializer.class)
public class TriggerAttributes extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TriggerAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TriggerAttributesSerializer extends StdSerializer<TriggerAttributes> {
    public TriggerAttributesSerializer(Class<TriggerAttributes> t) {
      super(t);
    }

    public TriggerAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(TriggerAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TriggerAttributesDeserializer extends StdDeserializer<TriggerAttributes> {
    public TriggerAttributesDeserializer() {
      this(TriggerAttributes.class);
    }

    public TriggerAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TriggerAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MonitorAlertTrigger
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MonitorAlertTrigger.class.equals(Integer.class)
            || MonitorAlertTrigger.class.equals(Long.class)
            || MonitorAlertTrigger.class.equals(Float.class)
            || MonitorAlertTrigger.class.equals(Double.class)
            || MonitorAlertTrigger.class.equals(Boolean.class)
            || MonitorAlertTrigger.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MonitorAlertTrigger.class.equals(Integer.class)
                        || MonitorAlertTrigger.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MonitorAlertTrigger.class.equals(Float.class)
                        || MonitorAlertTrigger.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MonitorAlertTrigger.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MonitorAlertTrigger.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MonitorAlertTrigger.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MonitorAlertTrigger) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MonitorAlertTrigger'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MonitorAlertTrigger'", e);
      }

      // deserialize GeneralInvestigationTrigger
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeneralInvestigationTrigger.class.equals(Integer.class)
            || GeneralInvestigationTrigger.class.equals(Long.class)
            || GeneralInvestigationTrigger.class.equals(Float.class)
            || GeneralInvestigationTrigger.class.equals(Double.class)
            || GeneralInvestigationTrigger.class.equals(Boolean.class)
            || GeneralInvestigationTrigger.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeneralInvestigationTrigger.class.equals(Integer.class)
                        || GeneralInvestigationTrigger.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeneralInvestigationTrigger.class.equals(Float.class)
                        || GeneralInvestigationTrigger.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeneralInvestigationTrigger.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeneralInvestigationTrigger.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GeneralInvestigationTrigger.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeneralInvestigationTrigger) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GeneralInvestigationTrigger'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GeneralInvestigationTrigger'", e);
      }

      TriggerAttributes ret = new TriggerAttributes();
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
    public TriggerAttributes getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TriggerAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TriggerAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public TriggerAttributes(MonitorAlertTrigger o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TriggerAttributes(GeneralInvestigationTrigger o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("MonitorAlertTrigger", new GenericType<MonitorAlertTrigger>() {});
    schemas.put("GeneralInvestigationTrigger", new GenericType<GeneralInvestigationTrigger>() {});
    JSON.registerDescendants(TriggerAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TriggerAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MonitorAlertTrigger, GeneralInvestigationTrigger
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(MonitorAlertTrigger.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GeneralInvestigationTrigger.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MonitorAlertTrigger, GeneralInvestigationTrigger");
  }

  /**
   * Get the actual instance, which can be the following: MonitorAlertTrigger,
   * GeneralInvestigationTrigger
   *
   * @return The actual instance (MonitorAlertTrigger, GeneralInvestigationTrigger)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MonitorAlertTrigger`. If the actual instance is not
   * `MonitorAlertTrigger`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MonitorAlertTrigger`
   * @throws ClassCastException if the instance is not `MonitorAlertTrigger`
   */
  public MonitorAlertTrigger getMonitorAlertTrigger() throws ClassCastException {
    return (MonitorAlertTrigger) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeneralInvestigationTrigger`. If the actual instance is not
   * `GeneralInvestigationTrigger`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeneralInvestigationTrigger`
   * @throws ClassCastException if the instance is not `GeneralInvestigationTrigger`
   */
  public GeneralInvestigationTrigger getGeneralInvestigationTrigger() throws ClassCastException {
    return (GeneralInvestigationTrigger) super.getActualInstance();
  }
}

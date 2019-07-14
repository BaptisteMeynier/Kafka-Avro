package com.meynier.kafka.avro.serializer;

import org.apache.avro.Schema;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.specific.SpecificRecord;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Date;
import java.util.Map;

public class AvroGenericDeserializer<T> implements Deserializer {

    final Schema schema;
    final Class klass;

    public AvroGenericDeserializer(Class klass) {
        this.klass = klass;
        if (!SpecificRecord.class.isAssignableFrom(this.klass)) {
            throw new IllegalArgumentException(String.format("Class %s is not implementation of SpecificRecord", this.klass.toString()));
        }
        String field = "SCHEMA$";
        try {
            this.klass.getField(field).setAccessible(true);
            this.schema = (Schema) this.klass.getField(field).get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalArgumentException(String.format("Class %s doesn't contain %s", this.klass, field));
        }
    }

    @Override
    public void configure(Map map, boolean b) {

    }

    @Override
    public Object deserialize(String topic, byte[] data) {
        T obj = null;
        if(data !=null){
            ReflectDatumReader<T> datumReader = new ReflectDatumReader(schema);
            try{
                BinaryDecoder in = DecoderFactory.get().binaryDecoder(data,null);
                obj = datumReader.read(null,in);
            }catch (Exception e){
                System.out.println(String.format("Cannot deserialize class %s, topic %s, date %s: %e",this.klass,topic,new Date(),e.getMessage()));
            }

        }
        return obj;
    }

    @Override
    public void close() {

    }
}

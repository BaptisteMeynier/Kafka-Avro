package com.meynier.kafka.avro.serializer;

import org.apache.avro.Schema;
import org.apache.avro.io.*;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.Map;

public class AvroGenericSerializer<T> implements Serializer<SpecificRecord> {

    @Override
    public void configure(Map map, boolean b) {

    }


    @Override
    public byte[] serialize(String topic, SpecificRecord data) {
        byte[] retVal = null;
        if(data != null){
            try(ByteArrayOutputStream out = new ByteArrayOutputStream()){
                Schema schema = data.getSchema();
                DatumWriter<Object> outputDatumWriter = new SpecificDatumWriter<>(schema);
                BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(out,null);
                outputDatumWriter.write(data,encoder);
                encoder.flush();
                retVal = out.toByteArray();
            }catch (Exception e){
                System.out.println(String.format("Cannot serialize, data %s, error : %s",data, e));
            }
        }
        return retVal;
    }


    @Override
    public void close() {

    }
}

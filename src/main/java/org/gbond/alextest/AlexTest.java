/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gbond.alextest;

import com.cisco.netflowiebase.entity.DataType;
import com.cisco.netflowiebase.entity.Field;
import com.cisco.netflowiebase.entity.FieldDefinitions;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gennady Bondar <gbondar@luxoft.com>
 */
public class AlexTest {

    public static void main(String[] args) {
        AlexTest t1 = new AlexTest();
        t1.test();
        t1.test2();
    }
   public class DataTypeConverter extends AbstractSingleValueConverter {

        @Override
        public boolean canConvert(Class type) {
            return type.equals(DataType.class);
        }

        @Override
        public Object fromString(String str) {
            DataType dt = new DataType();
            dt.setDatatype_name(str);
            return dt;
        }
       
   }
   
   public XStream prepareParser(){
        XStream xstr = new XStream();
        xstr.alias("fieldDefinitions", FieldDefinitions.class);
        xstr.alias("field", Field.class);
        xstr.addImplicitCollection(FieldDefinitions.class, "r1");
        xstr.registerConverter(new DataTypeConverter());
        xstr.aliasField("datatype", Field.class, "dataType");
        return xstr;
   }
    public void test() {
        XStream xstr = prepareParser();
        InputStream instr = this.getClass().getResourceAsStream("/netflow-external[5].xml");
        FieldDefinitions fd = (FieldDefinitions) xstr.fromXML(instr);
        System.out.println(fd.getR1().size());

    }
    
    public void test2(){
        XStream xstr = prepareParser();
        String res = xstr.toXML(FdFactory());
        System.out.println(res);
        
    }

    public static FieldDefinitions FdFactory() {
        FieldDefinitions fd = new FieldDefinitions();
        Field f = new Field();
        f.setId(1L);
        List<Field> fl = new ArrayList<Field>();
        fl.add(f);
        fd.setR1(fl);
        return fd;
    }
}

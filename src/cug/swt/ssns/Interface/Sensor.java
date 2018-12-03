/**
 * Sensor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface;

public class Sensor  implements java.io.Serializable {
    private java.lang.String changeTime;

    private cug.swt.ssns.Interface.Consumer[] consumers;

    private java.lang.String sensorid;

    private int sid;

    private java.lang.String sosAdress;

    private java.lang.String status;

    public Sensor() {
    }

    public Sensor(
           java.lang.String changeTime,
           cug.swt.ssns.Interface.Consumer[] consumers,
           java.lang.String sensorid,
           int sid,
           java.lang.String sosAdress,
           java.lang.String status) {
           this.changeTime = changeTime;
           this.consumers = consumers;
           this.sensorid = sensorid;
           this.sid = sid;
           this.sosAdress = sosAdress;
           this.status = status;
    }


    /**
     * Gets the changeTime value for this Sensor.
     * 
     * @return changeTime
     */
    public java.lang.String getChangeTime() {
        return changeTime;
    }


    /**
     * Sets the changeTime value for this Sensor.
     * 
     * @param changeTime
     */
    public void setChangeTime(java.lang.String changeTime) {
        this.changeTime = changeTime;
    }


    /**
     * Gets the consumers value for this Sensor.
     * 
     * @return consumers
     */
    public cug.swt.ssns.Interface.Consumer[] getConsumers() {
        return consumers;
    }


    /**
     * Sets the consumers value for this Sensor.
     * 
     * @param consumers
     */
    public void setConsumers(cug.swt.ssns.Interface.Consumer[] consumers) {
        this.consumers = consumers;
    }

    public cug.swt.ssns.Interface.Consumer getConsumers(int i) {
        return this.consumers[i];
    }

    public void setConsumers(int i, cug.swt.ssns.Interface.Consumer _value) {
        this.consumers[i] = _value;
    }


    /**
     * Gets the sensorid value for this Sensor.
     * 
     * @return sensorid
     */
    public java.lang.String getSensorid() {
        return sensorid;
    }


    /**
     * Sets the sensorid value for this Sensor.
     * 
     * @param sensorid
     */
    public void setSensorid(java.lang.String sensorid) {
        this.sensorid = sensorid;
    }


    /**
     * Gets the sid value for this Sensor.
     * 
     * @return sid
     */
    public int getSid() {
        return sid;
    }


    /**
     * Sets the sid value for this Sensor.
     * 
     * @param sid
     */
    public void setSid(int sid) {
        this.sid = sid;
    }


    /**
     * Gets the sosAdress value for this Sensor.
     * 
     * @return sosAdress
     */
    public java.lang.String getSosAdress() {
        return sosAdress;
    }


    /**
     * Sets the sosAdress value for this Sensor.
     * 
     * @param sosAdress
     */
    public void setSosAdress(java.lang.String sosAdress) {
        this.sosAdress = sosAdress;
    }


    /**
     * Gets the status value for this Sensor.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Sensor.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sensor)) return false;
        Sensor other = (Sensor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeTime==null && other.getChangeTime()==null) || 
             (this.changeTime!=null &&
              this.changeTime.equals(other.getChangeTime()))) &&
            ((this.consumers==null && other.getConsumers()==null) || 
             (this.consumers!=null &&
              java.util.Arrays.equals(this.consumers, other.getConsumers()))) &&
            ((this.sensorid==null && other.getSensorid()==null) || 
             (this.sensorid!=null &&
              this.sensorid.equals(other.getSensorid()))) &&
            this.sid == other.getSid() &&
            ((this.sosAdress==null && other.getSosAdress()==null) || 
             (this.sosAdress!=null &&
              this.sosAdress.equals(other.getSosAdress()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getChangeTime() != null) {
            _hashCode += getChangeTime().hashCode();
        }
        if (getConsumers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsumers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsumers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSensorid() != null) {
            _hashCode += getSensorid().hashCode();
        }
        _hashCode += getSid();
        if (getSosAdress() != null) {
            _hashCode += getSosAdress().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sensor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Interface.ssns.swt.cug/", "sensor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consumers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Interface.ssns.swt.cug/", "consumer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sosAdress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sosAdress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

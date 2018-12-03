/**
 * Consumer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface;

public class Consumer  implements java.io.Serializable {
    private int cid;

    private java.lang.String consumerPort;

    private cug.swt.ssns.Interface.Sensor[] subscribedSensor;

    public Consumer() {
    }

    public Consumer(
           int cid,
           java.lang.String consumerPort,
           cug.swt.ssns.Interface.Sensor[] subscribedSensor) {
           this.cid = cid;
           this.consumerPort = consumerPort;
           this.subscribedSensor = subscribedSensor;
    }


    /**
     * Gets the cid value for this Consumer.
     * 
     * @return cid
     */
    public int getCid() {
        return cid;
    }


    /**
     * Sets the cid value for this Consumer.
     * 
     * @param cid
     */
    public void setCid(int cid) {
        this.cid = cid;
    }


    /**
     * Gets the consumerPort value for this Consumer.
     * 
     * @return consumerPort
     */
    public java.lang.String getConsumerPort() {
        return consumerPort;
    }


    /**
     * Sets the consumerPort value for this Consumer.
     * 
     * @param consumerPort
     */
    public void setConsumerPort(java.lang.String consumerPort) {
        this.consumerPort = consumerPort;
    }


    /**
     * Gets the subscribedSensor value for this Consumer.
     * 
     * @return subscribedSensor
     */
    public cug.swt.ssns.Interface.Sensor[] getSubscribedSensor() {
        return subscribedSensor;
    }


    /**
     * Sets the subscribedSensor value for this Consumer.
     * 
     * @param subscribedSensor
     */
    public void setSubscribedSensor(cug.swt.ssns.Interface.Sensor[] subscribedSensor) {
        this.subscribedSensor = subscribedSensor;
    }

    public cug.swt.ssns.Interface.Sensor getSubscribedSensor(int i) {
        return this.subscribedSensor[i];
    }

    public void setSubscribedSensor(int i, cug.swt.ssns.Interface.Sensor _value) {
        this.subscribedSensor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consumer)) return false;
        Consumer other = (Consumer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cid == other.getCid() &&
            ((this.consumerPort==null && other.getConsumerPort()==null) || 
             (this.consumerPort!=null &&
              this.consumerPort.equals(other.getConsumerPort()))) &&
            ((this.subscribedSensor==null && other.getSubscribedSensor()==null) || 
             (this.subscribedSensor!=null &&
              java.util.Arrays.equals(this.subscribedSensor, other.getSubscribedSensor())));
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
        _hashCode += getCid();
        if (getConsumerPort() != null) {
            _hashCode += getConsumerPort().hashCode();
        }
        if (getSubscribedSensor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscribedSensor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscribedSensor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consumer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Interface.ssns.swt.cug/", "consumer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consumerPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribedSensor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscribedSensor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Interface.ssns.swt.cug/", "sensor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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

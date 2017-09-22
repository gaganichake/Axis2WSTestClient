package com.gagan.webservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.gagan.webservice.ConverterStub.CelsiusToFarenheit;
import com.gagan.webservice.ConverterStub.CelsiusToFarenheitResponse;

public class ConverterClient {

        public static void main(String[] args) {
                try {
                        float celsiusValue = 100;
                        ConverterStub stub = new ConverterStub();
                        CelsiusToFarenheit c2f = new CelsiusToFarenheit();
                        c2f.setCelsius(celsiusValue);
                        CelsiusToFarenheitResponse res = stub.celsiusToFarenheit(c2f);
                        System.out.println("Celsius : "+celsiusValue+" = "+"Farenheit : "+res.get_return());
                } catch (AxisFault e) {
                        e.printStackTrace();
                } catch (RemoteException e) {
                        e.printStackTrace();
                }

        }
}
